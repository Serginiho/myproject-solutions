package com.homecompany.chapter19.exercise9;

import com.homecompany.chapter19.exercise8.Mail;

import java.util.EnumMap;
import java.util.Map;

public class PostOfficeWithEnumMap {
    enum MailHandler2 {GENERAL_DELIVERY, MACHINE_SCAN, FORWARDING_MAIL, VISUAL_INSPECTION, RETURN_TO_SENDER}
    private static EnumMap<MailHandler2, MailHandlerInterface> enumMap = new EnumMap<>(MailHandler2.class);
    static {
        enumMap.put(MailHandler2.GENERAL_DELIVERY, new MailHandlerInterface() {
            @Override
            public boolean handle(Mail m) {
                switch (m.generalDelivery) {
                    case YES:
                        System.out.println("Using general delivery for " + m);
                        return true;
                    default:
                        return false;
                }
            }
        });
        enumMap.put(MailHandler2.MACHINE_SCAN, new MailHandlerInterface() {
            @Override
            public boolean handle(Mail m) {
                switch (m.scannability) {
                    case UNSCANNABLE:
                        return false;
                    default:
                        switch (m.address) {
                            case INCORRECT:
                                return false;
                            default:
                                System.out.println("Delivering " + m + " automatically");
                                return true;
                        }
                }
            }
        });
        enumMap.put(MailHandler2.FORWARDING_MAIL, new MailHandlerInterface() {
            @Override
            public boolean handle(Mail m) {
                switch (m.forwarding) {
                    case NO_FORWARD:
                        return false;
                    default:
                        switch (m.readability) {
                            case ILLEGIBLE:
                                return false;
                            default:
                                switch (m.address) {
                                    case INCORRECT:
                                        return false;
                                    default:
                                        System.out.println("Forwarding " + m + " by address");
                                        return true;
                                }
                        }
                }
            }
        });
        enumMap.put(MailHandler2.VISUAL_INSPECTION, new MailHandlerInterface() {
            @Override
            public boolean handle(Mail m) {
                switch(m.readability) {
                    case ILLEGIBLE: return false;
                    default:
                        switch(m.address) {
                            case INCORRECT: return false;
                            default:
                                System.out.println("Delivering " + m + " normally");
                                return true;
                        }
                }
            }
        });
        enumMap.put(MailHandler2.RETURN_TO_SENDER, new MailHandlerInterface() {
            @Override
            public boolean handle(Mail m) {
                switch(m.returnAddress) {
                    case MISSING: return false;
                    default:
                        System.out.println("Returning " + m + " to sender");
                        return true;
                }
            }
        });
    }
    static void handleMail(Mail m) {
        for (Map.Entry<MailHandler2, MailHandlerInterface> me:
             enumMap.entrySet()) {
            if(me.getValue().handle(m))
                return;
        }
        System.out.println(m + " is a dead letter");
    }
    public static void main(String[] args) {
        for (Mail mail : Mail.generator(10)) {
            System.out.println(mail.details());
            handleMail(mail);
            System.out.println("*****");
        }
    }
}

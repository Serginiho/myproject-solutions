package com.homecompany.chapter15.exercise39;

import com.homecompany.chapter15.exercise37.*;

import static util.Tuple.*;

class DynamicProxyMixin {
    public static void main(String[] args) {
        Object mixin = MixinProxy.newInstance(tuple(new BasicImp(), Basic.class),
                tuple(new TimeStampedImp(), TimeStamped.class), tuple(new SerialNumberedImp(), SerialNumbered.class),
                tuple(new ColoredImp(), Colored.class));
        Basic b = (Basic) mixin;
        TimeStamped ts = (TimeStamped) mixin;
        SerialNumbered sn = (SerialNumbered) mixin;
        Colored c = (Colored) mixin;
        b.set("Dynamic mixins test");
        System.out.println(b.get());
        System.out.println(ts.getStamp());
        System.out.println(sn.getSerialNumber());
        System.out.println(c.getColor());
    }
}

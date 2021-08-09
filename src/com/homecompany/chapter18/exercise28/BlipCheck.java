package com.homecompany.chapter18.exercise28;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class BlipCheck implements Externalizable {
//    BlipCheck () {
//        System.out.println("BlipCheck.constructor");
//    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("BlipCheck.writeExternal");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("BlipCheck.readExternal");
    }
}

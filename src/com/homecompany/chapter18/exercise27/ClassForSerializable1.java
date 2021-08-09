package com.homecompany.chapter18.exercise27;

import java.io.*;
import java.util.Random;

public class ClassForSerializable1 implements Serializable {
    public ClassForSerializable1() {}
    ClassForSerializable2 cfs2;
    public ClassForSerializable1 (ClassForSerializable2 link) {
        cfs2 = link;
    }

    @Override
    public String toString() {
        return "ClassForSerializable1{" +
                "cfs2=" + cfs2 +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Random random = new Random();
        ClassForSerializable1 classForSerializable1 = new ClassForSerializable1(
                new ClassForSerializable2(random.nextInt(100)));
        System.out.println(classForSerializable1);
        System.out.println("----------------");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("SerializeClass.out"));
        out.writeObject("Store classForSerializable1\n");
        out.writeObject(classForSerializable1);
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SerializeClass.out"));
        String s = (String) in.readObject();
        ClassForSerializable1 c = (ClassForSerializable1) in.readObject();
        System.out.println(s);
        System.out.println(c);
    }
}

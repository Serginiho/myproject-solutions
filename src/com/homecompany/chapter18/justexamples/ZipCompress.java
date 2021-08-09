package com.homecompany.chapter18.justexamples;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.*;

public class ZipCompress {
    public static void main(String[] args)
            throws IOException {
        FileOutputStream f = new FileOutputStream("testZipCompress.zip");
        CheckedOutputStream csum =
                new CheckedOutputStream(f, new Adler32());
        ZipOutputStream zos = new ZipOutputStream(csum);
        BufferedOutputStream out =
                new BufferedOutputStream(zos);
        zos.setComment("A test of Java Zipping");
        // No corresponding getComment(), though.
        for(String arg : args) {
            System.out.println("Writing file " + arg);
            BufferedReader in =
                    new BufferedReader(new FileReader(arg));
            zos.putNextEntry(new ZipEntry(arg));
            int c;
            while((c = in.read()) != -1)
                out.write(c);
            in.close();
            out.flush();
        }
        out.close();
        // Checksum valid only after the file has been closed!
        System.out.println("Checksum: " + csum.getChecksum().getValue());
        // Now extract the files:
        System.out.println("Reading file");
        FileInputStream fi = new FileInputStream("testZipCompress.zip");
        CheckedInputStream csumi =
                new CheckedInputStream(fi, new Adler32());
        ZipInputStream in2 = new ZipInputStream(csumi);
        BufferedInputStream bis = new BufferedInputStream(in2);
        ZipEntry ze;
        while((ze = in2.getNextEntry()) != null) {
            System.out.println("Reading file " + ze);
            System.out.println("------------------");
            int x;
            while((x = bis.read()) != -1)
                System.out.write(x);
        }
        if(args.length == 1)
            System.out.println("Checksum: " + csumi.getChecksum().getValue());
        bis.close();
        System.out.println("___________________________________________");
        System.out.println("Alternative way to open and read Zip files:");
        System.out.println("___________________________________________");
        ZipFile zf = new ZipFile("testZipCompress.zip");
        Enumeration<? extends ZipEntry> e = zf.entries();
        FileInputStream f2 = new FileInputStream("testZipCompress.zip");
        CheckedInputStream csumi2 =
                new CheckedInputStream(f2, new Adler32());
        ZipInputStream in3 = new ZipInputStream(csumi2);
        BufferedInputStream bis2 = new BufferedInputStream(in3);
        while(e.hasMoreElements()) {
            ZipEntry ze2 = e.nextElement();
            System.out.println("File: " + ze2);

            while ((ze2 = in3.getNextEntry())!=null){
                System.out.println("Reading file " + ze2);
                System.out.println("-------------------");
                int x;
                while((x = bis2.read()) != -1)
                      System.out.write(x);
            }
        }
        if(args.length == 1)
            System.out.println("Checksum: " + csumi.getChecksum().getValue());
        bis2.close();
    }
}

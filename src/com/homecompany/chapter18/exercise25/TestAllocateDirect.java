package com.homecompany.chapter18.exercise25;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.util.Random;

public class TestAllocateDirect {
    private static int reps = 10000;
    private static int bsize = 1024*2;
    private static Random random = new Random();

    private abstract static class Tester {
        private String name;

        public Tester(String name) {
            this.name = name;
        }

        public abstract void test() throws IOException;

        public void runTest() {
            System.out.println(name + ": ");
            try {
                long start = System.nanoTime();
                test();
                double duration = System.nanoTime() - start;
                System.out.format("%.2f\n", (duration/1.0e6));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
        private static Tester[] tests = {
                new Tester("DoubleBufferDemo") {
                    @Override
                    public void test() throws IOException {
                        for (int i = 0; i < reps; i++) {
                            ByteBuffer bb = ByteBuffer.allocate(bsize);
                            DoubleBuffer db = bb.asDoubleBuffer();
                            for (int j = 0; j < db.limit(); j++) {
                                db.put(random.nextInt(bsize));
                            }
                            db.put(3, 200.2);
                            db.flip();
                            while (db.hasRemaining()) {
                                double d = db.get();
                            }
                            db.clear();
                            bb.clear();
                        }
                    }
                },
                new Tester("DoubleBufferDemo with allocate direct") {
                    @Override
                    public void test() throws IOException {
                        for (int i = 0; i < reps; i++) {
                            ByteBuffer bb = ByteBuffer.allocateDirect(bsize);
                            DoubleBuffer db = bb.asDoubleBuffer();
                            for (int j = 0; j < db.limit(); j++) {
                                db.put(random.nextInt(bsize));
                            }
                            db.put(3, 200.2);
                            db.flip();
                            while (db.hasRemaining()) {
                                double d = db.get();
                            }
                            db.clear();
                            bb.clear();
                        }
                    }
                }
        };


    public static void main(String[] args) {
        for (Tester test: tests) {
            test.runTest();
        }
    }
}
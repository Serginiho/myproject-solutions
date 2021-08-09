package com.homecompany.chapter17.exercise28;

import org.jetbrains.annotations.NotNull;

public class TupleG {
    public static class T2<A,B> implements Comparable<T2<A,B>>{
        private final A a;
        private final B b;
        T2 (A a, B b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            T2<?, ?> t2 = (T2<?, ?>) o;
            return a.equals(t2.a) && b.equals(t2.b);
        }

        @Override
        public int hashCode() {
            int result = 17;
            if (a != null)
                result = 37*result + a.hashCode();
            if (b != null)
                result = 37*result + b.hashCode();
            return result;
        }
        @SuppressWarnings("unchecked")
        @Override
        public int compareTo(@NotNull TupleG.T2<A, B> o) {
            return ((Comparable<A>)a).compareTo(o.a) !=0 ? ((Comparable<A>)a).compareTo(o.a) : ((Comparable<B>)b).compareTo(o.b);
        }

        @Override
        public String toString() {
            return "(" + a +
                    ", " + b +
                    ')';
        }

        public A getA() {
            return a;
        }

        public B getB() {
            return b;
        }
    }
    public static class T3<A,B,C> implements Comparable<T3<A,B,C>>{
        private final T2<A,B> tuple;
        private final C c;
        T3(A a, B b, C c) {
            this.tuple = new T2<>(a,b);
            this.c = c;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            T3<?, ?, ?> t3 = (T3<?, ?, ?>) o;
            return tuple.equals(t3.tuple) && c.equals(t3.c);
        }

        @Override
        public int hashCode() {
            int result = tuple.hashCode();
            if (c != null)
                result = 37*result + c.hashCode();
            return result;
        }
        @SuppressWarnings("unchecked")
        @Override
        public int compareTo(@NotNull TupleG.T3<A, B, C> o) {
            return ((Comparable<T2<A,B>>)tuple).compareTo(o.tuple) !=0 ? ((Comparable<T2<A,B>>)tuple).compareTo(o.tuple) :
                    ((Comparable<C>)c).compareTo(o.c);
        }

        @Override
        public String toString() {
            return "(" + tuple.getA() + ", " + tuple.getB() +
                    ", " + c +
                    ')';
        }

        public A getA() {
            return tuple.getA();
        }
        public B getB() {
            return tuple.getB();
        }
        public C getC() {
            return c;
        }
    }
    public static class T4<A,B,C,D> implements Comparable<T4<A,B,C,D>>{
        private final T3<A,B,C> tuple;
        private final D d;
        public T4(A a, B b, C c, D d) {
            this.tuple = new T3<>(a,b,c);
            this.d = d;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            T4<?, ?, ?, ?> t4 = (T4<?, ?, ?, ?>) o;
            return tuple.equals(t4.tuple) && d.equals(t4.d);
        }

        @Override
        public int hashCode() {
            int result = tuple.hashCode();
            if (d != null)
                result = 37*result + d.hashCode();
            return result;
        }
        @SuppressWarnings("unchecked")
        @Override
        public int compareTo(@NotNull TupleG.T4<A, B, C, D> o) {
            return tuple.compareTo(o.tuple) !=0 ? tuple.compareTo(o.tuple) : ((Comparable<D>)d).compareTo(o.d);
        }
        public A getA () {
            return tuple.getA();
        }
        public B getB () {
            return tuple.getB();
        }
        public C getC () {
            return tuple.getC();
        }
        public D getD () {
            return d;
        }

        @Override
        public String toString() {
            return "(" + tuple.getA() + ", " + tuple.getB() + ", " + tuple.getC() +
                    ", " + d +
                    ')';
        }
    }
    public static class T5<A,B,C,D,E> implements Comparable<T5<A,B,C,D,E>>{
        private final T4<A,B,C,D> tuple;
        private final E e;
        T5(A a, B b, C c, D d, E e) {
            this.tuple = new T4<>(a,b,c,d);
            this.e = e;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            T5<?, ?, ?, ?, ?> t5 = (T5<?, ?, ?, ?, ?>) o;
            return tuple.equals(t5.tuple) && e.equals(t5.e);
        }

        @Override
        public int hashCode() {
            int result = tuple.hashCode();
            if (e != null)
                result = 37*result + e.hashCode();
            return result;
        }
        @SuppressWarnings("unchecked")
        @Override
        public int compareTo(@NotNull TupleG.T5<A, B, C, D, E> o) {
            return tuple.compareTo(o.tuple) !=0 ? tuple.compareTo(o.tuple) : ((Comparable<E>)e).compareTo(o.e);
        }
        public A getA () {
            return tuple.getA();
        }
        public B getB () {
            return tuple.getB();
        }
        public C getC () {
            return tuple.getC();
        }
        public D getD() {
            return tuple.getD();
        }
        public E getE () {
            return e;
        }
        @Override
        public String toString() {
            return "(" + tuple.getA() + ", " + tuple.getB() + ", " + tuple.getC() +
                    ", " + tuple.getD() + ", " + e +
                    ')';
        }
    }
    public static class T6<A,B,C,D,E,F> implements Comparable<T6<A,B,C,D,E,F>>{
        private final T5<A,B,C,D,E> tuple;
        private final F f;
        T6 (A a,B b,C c,D d,E e,F f) {
            this.tuple = new T5<>(a,b,c,d,e);
            this.f = f;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            T6<?, ?, ?, ?, ?, ?> t6 = (T6<?, ?, ?, ?, ?, ?>) o;
            return tuple.equals(t6.tuple) && f.equals(t6.f);
        }

        @Override
        public int hashCode() {
            int result = tuple.hashCode();
            if (f != null)
                result = 37*result + f.hashCode();
            return result;
        }
        @SuppressWarnings("unchecked")
        @Override
        public int compareTo(@NotNull TupleG.T6<A, B, C, D, E, F> o) {
            return tuple.compareTo(o.tuple) !=0 ? tuple.compareTo(o.tuple) : ((Comparable<F>)f).compareTo(o.f);
        }
        @Override
        public String toString() {
            return "(" + tuple.getA() + ", " + tuple.getB() + ", " + tuple.getC() +
                    ", " + tuple.getD() + ", " + tuple.getE() + ", " + f +
                    ')';
        }
    }
    public static  <A,B> T2<A,B> tuple (A a, B b) {
        return new T2<>(a,b);
    }
    public static <A,B,C> T3<A,B,C> tuple (A a, B b, C c) {
        return new T3<>(a,b,c);
    }
    public static <A,B,C,D> T4<A,B,C,D> tuple (A a, B b, C c, D d) {
        return new T4<>(a,b,c,d);
    }
    public static <A,B,C,D,E> T5<A,B,C,D,E> tuple (A a, B b, C c, D d, E e) {
        return new T5<>(a,b,c,d,e);
    }
    public static <A,B,C,D,E,F> T6<A,B,C,D,E,F> tuple (A a,B b,C c,D d,E e,F f){
        return new T6<>(a,b,c,d,e,f);
    }
}

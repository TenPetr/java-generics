package com.tenpetr;

public interface NodeListGenerics<T> {

        void add(T s);

        Node<T> get(int index);

        void remove(int index);
}

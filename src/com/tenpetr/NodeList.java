package com.tenpetr;

import java.util.ArrayList;

public class NodeList<T> implements NodeListGenerics<T> {

    private ArrayList<Node<T>> list = new ArrayList<>();

    @Override
    public void add(T s) {
        var node = new Node<T>();
        node.setObject(s);

        list.add(node);
    }

    @Override
    public Node<T> get(int index) {
        return list.get(index);
    }

    @Override
    public void remove(int index) {
        list.remove(index);
    }
}

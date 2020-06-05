package com.tenpetr;

import java.util.ArrayList;

public class NodeList implements NodeListGenerics {

    private ArrayList<Node<String>> list = new ArrayList<>();

    @Override
    public void add(String s) {
        var node = new Node<String>();
        node.setText(s);

        list.add(node);
    }

    @Override
    public Node<String> get(int index) {
        return list.get(index);
    }

    @Override
    public void remove(int index) {
        list.remove(index);
    }
}

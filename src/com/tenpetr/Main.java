package com.tenpetr;

public class Main {

    public static void main(String[] args) {
        var nodeList = new NodeList<Object>();

        nodeList.add("Hello");
        nodeList.add("Java");
        nodeList.add(50);

        System.out.println(nodeList.get(1).getObject());
        System.out.println(nodeList.get(2).getObject());

        nodeList.remove(2);
    }
}

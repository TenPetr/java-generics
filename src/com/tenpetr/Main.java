package com.tenpetr;

public class Main {

    public static void main(String[] args) {
        var nodeList = new NodeList();

        nodeList.add("Hello");
        nodeList.add("Java");
        nodeList.add("Generics!");

        System.out.println(nodeList.get(1).getText());

        nodeList.remove(2);
    }
}

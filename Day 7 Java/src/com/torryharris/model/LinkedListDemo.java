package com.torryharris.model;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListDemo {
    public static void main(String[] args) {
        String name[]={"jp","prasad"};
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Jp");
        linkedList.add("Divya");
        linkedList.add("Anil");
        linkedList.add("Arun");
        linkedList.addAll(Arrays.asList(name));
        System.out.println(linkedList);
        Stack<Integer> integerStack=new Stack<>();
        integerStack.push(45);
        integerStack.push(5);
        integerStack.push(55);
        integerStack.push(15);
        System.out.println(integerStack);
        System.out.println(integerStack.peek());
        integerStack.pop();
        System.out.println(integerStack);
    }
}

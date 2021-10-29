package com.torryharris.model;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap();
        hashMap.put(1,"Jp");
        hashMap.put(0,"Hi");
        hashMap.put(2,"Hello");
        hashMap.put(3,"Demo");
        hashMap.put(4,"Hash");
        System.out.println("---Method 1---");
        Iterator iteratorMap=hashMap.entrySet().iterator();
        while (iteratorMap.hasNext()){
            System.out.println(iteratorMap.next());
        }
        System.out.println("---Method 2---");
        for (Integer key:hashMap.keySet()) {
            System.out.println(hashMap.get(key));
        }
        System.out.println("---Method 3---");
        hashMap.entrySet().forEach(System.out::println);

        System.out.println("---Method 4---");
        System.out.println(Arrays.asList(hashMap));

        System.out.println("---Method 5----");
        System.out.println(Collections.singleton(hashMap));

        System.out.println("---Method 6----");
        for (Map.Entry<Integer,String> entry:hashMap.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }


    }
}

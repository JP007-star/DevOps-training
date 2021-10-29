package com.torryharris.driver;

import com.torryharris.model.Cow;
import com.torryharris.model.Mammal;
import com.torryharris.model.Tiger;

public class MammalDemo {
    public static void main(String[] args) {
        Mammal tiger=new Tiger();
        Mammal cow=new Cow();
        cow.eat();
        cow.feed();
        tiger.feed();
        tiger.eat();

    }
}

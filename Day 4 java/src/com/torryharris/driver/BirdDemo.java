package com.torryharris.driver;

import com.torryharris.model.Bat;
import com.torryharris.model.Bird;
import com.torryharris.model.Peacock;
import com.torryharris.model.Pigeon;

public class BirdDemo {
    public static void main(String[] args) {
        Bird peacock=new Peacock();
        Bird pigeon=new Pigeon();
        Bat bat=new Bat();
        peacock.fly();
        pigeon.eat();
        peacock.eat();
        pigeon.fly();
        bat.fly();
        bat.eat();
        bat.feed();
    }
}

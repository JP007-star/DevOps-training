package com.torryharris.driver;

import com.torryharris.model.*;

public class CarTypeDemo {
    public static void main(String[] args) {
        Tyre mrf=new Tyre("mrf",16);
        MusicSystem jbl=new MusicSystem("jbl",2,true,15);
        HatchBack swift=new HatchBack("swift","petrol",200,300,6,mrf,jbl,"powersteering");
        Sedan aspire=new Sedan("aspire","petrol",300,400,6,mrf,jbl,5);
        SUV xlu=new SUV("xlv","diesel",350,400,6,mrf,jbl,"eco",true);
        swift.displayHatchBackFeatures();
        aspire.displaySedanFeatures();
        xlu.displaySUVFeatures();
    }

}

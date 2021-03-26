package com.company;

public class Main {

    public static void main(String[] args) {

        Bird objectA=new Bird("itelgi",4,Color.BROWN,"Kyrgyzstan");
        objectA.makevoice("kruk kruk");
        objectA.makevoice(2);
        System.out.println(objectA.getInfo()+ objectA.getMakeVoice());

        Egle objectB=new Egle("орел",15,Color.BLACK,"Ala-Too",20);
        System.out.println(objectB.getInfo()+objectB.getMakeVoice());
        objectB.makevoice("чыыйк-чыыйк");
        Egle objectC =new Egle("Ходовый",7,Color.BLACK,"Uluu-Too",10);
        System.out.println(objectC.getInfo()+objectC.getMakeVoice());
        objectC.makevoice("чиик-чиик");

    }
}

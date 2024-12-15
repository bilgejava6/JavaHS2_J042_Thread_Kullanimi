package com.muhammet;

import java.util.ArrayList;

public class Runner_Ornek2 {
    public static void main(String[] args) {
        /**
         * Deger sınıfından bir nesne türetilir ve adresi deger değişkenine atanır
         */
        Deger deger = new Deger(10000);
        // 1. 100 kez arttırım
        Arttirim arttirim = new Arttirim(deger);
        arttirim.start();
        //2. 100 kez azaltım
        Azaltim azaltim = new Azaltim(deger);
        azaltim.start();
       // System.out.println("Değer in son durumu.....: "+ deger.sayi);
    }
}

class Deger{
    public int sayi;
    public Deger(int sayi){
        this.sayi = sayi;
    }
}

class Arttirim extends Thread{
    Deger d;
    public Arttirim(Deger d){
        this.d = d;
    }
    public void run(){
        for (int i=0; i<10000; i++){
            d.sayi++;
            System.out.println(d.sayi);
        }
    }
}

class Azaltim extends Thread{
    Deger d;
    public Azaltim(Deger d){
        this.d = d;
    }
    public void run(){
        for (int i=0; i<10000; i++){
            d.sayi--;
            System.out.println(d.sayi);
        }
    }
}
package com.muhammet;

public class Runner_OneProcess_MultiThread {
    public static void main(String[] args) {
        System.out.println("""
                *** Program Başladı ***
                """);
        new Thread(()->{
            System.out.println("--- Tek Sayılar ---");
            for (int i = 0; i < 10; i++) {
                if(i%2==1)
                    System.out.println("TEK: "+i);
            }
        }).start();
        new Thread(()->{
            System.out.println("Ben Bekliyorum.");
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Bekleme bitti.");
            System.out.println("--- Çift Sayılar ---");
            for (int i = 0; i < 10; i++) {
                if(i%2==0)
                    System.out.println("ÇİFT: "+i);
            }
        }).start();
        System.out.println("""
                *** Program Bitti. ***
                """);
    }
}

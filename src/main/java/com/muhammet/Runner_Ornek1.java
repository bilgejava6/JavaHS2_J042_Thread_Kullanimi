package com.muhammet;

public class Runner_Ornek1 {
    public static void main(String[] args) {
        System.out.println("""
                **** Program Başladı ****
                """);

        new Thread(()->{
            for (int i=0;i<5;i++){
                try{
                    Thread.sleep(2000L);
                }catch (Exception ex){}
                System.out.println(i);
            }
        }).start();

        new Thread(()->{
            String[] gunler = {"Pzt.","Sl.","Çrş.","Per.","Cu.","Cum.","Paz."};
            for (int i=0;i<gunler.length;i++){
                try{
                    Thread.sleep(800L);
                }catch (Exception ex){}
                System.out.println(gunler[i]);
            }
        }).start();

        System.out.println("""
                **** Program Bitti. ****
                """);
    }
}

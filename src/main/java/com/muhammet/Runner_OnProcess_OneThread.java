package com.muhammet;

public class Runner_OnProcess_OneThread {
    /**
     * Tek Cpu, Tek Process, Tek Thread
     * MainThread
     */
    public static void main(String[] args) {
        System.out.println("""
                *** Uygulama Başladı ***
                """);
        for (int i=0; i<10;i++){
            if (i%2==0) System.out.println(i);
        }
        System.out.println("""
                *** Tek sayılar Yazılıyor... ***
                """);
        for (int i=0; i<10;i++){
            if (i%2==1) System.out.println(i);
        }

        System.out.println("""
                *** Uygulama Bitti ***
                """);
    }
}

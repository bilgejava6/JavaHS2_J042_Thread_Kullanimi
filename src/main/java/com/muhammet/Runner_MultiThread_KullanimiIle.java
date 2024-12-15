package com.muhammet;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner_MultiThread_KullanimiIle {
    private static Long startTime;
    private static String[] burclar = {"koc","boga","ikizler","yengec","aslan","basak","terazi","akrep","yay","oglak","kova","balik"};
    public static void main(String[] args) {
            startTime = System.currentTimeMillis();
            List<String> yeniburcList = Arrays.asList(burclar);
            ExecutorService service = Executors.newCachedThreadPool();
            yeniburcList.forEach(burc->{
                service.submit(()-> yorumYap(burc));
            });
            Long endTime = System.currentTimeMillis();
            Long totalTime = endTime - startTime;
        System.out.println("Geçen süre....: "+ totalTime);
    }

    private static void yorumYap(String burc){
        Scanner scanner=null;
        try{
            scanner = new Scanner(
                    URL.of(URI.create("https://www.elle.com.tr/astroloji/"+burc), null).openStream(),"UTF-8"
            );
        }catch (Exception exception){
            System.out.println("Sorun oluştu.....: "+ exception);
        }
        List<String> yorum = new ArrayList<>();
        while (scanner.hasNext()){
            String row = scanner.nextLine();
            if(row.contains("<p>")){
                yorum.add(row.trim()); break;
            }

        }
        System.out.println(burc+" nın yorumu....: "+yorum);
        System.out.println(burc+" için geçen süre...: "+ (System.currentTimeMillis()- startTime));
    }
}

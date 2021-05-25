package com.company.devices;

import com.company.Human;
import com.company.Sellable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device implements Sellable {
    final Double screenSize;
    final String operationSystem;
    final static public String DEFAULT_SERVER_ADDRESS="appserver.com";
    final static public String DEFAULT_VERSION="latest";
    final static public String DEFAULT_PROTOCOL="https";

    public Phone(String producer, String model, Double screenSize, String operationSystem, Integer yearOfProduction) {
        super(producer,model,yearOfProduction);
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    @Override
    public void turnOn() {
        System.out.println("Naduszam guzika");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone != this){
            System.out.println("Nie można sprzedać czegoś czego się nie ma");
        } else if(buyer.cash<price){
            System.out.println("Nie stać Cię");
        } else {
            seller.cash+=price;
            buyer.cash-=price;
            buyer.phone= seller.phone;
            seller.phone=null;
            System.out.println("Transakcja przebiegła pomyślnie");
        }
    }
    public void installAnApp(String appName){ this.installAnApp(appName,"latest");}

    public void installAnApp(String appName,String version){
        this.installAnApp(appName,version,DEFAULT_SERVER_ADDRESS);
    }

    public void installAnApp(String appName, String version, String address){
        try {
            URL url = new URL("https",address,appName+"_"+version);
            this.installAnApp(url);
        } catch(MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public void installAnApp(URL url){
        System.out.println("pobieram aplikację "+url.getFile()+" z adresu "+url.getHost());
        System.out.println("instaluję aplikację "+url.getFile());
    }
    public void installAnApp(List<String> appNames){
        for (String appName:appNames){
            this.installAnApp(appName);
        }
    }
    public void installAnApp(String[] appNames){
        for (String appName:appNames){
            this.installAnApp(appName);
        }
    }
}

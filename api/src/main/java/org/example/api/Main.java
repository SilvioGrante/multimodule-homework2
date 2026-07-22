package org.example.api;

import org.example.db.MyEntity;
import org.example.service.MyService;

public class Main {

    public static void main(String[] args) {

        MyService myService = new MyService();

        System.out.println(myService.getMyEntity());

        System.out.println(
                myService.setMyEntity(new MyEntity("second"))
        );

        System.out.println(myService.getMyEntity());
    }
}

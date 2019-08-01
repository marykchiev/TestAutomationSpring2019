package com.cybertek;


import com.github.javafaker.Faker;

public class FakerTester {
    public static void main(String[] args) {
        Faker faker= new Faker();
        System.out.println(faker.firstName());
        System.out.println(faker.lastName());

    }
}

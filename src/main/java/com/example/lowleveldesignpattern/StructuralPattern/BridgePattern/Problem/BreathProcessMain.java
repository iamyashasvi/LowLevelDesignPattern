package com.example.lowleveldesignpattern.StructuralPattern.BridgePattern.Problem;

public class BreathProcessMain {

    public static void main(String[] args) {

        System.out.println("Bridge design pattern problem...");

        AbstractLivingThings DogObj = new Dog();
        DogObj.breath();

        AbstractLivingThings FishObj = new Fish();
        FishObj.breath();

        AbstractLivingThings TreeObj = new Tree();
        TreeObj.breath();

        System.out.println("End....");
    }
}

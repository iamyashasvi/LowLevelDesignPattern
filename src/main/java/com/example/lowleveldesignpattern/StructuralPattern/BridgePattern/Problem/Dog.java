package com.example.lowleveldesignpattern.StructuralPattern.BridgePattern.Problem;

public class Dog extends AbstractLivingThings{

    //    breath is tightly coupled with the AbstractLivingThings.
    @Override
    public void breath() {
        System.out.println("Dog breath through nose, inhale air and exhale co2.");
    }
}

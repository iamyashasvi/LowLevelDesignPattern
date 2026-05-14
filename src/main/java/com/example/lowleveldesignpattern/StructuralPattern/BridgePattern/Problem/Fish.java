package com.example.lowleveldesignpattern.StructuralPattern.BridgePattern.Problem;

public class Fish extends AbstractLivingThings{
    //    breath is tightly coupled with the AbstractLivingThings.
    @Override
    public void breath() {
        System.out.println("Fish ihale air from gill and exhale co2.");
    }
}

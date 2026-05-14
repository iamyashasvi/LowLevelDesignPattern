package com.example.lowleveldesignpattern.StructuralPattern.BridgePattern.Problem;

public class Tree extends AbstractLivingThings{

    //    breath is tightly coupled with the AbstractLivingThings.
    @Override
    public void breath() {
        System.out.println("Tree inhale co2 and exhale air during day time, using photo synthesis process.");
    }
}

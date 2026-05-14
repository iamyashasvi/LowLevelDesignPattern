package com.example.lowleveldesignpattern.StructuralPattern.BridgePattern.Solution;

public class Fish extends AbstractLivingThings{


    public Fish(InterfaceBreathingProcess interfaceBreathingProcess){
        super(interfaceBreathingProcess);
    }

    @Override
    public void breath() {
        System.out.println("Fish breath...");
        interfaceBreathingProcess.breath();
    }
}

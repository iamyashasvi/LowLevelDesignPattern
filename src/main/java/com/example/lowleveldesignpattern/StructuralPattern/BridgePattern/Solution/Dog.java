package com.example.lowleveldesignpattern.StructuralPattern.BridgePattern.Solution;

public class Dog extends AbstractLivingThings{

    public Dog(InterfaceBreathingProcess interfaceBreathingProcess){
        super(interfaceBreathingProcess);
    }

    @Override
    public void breath() {
        System.out.println("Dog breath process....");
        interfaceBreathingProcess.breath();
    }
}

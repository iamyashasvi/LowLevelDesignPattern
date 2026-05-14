package com.example.lowleveldesignpattern.StructuralPattern.BridgePattern.Solution;

public class Tree extends AbstractLivingThings{

    public Tree(InterfaceBreathingProcess interfaceBreathingProcess){
        super(interfaceBreathingProcess);
    }

    @Override
    public void breath() {
        System.out.println("Tree breath process...");
        interfaceBreathingProcess.breath();
    }
}

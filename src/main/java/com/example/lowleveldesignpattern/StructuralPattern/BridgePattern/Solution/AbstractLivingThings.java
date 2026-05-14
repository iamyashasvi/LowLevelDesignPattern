package com.example.lowleveldesignpattern.StructuralPattern.BridgePattern.Solution;

public abstract class AbstractLivingThings {

    InterfaceBreathingProcess interfaceBreathingProcess;

    public AbstractLivingThings(InterfaceBreathingProcess interfaceBreathingProcess){
        this.interfaceBreathingProcess = interfaceBreathingProcess;
    }

    public abstract void breath();
}

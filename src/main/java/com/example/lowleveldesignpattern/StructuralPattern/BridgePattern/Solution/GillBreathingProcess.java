package com.example.lowleveldesignpattern.StructuralPattern.BridgePattern.Solution;

public class GillBreathingProcess implements InterfaceBreathingProcess{

    @Override
    public void breath() {
        System.out.println("GillBreathingProcess..... breath");
    }
}

package com.example.lowleveldesignpattern.StructuralPattern.BridgePattern.Solution;

public class LungBreathingProcess implements InterfaceBreathingProcess {

    @Override
    public void breath() {
        System.out.println("LungBreathingProcess...... breath");
    }
}

package com.example.lowleveldesignpattern.StructuralPattern.BridgePattern.Solution;

public class BreathProcessMain {

    public static void main(String[] args) {
        InterfaceBreathingProcess lungBreathProcessObj = new LungBreathingProcess();

        Dog dogObj = new Dog(lungBreathProcessObj);
        dogObj.breath();

        InterfaceBreathingProcess photoSynthesisBreathProcessObj = new PhotoSynthesisBreathingProcess();
        AbstractLivingThings treeObj = new Tree(photoSynthesisBreathProcessObj);
        treeObj.breath();

        InterfaceBreathingProcess gillBreathingProcessObj = new GillBreathingProcess();
        AbstractLivingThings fishObj = new Fish(gillBreathingProcessObj);
        fishObj.breath();
    }

}

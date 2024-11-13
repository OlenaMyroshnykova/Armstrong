package com.armstrong.controllers;

import com.armstrong.models.ArmstrongModel;
import com.armstrong.views.View;

public class StartController {
    
    private static ArmstrongModel model = new ArmstrongModel();
    private static View view = new View();
        
    public static void checkNumber(int number) {
        boolean isArmstrong = model.isArmstrong(number);
        view.showResult(number, isArmstrong);
    } 
}
package main.java.com.armstrong.controllers;

import main.java.com.armstrong.models.ArmstrongModel;
import main.java.com.armstrong.views.View;

public class StartController {
    
    private static ArmstrongModel model = new ArmstrongModel();
    private static ArmstrongView view = new View();
        
        public static void checkNumber(int number) {
            boolean isArmstrong = model.isArmstrong(number);
        view.showResult(number, isArmstrong);
    } 
}
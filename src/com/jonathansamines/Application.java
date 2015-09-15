package com.jonathansamines;

import com.jonathansamines.views.CalculatorView;
import java.awt.EventQueue;

/**
 * Application
 * Main entry point for application
 * @author jonathansamines
 */
public class Application {
  
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new CalculatorView().setVisible(true);
            }
        });
    }
}

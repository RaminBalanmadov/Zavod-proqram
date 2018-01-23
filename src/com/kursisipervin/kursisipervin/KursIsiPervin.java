package com.kursisipervin.kursisipervin;

import com.kursisipervin.screenframe.Screen;


public class KursIsiPervin {

     public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }

}

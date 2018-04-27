/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlasnemenu;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

/**
 *
 * @author Dominik
 */
public class WlasneMenu extends JFrame{
    
    WlasneMenu(){
        initComponents();
    }
    public void initComponents(){
        this.setTitle("Własne menu");
        this.setBounds(300, 300, 330, 300);
        this.setDefaultCloseOperation(3);
        
        kontener.add(panelMenu);
        panelMenu.setLayout(new GridLayout(3,1));
        panelMenu.add(menu1);
        panelMenu.add(menu2);
        panelMenu.add(menu3);
        
        
        
    }
   
    private Container kontener = this.getContentPane();
    private JPanel panelMenu = new JPanel();
    private MenuButton menu1 = new MenuButton("1. Dodaj");
    private MenuButton menu2 = new MenuButton("1. Usuń");
    private MenuButton menu3 = new MenuButton("1. Zmień");


   private class MenuButton extends JButton implements FocusListener{
       public MenuButton(String nazwa){
           super(nazwa);
           this.addFocusListener(this);
           this.setBackground(kDefault);
       }

        @Override
        public void focusGained(FocusEvent fe) {
            this.setBackground(kFocusGained);
        }

        @Override
        public void focusLost(FocusEvent fe) {
           this.setBackground(kDefault);
        }
        
            private Color kFocusGained = Color.GRAY;
            private Color kDefault = Color.LIGHT_GRAY;
   } 
    
    public static void main(String[] args) {
        new WlasneMenu().setVisible(true);
    }
    
}

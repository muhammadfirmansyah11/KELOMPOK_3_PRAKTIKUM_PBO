/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum8;

/**
 *
 * @author firman
 */
import javax.swing.*;
public class Praktikum8 {
    public static void main(String[] args) {
      //Memanggil JFrame
      JFrame frame = new JFrame ("Contoh JFrame");
      
      //Menentukan size
      frame.setSize(400, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //Frame terlihat
      frame.setVisible(true);
      
      //Posisi di tengah
      frame.setLocationRelativeTo(null);
      
      //label
      JLabel label = new JLabel ("Contoh label", SwingConstants.CENTER);
      
      //Text Field
      JTextField textField = new JTextField(20);
      frame.add (textField);
      
      //Button
      JButton button = new JButton ("Button");
      frame.add(button);
      
    }
}

package Atividades01;

import javax.swing.JOptionPane;

public class exercicio06 {
    
    public static void main(String[] args) {
        
        String menu = "Escolha uma cidade";
               menu+= "\n1)Mexico";
               menu+= "\n2)Nova Iorque";
               menu+= "\n3)Paris";

         int cidade = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

         int horario = Integer.parseInt(JOptionPane.showInputDialog(null, "qual o horario de Brasilia"));

         //retorno
         JOptionPane.showMessageDialog(null, cidade == 1 ? horario+3 : cidade == 2 ? horario+4 : horario+2);

        }


    }


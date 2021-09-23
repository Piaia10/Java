package Atividades01;

import javax.swing.JOptionPane;

public class exercicio04 {

    public static void main(String[] args) {
        
        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o ano"));

        JOptionPane.showMessageDialog(null, ano % 4 == 0 ? "é bissexto" : "não é bissexto");
    }
    
}

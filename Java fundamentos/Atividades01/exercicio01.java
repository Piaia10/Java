package Atividades01;

import javax.swing.JOptionPane;

public class exercicio01 {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog(null, " informe seu nome");
        String idade = JOptionPane.showInputDialog(null, "informe sua idade");
        String cidade = JOptionPane.showInputDialog(null, " informe a cidade que você mora");

        JOptionPane.showMessageDialog(null, "Bom dia " +nome+ ", você tem " +idade+ " anos, atualmente mora na cidade de " +cidade);

    }
    
}

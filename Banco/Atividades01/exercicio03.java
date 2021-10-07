package Atividades01;

import javax.swing.JOptionPane;

public class exercicio03 {

    public static void main(String[] args) {

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "informe a 1ª nota"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "informe a 2ª nota"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "informe a 3ª nota"));

        double media = (nota1 + nota2 + nota3) / 2;

        if (media >= 7) {
            JOptionPane.showMessageDialog(null, "aprovado com média " + media);
        } else {
            JOptionPane.showMessageDialog(null, "reprovado com média " + media);
        }

    }

}

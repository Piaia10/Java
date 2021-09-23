package Atividades01;

import javax.swing.JOptionPane;

public class exercicio02 {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "informe um número"));

        String mensagem = numero < 0 ? "negativo" : "positivo";

        mensagem += "\n";

        mensagem += numero % 2 == 0 ? "par" : "ímpar";

        JOptionPane.showMessageDialog(null, mensagem);
    }
}

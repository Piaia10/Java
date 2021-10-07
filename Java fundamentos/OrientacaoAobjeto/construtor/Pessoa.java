package construtor;

import javax.swing.JOptionPane;

public class Pessoa {
    
    // construtor
    public Pessoa(){
        JOptionPane.showMessageDialog(null, "hello World");
    }

    public Pessoa(String nome){
        JOptionPane.showMessageDialog(null, "olá " +nome);
    }

    public Pessoa(String nome, int idade){
        JOptionPane.showMessageDialog(null, "olá "+nome+" você tem "+idade+" anos");
    }

}

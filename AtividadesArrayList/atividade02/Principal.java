package AtividadesArrayList.atividade02;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        // vetor
        ArrayList<Pessoa> dados = new ArrayList<Pessoa>();

        String menu = "o que deseja fazer?\n";
        menu += "1) cadastrar\n";
        menu += "2) listar\n";
        menu += "3) remover\n";
        menu += "4) sair";

        // variavel para sair do laço
        boolean continuar = true;

        // laço
        do {

            // obter a opçao
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            // escolha
            switch (opcao) {
                case 1:
                  
                   Pessoa p = new Pessoa();
                   p.nome = JOptionPane.showInputDialog(null, "informe o nome");
                   p.cidade = JOptionPane.showInputDialog(null, "informe a cidade");
                   p.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "informe a idade"));

                   dados.add(p);

                   JOptionPane.showMessageDialog(null, "cadastro efetuado com sucesso!");
                break;

                case 2:
                    //lista de pessoas
                    String lista = "pessoas cadastradas\n";

                    //laço
                    for(int i=0; i<dados.size(); i++){
                        lista += "\nnome: " + dados.get(i).nome;
                        lista += "\ncidade: " + dados.get(i).cidade;
                        lista += "\nidade: " + dados.get(i).idade;
                        lista += "\n------------";
                    }

                    //exibir lista
                    JOptionPane.showMessageDialog(null, lista);
                    break;

                case 3:

                 //lista de nomes
                 String nomes = "selecione a pessoa\n";

                 //laço
                 for(int i=0; i<dados.size(); i++){
                    nomes += (i+1) + ")"  + dados.get(i).nome + "\n";
                 }
            
                  int indice = Integer.parseInt(JOptionPane.showInputDialog(null, nomes));

                  dados.remove(indice-1);

                  JOptionPane.showMessageDialog(null, "pessoa removida com sucesso!");

                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "sair");
                    continuar = false;
                    break;

            }
        } while (continuar == true);

    }

}

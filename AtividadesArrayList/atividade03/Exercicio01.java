package AtividadesArrayList.atividade03;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {

        // Criar um sistema para cadastrar, selecionar e remover produtos.
        // Crie uma classe chamada Produto com os atributos nome, marca e valor.

        // vetor
        ArrayList<Produto> dados = new ArrayList<Produto>();

        String menu = "o que deseja fazer?\n";
        menu += "1) cadastrar\n";
        menu += "2) selecionar\n";
        menu += "3) remover produto\n";
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

                    Produto p = new Produto();
                    p.nome = JOptionPane.showInputDialog(null, "informe o nome");
                    p.marca = JOptionPane.showInputDialog(null, "informe a marca do produto");
                    p.valor = Double.parseDouble(JOptionPane.showInputDialog(null, "informe o valor do produto"));

                    dados.add(p);

                    JOptionPane.showMessageDialog(null, "cadastro efetuado com sucesso!");
                    break;

                case 2:
                    // lista de pessoas
                    String lista = "produtos cadastrados\n";

                    // laço
                    for (int i = 0; i < dados.size(); i++) {
                        lista += "\nnome: " + dados.get(i).nome;
                        lista += "\nmarca: " + dados.get(i).marca;
                        lista += "\nvalor: " + dados.get(i).valor;
                        lista += "\n------------";
                    }

                    // exibir lista
                    JOptionPane.showMessageDialog(null, lista);
                    break;

                case 3:

                    // lista de nomes
                    String nomes = "selecione o produto\n";

                    // laço
                    for (int i = 0; i < dados.size(); i++) {
                        nomes += (i + 1) + ")" + dados.get(i).nome + "\n";
                    }

                    int indice = Integer.parseInt(JOptionPane.showInputDialog(null, nomes));

                    dados.remove(indice - 1);

                    JOptionPane.showMessageDialog(null, "produto removida com sucesso!");

                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "sair");
                    continuar = false;
                    break;

            }
        } while (continuar == true);

    }
}

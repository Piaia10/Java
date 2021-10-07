package AtividadesArrayList.atividade05;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class cadastro {

    public static void main(String[] args) {

        ArrayList<Carro> dados = new ArrayList<Carro>();

        String menu = "o que você deseja fazer?\n";
        menu += "1) cadastrar\n";
        menu += "2) selecionar\n";
        menu += "3) alterar carro\n";
        menu += "4) remover carro\n";
        menu += "5) sair\n";

        boolean continuar = true;

        do {

            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch(opcao) {

                case 1:
               
                Carro c = new Carro();
                c.modelo = JOptionPane.showInputDialog(null, "Informe o modelo");
                c.fabricante = JOptionPane.showInputDialog(null, "informe o fabricante do modelo");
                c.valor = Double.parseDouble(JOptionPane.showInputDialog(null, "informe o valor"));
                c.ano = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o ano"));
                c.cor = JOptionPane.showInputDialog(null, "informe a cor");

                
                dados.add(c);

                JOptionPane.showMessageDialog(null, "cadastro efetuado com sucesso!");
                break;

                case 2:
             
                String lista = "produtos cadastrados\n";

                for (int i = 0; i < dados.size(); i++) {
                    lista += "\nmodelo: " + dados.get(i).modelo;
                    lista += "\nfabricante: " + dados.get(i).fabricante;
                    lista += "\nvalor: " + dados.get(i).valor;
                    lista += "\nano: " + dados.get(i).ano;
                    lista += "\ncor: " + dados.get(i).cor;
                    lista += "\n------------";
                }

               
                JOptionPane.showMessageDialog(null, lista);
                break;

                case 3:

                String selecionarCarro = "Selecione o carro que deseja alterar\n";

                for(int i=0; i<dados.size(); i++){
                    selecionarCarro += (i+1) + " - " + dados.get(i).modelo + "\n";
                }
     
                int indice = Integer.parseInt(JOptionPane.showInputDialog(null, selecionarCarro));

                Carro c2 = new Carro();
                c2.modelo = JOptionPane.showInputDialog(null, "Informe o modelo");
                c2.fabricante = JOptionPane.showInputDialog(null, "informe o fabricante do modelo");
                c2.valor = Double.parseDouble(JOptionPane.showInputDialog(null, "informe o valor"));
                c2.ano = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o ano"));
                c2.cor = JOptionPane.showInputDialog(null, "informe a cor");

                dados.set(indice-1, c2);
                break;

                case 4:
                String carro = "selecione o carro\n";

                for(int i=0; i<dados.size(); i++){
                  carro += (i+1) + ")"  + dados.get(i).modelo + "\n";
                }
           
                 int Indice = Integer.parseInt(JOptionPane.showInputDialog(null, carro));

                 dados.remove(Indice-1);

                 JOptionPane.showMessageDialog(null, "pessoa removida com sucesso!");
                break;

                case 5:
                JOptionPane.showMessageDialog(null, "sair");
                continuar = false;
                break;

            }

        } while (continuar == true);
    }
}
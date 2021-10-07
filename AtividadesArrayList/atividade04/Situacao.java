package AtividadesArrayList.atividade04;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Situacao {

    public static void main(String[] args) {

        ArrayList<Aluno> dados = new ArrayList<Aluno>();

        String menu = "o que deseja fazer?\n";
        menu += "1) cadastrar\n";
        menu += "2) selecionar\n";
        menu += "3) sair";

        boolean continuar = true;

        do {

            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (opcao) {

                case 1:
                    try {
                        Aluno a = new Aluno();
                        a.nome = JOptionPane.showInputDialog(null, "Informe o nome");
                        a.nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "informe a 1ª nota"));
                        a.nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "informe a 2ª nota"));

                        a.media = (a.nota1 + a.nota2) / 2;

                        if (a.media >= 7) {
                            a.situacao = "Aprovado";
                        } else if (a.media >= 5) {
                            a.situacao = "Em exame";
                        } else {
                            a.situacao = "Reprovado";
                        }

                        JOptionPane.showMessageDialog(null, "a média é " + a.media + " o aluno está " + a.situacao);

                        dados.add(a);
                    } catch (Exception erro) {
                        JOptionPane.showMessageDialog(null, "Favor informar apenas números");
                    }
                    break;

                case 2:
                     
                         String lista = "alunos\n";

                        for (int i = 0; i < dados.size(); i++) {
                         lista += "\nnome: " + dados.get(i).nome;
                         lista += "\nnota1: " + dados.get(i).nota1;
                        lista += "\nnota2: " + dados.get(i).nota2;
                        lista += "\nmedia: " + dados.get(i).media;
                        lista += "\nsituacao: " + dados.get(i).situacao;
                         lista += "\n------------";
                     }
                     JOptionPane.showMessageDialog(null, lista);
                    break;

                case 3:
                    continuar = false;
                    break;

            }
        } while (continuar == true);

    }
}
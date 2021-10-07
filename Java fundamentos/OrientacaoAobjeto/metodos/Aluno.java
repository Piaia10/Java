package metodos;

import javax.swing.JOptionPane;

public class Aluno {

    // atributos
    private String nome;
    private double nota1, nota2;

    // cosntrutor
    public Aluno() {
        obterDados();

        double retornoMedia = media();
        String retornoSituacao = situacao(retornoMedia);

        String mensagem = "o aluno " + nome + " obteve media " + retornoMedia + " e está " + retornoSituacao;
        JOptionPane.showConfirmDialog(null, mensagem);
    }

    // metodo para obter o nome e as notas
    private void obterDados() {
        nome = JOptionPane.showInputDialog(null, "informe seu nome");
        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "nota 1"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "nota 2"));
    }

    // metodo para realizar a media
    private double media() {
        return (nota1 + nota2) / 2;
    }

    // metodo para realizar a situação
    private String situacao(double media) {
        return media >= 7 ? "aprovado(a)" : "reprovado(a)";
    }
}

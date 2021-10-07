import javax.swing.JOptionPane;

public class Produto {

    // atributos
    private String nome;
    private int formaPagamento;
    private double valor;

    // construtor
    public Produto() {
        obterDados();
        JOptionPane.showMessageDialog(null, mensagem());
    }

    // obter dados
    private void obterDados() {
        nome = JOptionPane.showInputDialog(null, "informe o produto");

        formaPagamento = Integer.parseInt(JOptionPane.showInputDialog(null, "1)a vista 2)a prazo"));

        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "valor da compra"));
    }

    // calculo
    private double calculo() {

        double total;

        if (valor >= 500 && formaPagamento == 1) {
            total = valor * 0.9;
        } else {
            total = valor;
        }

        return total;
    }

    // mensagem
    private String mensagem() {
        String texto = "o produto " + nome + " irá custar R$" + calculo();
        return texto;
    }
}

public class Principal {
    
       // atributos
       private String modelo;
       private double valor;
   
       // construtor
       public Produto() {
           obterDados();
           JOptionPane.showMessageDialog(null, mensagem());
       }
   
       // obter dados
       private void obterDados() {
           nome = JOptionPane.showInputDialog(null, "informe o produto");
   
           valor = Double.parseDouble(JOptionPane.showInputDialog(null, "valor da compra"));
       }
   
       // calculo
       private double calculo() {
   
           double total;
   
           if (valor >= 10000 && formaPagamento ==) {
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
}

package Atividades01;

import javax.swing.JOptionPane;

public class exercicio05 {
    
    public static void main(String[] args) {
        
        // obter o valor da compra
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "informe o valor da compra"));

        //obter se pagou á vista ou não
        //int pagamento = JOptionPane.showConfirmDialog(null, "foi pago a vista?");
          int pagamento = Integer.parseInt(JOptionPane.showInputDialog(null, "1) a vista 2) parcelado"));

          //condicional
          //if (valor > 500 && pagamento == 0){
              if(valor > 500 && pagamento == 1){
                  JOptionPane.showMessageDialog(null, "total a pagar R$"+(valor*0.9));
              }else{
                  JOptionPane.showMessageDialog(null, "total a pagar R$"+valor);
          }
    }
}

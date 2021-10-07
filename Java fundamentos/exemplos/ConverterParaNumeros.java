import javax.swing.JOptionPane;

/**
 * ConverterParaNumeros
 */
public class ConverterParaNumeros {

    public static void main(String[] args) {

        /*
        Double.parseDouble() : converte um texto para um número real
        Integer.parseInt() : converte um texto para um número inteiro
        */
    
      try{
         double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "informe a 1ª nota"));
         double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "informe a 2ª nota"));

         double media = (nota1+nota2)/2;

         JOptionPane.showMessageDialog(null, "a média é "+media);
      }catch(Exception erro){
          JOptionPane.showMessageDialog(null, "Favor informar apenas números");
      }
    }
    
}
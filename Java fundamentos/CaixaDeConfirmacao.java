import javax.swing.JOptionPane;

public class CaixaDeConfirmacao {

    public static void main(String[] args) {
        
        //menu
        String menu = "Escolha uma cidade";
               menu+= "\n1)Blumenau";
               menu+= "\n2)Indaial";
               menu+= "\n3)Joinvile";
    
               //Armazernar a opção de cidade escolhida
               int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            //Escolha
            switch (opcao) {
                case 1:
                 JOptionPane.showMessageDialog(null,"você escolheu Blumenau");   
                    break;
                
                case 2:
                JOptionPane.showMessageDialog(null, "você escolheu Indaial");
                break;

                case 3:
                JOptionPane.showMessageDialog(null, " voceê escolheu Joinvile");
                break;
            
                default:
                JOptionPane.showMessageDialog(null, "opção inválida");
            }

            //Opnião sobre a enquete
            int enquete = JOptionPane.showConfirmDialog(null, " gostou da enquete?");

            switch(enquete){
                case 0:
                JOptionPane.showConfirmDialog(null, "que bom");
                break;

                case 1:
                JOptionPane.showConfirmDialog(null, "que pena");
                break;

                default:
                JOptionPane.showConfirmDialog(null, "bye!");
            }

    }
    
}

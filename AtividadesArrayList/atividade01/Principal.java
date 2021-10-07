package AtividadesArrayList.atividade01;

import java.util.ArrayList;

public class Principal {
    
    public static void main(String[] args) {
        
        //vetor
        ArrayList<Pessoa> dados = new ArrayList<Pessoa>();

        //instanciar objetos
        Pessoa p1 = new Pessoa();
        p1.nome = "Alice";
        p1.cidade = "Blumenau";
        p1.idade = 19;

        Pessoa p2 = new Pessoa();
        p2.nome = "Ricardo";
        p2.cidade = "Gaspar";
        p2.idade = 26;

        //adicionar objetos no vetor
        dados.add(p1);
        dados.add(p2);

        //laço de repetição
        for(int i=0; i<dados.size(); i++){
        System.out.println(dados.get(i).nome);
        System.out.println(dados.get(i).cidade);
        System.out.println(dados.get(i).idade);
        System.out.println("------------------");
        }
    }
    

}

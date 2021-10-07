package encapsulamento;

public class Pessoa {

    // atributos
    String nome;
    int idade;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /*
     * visibilidade de atributos e metodos: default : atributos e metodos ficam
     * visiveis para projetos na mesma pasta public : atributos e metodos ficam
     * visiveis independe a classe que chame private : atributos e metodos ficam
     * visiveis apenas na classe onde são criados protected : atributos e metodos
     * ficam visiveis em classes onde são criados ou herdados
     * 
     * encapsulamento: restringir o uso de atributos e metodos
     * 
     * //set: envia a informação //get: retorna a informação
     * 
     */

}

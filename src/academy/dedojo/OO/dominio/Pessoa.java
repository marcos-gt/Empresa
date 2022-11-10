package academy.dedojo.OO.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public void impressora() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Sexo: "+this.sexo);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
}


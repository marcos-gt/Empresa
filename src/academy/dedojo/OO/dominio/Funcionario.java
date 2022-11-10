package academy.dedojo.OO.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;

    public void imprimirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        ImprimirSalario();
    }
    private void ImprimirSalario(){
        if(this.salario != null) {

            double soma = 0;
            for (double salario : this.salario) {
                soma += salario;
            }
            soma = soma / this.salario.length;
            System.out.println("média de salário: " + soma);
        }else {
            System.out.println("Salário: Não informado");
            return;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }
}

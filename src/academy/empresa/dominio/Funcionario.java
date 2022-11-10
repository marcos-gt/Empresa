package academy.empresa.dominio;

public class Funcionario {
    private String nome;
    private Departamento departamento;
    private float salario;
    private float salarioBase;

    public Funcionario(){
    }
    public Funcionario(String nome) {
        this.nome = nome;
    }
    public Funcionario(String nome, Departamento departamento) {
        this(nome);
        this.departamento = departamento;
    }
    public void imprimirRelatorioFuncionario() {
        System.out.println("Nome: " + nome);

        if (this.departamento != null) {
            System.out.println("Departamento: " + departamento.getNome());
            System.out.println("Salario Base: " + salarioBase);
            System.out.println("Bonus: " + (((departamento.getBonus())*100)-100)+"%");
            System.out.println("Salario final: " + salario);
        } else {
            System.out.println("Funcionario sem departamento");
        }
    }





    public Funcionario(String nome, Departamento departamento, float salario) {
        this(nome, departamento);
        this.salarioBase = salario;
        this.salario = salario*departamento.getBonus();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}

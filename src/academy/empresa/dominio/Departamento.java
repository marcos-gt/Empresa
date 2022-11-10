package academy.empresa.dominio;

public class Departamento {
    private String nome;
    private float bonus;
    private Funcionario [] funcionarios;
    public Departamento(String nome) {
        this.nome = nome;
    }

    public Departamento(String nome, Funcionario[] funcionarios) {
        this(nome);
        this.funcionarios = funcionarios;
    }

    public void imprimirDep(){
        System.out.println("Departamento: " + nome);
        System.out.println("Bonus: " + (((getBonus())*100)-100)+"%");
        if(funcionarios != null){
            System.out.println("Funcionario(s): ");
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario.getNome());;
            }
        }else System.out.println("Sem funcionarios neste departarmento!");
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public float getBonus() {
        if(nome.equals("Frentista")){
            this.bonus = 1.3f;
        }else if(this.nome.equals("Gerente")){
            this.bonus = 1.1f;
        }else if(this.nome.equals("Caixa")){
            this.bonus = 1;
        }else if(this.nome.equals("Perigo"))
            this.bonus = 1.6f;
        return bonus;
    }
}

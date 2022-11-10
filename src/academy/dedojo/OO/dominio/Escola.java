package academy.dedojo.OO.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;



    public void imprimir(){
        System.out.println("Escola: " + this.nome);
        if (this.professores != null) {
            for (Professor professor : professores) {
                System.out.println("Professor: " + professor.getNome());
                System.out.println("Disciplina: " + professor.getDisciplina());
            }
        }else System.out.println("Não há professores cadastrados");
    }
    public Escola(String nome) {
        this.nome = nome;
    }
    public Escola(String nome, Professor[] professores) {
        this(nome);
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}

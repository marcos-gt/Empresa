package academy.dedojo.OO.usege;

import academy.dedojo.OO.dominio.Escola;
import academy.dedojo.OO.dominio.Professor;

public class EscolaProf {
    public static void main(String[] args) {
        Professor professor = new Professor("João");
        professor.setDisciplina("Matemática");
        Professor professor2 = new Professor("Maria");
        professor2.setDisciplina("Português");
        Professor professor3 = new Professor("José");
        professor3.setDisciplina("História");
        professor3.setNome("José da Silva");
        Escola escola = new Escola("Escola do João");


        Escola escola3 = new Escola("escola 3",new Professor[]{professor,professor2,professor3});
        escola.imprimir();
        escola.setProfessores(new Professor[] { professor});
        escola3.imprimir();

        escola.imprimir();


    }
}

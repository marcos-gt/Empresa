package academy.dedojo.OO.usege;

import academy.dedojo.OO.dominio.Pessoa;

public class UsePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        p1.setNome("Marcos");
        p1.setIdade(30);
        p1.setSexo('M');
        p1.impressora();

        p2.setNome("Maria");
        p2.setIdade(25);
        p2.setSexo('F');
        p2.impressora();

        p3.setNome("João");
        p3.setIdade(20);
        p3.setSexo('M');
        p3.impressora();
    }
}
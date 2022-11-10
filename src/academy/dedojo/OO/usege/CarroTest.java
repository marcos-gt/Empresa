package academy.dedojo.OO.usege;

import academy.dedojo.OO.dominio.Carro;
import academy.dedojo.OO.dominio.Montadora;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        Montadora montadora = new Montadora("Fiat");
        Montadora montadora2 = new Montadora("Volkswagem");


        carro.setMontadora(montadora);
        carro.setModelo("Uno");
        carro.setAno(2010);
        carro.setCor("Vermelho");

        carro2.setMontadora(montadora2);
        carro2.setModelo("Celta");
        carro2.setAno(2012);
        carro2.setCor("Preto");


        carro.imprimirRelatorio();





    }
}

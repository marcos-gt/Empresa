package academy.dedojo.OO.dominio;

public class Carro {
    private Montadora montadora;
    private String modelo;
    private int ano;
    private String cor;

    public void imprimirRelatorio() {
        if (montadora != null)
            System.out.print("Montadora: " + montadora.getNome());
        System.out.print(", Modelo: " + modelo);
        System.out.print(", Ano: " + ano);
        System.out.print(", Cor: " + cor);
        System.out.println();
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

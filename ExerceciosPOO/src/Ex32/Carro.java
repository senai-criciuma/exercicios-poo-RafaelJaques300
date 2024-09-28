package Ex32;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public void acelerar(){
        System.out.println("Carro acelerando");
    }
    public void freiar(){
        System.out.println("Carro freiando");
    }
    public void darRé(){
        System.out.println("Carro dando a Ré.");
    }

    public void mostrarInformações(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo " + modelo);
        System.out.println("Ano " + ano);
    }

}

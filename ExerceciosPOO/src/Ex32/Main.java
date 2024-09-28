package Ex32;

public class Main {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();

        meuCarro.setMarca("Gol");
        meuCarro.setModelo("G5");
        meuCarro.setAno(2011);

        meuCarro.mostrarInformações();

        meuCarro.acelerar();
        meuCarro.freiar();
        meuCarro.darRé();
    }
}

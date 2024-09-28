package Ex31;

public class Main {
    public static void main(String[] args) {

        Cachorro meuCachorro = new Cachorro();

        meuCachorro.setNome("Dog");
        meuCachorro.setRaca("Pitbull");
        meuCachorro.setIdade(3);

        meuCachorro.mostrarDetalhes();

        meuCachorro.comer();
        meuCachorro.latir();
        meuCachorro.correr();


    }
}

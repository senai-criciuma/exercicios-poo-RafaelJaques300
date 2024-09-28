package Ex31;

public class Cachorro {

    private String nome;
    private String raca;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void latir(){
        System.out.println("Cachorro latindo");
    }

    public void correr(){
        System.out.println("Cachorro está correndo!");
    }

    public void comer(){
        System.out.println("Cachorro está comendo.");
    }

    public void mostrarDetalhes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Raça: " + this.raca);
        System.out.println("Idade: " + this.idade);
    }
}

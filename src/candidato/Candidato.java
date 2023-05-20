package candidato;

public class Candidato {
    private int numeroDeVotos, idade;
    private String partido, nome;

    public Candidato(String nome, int idade, String partido, int numeroDeVotos) {
        this.numeroDeVotos = numeroDeVotos;
        this.idade = idade;
        this.partido = partido;
        this.nome = nome;
    }

    public int getNumeroDeVotos() {
        return numeroDeVotos;
    }

    public void setNumeroDeVotos(int numeroDeVotos) {
        this.numeroDeVotos = numeroDeVotos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

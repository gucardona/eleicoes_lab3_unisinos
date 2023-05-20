package eleicoes;

import candidato.Candidato;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Eleicoes {

    public int totalVotos(List<Candidato> listaCandidatos) {
        int somaVotos = listaCandidatos.stream().mapToInt(Candidato::getNumeroDeVotos).sum();
        return somaVotos;
    }

    public double mediaVotos(List<Candidato> listaCandidatos) {
        int quantidade = listaCandidatos.size();
        return totalVotos(listaCandidatos) / quantidade;
    }

    public Candidato candidatoMaisJovem(List<Candidato> listaCandidatos) {
        listaCandidatos.sort(Comparator.comparing(Candidato::getIdade));
        return listaCandidatos.get(0);
    }

    public Candidato candidatoMaisVelho(List<Candidato> listaCandidatos) {
        listaCandidatos.sort(Comparator.comparing(Candidato::getIdade));
        return listaCandidatos.get(listaCandidatos.size() -1);
    }

    public Candidato candidatoMaisVotado(List<Candidato> listaCandidatos) {
        listaCandidatos.sort(Comparator.comparing(Candidato::getNumeroDeVotos));
        return listaCandidatos.get(listaCandidatos.size() - 1);
    }

    public Candidato candidatoMenosVotado(List<Candidato> listaCandidatos) {
        listaCandidatos.sort(Comparator.comparing(Candidato::getNumeroDeVotos));
        return listaCandidatos.get(0);
    }
}

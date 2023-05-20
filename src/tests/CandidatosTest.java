package tests;

import candidato.Candidato;
import eleicoes.Eleicoes;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CandidatosTest {
    List<Candidato> listaCandidatos = new ArrayList<Candidato>();
    Eleicoes eleicoes = new Eleicoes();

    @Before
    public void cria_lista_candidatos() {
        Candidato candidato0 = new Candidato("José do Petróleo", 58, "Partido do Petróleo Brasileiro", 1337);
        Candidato candidato1 = new Candidato("Carlinhos Orador", 34, "Partido Evangélico Angolano", 231);
        Candidato candidato2 = new Candidato("Jefferson dos Hamsters", 29, "Partido União Hamster", 592);
        Candidato candidato3 = new Candidato("Maia do Himalaia", 61, "Partido do Sal do Himalaia", 9);
        Candidato candidato4 = new Candidato("Grávida de Taubaté", 38, "Partido Volta Grávida de Taubaté", 116);

        listaCandidatos.add(candidato0);
        listaCandidatos.add(candidato1);
        listaCandidatos.add(candidato2);
        listaCandidatos.add(candidato3);
        listaCandidatos.add(candidato4);
    }

    @Test
    public void testa_candidato_mais_jovem() {
        assertEquals(listaCandidatos.get(2), eleicoes.candidatoMaisJovem(listaCandidatos));
    }

    @Test
    public void testa_candidato_mais_velho() {
        assertEquals(listaCandidatos.get(3), eleicoes.candidatoMaisVelho(listaCandidatos));
    }

    @Test
    public void testa_candidato_mais_votado() {
        assertEquals(listaCandidatos.get(0), eleicoes.candidatoMaisVotado(listaCandidatos));
    }

    @Test
    public void testa_candidato_menos_votado() {
        assertEquals(listaCandidatos.get(3), eleicoes.candidatoMenosVotado(listaCandidatos));
    }

    @Test
    public void testa_total_de_votos_recebidos() {
        assertEquals(2285, eleicoes.totalVotos(listaCandidatos));
    }

    @Test
    public void media_de_votos_recebidos_por_candidato() {
        assertEquals(457.00, eleicoes.mediaVotos(listaCandidatos));
    }
}

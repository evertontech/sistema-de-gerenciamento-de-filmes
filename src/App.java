import enums.Genero;
import enums.VeiculoDeCritica;
import models.*;

import java.time.Duration;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        AtorPrincipal atorPrincipal1 = new AtorPrincipal("Tom Hanks", 67, Genero.DRAMA, 32);
        AtorPrincipal atorPrincipal2 = new AtorPrincipal("Leonardo Di Caprio", 47, Genero.DRAMA, 25);

        AtorCoadjuvante atorCoadjuvante1 = new AtorCoadjuvante("Tom Holland", 25, Genero.AVENTURA, 9.5);
        AtorCoadjuvante atorCoadjuvante2 = new AtorCoadjuvante("Zendaya", 25, Genero.AVENTURA, 8.7);

        Diretor diretor = new Diretor("Christopher Nolan", 51, "Britânico");

        Estudio estudio = new Estudio("Warner Bros.", false);

        LocalDateTime dataHorarioLancamento = LocalDateTime.of(2010, 7, 16, 20, 30);
        Filme filme = new Filme("Inception", Duration.ofMinutes(148), dataHorarioLancamento, diretor, atorPrincipal1);
        filme.adicionarAtor(atorPrincipal1);
        filme.adicionarAtor(atorCoadjuvante1);
        filme.adicionarAtor(atorCoadjuvante2);

        Critico critico1 = new Critico("Roger Ebert", 70, VeiculoDeCritica.JORNAL);
        Critico critico2 = new Critico("Peter Travers", 80, VeiculoDeCritica.REVISTA);

        Avaliacao avaliacao1 = new Avaliacao(critico1, 9.0);
        Avaliacao avaliacao2 = new Avaliacao(critico2, 8.5);

        filme.adicionarAvaliacao(avaliacao1);
        filme.adicionarAvaliacao(avaliacao2);

        filme.exibirInformacoes();
        filme.exibirAvaliacoes();
        filme.exibirClassificacao();
        filme.exibirMediaDasAvaliacoes();
        System.out.println("Média de idades dos atores Coadjuvantes: " + filme.calcularMediaDeIdadesCoadjuvantes());
    }
}

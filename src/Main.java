import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Time> times = new ArrayList<>() {{
			
		    add(new Time (
		        "Gremio",
		        new ArrayList<>() {{
		            add(new Jogador("Gabriel Granco", Tipo.GOLEIRO));
		            add(new Jogador("Rafinha", Tipo.LATERAL));
		            add(new Jogador("Bruno Cortez", Tipo.LATERAL));
		            add(new Jogador("Pedro Geromel", Tipo.ZAGUEIRO));
		            add(new Jogador("Ruan", Tipo.ZAGUEIRO));
		            add(new Jogador("Tiago Santos", Tipo.VOLANTE));
		            add(new Jogador("Lucas Silva", Tipo.VOLANTE));
		            add(new Jogador("Ferreira", Tipo.MEIA));
		            add(new Jogador("Jaminton Campaz", Tipo.MEIA));
		            add(new Jogador("Jhonata Robert", Tipo.MEIA));
		            add(new Jogador("Diego Souza", Tipo.ATACANTE));
		        }}
		    ));
		    
		    add(new Time (
		            "Flamengo",
		            new ArrayList<>() {{
		                add(new Jogador("Hugo Souza", Tipo.GOLEIRO));
		                add(new Jogador("Rodinel", Tipo.LATERAL));
		                add(new Jogador("Renê", Tipo.LATERAL));
		                add(new Jogador("Gustavo Henrique", Tipo.ZAGUEIRO));
		                add(new Jogador("Léo Pereira", Tipo.ZAGUEIRO));
		                add(new Jogador("Thiago Maia", Tipo.VOLANTE));
		                add(new Jogador("João Gomes", Tipo.VOLANTE));
		                add(new Jogador("Kenedy", Tipo.MEIA));
		                add(new Jogador("Diego", Tipo.MEIA));
		                add(new Jogador("Vitinho", Tipo.MEIA));
		                add(new Jogador("Vitor Gabriel", Tipo.ATACANTE));
		            }}
		    ));
		}};
			
		times.forEach(time -> time.jogadores.stream()
                .filter(jogador -> jogador.tipo.equals(Tipo.MEIA))
                .forEach(jogador -> System.out.println(time.getNome() + " - " + jogador.getTipo() + " - " + jogador.getNome())));
	

	}
}


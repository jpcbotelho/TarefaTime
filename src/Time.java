import java.util.ArrayList;

public class Time {

	String nome;
	ArrayList<Jogador> jogadores;
	
	public Time(String nome, ArrayList<Jogador> jogadores) {
		super();
		this.nome = nome;
		this.jogadores = jogadores;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
		
}

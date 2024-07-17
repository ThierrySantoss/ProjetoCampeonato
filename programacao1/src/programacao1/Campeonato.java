package programacao1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Campeonato {
	
	private int qtdCompetidores;
	private int gerarId;

	final Map<Categoria, List<Atleta>> categoriaAtleta = new HashMap<>();
	
	public Campeonato(int qtdCompetidores) {
		
		this.qtdCompetidores = qtdCompetidores;
		
		for(Categoria categoria : Categoria.values()) {
			categoriaAtleta.put(categoria, new ArrayList<Atleta>());
		}
	}
	
	public boolean adicionarAtleta(Atleta atleta) {
		
		if(qtdCompetidores != 0) {
			if(atleta.getCategoria() == Categoria.INFANTIU) {
				categoriaAtleta.get(Categoria.INFANTIU).add(atleta);
				atleta.setId(gerarId);
				qtdCompetidores--;
				gerarId++;
				return true;
			} else if(atleta.getCategoria() == Categoria.JUVENIL) {
				categoriaAtleta.get(Categoria.JUVENIL).add(atleta);
				atleta.setId(gerarId);
				qtdCompetidores--;
				gerarId++;
				return true;
			} else if(atleta.getCategoria() == Categoria.AMADOR) {
				categoriaAtleta.get(Categoria.AMADOR).add(atleta);
				atleta.setId(gerarId);
				qtdCompetidores--;
				gerarId++;
				return true;
			} else if(atleta.getCategoria() == Categoria.PROFISSIONAL) {
				categoriaAtleta.get(Categoria.PROFISSIONAL).add(atleta);
				atleta.setId(gerarId);
				qtdCompetidores--;
				gerarId++;
				return true;
			} else if(atleta.getCategoria() == Categoria.APOSENTADO) {
				categoriaAtleta.get(Categoria.APOSENTADO).add(atleta);
				atleta.setId(gerarId);
				qtdCompetidores--;
				gerarId++;
				return true;
			} else {
				return false;
			}
			
		} else {
			return false;
		}
	}
	
	public String consultar(String nome) {
		StringBuilder frase = new StringBuilder();
		for(Categoria categoria: Categoria.values()) {
			for(Atleta atletas : categoriaAtleta.get(categoria)) {
				if(atletas.getNome().equalsIgnoreCase(nome)) {
					frase.append("Categoria: " + categoria + "\n"
							+ "Id: " + atletas.getId() 
							+ " " + atletas.getNome() 
							+ " - " 
							+ atletas.getIdade() + " anos\n" );
				}
				
			}
	
		}
		return frase.toString();
	}
	
	public void listar(Categoria categoria) {
		System.out.println("Categoria: " + categoria);
		for(Atleta atleta : categoriaAtleta.get(categoria)) {
			System.out.println("ID: " + atleta.getId() + " " + atleta.getNome() 
			+ " - " + atleta.getIdade() 
			+ " anos ");
		}
	}
	
	public boolean excluirAtleta(int id) {
		for(Categoria categoria : Categoria.values()) {
			for(Atleta atletas : categoriaAtleta.get(categoria)) {
				if (atletas.getId() == id) {
					categoriaAtleta.get(categoria).remove(atletas);
					qtdCompetidores++;
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean alterarNome(int id, String novoNome) {
		for(Categoria categoria : Categoria.values()) {
			for(Atleta atleta : categoriaAtleta.get(categoria)) {
				if(atleta.getId() == id) {
					System.out.println(atleta.getNome() + " alterado para " + novoNome);
					atleta.setNome(novoNome);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean alterarIdade(int id, int novaIdade) {
		for(Categoria categoria : Categoria.values()) {
			for(Atleta atleta : categoriaAtleta.get(categoria)) {
				if(atleta.getId() == id) {
					System.out.println(atleta.getIdade() + " anos alterado para " + novaIdade + " anos.");
					atleta.setIdade(novaIdade);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean alterarCategoria(int id, Categoria novaCategoria) {
		for(Categoria categoria : Categoria.values()) {
			for(Atleta atleta : categoriaAtleta.get(categoria)) {
				if(atleta.getId() == id) {
					System.out.println(atleta.getCategoria() + " alterado para " + novaCategoria);
					atleta.setCategoria(novaCategoria);
					categoriaAtleta.get(novaCategoria).add(atleta);
					categoriaAtleta.get(categoria).remove(atleta);
					return true;
				}
			}
		}
		return false;
	}
	
	public int getQtdCompetidores() {
		return qtdCompetidores;
	}

	public int getGerarId() {
		return gerarId;
	}

	@Override
	public String toString() {
		StringBuilder frase = new StringBuilder();
		for(Categoria categoria : Categoria.values()) {
			frase.append("Categoria:" + categoria + "\n");
			for(Atleta atleta : categoriaAtleta.get(categoria)) {
				frase.append("ID: " + atleta.getId() + " " + atleta.getNome() 
						+ " - " + atleta.getIdade() 
						+ " anos " 
						+ "\n");
			}
			
		}
		return frase.toString();
	}	
	
	
	

}

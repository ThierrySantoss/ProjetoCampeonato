package programacao1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Campeonato {

	private int qtdVagas;
	private int gerarId;

	final Map<Categoria, List<Atleta>> categoriaAtleta = new HashMap<>();

	public Campeonato(int qtdVagas) {

		this.qtdVagas = qtdVagas;

		for (Categoria categoria : Categoria.values()) {
			categoriaAtleta.put(categoria, new ArrayList<Atleta>());
		}
	}

	public boolean adicionarAtleta(Atleta atleta) {

		if (qtdVagas != 0 && atleta.getCategoria() != null) {
			categoriaAtleta.get(atleta.getCategoria()).add(atleta);
			atleta.setId(gerarId);
			qtdVagas--;
			gerarId++;
			return true;
		} else {
			return false;
		}
	}

	public String consultar(String nome) {
		StringBuilder frase = new StringBuilder();
		for (Categoria categoria : Categoria.values()) {
			for (Atleta atletas : categoriaAtleta.get(categoria)) {
				if (atletas.getNome().equalsIgnoreCase(nome)) {
					frase.append("Categoria: " + categoria + "\n" + "Id: " + atletas.getId() + " " + atletas.getNome()
							+ " - " + atletas.getIdade() + " anos\n");
				}

			}

		}
		return frase.toString();
	}

	public void listar(Categoria categoria) {
		System.out.println("Categoria: " + categoria);
		for (Atleta atleta : categoriaAtleta.get(categoria)) {
			System.out.println("ID: " + atleta.getId() + " " + atleta.getNome() + " - " + atleta.getIdade() + " anos ");
		}
	}

	public boolean excluirAtleta(int id) {
		for (Categoria categoria : Categoria.values()) {
			for (Atleta atletas : categoriaAtleta.get(categoria)) {
				if (atletas.getId() == id) {
					categoriaAtleta.get(categoria).remove(atletas);
					qtdVagas++;
					return true;
				}
			}
		}
		return false;
	}

	public boolean alterarNome(int id, String novoNome) {
		for (Categoria categoria : Categoria.values()) {
			for (Atleta atleta : categoriaAtleta.get(categoria)) {
				if (atleta.getId() == id) {
					System.out.println(atleta.getNome() + " alterado para " + novoNome);
					atleta.setNome(novoNome);
					return true;
				}
			}
		}
		return false;
	}

	public boolean alterarIdade(int id, int novaIdade) {
		for (Categoria categoria : Categoria.values()) {
			for (Atleta atleta : categoriaAtleta.get(categoria)) {
				if (atleta.getId() == id) {
					System.out.println(atleta.getIdade() + " anos alterado para " + novaIdade + " anos.");
					atleta.setIdade(novaIdade);
					return true;
				}
			}
		}
		return false;
	}

	public boolean alterarCategoria(int id, Categoria novaCategoria) {
		for (Categoria categoria : Categoria.values()) {
			for (Atleta atleta : categoriaAtleta.get(categoria)) {
				if (atleta.getId() == id) {
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

	public int getQtdVagas() {
		return qtdVagas;
	}

	public int getGerarId() {
		return gerarId;
	}

	@Override
	public String toString() {
		StringBuilder frase = new StringBuilder();
		for (Categoria categoria : Categoria.values()) {
			frase.append("Categoria:" + categoria + "\n");
			for (Atleta atleta : categoriaAtleta.get(categoria)) {
				frase.append(
						"ID: " + atleta.getId() + " " + atleta.getNome() + " - " + atleta.getIdade() + " anos " + "\n");
			}

		}
		return frase.toString();
	}

}

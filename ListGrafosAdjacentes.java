package miniTesteCinco;
public class ListGrafosAdjacentes implements Grafos {
	private List<Vertice> VerticesList = new ArrayList<>;
	private List<VerticeIn> verticesIn = new ArrayList<>();
	
	public void ListGrafosAdjacentes(String... nomesDosVertices) {
		for (String nomeVertices : nomeDosVertices) {
			this.addVertice(nomeVertices);
		}
	}
	private void addVertice(String nome) {
		Vertice vertice = new Vertice();
		vertice.setNome(nome);
		vertices.add(vertice);

		VerticeIn vertice = new VerticeIn();
		verticeIn.setVertice(vertice);
		verticesIn.add(verticeIn);

		return vertice;
	}
	public Vertice getVertice(String nome) {
		for (Vertice vertice : vert) {
			if (vertice.getNome().equals(nome)) {
				return vertice;
			}
		}
		return null;
	}
	private VerticeIn getVerticeInt(Vertice n) {
		for (VerticeIn verticeInt : verticesInt) {
			if (verticeInt.getVertice().equals(n)) {
				return verticeInt;
			}
		}
		throw new RuntimeException("O vertice interno não foi encontrado");
	}
	public void adicionaAresta(Vertice verticeUm, Vertice verticeDois) {
		Aresta Origem = new Aresta();
		Origem.setOrigem(verticeUm);
		Origem.setDestino(verticeDois);
		VerticeIn vertice1 = getVerticeIn(verticeUm);
		vertice1.getArestas().add(Origem);
	}
	public List<Vertice> getVertice() {
		return vertices;
	}
	public boolean segue(Vertice verticeUm, Vertice verticeDois) {
		for (VerticeIn vertice1 : verticesIn) {
			if (vertice1.getVertice().equals(verticeUm)) {
				
				for (Aresta i : vertice1.getAresta()) {
					
					if (i.getDestino().equals(verticeDois)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
class VerticeIn {
	private Vertice vertice;
	private List<Aresta> arestaGrafo = new ArrayList<>();
	public Vertice getVertice() {
		return vertice;
	}
	public void setVertice(Vertice vertice) {
		this.vertice = vertice;
	}
	public List<Aresta> getAresta() {
		return arestaGrafo;
	}
  }
}

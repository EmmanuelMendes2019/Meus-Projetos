package miniTesteCinco;

import java.util.List;

public interface grafo {

	Vertice getVertice(String nome);
	
	Vertice addVertice(String nome);

	void addAresta(Vertice v1, Vertice v2);

	List<Vertice> getVertices();

	boolean segue(Vertice v1, Vertice v2);

}
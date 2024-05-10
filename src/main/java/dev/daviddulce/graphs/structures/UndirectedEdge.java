package dev.daviddulce.graphs.structures;

import java.util.List;

public class UndirectedEdge<K, W> {

    private List<K> vertices;

    private W weight;

    public UndirectedEdge(K source, K destination, W weight) {

        this.vertices = List.of(source, destination);

        this.weight = weight;

    }

    public UndirectedEdge(K source, K destination) {

        this.vertices = List.of(source, destination);

        this.weight = null;

    }

    public K getSource() {

        return vertices.get(0);

    }

    public void setSource(K source) {

        vertices.set(0, source);

    }

    public K getDestination() {

        return vertices.get(1);

    }

    public void setDestination(K destination) {

        vertices.set(1, destination);

    }

    public W getWeight() {

        if (weight == null)
            throw new UnsupportedOperationException("This edge has no weight");

        return weight;

    }

    public void setWeight(W weight) {

        if (weight == null)
            throw new UnsupportedOperationException("This edge has no weight");

        this.weight = weight;

    }

}
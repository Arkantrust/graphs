package dev.daviddulce.graphs.structures;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vertex<K, V> {

    private K key;

    private V value;

}
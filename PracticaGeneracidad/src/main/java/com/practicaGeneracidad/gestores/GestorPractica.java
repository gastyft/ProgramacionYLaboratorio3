package com.practicaGeneracidad.gestores;

import java.util.Map;
import java.util.TreeMap;

public class GestorPractica<T,K,V> {
    // Generics -> agregar, obtener y eliminar

    Map<K,V> objetos = new TreeMap<>();


    public void agregar(K clave, V valor) {
        objetos.put(clave,valor);
    }

    public V obtenerTodos(K clave, V valor) {
        for (Map.Entry<K, V> entry : objetos.entrySet()) {
            if (entry.getKey().equals(clave) && entry.getValue().equals(valor)) {
                return entry.getValue();
            }
        }
        return null; // Si no se encuentra el objeto con la clave y valor dados
    }

    public void eliminar(T obj) {
        objetos.remove(obj);
    }


}

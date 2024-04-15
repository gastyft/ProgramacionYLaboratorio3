package org.example.enums;

public enum DisponibilityAge {
    G("Apta para todos los públicos"),
    PG("Sugiere la compañía de un adulto para los menores de 10 años"),
    PG_13("Sugiere la compañía de un adulto para los menores de 13 años"),
    R("Restringido a menores de 17 años si no es con la compañía de un adulto"),
    NC_17("Contenido sólo para mayores de 18 años"),
    UNRATED("No clasificada");

    private String descripcion;


    DisponibilityAge(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método getter para obtener la descripción
    public String getDescripcion() {
        return descripcion;
    }
}

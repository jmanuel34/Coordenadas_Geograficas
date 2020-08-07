package com.example.coordenadas_geograficas;

public class GeoPunto {
    double longitud, latitud;
    public GeoPunto(double longitud, double latitud) {
        this.latitud=latitud;
        this.longitud=longitud;
    }
    public String toString() {
        return longitud+" "+latitud;
    }
    double distancia(GeoPunto punto) {
/*      Metodo de calculo de coordenadas Haversine
        R = radio medio de la Tierra (6,378km)
        Δlat = lat2− lat1
                Δlong = long2− long1
                a = sin²(Δlat/2) + cos(lat1) cos(lat2) sin²(Δlong/2)
        c = 2 atan2(√a, √(1−a))
        d = R c
        */
        final double RADIO_TIERRA = 6371000; // en metros
        double dLat = Math.toRadians(latitud - punto.latitud);
        double dLon = Math.toRadians(longitud - punto.longitud);
        double lat1 = Math.toRadians(punto.latitud);
        double lat2 = Math.toRadians(latitud);
        double a =    Math.sin(dLat/2) * Math.sin(dLat/2) +
                Math.sin(dLon/2) * Math.sin(dLon/2) *
                        Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return c * RADIO_TIERRA;
    }
}
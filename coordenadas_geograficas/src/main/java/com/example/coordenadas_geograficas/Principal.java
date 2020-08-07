package com.example.coordenadas_geograficas;

public class Principal {
    public static void main (String[] main) {
        GeoPunto lon, lat;
        lon = new GeoPunto(65535, 32768);
        lat = new GeoPunto(32768, 65535);
        lon.distancia(lat);
        System.out.println (lon.toString());
        System.out.println(lat.toString());
        System.out.println("Coordenadas:"+ lon.toString()+" Distancia "+lon.distancia(lat));
    }
}

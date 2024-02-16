import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pais> paises = new ArrayList<>();
        paises.add(new Pais("Suecia", "ABBA", "Dancing Queen"));
        paises.add(new Pais("Israel", "Netta", "Toy"));
        paises.add(new Pais("Italia", "Il Volo", "Grande Amore"));
        paises.add(new Pais("Finlandia", "Lordi", "Hard Rock Hallelujah"));
        paises.add(new Pais("Estonia", "Elina Nechayeva", "La Forza"));
        paises.add(new Pais("Australia", "Guy Sebastian", "Tonight Again"));
        paises.add(new Pais("Bélgica", "Loïc Nottet", "Rhythm Inside"));
        paises.add(new Pais("Austria", "Conchita Wurst", "Rise Like a Phoenix"));
        paises.add(new Pais("España", "Mocedades", "Eres Tú"));
        paises.add(new Pais("República Checa", "Lake Malawi", "Friend of a Friend"));
        paises.add(new Pais("Lituania", "LT United", "We Are the Winners"));
        paises.add(new Pais("Armenia", "Sirusho", "Qélé, Qélé"));
        paises.add(new Pais("Chipre", "Eleni Foureira", "Fuego"));
        paises.add(new Pais("Suiza", "Luca Hänni", "She Got Me"));
        paises.add(new Pais("Ucrania", "Jamala", "1944"));
        paises.add(new Pais("Francia", "Amir", "J'ai cherché"));
        paises.add(new Pais("Noruega", "Alexander Rybak", "Fairytale"));
        paises.add(new Pais("Portugal", "Salvador Sobral", "Amar pelos dois"));
        paises.add(new Pais("Eslovenia", "Maraaya", "Here for You"));
        paises.add(new Pais("Moldavia", "SunStroke Project", "Hey Mamma!"));
        paises.add(new Pais("Albania", "Eugent Bushpepa", "Mall"));
        paises.add(new Pais("Reino Unido", "Katrina and the Waves", "Love Shine a Light"));
        paises.add(new Pais("Serbia", "Željko Joksimović", "Lane moje"));
        paises.add(new Pais("Polonia", "Cleo & Donatan", "My Słowianie"));
        paises.add(new Pais("Croacia", "Roko Blažević", "The Dream"));
        paises.add(new Pais("Alemania", "Lena", "Satellite"));

        for (Pais pais:paises) {
            while (pais.getListaPuntos().size()!=10){
                int rndPuntos = (int)(Math.random()*12)+1 ;
                int rndPais = (int)(Math.random()*paises.size());
                pais.votar(paises.get(rndPais),rndPuntos);
            }
        }
        System.out.println(paises);
        System.out.println("------Listado de todos los paises participantes------");
        for (Pais pais:paises) {
            System.out.println(pais.getNombre());
        }
        System.out.println("------Listado de todos los paises participantes ordenados alfabéticamente------");
        for (Pais pais : paises) {
            System.out.println(pais.getNombre());
        }
        Collections.sort(paises,Collections.reverseOrder());
        System.out.println("------Listado de todos los paises participantes ordenados por puntuaciones recibidas------");
        for (Pais pais : paises) {
            System.out.println(pais.getNombre() + ": " + pais.getListaPuntos() + "  Total de puntos: " + pais.getTotalPuntos() );
        }

        System.out.println("------Listado de cantantes ordenados por nombre------");
        for (Pais pais : paises) {
            System.out.println(pais.getParticipante());
        }
    }

}
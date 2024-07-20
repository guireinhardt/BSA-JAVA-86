package array;

import java.util.ArrayList;
import java.util.Collections;

public class arrayAnime {

    public static void main(String[] args) {
        ArrayList<String> listaAnimes = new ArrayList<>();

        listaAnimes.add("Naruto");
        listaAnimes.add("One Piece");
        listaAnimes.add("Demon Slayer");
        System.out.println("Antes de adicionar informação");
        for (int i = 0; i < listaAnimes.size(); i++){
            System.out.printf("0 %dº item da lista é %s\n", i+1,listaAnimes.get(i));
        }
        listaAnimes.add("Dragon Ball");
        listaAnimes.add("Sharuto");
        listaAnimes.add("Pokemon");
        listaAnimes.add("Jojo");

        listaAnimes.remove("One Piece");

        System.out.println("Depois de adicionar informação");

        listaAnimes.forEach(animes -> System.out.printf("O %dº item da lista é %s\n",listaAnimes.indexOf(animes)+1,animes));
        // for each de outra forma
        //for (String anime: listaAnimes){
          //  System.out.printf("O %dº item da lista é %s\n", listaAnimes.indexOf(anime)+1,anime);
       // }
        System.out.printf("O indice do anime One Piece é %d\n",listaAnimes.indexOf("One Piece"));
        listaAnimes.set(listaAnimes.indexOf("Jojo"),"Yu-Gi-Oh");

        listaAnimes.forEach(animes -> System.out.printf("O %dº item da lista é %s\n",listaAnimes.indexOf(animes)+1,animes));

        System.out.println("Lista Ordenada");

        Collections.sort(listaAnimes);
        listaAnimes.forEach(animes -> System.out.printf("O %dº item da lista é %s\n",listaAnimes.indexOf(animes)+1,animes));

    }
}

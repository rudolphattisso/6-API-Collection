package fr.afpa;

import java.util.HashMap;

//TODO Faites l'import de java HashMap

public class HashMapApp {
    public static void main(String[] args) {

        // Ressources :
        // https://www.youtube.com/watch?v=I9aBP0xm-lE
        // https://www.w3schools.com/java/java_hashmap.asp
        // https://www.jmdoudoux.fr/java/dej/chap-collections.htm#collections-5

        // Instanciez une nouvelle HashMap sur le theme de votre choix
        HashMap<String, String> capitalesCities = new HashMap<String, String>();

        // Ajoutez des paires clé/valeur à votre HashMap - au moins 5 paires
        capitalesCities.put("Gabon", "Libreville");
        capitalesCities.put("Togo", "Lomé");
        capitalesCities.put("Bénin", "Cotonou");
        capitalesCities.put("France", "Paris");
        capitalesCities.put("Camerooun", "Douala");
        // Vérifiez si une de vos clés est contenue dans la collection

        capitalesCities.get("Gabon");
        // Vérifiez si une de vos valeurs est contenue dans la collection
       capitalesCities.get("Lomé");

        // Utilisez une méthode pour trouver le nombre de paires (la longueur de
        // votre HashMap) et affichez la en console
        System.out.println(capitalesCities.size());

        // Affichez toutes les clés de votre HashMap (avec une boucle for each &
        // avec une méthode de HashMap)
        for (String key : capitalesCities.keySet()) {
            System.out.println("affichage des clés \n" + key + ". \n");
        }
        // Affichez toutes les valeurs de votre HashMap (avec une boucle for each &
        // avec une méthode de HashMap)
        for (String value : capitalesCities.values()) {
            System.out.println("affichage des valeurs" + value + ". \n");
        }
        // Affichez toutes les clés/valeurs de votre HashMap (avec une boucle for
        // each & avec une méthode de HashMap)

        for (String key : capitalesCities.keySet()) {
            System.out.println(" affichage des clé/valeurs\n" + key + " " + capitalesCities.get(key)+ "\n");
        }
        // Supprimez une de vos paires
        capitalesCities.remove("Bénin");

            System.out.println(
                    "après avoir retiré une paire, voici la liste \n" + capitalesCities);
        //Vider la HashMap et vérifiez si votre HashMap est vide
        capitalesCities.clear();
        System.out.println("la liste à bien été vidée \n" + capitalesCities);

    }

}

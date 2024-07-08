package fr.afpa;

import java.util.HashMap;

//TODO Faites l'import de java HashMap


public class HashMapApp {
    public static void main(String[] args) {

        // Ressources :
        // https://www.youtube.com/watch?v=I9aBP0xm-lE
        // https://www.w3schools.com/java/java_hashmap.asp
        // https://www.jmdoudoux.fr/java/dej/chap-collections.htm#collections-5


        // TODO Instanciez une nouvelle HashMap sur le theme de votre choix
        HashMap<String,String> capitalesCities = new HashMap<String,String>();

        // TODO Ajoutez des paires clé/valeur à votre HashMap - au moins 5 paires
        capitalesCities.put("Gabon", "Libreville");
        capitalesCities.put("TOGO", "Lomé");
        capitalesCities.put("Bénin", "Cotonou");
        capitalesCities.put("France", "Paris");
        capitalesCities.put("Camerooun", "Douala");
        // TODO Vérifiez si une de vos clés est contenue dans la collection
       
        capitalesCities.get("Gabon");
        // TODO Vérifiez si une de vos valeurs est contenue dans la collection
       capitalesCities.get("Lomé");

    
        // TODO Utilisez une méthode pour trouver le nombre de paires (la longueur de votre HashMap) et affichez la en console
        System.out.println(capitalesCities.size());

        // TODO Affichez toutes les clés de votre HashMap (avec une boucle for each & avec une méthode de HashMap)
        for (String string : args) {
            
        }

        // TODO Affichez toutes les valeurs de votre HashMap (avec une boucle for each & avec une méthode de HashMap)
       


        // TODO Affichez toutes les clés/valeurs de votre HashMap (avec une boucle for each & avec une méthode de HashMap)
        

        // TODO Supprimez une de vos paires
       

        // TODO Vérifiez si votre HashMap est vide
       

        // TODO Supprimez tous les éléments de votre HashMap
      

        // TODO Refaites la vérification
    

    }
}

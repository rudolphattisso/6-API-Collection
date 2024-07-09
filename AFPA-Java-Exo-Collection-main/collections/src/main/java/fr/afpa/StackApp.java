package fr.afpa;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {

        // Ressources :
        // https://www.jmdoudoux.fr/java/dej/chap-collections.htm#collections-5 -> crtl + F : '14.6.7.1. L'interface java.util.Deque' (ca aide si vous y retrouvez sinon utilisé les autres)
        // https://codegym.cc/fr/groups/posts/fr.828.pile-java
        // https://www.youtube.com/watch?v=KInG04mAjO0
        

        // Instanciation d'une nouvelle Stack(Pile) sur le theme de mon choix
        Stack <String> myStackOfCars = new Stack<String>();

        //  Ajout des valeurs dans votre stack
            myStackOfCars.push("Lamborgini");
            myStackOfCars.push("Mazerrati");
            myStackOfCars.push("Bugatti");
        
        // Affichage votre stack
            for (String stackToPrint : myStackOfCars) {
                System.out.println(stackToPrint);
                
            }

        // Suppression de l'élément du dessus de la stack;
            myStackOfCars.pop();
           for (String stackToPrint2 : myStackOfCars) {
            System.out.println("\n after delete \n" + stackToPrint2 + "\n");
           }
        // Affichage de l'élément du dessus de la stack
        System.out.println(myStackOfCars.peek());

       
        // Recherche et affichage de la position d'un des éléments (la valeur indiquera la position de l'élément par rapport au dessus de la stack);
        String elementToSearch = "Mazerrati";   
        int position = myStackOfCars.search(elementToSearch);

        if(position != -1){
            System.out.println("La position de l'élément " + elementToSearch + " par rapport au sommet de la pile est : " + position);
        }else{
           System.out.println( "La position de l'élément " + elementToSearch + " n'est pas présent dans la pile.");
        } 

        // Supprimez tous les éléments de votre stack
        myStackOfCars.removeAllElements();

        // Vérifiez si votre stack est vide 
        System.out.println("le cotenude ma stack est" +myStackOfCars);


    }
}

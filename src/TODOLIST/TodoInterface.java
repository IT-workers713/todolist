package TODOLIST;

import java.util.Scanner;

public class TodoInterface {
    private  String username;
    private String createtodolist;
    Scanner sc  = new Scanner(System.in);
    Todolist Caracteristiques = new Todolist();
    public void todo(){
        System.out.println("******ORANGE******");
        System.out.println("Bienvenue , Entrez votre Nom");
        Caracteristiques.setUsername(username);
        System.out.println("Bonjour " + Caracteristiques.getUsername() + " Click sur entrer pour continuer ! ");
        sc.nextLine();
        System.out.println(" Tapez tab ou enter pour enregistrer le todo !");
        Caracteristiques.setTodolist();
        Caracteristiques.createtextfiletodos();
    }
}

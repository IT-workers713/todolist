package TODOLIST;

import java.util.Scanner;

public class Todolist {
    private String username;
    private String todolist;
    private boolean continueInApp;

    Scanner Entrer = new Scanner(System.in);
    public void setUsername(String username){
        username = Entrer.next();
        this.username = username;
    }
    public String getUsername(){
        return this.username;
    }
    public void setTodolist() {
        System.out.println("Entrez votre tâche (ou tapez 'exit' pour quitter) : \n");
        todolist = Entrer.nextLine();

        if (todolist.equalsIgnoreCase("exit")) {
            System.out.println("Liste des tâches terminée. Quitter l'application...\n");
            continueInApp = false; // Met à jour la variable continueInApp pour sortir de l'application
        } else {
            this.todolist = todolist;
        }
    }

    public void continueInApp(boolean yesOrNo){
        this.continueInApp = yesOrNo;
    }
    public boolean continueInApp(){
        return this.continueInApp;
    }
    public void createtextfiletodos(){
        TextIO.writeFile("todolist.txt");
        TextIO.putln(this.todolist);
    }
}


package TODOLIST;
import TODOLIST.TextIO;
public class Main {
    public static void main(String[] args) {
        TodoInterface userInterface = new TodoInterface();
        boolean continueInApp ;

        do {
            userInterface.todo();
            System.out.println(" Voulez vous continuer sur cette application 'oui' ou 'non '");
            continueInApp = TextIO.getlnBoolean();
        } while (continueInApp);
    }}
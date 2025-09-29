import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a political party, D, R, I, or Other");
        Scanner in = new Scanner(System.in);
        String partyAffiliation = in.next();
        if(partyAffiliation.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (partyAffiliation.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        }
        else if (partyAffiliation.equals("I")){
            System.out.println("You get an Independent Man.");
        }
        else {
            System.out.println("You get an Other Person");
        }
    }
}

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a political party, D, R, I, or Other");
        Scanner in = new Scanner(System.in);
        String partyAffiliation = in.next();
        if(Objects.equals(partyAffiliation, "D")){
            System.out.println("You get a Democratic Donkey.");
        }
        else if (Objects.equals(partyAffiliation, "R")) {
            System.out.println("You get a Republican Elephant.");
        }
        else if (Objects.equals(partyAffiliation, "I")) {
            System.out.println("You get an Independent Man.");
        }
        else {
            System.out.println("You get an Other Person");
        }
    }
}

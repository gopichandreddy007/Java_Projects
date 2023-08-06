import java.util.*;
public class GuessTheNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 to play 0 to exit");
        int j = sc.nextInt();
        while(j == 1){ 
        Random r = new Random();
        int RandomNumber = r.nextInt(100);
        
        int i = 0;
        while(i<3){
        System.out.println("Guess the number(1-100)");
        int guess = sc.nextInt();
        if(guess < RandomNumber){
            System.out.println("Your guess is lower, try again");
            i++;
        }
        else if(guess > RandomNumber){
            System.out.println("your guess is higher, try again");
            i++;

        }
        else if(guess==RandomNumber){
            System.out.println("you have guessed it right");
            break;
        }
        else{
            System.out.println("Sorry, try again");
            i++;
        }
    }
    System.out.println("you have completed your tries");
    System.out.println("if you wish to continue enter 1 else enter 0");
    j = sc.nextInt();
}
System.out.println("thanks for playing");


    }
}
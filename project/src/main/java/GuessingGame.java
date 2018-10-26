import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
      
      final int MAX_NUMBER_OF_ITEMS = 100;
      Scanner scanner = new Scanner(System.in);
       
      //Introduction to the game
      System.out.printf("We are making a game called :'Guess How Many are in the Jar%n");
      System.out.printf("Please Note: Don't guess the answer above the maximum number which is %d or else you lose the game.%n%nYou have good chances to win the game%n%n", MAX_NUMBER_OF_ITEMS);
      System.out.printf("%nPlease follow the instructions carefully to play the game%n");
      
      
      //Asking the user what type of item the user wants to fill in the jar
      System.out.println("What type of item do you want this jar to be filled with?/nAns:");
      String item = scanner.next();
      System.out.printf("%nYou have filled the jar with "+item+".");
      
      
      //Defining the total number of items in the jar and the number is unknown to the user and the developer
      int count = 1;
      Random random = new Random();
      int someNumber = random.nextInt(MAX_NUMBER_OF_ITEMS);
      
                        
      //Declaring all the instructions to the player
      System.out.printf("Please Note:You can fill only %d number of maximum %s.%n%n ", MAX_NUMBER_OF_ITEMS, item);
      System.out.printf("%n%nMaximum capacity of the jar is %d. You are allowed to guess a number between 1 and %d.", MAX_NUMBER_OF_ITEMS, MAX_NUMBER_OF_ITEMS); 
      System.out.printf("%n%nHow many number of %s are filled in the jar?%n Write your guess in integer.%n ", item);
      
      
      //Asking the user to input the first guess 
      int guessAsInteger = scanner.nextInt();
      if(guessAsInteger > MAX_NUMBER_OF_ITEMS){
        System.out.println("You have guessed above the maximum limit.");
        System.exit(0);
      }
       
      
      /*If the guess is incorrect, you are given infinte tries. 
      The game also gives the hint whether your guess is higher 
      or lower to the actual answer.
      */
      while(guessAsInteger != someNumber){
        System.out.printf("%nYour guess is incorrect. Please try again. You have used %d tries.%n",count);
        if(guessAsInteger > someNumber){
          System.out.println("Your guess is higher than the actual value");
        } else {
          System.out.println("Your guess is lower than the actual value");
        }
        
        System.out.println("Write your guess number in Integer form? ");
        guessAsInteger = scanner.nextInt();
         count = count + 1;
        } 
    
      
      //If your guess is correct, you win the game                  
      if(guessAsInteger == someNumber){
        System.out.printf("Congrats! You have guessed the correct answer. You have passed the game in %d attempts", count);
      }
    
    }
}



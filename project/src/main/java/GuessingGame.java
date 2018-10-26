import java.io.Console;
import java.util.Random;


public class GuessingGame {
    public static void main(String[] args) {
      
      final int MAX_NUMBER_OF_ITEMS = 100;
      final int MAX_TRIES = 7;
      Console console = System.console();
       
      //Introduction to the game
      System.out.printf("We are making a game called :'Guess How Many are in the Jar%n");
      System.out.printf("You have %d number of tries for this game. Don't guess the answer above the maximum number or else you lose the game.%n%nYou have good chances to win the game%n%n", MAX_TRIES);
      
      
      //Asking the user what type of item the user wants to fill in the jar
      String item = console.readLine("What type of item do you want this jar to be filled with? :");
      console.printf("%nYou have filled the jar with %s %n", item);
      
      
      /*
      Asking the user how many items he/she wants to fill the jar. 
      If the user inputs above the maximum limit, the system exits else the game continues
      */
      System.out.printf("Please Note:You can fill only %d number of maximum items.%n%nWhat is the maximum number of %s that you want your jar to hold? ", MAX_NUMBER_OF_ITEMS, item);
                        
      String maxNumber = console.readLine("%nWrite your  answer in Integer form. ");
      int numberAsInteger = Integer.parseInt(maxNumber);
      if( numberAsInteger > MAX_NUMBER_OF_ITEMS ){
        System.out.println("%nYou have exceeded the maximum limit which is " + MAX_NUMBER_OF_ITEMS + ".");
        System.exit(0);
      }
      
      //Defining the total number of items in the jar and the number is unknown to the user and the developer
      int count = 1;
      Random random = new Random();
      int someNumber = random.nextInt(MAX_NUMBER_OF_ITEMS);
      
                        
      //Asking the user to input the first guess                   
      System.out.printf("%n%nMaximum capacity of the jar is %d. You are allowed to guess a number between 1 and %d.", numberAsInteger, numberAsInteger);                                            
      System.out.printf("%n%nHow many number of %s are filled in the jar? ", item);
      
      String guessNumber = console.readLine("%nWrite your guess number in Integer form?%nAns: ");
      int guessAsInteger = Integer.parseInt(guessNumber);
      if(guessAsInteger > MAX_NUMBER_OF_ITEMS || guessAsInteger > numberAsInteger){
        System.out.println("You have guessed above the maximum limit.");
        System.exit(0);
      }
       
      
      /*If the guess is incorrect, you are given 6 extra tries. 
      The game also gives the hint whether your guess is higher 
      or lower to the actual answer. After 6 extra tries, you exit the system. 
      */
      while(guessAsInteger != someNumber){
        System.out.println("Your guess is incorrect. Please try again. You have used "+count+" tries.");
        if(guessAsInteger > someNumber){
          System.out.println("Your guess is higher than the actual value");
        } else {
          System.out.println("Your guess is lower than the actual value");
        }
        guessNumber = console.readLine("Write your guess number in Integer form? ");
         guessAsInteger = Integer.parseInt(guessNumber);
        count = count + 1;
        if(count == MAX_TRIES){
          System.out.printf("The correct answer is %d.", someNumber);
          
          System.exit(0);
        }
      }
      
      
      //If your guess is correct, you win the game                  
      if(guessAsInteger == someNumber){
        System.out.println("Congrats! You have guessed the correct answer.");
      }
    
    }
}


import java.util.Scanner;

public class Prompter {

    private Scanner scanner;
    private Jar jar;
    private int answer;

    public Prompter() {
        scanner = new Scanner(System.in);;
    }

    public void game(){
        String itemName = promptItemName();
        int maxNumberWithItemName = promptMaxItems(itemName);
        jar = new Jar(itemName, maxNumberWithItemName);
        promptGuessAnswer();

    }

    private String promptItemName(){
        System.out.println("What type of item do you want this jar to be filled with?Ans:");
        String item = scanner.nextLine();
        return item;
    }

    private int promptMaxItems(String item){
        System.out.print("What is the maximum amount of "+ item +" you want to fill with ?  ");
        int maxItem = scanner.nextInt();
        return maxItem;
    }

    private void promptGuessAnswer(){
        System.out.printf("%n%nHow many number of %s are filled in the jar? You can only guess a number from 1 to %d%nWrite your guess in integer.%n ", jar.getItem(), jar.getMaxNum());
    }

    int count = 1;

    public void actualGame(){
        answer = scanner.nextInt();

        while(answer != jar.getAnswer()){
            System.out.printf("%nYour guess is incorrect. Please try again. You have used %d tries.%n",count);
            if(answer > jar.getAnswer()){
                System.out.println("Your guess is higher than the actual value");
            } else {
                System.out.println("Your guess is lower than the actual value");
            }
            //promptGuessAnswer();
            System.out.println("Write your guess number in Integer form? ");
            answer = scanner.nextInt();
            count = count + 1;
        }


        //If your guess is correct, you win the game
        if(answer == jar.getAnswer()){
            System.out.printf("Congrats! You have guessed the correct answer. You have passed the game in %d attempts", count);
        }

    }

}

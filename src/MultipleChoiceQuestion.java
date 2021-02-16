import java.util.Scanner;

public class MultipleChoiceQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean checker = true;
        while(checker){
            System.out.println("Welcome to this challenge, pick a choice as the answer!");
            System.out.println("Once you pick an answer, type out the choice containing the answer!");
            System.out.println("What is 1+1 equals to?");
            System.out.println("A\t3.\nB\t2.\nC\t5.");
            String userInput = input.next();
            if(userInput.equals("A") || userInput.equals("C")){
                System.out.println("That is incorrect!\nPlease try again!");
                checker =true;
            }
            else if(userInput.equals("B")){
                checker =false;
            }
            else{
                System.out.println("That answer is invalid!\nPlease try again! \n");
                checker =true;
            }

        }

            System.out.println("Congratulations!\tYou are correct!");

    }
}

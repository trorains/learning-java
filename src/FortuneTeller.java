import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        int number;
        System.out.println("Welcome to the Fortune Tellers App!\n Pick a number between 1-10 to predict your fortune. \n ");
        Scanner input = new Scanner(System.in);
        Scanner executer = new Scanner(System.in);
        number = input.nextInt();
        if(number <= 5 && number > 0){
            System.out.println("Welcome young worlock!");
        }else if(number >5){
            System.out.println("Welcome unruly worlock!");
        }else{
            System.out.println("Invalid number");
        }

    }

}

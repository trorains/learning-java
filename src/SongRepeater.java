import java.util.Scanner;

public class SongRepeater {
    public static void main(String[] args) {
        boolean isSongOnRepeat =true;
        while (isSongOnRepeat){
            System.out.println("This song is on repeat. \nWould you like to jump to the next song!\n If you would like to, type in YES!" +
                    "\n If you would not like to, type in NO!");
            Scanner input = new Scanner(System.in);
            String checker = input.next();
            if(checker.equals("YES")){
                isSongOnRepeat = false;
                System.out.println("Next song is playing!");
            }
            else{
                isSongOnRepeat =true;

            }
        }
    }
}

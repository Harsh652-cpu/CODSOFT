// number game
import java.util.Scanner;

class rangeofnumbers{
    public int generate(int max,int min){
        return (int) (Math.random()*(max-min+1)+min);
    }
}

public class Main {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        rangeofnumbers rg=new rangeofnumbers();
        int totalnumberofAttempts=0;
        int win=0;

        while(true){
            System.out.println("Enter the maximum number");
            int max=inp.nextInt();
            System.out.println("Enter the minimum number");
            int min=inp.nextInt();
            inp.nextLine();

            int correctnumber=rg.generate(max,min);
            int attempts=0;

            while(true){
                System.out.println("Guess a number including & between "+max+" and "+min);
                int guessednumber=inp.nextInt();
                attempts++;

                if(guessednumber>correctnumber){
                    System.out.println("Entered number is greater than actual random number");
                }
                else if (guessednumber<correctnumber){
                    System.out.println("Entered number is lower than actual number");
                }
                else{
                    System.out.println("You guessed the right number");
                    win++;
                    break;
                }
            }
            totalnumberofAttempts+= attempts;
            System.out.println("Attempts="+ attempts);
            System.out.println("Wins="+win);

            double winrate=(double) win/ totalnumberofAttempts*100;
            System.out.printf("Your winrate is %.2f%%\n",winrate);

            System.out.println("Do you want to play again (yes/no)");
            String playAgain= inp.next();
            if(!playAgain.equalsIgnoreCase("yes")){
                inp.close();
                System.exit(0);
            }
            inp.nextLine();
        }
    }

}

//Number game
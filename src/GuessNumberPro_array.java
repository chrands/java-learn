import java.util.Random;
import java.util.Scanner;

public class GuessNumberPro_array {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int[] guessTime = new int[3];
        String [] playerName = {"zhangsan","lisi","wangwu"};
        int wintime = 0;
        int losttime =0;
        System.out.println("game is on!");

        for(int i = 0;i < playerName.length;i++){
            int target = rand.nextInt(50)+1;
            System.out.println(playerName[i]+"begin");
            int count = 0;
            boolean isRight = false;

            while(count < 3){
                System.out.println("hello, "+playerName[i]+". this is "+(count+1)+"~~enter your number:"+target);
                if(!input.hasNextInt()){
                    System.out.println("mistake enter ,please retry");
                    count --;
                    input.next();
                }else{
                    count ++;
                }
                int guess = input.nextInt();
                if (guess == target){
                    System.out.println("you are win!");
                    isRight = true;
                    guessTime [i] = count;
                    break;
                }else{
                    System.out.println("wrong! you only have"+(3-count)+"time chance");
                }
            }
            if(!isRight){
                System.out.println("you have no chance");
                guessTime[i] = -1;
            }
        }
        input.close();
        for(int i = 0; i < playerName.length; i++) {
            if (guessTime[i] != -1) {
                System.out.println(playerName[i] + "  guesstime is  " + guessTime[i]);
            }else{
                System.out.println(playerName[i] + "  guesstime is 0");
            }
        }
    }
}

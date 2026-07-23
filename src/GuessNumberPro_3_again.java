//电脑随机想一个1-50的随机数，用户有3次机会猜测，且支持再来一次。
import java.util.Scanner;
import java.util.Random;

public class GuessNumberPro_3_again {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int GuessNum;

        while(true){
            int count = 0;
            int target = rand.nextInt(50)+1;
            boolean isRight=false;
            System.out.println("game is on!  "+target);

            while(count < 3){
                count ++;
                System.out.println("put your numbers:");
                GuessNum = input.nextInt();
                if(GuessNum < target){
                    System.out.println("you are low");
                }else if(GuessNum > target){
                    System.out.println("you are high");
                }else{
                    System.out.println("you are right!");
                    isRight = true;
                    break;
                }
            }

            if(!isRight) {
                    System.out.println("you are 3 times,again(y/n)?");
            }

            while(true){
                System.out.println("again(y/n)?");
                String AgainGame = input.next();
                if(AgainGame.equals("y")||AgainGame.equals("Y")){
                    break;
                }else if(AgainGame.equals("n")||AgainGame.equals("N")){
                    System.out.println("goodbye");
                    input.close();
                    return;
                }else{
                    System.out.println("print is wrong");
                }
            }
        }
    }
}

import java.util.Scanner;
import java.util.Random;

public class GuessNumberPro {
    public static void  main(){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int gameTime = 0;
//        int guess;
        String againGame;
        int wintime = 0;
        int losetime = 0;
        System.out.println("game is on!");


        while(true){
            int count = 0;
            boolean isRight = false;
            gameTime ++;
            int target = rand.nextInt(50)+1;
            System.out.println("This is your "+gameTime+" times game,"+"[TEST]target:"+target+"\n print your guess num:");

            //游戏核心内容，判断大小逻辑
            while(count < 3){

                count ++;
                if(!input.hasNextInt()){
                    System.out.println("input is not a number! please try again");
                    input.next();
                    count --;
                    continue;
                }
                int guess = input.nextInt();  //先校验，在读取
                if(guess == target){
                    System.out.println("["+gameTime+"]"+"you are win! do you again?(y/n)");
                    wintime++;
                    isRight = true;
                    break;
                }else if(guess < target){
                    System.out.println("["+gameTime+"]"+"low!");
                }else{
                    System.out.println("["+gameTime+"]"+"high!");
                }
            }
            if (!isRight){
                System.out.println("["+gameTime+"]"+"you are try most times! you are lost! do you want again? (y/n)");
                losetime++;
            }
            while(true){
                againGame = input.next();
                if (againGame.equals("y")||againGame.equals("Y")){
                    break;
                }else if(againGame.equals("n")||againGame.equals("N")){
                    System.out.println("gameTime:"+gameTime+",wintime:"+wintime+",losetime"+losetime);
                    return;
                }else{
                    System.out.println("mistake input ,please try again!");
                }
            }

        }
    }
}
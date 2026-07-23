import java.util.Scanner;
import java.util.Random;

public class GuessNumberPro {
    public static void  main(String[] args){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int count = 0;
        int gameTime = 0;
        int guess;
        String againGame;
        boolean isRight = false;
        int wintime = 0;
        int losetime = 0;

        while(true){
            System.out.println("game is on!\n");
            gameTime ++;

            //游戏核心内容，判断大小逻辑
            while(count < 3){
                int target = rand.nextInt(50)+1;
                guess = input.nextInt();
                if(!input.hasNextInt()){
                    System.out.println("input is not a number!\n");
                    input.next();
                    count --;
                    continue;
                }
                count ++;
                System.out.println("This is your"+gameTime+"times game,"+"[TEST]target:"+target+"\n print your guess num:");
                if(guess == target){
                    System.out.println("you are win!\n");
                    wintime++;
                    isRight = true;
                    break;
                }else if(guess < target){
                    System.out.println("low!\n");
                }else{
                    System.out.println("high!\n");
                }
            }
            if (!isRight){
                System.out.println("you are 3 times! do you want again? (y/n)\n");
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
                    System.out.println("wrong\n");
                }
            }

        }
    }
}
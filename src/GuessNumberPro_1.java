//电脑随机想一个1-50的随机数，用户有3次机会猜测。
import java.util.Scanner;
import  java.util.Random;

public class GuessNumberPro_1 {
    public static void main(String[] args) {

        Random rand = new Random();  //先定义一个随机数变量rand
        Scanner input = new Scanner(System.in);  //再定义一个输入的整数变量input
        int  target = rand.nextInt(50) + 1; //定义一个target目标整数位1-50的随机数rand变量的取数
        int guess;
        int count = 0;
        boolean isTrue = false;
        System.out.println("game is on,target is: "+target);

        //第一种写法，不用while判断次数，用if
        while(true){
            count ++;
            if(count <= 3) {
                System.out.println("enter a number between 1 and 50:");
                guess = input.nextInt();


                if (guess < target) {
                    System.out.println("you is low");
                } else if (guess > target) {
                    System.out.println("you is high");
                } else {
                    System.out.println("you are right!"+"you guess "+count+" times");
                    isTrue = true;
                    break;
                }
            }
            else {
                break;
            }
        }

        if (!isTrue){
            System.out.println("you are try 3 times , game is over~");
        }

        input.close();
    }
}

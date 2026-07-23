//电脑随机想一个1-50的随机数，用户有3次机会猜测。

import  java.util.Random;
import java.util.Scanner;

public class GuessNumberPro_2 {
    public static void main(String[] args) {

        Random rand = new Random();  //先定义一个随机数变量rand
        Scanner input = new Scanner(System.in);  //再定义一个输入的整数变量input
        int  target = rand.nextInt(50) + 1; //定义一个target目标整数位1-50的随机数rand变量的取数
        int guess;
        int count = 0;
        boolean isTrue = false;
        System.out.println("game is on,target is: "+target);

        //第二种写法，使用while直接判断count，最简洁
        //初始为0，进来依次是1,2,；分别对应三次机会，count为3的时候自动跳出循环
        while(count < 3){
            count ++;

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

        if (!isTrue){
            System.out.println("you are try 3 times , game is over~");
        }

        input.close();
    }
}

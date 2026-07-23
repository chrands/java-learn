import java.util.Random; //导入随机数功能
import java.util.Scanner; //导入键盘输入功能

public class GuessNumber {
    public static void main(String[] args) {

        Random rand = new Random(); //创建随机数
        int target = rand.nextInt(100)+1; //生成随机数1-100，这里是0-99首尾分别+1
        Scanner scanner  = new Scanner(System.in);

        System.out.println("game is on!");

        int guess;
        int count = 0;

        while (true) {
            System.out.println("print a number between 1 and 100:");
            guess = scanner.nextInt(); //等待输入
            count++;

            if (guess > target) {
                System.out.println("please small");
            }else if (guess < target){
                System.out.println("please big");
            }else{
                System.out.println("congratulations,you are right!"+"you guess "+count+" times");
                break;
            }
        }
        scanner.close();
        System.out.println("game is over");
    }
}

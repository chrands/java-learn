public class array1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] scores = {1,2,3,4,5};
        String[] names = new String[10];
        System.out.println(numbers[9]);
        System.out.println(scores[3]);

        names[0]="zhangsan";
        System.out.println(names[0]);
        System.out.println(numbers.length);

        for(int i = 0;i < scores.length; i++){
            System.out.println("第"+(i+1)+"个元素是："+scores[i]);
        }

        for(int score : scores){
            System.out.println(score);
        }

    }
}

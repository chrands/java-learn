//把 for 循环和 if 结合起来——打印1到10，但只打印其中的偶数
public class pro1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "是奇数");
            }else{
                System.out.println(i+"是偶数");
            }
        }
    }
}

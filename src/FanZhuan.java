public class FanZhuan {
    public static void main(String[] args) {
        String str = "abcde";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("反转前:"+str);
        System.out.println("反转后："+reversed);
    }
}

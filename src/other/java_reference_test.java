package other;

public class java_reference_test {
    public static void main(String[]arg){
        int test1 = 1;
        int test2 = test1;
        System.out.println(test2);
        test1 = 2;
        System.out.println(test2);
    }
}

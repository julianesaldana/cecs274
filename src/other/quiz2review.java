package other;

import java.util.Random;

public class quiz2review {
    public static void main(String[]arg){
        System.out.println("Loading an array with 20 numbers and creating the average");
        int [] numbers = new int[20];
        loadArray(numbers);
        double ave = arrayAverage(numbers);
        System.out.println(ave);
    }

    public static void loadArray (int [] l){
        Random rand = new Random();
        for (int i = 0; i < l.length; i++){
            int random_num = rand.nextInt(51) + 50;  // (max - min) + 1 then add 50
            l[i] = random_num;
        }
    }

    public static double arrayAverage (int [] l){
        double total = 0;
        for (int i = 0; i < l.length; i++){
            total += l[i];
        }
        return (double) (total / l.length);
    }
}

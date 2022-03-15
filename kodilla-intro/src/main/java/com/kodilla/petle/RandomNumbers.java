import java.util.Random;

public class RandomNumbers {
    public static void main (String[] arg){
        Random newRandom = new  Random();
        int min = 30;
        int max = 0;
        int sum = 0;
        while (sum < 5000) {
            int a =  newRandom.nextInt(31);
                    if (a > max) max = a;
                    if (a < min) min = a;
                    sum = sum +a;
        }
        System.out.println(sum);
        System.out.println("Największa liczba to " + max);
        System.out.println("Najmniejsza liczba to " + min);

    }
}

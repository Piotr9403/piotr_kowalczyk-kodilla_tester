import java.util.Random;
public class Loops2 {

    static public int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {


        System.out.println(getCountOfRandomNumber(55));

    }

}

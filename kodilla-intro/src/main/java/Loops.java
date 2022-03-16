public class Loops {

    static public int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;

    }

    public static void main(String[] args) {

        //Tablice można zapisać tak lub tak jak poniżej
        int[] numbers = new int[]{1, 2, 3, 4, 5};

       /* numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;*/


        System.out.println(sumNumbers(numbers));
        System.out.println("Poniżej wyniki z pętli While");


    }

}

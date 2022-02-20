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
        int[] numbers = new int[]{1,2,3,4,5};

       /* numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;*/


        System.out.println(sumNumbers(numbers));
        System.out.println("Poniżej wyniki z pętli While");

        /*
        //pętla liczy wartości tablicy od 0 czyli od pierwszego imienia
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }*/
        //Pętla teraz liczy wartości z tablicy od tyłu
        /*for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
        */
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

    }

}

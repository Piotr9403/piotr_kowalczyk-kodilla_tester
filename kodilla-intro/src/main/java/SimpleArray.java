public class SimpleArray {
    public static void main(String[] args) {

        String[] animalNames = new String[5];
        int numberOfElements = animalNames.length;


        animalNames[0] = "Puszek";
        animalNames[1] = "Okruszek";
        animalNames[2] = "Shrek";
        animalNames[3] = "Wezyr";
        animalNames[4] = "Mruczek";

        //wyświetlenie wartości nr 3 z tablicy animalNames

        System.out.println ("Tablica zawiera wartość " + numberOfElements + " elementów");

    }
}
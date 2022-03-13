public class FirstClass {
    public static void main(String[] args) {


        Notebook notebook = new Notebook(600, 1000, 2010);
        System.out.println("Asus: " + notebook.weight + "g " + notebook.price + " pln " + notebook.year+ " rok");
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkPriceyear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2015);
        System.out.println("Toshiba: " + heavyNotebook.weight + "g " + heavyNotebook.price + " pln " + heavyNotebook.year+ " rok");
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkPriceyear();

        Notebook oldNotebook = new Notebook(1600, 600, 2005);
        System.out.println("Samsung: " + oldNotebook.weight + "g " + oldNotebook.price + " pln " + oldNotebook.year + " rok");
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkPriceyear();

        }

    }

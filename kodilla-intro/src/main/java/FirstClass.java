/*public class FirstClass {                           // [1]
    public static void main(String[] args) {         // [2]
        System.out.println("Hello from FirstClass!"); // [3]
    }
}*/
/*public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello from FirstClass!");

        if (1 > 2){
            System.out.println("Niesamowite! Jeden jest większe niż dwa!!!");
        }
    }
}*/
/*public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("600g");
        System.out.println(notebook.weight);

    }
}*/

public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("600g", 1000);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();

        Notebook heavyNotebook = new Notebook("2000g", 1500);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();

        Notebook oldNotebook = new Notebook("1600g", 500);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();

        }
    }
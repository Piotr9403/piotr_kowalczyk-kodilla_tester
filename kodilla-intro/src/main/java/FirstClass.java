public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("Asus", 600, 1000, 2010);
        System.out.println(notebook);
        notebook.checkAll();

        Notebook heavyNotebook = new Notebook("Toshiba", 2000, 1500, 2015);
        System.out.println(heavyNotebook);
        heavyNotebook.checkAll();

        Notebook oldNotebook = new Notebook("Samsung", 1600, 600, 2005);
        System.out.println(oldNotebook);
        oldNotebook.checkAll();
    }
}

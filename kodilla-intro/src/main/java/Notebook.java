public class Notebook {
    String weight;
    int price;
    public Notebook(String weight, int price) { //Do konstruktora, po przecinku, dodaj nowy argument (int price), taki sam jak właśnie zadeklarowany atrybut.
        this.weight = weight;
        this.price = price; //W klasie Notebook został dopisant argumement price
    }
    //W klasie Notebook utwórzmy metodę o nazwie checkPrice, która sprawdzi, czy cena laptopa jest mniejsza niż 900.
    public void checkPrice() {
        if (this.price < 900) {
            System.out.println("This notebook is cheap.");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
    }

}

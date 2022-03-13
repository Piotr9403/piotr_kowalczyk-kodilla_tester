public class Notebook {
    private String name;
    private int weight;
    private int price;
    private int year;

    public Notebook(String name, int weight, int price, int year) {
        this.name = name; //Do konstruktora, po przecinku, dodaj nowy argument (int price), taki sam jak właśnie zadeklarowany atrybut.
        this.weight = weight;
        this.price = price; //W klasie Notebook został dopisant argumement price
        this.year = year; //W klasie Notebook został dopisant argumement year
    }

    public void checkAll() {
        checkPrice();
        checkPriceyear();
        checkWeight();
    }

    //W klasie Notebook utwórzmy metodę o nazwie checkPrice, która sprawdzi, czy cena laptopa jest mniejsza niż 900.
    public void checkPrice() {
        if (price <= 600) {
            System.out.println("notebook is very cheap.");
        } else if (price >= 601 && price <= 1000) { // przedział od 600 do 1000
            System.out.println("price is good");
        } else if (price >= 1001) { // powyzej 1000
            System.out.println("price is expensive");
        }
    }

    public void checkWeight() {
        if (weight >= 1601) { //powyzej 1600
            System.out.println("Urządzenie jest cięzkie");
        } else if (weight >= 601 && weight <= 1600) { // od 601 do 1600
            System.out.println("Urządzenie jest niezbyt cięzkie");
        } else if (weight > 0 && weight <= 600) { // od 0 do 600
            System.out.println("Urządzenie jest lekkie");
        } else if (weight == 0) {
            System.out.println("Wybierz wagę powyżej zera");
        }
    }

    public void checkPriceyear() {
        if (price <= 600 && year <= 2005) {
            System.out.println("Do 2005 roku laptopy kosztowały 600 pln");
        } else if (price <= 1000 && year <= 2010) {
            System.out.println("Do 2010 roku laptopy kosztowały 1000 pln");
        } else if (price <= 1500 && year <= 2015) {
            System.out.println("Do 2015 roku laptopy kosztowały 1500 pln");
        }
    }

    @Override
    public String toString() {
        return name + ": " + weight + "g " + price + " pln " + year + " rok";
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }
}
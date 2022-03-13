public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) { //Do konstruktora, po przecinku, dodaj nowy argument (int price), taki sam jak właśnie zadeklarowany atrybut.
        this.weight = weight;
        this.price = price; //W klasie Notebook został dopisant argumement price
        this.year = year; //W klasie Notebook został dopisant argumement year
    }
    //W klasie Notebook utwórzmy metodę o nazwie checkPrice, która sprawdzi, czy cena laptopa jest mniejsza niż 900.
    public void checkPrice() {
        if (this.price <= 600) {
            System.out.println("This notebook is very cheap.");
        }
       else if (this.price >= 601 && this.price <= 1000) { // przedział od 600 do 1000
            System.out.println("This price is good");
        }

        else if (this.price <= 1001 || this.price <= 1000000 ) { // //tutaj funkcja nie działa do końca dobrze
            System.out.println("This price is expensive");
        }

    }

    public void checkWeight() {
        if (this.weight >= 1601 || this.weight >= 2000) {
            System.out.println("Urządzenie jest cięzkie");
        }
        else if (this.weight >= 601 || this.weight >= 1600) {
            System.out.println("Urządzenie jest niezbyt cięzkie");
        }
        else if (this.weight >= 1 || this.weight >= 600) {
            System.out.println("Urządzenie jest lekkie");
        } else if  (this.weight == 0) {
            System.out.println("Wybierz wagę powyżej zera");
        }


    }

    public void checkPriceyear(){
        if (this.price <= 600 && this.year <= 2005) {
            System.out.println("Do 2005 roku laptopy kosztowały 600 pln");
        }
        else if (this.price <= 1000 && this.year <=2010){
            System.out.println("Do 2010 roku laptopy kosztowały 1000 pln");
        }
        else if (this.price <= 1500 && this.year <=2015){
            System.out.println("Do 2015 roku laptopy kosztowały 1500 pln");
        }
    }



    }




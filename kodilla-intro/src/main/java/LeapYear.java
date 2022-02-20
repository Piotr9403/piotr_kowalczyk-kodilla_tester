public class LeapYear {

    public static void main(String[] args) {

        // stała dla year
        int year = 2000;
        boolean leap = false;

        // jeżeli rok jest podzielny przez 4
        if (year % 4 == 0) {

            // jeżeli jest podzielny przez 100
            if (year % 100 == 0) {
            // jeżeli rok jest podzielny przez 400 jest przestępny
            // else - jeżeli nie jest - jest nieprzprzestępny
            if (year % 400 == 0)
                leap = true;
            else
                leap = false;
        }

        // jeżeli nie jest rokiem przestępnym
        else
            leap = true;
    }

        else
            leap = false;

        if (leap)
            System.out.println(year + " jest przestępny.");
        else
            System.out.println(year + " jest nieprzestępny.");
}
}


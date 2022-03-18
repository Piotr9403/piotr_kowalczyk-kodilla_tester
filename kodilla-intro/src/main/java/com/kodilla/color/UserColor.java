import com.kodilla.color.UserColorApp;

public class UserColor {
    public static void main(String args[]) {
        UserColorApp userApp = new UserColorApp();      //instacja klasy
        userApp.getUserWord();                          //wprowadza litere z klasy wpisaną z konsoli getUserWord

        System.out.println(userApp);                    //wyświetla strumień zadekarowany do danej litery ze switch(choice)

    }
}
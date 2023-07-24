// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       System.out.println("Hello and welcome!");
        Transport transport[] = new Transport[3];
        transport[0] = new Transport("Red", 120);
        transport[1] = new Transport("Green", 160);
        transport[1] = new Transport("Black", 200);

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i < 4; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println();
            System.out.println("Transport N " + i + " with color - " + transport[i-1].getColor());
            System.out.println("Transport N " + i + " with maxSpeed - " + transport[i-1].getMaxSpeed());
        }
    }
}
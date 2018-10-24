package matematyka;

public class Rectangle {
    //pola
    public int a;
    public int b;

    //konstruktor
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // metody
    public int calculateArea() {
        return a * b;
    }

    public int calculateCircumference() {
        return 2 * (a + b);
    }


}

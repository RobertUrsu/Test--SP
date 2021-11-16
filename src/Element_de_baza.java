public abstract class Element_de_baza implements Element{
    int x,y;
    String culoare;
    float dimensiune;

    public Element_de_baza(int x, int y, String culoare, float dimensiune) {
        this.x = x;
        this.y = y;
        this.culoare = culoare;
        this.dimensiune = dimensiune;
    }
}

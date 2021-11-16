import java.util.ArrayList;
import java.util.List;

public class Figura_Complexa implements  Element{
    List<Element> Shape;
    public Figura_Complexa()
    {
        Shape = new ArrayList<Element>();
    }

    public  Figura_Complexa(List<Element> elements)
    {
        this.Shape = elements;
    }

    public  void addShape(Element e)
    {
        Shape.add(e);
    }

}

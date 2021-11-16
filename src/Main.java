public class Main {
    public static void main(String[] args) {
        Patrat patrat1 = new Patrat(4,2,"Negru",2);
        Patrat patrat2 = new Patrat(8,5,"Galben",4);

        Cerc cerc1 = new Cerc(7,7,"Verde", 3);
        Cerc cerc2 = new Cerc(5,5,"Portocaliu",4);

        Punct punct1 = new Punct(1,1, "Rosu", 1);
        Punct punct2 = new Punct(2,3, "Maro", 1);
        Punct punct3 = new Punct(6,5, "Albastru", 1);

        Figura_Complexa struct1 = new Figura_Complexa();
        struct1.addShape(patrat1);
        struct1.addShape(cerc1);
        struct1.addShape(punct1);

        Figura_Complexa struct2 = new Figura_Complexa();
        struct2.addShape(patrat2);
        struct2.addShape(cerc2);
        struct2.addShape(punct2);

        Figura_Complexa struct3 = new Figura_Complexa();
        struct3.addShape(struct1);
        struct3.addShape(struct2);
        struct3.addShape(punct3);
    }
}

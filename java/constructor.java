public class constructor {

    private int atributo1;
    private int atributo2;
    private String atributo3;

    //Declaramos un constructor
    public constructor(int attr1, int attr2, String attr3)
    {
        atributo1 = attr1;
        atributo2 = attr2;
        atributo3 = attr3;
    }

    public static void main(String[] args)
    {
        constructor ac = new constructor(5, 10, "x");//Creamos un objeto enviando parámetros al constructor

        System.out.println(ac.atributo1 + ", " + ac.atributo2 + ", " +ac.atributo3);//Mostramos el valor de los atributos
        //Imprime '5, 10, x'
    }



    
}

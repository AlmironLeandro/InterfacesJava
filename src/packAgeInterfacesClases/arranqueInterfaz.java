package packAgeInterfacesClases;
/*Podemos ver que construimos un objeto (p) de tipo persona y se lo pasamos a la función hacerCantar. Esta función espera recibir un
objeto Cantante, y una persona lo es, por tanto la recibe y llama al método cantar del objeto recibido.*/
public class arranqueInterfaz {
    public static void hacerCantar(cantante c)
    {
        c.cantar();
    }
    public static void main(String arg[])
    {
        persona p = new persona();
        hacerCantar(p);
    }
}

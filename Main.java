import builder.CalzadoBuilder;
import clases.Calzado;
import componentes.Cordones;
import director.Director;

import java.nio.file.DirectoryIteratorException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        // General
        Director director = new Director();
        CalzadoBuilder builder = new CalzadoBuilder();

        // 1. Boleta tipo con cordones
        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        director.crearCalzadoCordones(builder);
        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Calzado calzado = builder.getCalzadoResultado();
        System.out.println("Calzado creado:\n" + calzado.getTipoCalzado() + "\n" +
        "Descripción:\n" + Director.printCordones());

        // 2. Boleta tipo con tacon
        director.crearCalzadoTacon(builder);
        Calzado calzadoTacon = builder.getCalzadoResultado();
        System.out.println("Calzado creado:\n" + calzadoTacon.getTipoCalzado()+ "\n" +
        "Descripción:\n" + Director.printTacon());

        // 3. Boleta tipo con almohadilla
        director.crearCalzadoAlmohadilla(builder);
        Calzado calzadoAlmohadilla = builder.getCalzadoResultado();
        System.out.println("Calzado creado:\n" + calzadoAlmohadilla.getTipoCalzado()+ "\n" +
        "Descripción:\n" + Director.printAlmohadilla());

        // 3. Boleta tipo con velcro
        director.crearCalzadoVelcro(builder);
        Calzado calzadoVelcro = builder.getCalzadoResultado();
        System.out.println("Calzado creado:\n" + calzadoVelcro.getTipoCalzado()+ "\n" +
                "Descripción:\n" + "N/A");

    }
}
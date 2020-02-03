package es.google;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
            String miMensaje="Hola mundo";
            System.out.println(miMensaje);
        
            Persona persona = new Persona();
            persona.setEdad(30);
            persona.setNombre("Lazaro");
            System.out.println(persona);
    }
}

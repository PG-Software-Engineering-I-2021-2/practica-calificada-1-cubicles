package app;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Oliver {
    private static Oliver instance;
    private Map<Integer, Oferta> ofertas = new HashMap<>();
    private Map<Integer, Autor> autores = new HashMap<>();
    private Map<Integer, LibrosAutor> LibrosAutores = new HashMap<>();

    private Oliver(){
    }

    public Boolean consultarAutor(String autor){
        // Revisar si el autor se encuentra en la lista de autores
        return true;
    }

    public Integer consultarAutorLibros(String autor){
        // Revisar la cantidad de libros por autor
        return 1;
    }

    public void getLibrosPorAutor(String autor){
        // Obtener los libros por autor en una lista
    }

    public Boolean consultarStock(String nombrelibro){
        // Consultar por el stock del libro deseado
        // Libro.getStock(nombrelibro);
        return true;
    }

    public void registrarDatos(String celular, String correo){
        //Waitlist.put(celular, correo);
    }

    public Boolean ofertar(){
        return true;
    }

    // Empleamos Singleton para tener un solo Oliver
    public static synchronized Oliver getInstance() {
        if(instance == null){
            instance = new Oliver();
        }
        return instance;
    }
}

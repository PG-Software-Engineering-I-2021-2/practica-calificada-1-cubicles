package app;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Oliver {
    private static Oliver instance;
    private


    private Oliver(){
    }

    public Boolean consultarAutor(String autor){
        Autor.exists(autor);
    }

    public Boolean consultarAutorLibros(String autor){
        LibrosAutor.detalle(autor);
    }

    public ArrayList getLibrosPorAutor(String autor){
        Libro.getListaPorAutor(autor);
    }

    public Boolean consultarStock(String nombrelibro){
        Libro.getStock(nombrelibro);
    }

    public void registrarDatos(String celular, String correo){
        Waitlist.put(celular, correo);
    }

    public void ofertar(){
        if
    }

    // Empleamos Singleton para tener un solo Oliver
    public static synchronized Oliver getInstance() {
        if(instance == null){
            instance = new Oliver();
        }
        return instance;
    }
}

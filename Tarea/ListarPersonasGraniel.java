
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;


public class ListarPersonasGraniel {
    public static class Persona {
        private String nombre;
        private String apellido;
        
        public Persona(String nombre, String apellido){
            this.nombre = nombre;
            this.apellido = apellido;
        }

        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getApellido() {
            return apellido;
        }
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }    

        
    }
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Perez");
        Persona persona2 = new Persona("Maria", "Lopez");
        Persona persona3 = new Persona("Pedro", "Gomez");
        Persona persona4 = new Persona("Ana", "Gonzalez");
        Persona persona5 = new Persona("Luis", "Gutierrez");

        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);

        //impresion de la lista en el orden original
        for (Persona persona : listaPersonas) {
            System.out.println("Nombre: " + persona.getNombre() + " Apellido: " + persona.getApellido());
        }

        //Orden de la lista de personas por nombre de forma ascendente
        Collections.sort(listaPersonas, new Comparator<Persona>(){
            @Override
            public int compare(Persona persona1, Persona persona2){
                return persona1.getNombre().compareTo(persona2.getNombre());
            }
        });
        //impresion de la lista ordenada
        System.out.println("\nOrden por nombre ascendente:");
        for (Persona persona : listaPersonas) {
            System.out.println("Nombre: " + persona.getNombre() + " Apellido: " + persona.getApellido());
        }

        //Orden de la lista de personas por apellido
        Collections.sort(listaPersonas, new Comparator<Persona>(){
            @Override
            public int compare(Persona persona1, Persona persona2){
                return persona1.getApellido().compareTo(persona2.getApellido());
            }
        });

        //impresion de la lista ordenada
        System.out.println("\nOrden por apellido ascendente:");
        for (Persona persona : listaPersonas) {
            System.out.println("Nombre: " + persona.getNombre() + " Apellido: " + persona.getApellido());
        }

        //Orden de la lista de personas por apellido invertido
        Collections.sort(listaPersonas, new Comparator<Persona>(){
            @Override
            public int compare(Persona persona1, Persona persona2){
                return persona2.getApellido().compareTo(persona1.getApellido());
            }
        });

        //impresion de la lista ordenada
        System.out.println("\nOrden por apellido descendente:");
        for (Persona persona : listaPersonas) {
            System.out.println("Nombre: " + persona.getNombre() + " Apellido: " + persona.getApellido());
        }
    }
}





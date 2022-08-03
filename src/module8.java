public class module8 {
//    Crear clase Persona.
//
//    Crear variables las privadas edad, nombre y telefono de la clase Persona.
//
//    Crear gets y sets de cada propiedad.
//
//    Crear un objeto persona en el main.
//
//    Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Oliver");
        persona.setEdad(45);
        persona.setTelefono(523465134);
        System.out.println(persona.getNombre() + ", " + persona.getEdad() + ", " + persona.getTelefono());
    }

}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;


    //propiedad nombre

    public void setNombre(String nombre)  {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }


    //propiedad edad

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }


    //propiedad  telefono

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }

}


package Ejercicio1;

import static java.util.Locale.US;
import java.util.Scanner;


public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String tamaño;
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);
    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
 
    public void solicitarDatoPerro(){
        System.out.println("Ingrese los datos del Perro");
        System.out.println("Nombre");
        this.setNombre(leer.next());
        System.out.println("Raza");
        this.setRaza(leer.next());
        System.out.println("Edad");
        this.setEdad(leer.nextInt());
        System.out.println("Tamaño");
        this.setTamaño(leer.next());
    }

    @Override
    public String toString() {
        return "Datos del Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamaño=" + tamaño + '}';
    }
    
    
}

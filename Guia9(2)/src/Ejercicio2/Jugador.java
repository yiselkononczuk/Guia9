
package Ejercicio2;

public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado; 
 
    public Jugador() {
    }

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " +this.id;
        this.mojado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        this.nombre = "Jugador " +this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean isMojado() {
        return this.mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public boolean disparo(RevolverDeAgua revolverDeAgua){
        
        revolverDeAgua.siguienteChorro();
        
        if(revolverDeAgua.mojar()== true) {
            this.setMojado(true);
            return true; 
        }
        return false; 
    }
}

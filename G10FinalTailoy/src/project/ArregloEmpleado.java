
package project;
import java.io.Serializable;
import java.util.ArrayList;

public class ArregloEmpleado implements Serializable {
    private ArrayList <Empleado> a;
    
    public ArregloEmpleado() {
        a = new ArrayList();
    }

    public void agrega(Empleado nuevo){
        a.add(nuevo);
    }
    
    public Empleado getEmpleado (int i){
        return a.get(i);
    }
    
    public void reemplaza(int i, Empleado actualizado){
        a.set(i, actualizado);
    }
    
    public void elimina(int i){
        a.remove(i);
    }
    
    public void elimina(){
        for (int i = 0; numeroEmpleados() < 10; i++) {
            a.remove(0);
        }
    }
    
    public int numeroEmpleados(){
        return a.size();
    }
    
    public int busca(String codigo){
        for (int i = 0; i < numeroEmpleados(); i++) {
            if (codigo.equalsIgnoreCase(getEmpleado(i).getCodigo())) {
                //Retorna índice
                return i;
            }
        }
        //Significa que no lo encontró
        return -1;
    }

}
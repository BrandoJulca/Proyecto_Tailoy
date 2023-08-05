

package project;

import java.io.Serializable;
import javax.swing.*;

public class Empleado implements Serializable {
 
    //Atributos
    private String codigo;
    private String nombre;
    private String apellido;
    private double ventas;
    private Icon foto;

    //Constructores
    public Empleado(String codigo, String nombre, String apellido, double ventas, Icon foto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ventas = ventas;
        this.foto = foto;
    }

    public Empleado(String codigo, String nombre, String apellido, double ventas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ventas = ventas;
        
    }

    //Getters and Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public Icon getFoto() {
        return foto;
    }

    public void setFoto(Icon foto) {
        this.foto = foto;
    }
       
}

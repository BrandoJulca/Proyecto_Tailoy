package reciclaje;

import java.io.Serializable;
import project.PYC;

public class Empleado12 extends PYC implements Serializable{
    
    private static final long serialVersionUID = 1L;

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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Empleado12(String codigo, String nombre, String categoria, double precio) {
        super(codigo, nombre, categoria, precio);
    }

    @Override
    public String mostrarCodigo() {
return " "+codigo;
    }

    @Override
    public String mostrarNombre() {
return " "+nombre;  
    }

    @Override
    public String mostrarPrecio(){
return " "+precio;
}

    @Override
    public String mostrarCategoria() {
return " "+categoria;
    }

    @Override
    public double mostrarSueldo() {
if(precio== 1)
    return 1200;
else if(precio == 2)
    return 2000;
else if(precio == 3)
    return 1500;
else if(precio == 4)
    return 1450;
        return 0;
    }
    
}

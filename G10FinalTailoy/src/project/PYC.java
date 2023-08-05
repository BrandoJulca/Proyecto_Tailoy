
package project;


public abstract class PYC   {
    public String codigo;
    public String nombre;
    public double precio;
    public String categoria;

    public PYC(String codigo, String nombre, String categoria, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

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
    //METODO ABSTRACTO
 public abstract String mostrarCodigo();
 public abstract String mostrarNombre();
 public abstract String mostrarPrecio();
 public abstract String mostrarCategoria();
 public abstract double mostrarSueldo();
       
}

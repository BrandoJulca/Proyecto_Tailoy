
package project;


public class Productos extends PYC {

 

    public Productos(String codigo, String nombre, String categoria, double precio) {
        super(codigo, nombre, categoria, precio);
    }

      public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
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

   
    @Override
    public String mostrarCodigo() {
return " "+codigo;
    }

    @Override
    public String mostrarNombre() {
return " "+nombre;  
    }

    @Override
    public String mostrarPrecio() {
return " "+precio;
        }

    @Override
    public String mostrarCategoria() {
return " "+categoria;
    }

    @Override
    public double mostrarSueldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

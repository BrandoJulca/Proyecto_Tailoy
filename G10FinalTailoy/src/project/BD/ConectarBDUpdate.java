
package project.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConectarBDUpdate {
    public static void main(String[] args) {
        
    
    try{
            //conectar a la bd
            String xurl="jdbc:mysql://localhost/bdVentas";    
            String xusu="root";
            String xpas="";
            
            Connection conex=DriverManager.getConnection(xurl,xusu,xpas);
            
            //crearconsulta
            
            Statement declarar=conex.createStatement();
            
            //actualizar registro
            String xsql="UPDATE cliente SET nom_cliente='Nany Fuentes' WHERE cod_cliente='1020'"; 

            declarar.execute(xsql);
            
            System.out.println("El cliente ha sido actualizado ...");
                      
        }catch(SQLException ex){
            System.out.println("ERROR... FALLA EN CONEXION");
           
        
        
        
        
    }
    }
}


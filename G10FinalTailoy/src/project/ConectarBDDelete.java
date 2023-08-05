
package project;

import project.BD.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConectarBDDelete {
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
            String xsql="DELETE FROM cliente WHERE DNI='123456'"; 

            declarar.execute(xsql);
            
            System.out.println("El cliente ha sido eliminado ...");
                      
        }catch(SQLException ex){
            System.out.println("ERROR... FALLA EN CONEXION");
           
        
        
        
        
    }
    }
}


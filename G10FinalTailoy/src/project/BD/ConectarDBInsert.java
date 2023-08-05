
package project.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConectarDBInsert {
    public static void main(String[] args) {
        try{
            //conectar a la bd
            String xurl="jdbc:mysql://localhost/bdVentas";    
            String xusu="root";
            String xpas="";
            
            Connection conex=DriverManager.getConnection(xurl,xusu,xpas);
            
            //crearconsulta
            
            Statement declarar=conex.createStatement();
            
            //insertar registro
            String xsql="INSERT INTO cliente(cod_cliente,nom_cliente,ruc_cliente,dir_cliente,fec_ing_cliente)"
                    +"VALUES ('1050','Vero Franca','123456789','Av pajarita','2020-11-10')";
            
            declarar.execute(xsql);
            
            System.out.println("El cliente fue registrado ...");
                      
        }catch(SQLException ex){
            System.out.println("ERROR... FALLA EN CONEXION");
           
        
        
        
        
    }
    }
}


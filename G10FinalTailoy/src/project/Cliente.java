
package project;


import project.BD.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Cliente {
    public static void main(String[] args) {
        
    String xurl="jdbc:mysql://localhost/bdVentas";    
    String xusu="root";
    String xpas="";
    try{
    Connection conex=DriverManager.getConnection(xurl, xusu, xpas);
    
    Statement cons=conex.createStatement();
    
    String xsql="SELECT*FROM cliente";
    
    ResultSet rs=cons.executeQuery(xsql);
    
    while(rs.next()){
        System.out.println("DNI: "+rs.getString("DNI")+" Nombres: "+rs.getString("Nombre")+
                " Telefono: "+rs.getString("Telefono")+" E-mail: "+rs.getString("Email")+" Fecha: "+rs.getString("Fecha"));
                }
    
    
    }    
       catch(Exception ex){
           System.out.println("ERROR... NO SE CONECTO A LA BD");
       } 
    }
}

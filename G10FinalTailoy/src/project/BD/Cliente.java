
package project.BD;


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
        System.out.println("CodigoCliente: "+rs.getString("cod_cliente")+" Nombres: "+rs.getString("nom_cliente")+
                " RUC: "+rs.getString("ruc_cliente")+" Direccion: "+rs.getString("dir_cliente")+" Fecha: "+rs.getString("fec_ing_cliente"));
                }
    
    
    }    
       catch(Exception ex){
           System.out.println("ERROR... NO SE CONECTO A LA BD");
       } 
    }
}

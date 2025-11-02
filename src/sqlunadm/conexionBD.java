
package sqlunadm;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class conexionBD 
{
    
   
    
       public static  void hola()
       {
            
          try
          {
              Class.forName("com.mysql.jdbc.Driver");
              Connection conexion2 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/RegistrosKinderRosita","root","1234"); 
                            Statement q= conexion2.createStatement();
                  ResultSet rst =q.executeQuery("SELECT *FROM alumnos;");
         
       
                     while (rst.next())
              {
            System.out.println(rst.getInt(1)+rst.getString(2)+rst.getInt(3)+rst.getString(4)+rst.getString(5)+rst.getInt(6)+rst.getString(7)+rst.getString(8));
             }
       
           q.close();
            conexion2.close(); 
          
          }
          catch (Exception e)
          {
              
          }
      
       }
       
       
       public static void registrardatos(String idalumno,String nombre,String edad,String papa,String mama,String telefono,String grado,String grupo)
       {
            
           Connection conexionrd=null;
      
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            conexionrd= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/RegistrosKinderRosita","root","1234");
         
         Statement ssr= conexionrd.createStatement();
         ssr.executeUpdate("INSERT INTO  `registroskinderrosita`.`alumnos` (`idalumnos` ,`nombre`,`edad`,`papa`,`mama`,`telefono`,`grado`,`grupo`)VALUES ('"+idalumno+"','"+nombre+"','"+edad+"','"+papa+"', '"+mama+"','"+telefono+"', '"+grado+"','"+grupo+"');");
         
         
         JOptionPane.showInternalMessageDialog(null, "El alumno se ha capturado, correctamente", "Registros", 1);
         

         ssr.close();
         conexionrd.close(); 
         }
        
        catch (Exception e)
          {
              
          }
        
              
       }
}

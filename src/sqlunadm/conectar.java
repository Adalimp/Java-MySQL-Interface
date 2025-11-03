package sqlunadm;
import java.sql.*;

public class conectar 
{
 Connection miconexion;
 Statement stSentencias;
 ResultSet rsDatos;
 PreparedStatement psPrepararSentencias;
 public conectar() throws ClassNotFoundException,SQLException
 {
   try
   {
       Class.forName("com.mysql.jdbc.Driver");
       String url="jdbc:mysql://127.0.0.1:3307/RegistrosKinderRosita";
       miconexion =DriverManager.getConnection(url,"root","PerroT3ZZZ*123");
       stSentencias=miconexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
   }
   catch(ClassCastException ex){throw ex;}
   catch (SQLException ex1){throw ex1;}
   
   }  
 
/////////////////////////////////////////////////////////////////////
public ResultSet consulta(String sql)throws SQLException
{
try
{
 rsDatos=stSentencias.executeQuery(sql);
         
}
catch (SQLException ex){throw ex;}
return rsDatos;
}
}
//fin conectar
 
    
    
    


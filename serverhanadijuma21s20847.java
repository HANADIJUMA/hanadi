
import java.beans.Statement;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Serverhanadijuma21s20847 implements Runnable
{
public void run()

{
try{


String Hhost="jdbc:derby://localhost:2234/HANADI23";
String HAname="HANADI23";
String Hpass="04432";

Connection HANADIconne=DriverManager.getConnection(Hhost, HAname, Hpass);
ServerSocket HANADIserver = new ServerSocket (2234);
System.out.println("Server is RUN..... ");

while(true)
{
    Socket HANADIsce = HANADIserver.accept();
}
DataInputStream HANADIdis;
    HANADIdis = new DataInputStream(HANADIsce.getInputStream());
int hanadinum = HANADIdis.readInt();
int HQequired = HANADIdis.readInt();
System.out.println("The code is:"+hanadinum);
System.out.println("The Qequired is"+HQequired);

Statement HANADIst=(Statement) HANADIconne.createStatement();
String HTable="SELECT * FROM UNTITLED WHERE BEVERAGECODE="+hanadinum;

ResultSet Hsr=HANADIst.execute Query(HTable);

DataOutputStream HANADIdos = new DataOutputStream(HANADIsce.getOutputStream());
while(Hsr.next()){
String HAname=Hsr.getString("BEVERAGENAME");


double HANADIMI=Hsr.getDouble("PRICE");
double price= HQequired*HANADIMI;

HANADIdos.writeUTF(HAname);
HANADIdos.writeDouble(price);
System.out.println("Send to the cliet");
}
}   catch (SQLException | IOException ex) {
        Logger.getLogger(Serverhanadijuma21s20847.class.getName()).log(Level.SEVERE, null, ex);
    }
}
catch(SQLException e)
{
 System.out.println(e);
}
catch(IOException ex)
 {
}

    private void Query(String HTable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


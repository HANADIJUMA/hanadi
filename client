import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class clienthanadijuma21s20847 implements Runnable
{
public void run()
{
try{
Socket HANADIwew=new Socket("localhost",2234);
Scanner HANADIwer=new Scanner(System.in);
System.out.println("Enter ther CODE 200 to 400 ");

int hanadinum=HANADIwer.nextInt();
System.out.println("Enter the Qequired Quantity");
int HQequired=HANADIwerH.nextInt();

DataOutputStream HANADIdss=new DataOutputStream(HANADIwew.getOutputStream());
HANADIdss.writeInt(hanadinum);
HANADIdss.writeInt(HQequired);
HANADIdss.flush();

DataInputStream HANADIdos=new DataInputStream(HANADIwew.getInputStream());
String name=HANADIdos.readUTF();
double price=HANADIdos.readDouble();
System.out.println("NAME:"+name);
System.out.println("pris:OMR "+price);

}
catch(IOException e)
{
System.out.println(e);
}

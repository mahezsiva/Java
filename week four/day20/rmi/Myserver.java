import java.rmi.*;  
import java.rmi.registry.*;  
public class MyServer{  
public static void main(String args[]){  
try{  
Adder stub=new AdderRemote();  
Naming.rebind("rmi://localhost:5555/mysql_database",stub);  
}catch(Exception e){System.out.println(e);}  
}  
}  
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ProgramaIP {
    public static void main(String[] args) {
        
    try {
        InetAddress Direccion = InetAddress.getLocalHost();
        InetAddress stars[] = InetAddress.getAllByName("hielogas.com");
        
    System.out.println(Direccion);
    System.out.println(stars[0].toString());
    } catch (UnknownHostException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }
}
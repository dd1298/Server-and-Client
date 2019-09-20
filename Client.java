import java.io.*;
import java.net.*;
class Client{
  public static void main(String[] args)throws Exception {
    Socket s=new Socket("localhost",4999);
    PrintWriter pr=new PrintWriter(s.getOutputStream());
    pr.println("Is it Working");
    pr.flush();
    InputStreamReader in=new InputStreamReader(s.getInputStream());
    BufferedReader br=new BufferedReader(in);
    String str=br.readLine();
    System.out.println("Server:"+str);
  }
}

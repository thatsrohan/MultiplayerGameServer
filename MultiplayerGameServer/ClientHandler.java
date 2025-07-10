package MultiplayerGameServer;
import java.net.Socket;
import java.io.*;
public class ClientHandler {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public ClientHandler(Socket socket)throws IOException{
        this.socket=socket;
        in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out=new PrintWriter(socket.getOutputStream(),true);
    }
    public String readLine()throws IOException{
return in.readLine();
    }
    public void sendMessage(String message){
        out.println(message);
    }
}

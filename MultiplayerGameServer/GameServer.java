package MultiplayerGameServer;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class GameServer {
    public static void main(){
        try{
            ServerSocket serverSocket=new ServerSocket(5000);
            System.out.println("Server Running");
            while(true){
            Socket clientSocket=serverSocket.accept();
            ClientHandler handler = new ClientHandler(clientSocket);
            MatchMaker.addPlayer(handler);
        }
    }catch(IOException e){
        e.printStackTrace(); 
    }
}
}
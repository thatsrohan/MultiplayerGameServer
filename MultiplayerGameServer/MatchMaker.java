import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import MultiplayerGameServer.ClientHandler;

public class MatchMaker {
    public static final BlockingQueue<ClientHandler> queue = new LinkedBlockingQueue<>();
    
    public static void addPlayer(ClientHandler player){
        try{
            queue.put(player); //waits if full
            ClientHandler p1=queue.take();
            ClientHandler p2=queue.take();

            new Thread(new GameSession(p1,p2)).start(); //Start game session
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

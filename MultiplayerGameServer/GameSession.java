public class GameSession implements Runnable {
    private ClientHandler player1;
    private ClientHandler player2;
    public GameSession(ClientHandler p1, ClientHandler p2) {
    this.player1 = p1;
    this.player2 = p2;
    }
    public void run() {
    player1.sendMessage("You are Player 1. Game starting...");
    player2.sendMessage("You are Player 2. Game starting...");
    // Here we will add game logic (turns, board state, etc.)
    }
}
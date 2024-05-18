package test;


// Requirement : As a client, want to add 100 trees with green,brown,pink at different coordinates..
public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        game.addTree(1,2,"green");
        game.addTree(2,2,"brown");

    }
}

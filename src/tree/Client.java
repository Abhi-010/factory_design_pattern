package tree;


// Requirement : As a client, want to add 100 trees with green,brown,pink at different coordinates..
public class Client {
    public static void main(String[] args) {
        Game game = new Game();

        for(int i = 0 ; i < 100  ; i++){
            int x = (int)(Math.random()*100) ;
            int y = (int)(Math.random()*10) ;
            game.addTree(x,y,"green");
            //game.addTree(x,y,"brown");
        }
    }
}

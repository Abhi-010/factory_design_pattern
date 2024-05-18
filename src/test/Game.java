package test;

import java.util.ArrayList;
import java.util.List;

public class Game {


    private List<Tree> trees ;

    private TreeFactory treeFactory;

    public Game(){
        this.trees = new ArrayList<>();
        this.treeFactory = new TreeFactory();
    }

    public void addTree(int x, int y, String color){
        trees.add( new Tree(x,y,treeFactory.getTree(color)) ) ;

        render(trees.size()-1);
    }
    public void render(int id){
        System.out.println(
                "Tree " + id + " with " + trees.get(id).getColor() + " color rendered at " +
                        trees.get(id).getX() +","+
                        trees.get(id).getY()
        );
    }
}

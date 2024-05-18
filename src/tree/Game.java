package tree;

import tree.flyweightClass.FlyWeightTreeIntrinsic;
import tree.flyweightClass.TreePositionExtrinsic;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<FlyWeightTreeIntrinsic> flyWeightTreeIntrinsicList;
    private List<TreePositionExtrinsic> treePositionExtrinsicList;
    private TreeFactory treeFactory;

    public Game(){
        this.flyWeightTreeIntrinsicList = new ArrayList<>();
        this.treePositionExtrinsicList = new ArrayList<>();
        this.treeFactory = new TreeFactory();
    }

    public void addTree(int x, int y, String color){
        flyWeightTreeIntrinsicList.add(treeFactory.getTree(color));
        treePositionExtrinsicList.add(new TreePositionExtrinsic(x,y));
        render(flyWeightTreeIntrinsicList.size()-1);
    }
    public void render(int id){
        System.out.println(
                "Tree " + id + " with " + flyWeightTreeIntrinsicList.get(id).getColor() + " color rendered at " +
                        treePositionExtrinsicList.get(id).getX() +","+
                        treePositionExtrinsicList.get(id).getY()
        );
    }
}

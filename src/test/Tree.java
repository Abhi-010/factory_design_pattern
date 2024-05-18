package test;

public class Tree {
    private int x;
    private int y;
    private FlyWeightTree flyWeightTree ;


    public Tree(int x, int y, test.FlyWeightTree flyWeightTree){
        this.x = x;
        this.y = y;
        this.flyWeightTree = flyWeightTree ;
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor(){
        return flyWeightTree.getColor();
    }
}

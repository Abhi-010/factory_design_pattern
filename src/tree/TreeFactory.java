package tree;

import tree.flyweightClass.FlyWeightTreeIntrinsic;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    private Map<String, FlyWeightTreeIntrinsic> treemap;

    public TreeFactory(){
        this.treemap = new HashMap<>();
    }

    public FlyWeightTreeIntrinsic getTree(String color){
        if(treemap.containsKey(color)){
            return treemap.get(color);
        }

        FlyWeightTreeIntrinsic flyWeightTreeIntrinsic = new FlyWeightTreeIntrinsic(color);
        treemap.put(color, flyWeightTreeIntrinsic);
        return flyWeightTreeIntrinsic;
    }
}

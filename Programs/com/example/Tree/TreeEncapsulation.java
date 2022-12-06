package Programs.com.example.Tree;

import java.awt.Color;

public class TreeEncapsulation {
    
    protected static Color trunkColor = new Color(102, 51, 0);

    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType;

    public TreeEncapsulation(double heightFt, double trunkDiameterInches, TreeType treeType) {

        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    public void grow() {
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    public void announceTree() {
        System.out.println("This is a " + this.treeType + " tree.");
    }

    public double getHeightFt() {
        return this.heightFt;
    }

    public double getTrunkDiameterInches() {
        return this.trunkDiameterInches;
    }

    public TreeType getTreeType() {
        return this.treeType;
    }
}

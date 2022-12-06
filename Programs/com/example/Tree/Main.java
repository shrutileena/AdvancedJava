package Programs.com.example.Tree;

public class Main {
    
    public static void main(String[] args) {
        
        Tree oakTree = new Tree(120, 34, TreeType.OAK);

        TreeEncapsulation mapleTree = new TreeEncapsulation(125, 20, TreeType.MAPLE);

        oakTree.grow();
        oakTree.announceTree();
        System.out.println(oakTree.heightFt);
        System.out.println(oakTree.trunkDiameterInches);
        System.out.println(oakTree.treeType);

        mapleTree.grow();
        mapleTree.announceTree();
        System.out.println(mapleTree.getHeightFt());
        System.out.println(mapleTree.getTrunkDiameterInches());
        System.out.println(mapleTree.getTreeType());
        System.out.println(TreeEncapsulation.trunkColor);
    }
}

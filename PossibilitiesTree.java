/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package possibilities.tree;

/**
 *
 * @author Balqees
 */
public class PossibilitiesTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BuildTree buildTree = new BuildTree();
        buildTree.generateTree(4, 3);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package possibilities.tree;

import java.util.Vector;

/**
 *
 * @author Balqees
 */
public class Node {
    
    private int length;
    private Vector<Integer> vectorNode;
    private int l;
    
    Node(int length , int l){
        vectorNode = new Vector<Integer>();
        vectorNode.setSize(length);
        this.l = l;
    }
    
    
    int getLevel(){
        return this.l;
    }
    
    Vector<Integer> getVectorNode(){
        return this.vectorNode;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package possibilities.tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;


/**
 *
 * @author Balqees
 */
public class BuildTree {
    
    Vector<Node> AllNodes;
    Vector<Edge> AllEdges;

    public BuildTree() {
        AllNodes = new Vector<Node>();
        AllEdges = new Vector<Edge>();
    }
    
    
    private Node buildNode(int length, int l){
        Node node = new Node(length ,l );
        return node;
    }
    
    private void addEdges(Map<Node,Integer> from, Node to){
        Edge e = new Edge(from,to);
        AllEdges.add(e);
    }
    
    private void addNode(Node n){
        AllNodes.add(n);
    }
    
    //m is the size of root vector 
    // n is the level, or Tree depth
    public void generateTree(int m, int n){
        Node root = buildNode(m, 1);
        addNode(root);
        int Level = 2; 
   
        while (Level <= n){
            for(int i=0;i<AllNodes.size();i++){
                if(AllNodes.get(i).getLevel()== Level-1){
                    Node tmp = AllNodes.get(i);
                    for(int j=0;j<tmp.getVectorNode().size();j++){
                        Node child = buildNode(m -1, Level);
                        addNode(child);
                        Map <Node, Integer> tmpFrom = new ConcurrentHashMap<Node, Integer>();
                        tmpFrom.put(tmp, j);
                        addEdges(tmpFrom, child);
                    }
                }
            }
            m--;
            Level++;
        }
        
        System.out.println("Number of generated Vectors in the whole tree = "+ AllNodes.size());
        System.out.println("Number of generated Edges in the whole tree = "+ AllEdges.size());
        System.out.println("Number of generated levels = "+ (Level-1));
    }
}

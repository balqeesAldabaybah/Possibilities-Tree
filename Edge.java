/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package possibilities.tree;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author Balqees
 */
public class Edge {
    private Map<Node,Integer> from; 
    private Node to; 
    
    Edge(Map<Node,Integer> from, Node to){
        this.from = new ConcurrentHashMap<>();
        this.from = from;
        this.to = to;
    }
    
}

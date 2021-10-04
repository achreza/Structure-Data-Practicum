/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak10;

/**
 *
 * @author Reza
 */
public class GraphAppTopo {
    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex('A'); //0
        theGraph.addVertex('B'); //1
        theGraph.addVertex('C'); //2
        theGraph.addVertex('D'); //3
        theGraph.addVertex('E'); //4
        theGraph.addVertex('F'); //5
        theGraph.addVertex('G'); //6
        theGraph.addVertex('H'); //7
        
        theGraph.addEdge(0,3);
        theGraph.addEdge(0,4);
        theGraph.addEdge(1,4);
        theGraph.addEdge(3,6);
        theGraph.addEdge(4,6);
        theGraph.addEdge(6,7);
        theGraph.addEdge(2,5);
        theGraph.addEdge(5,7);
        
       // theGraph.display();
        theGraph.topo();
    }
    
}
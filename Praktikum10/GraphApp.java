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
public class GraphApp {
    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex('A'); //0
        theGraph.addVertex('B'); //1
        theGraph.addVertex('C'); //2
        theGraph.addVertex('D'); //3
        theGraph.addVertex('E'); //4
        
        theGraph.addEdge(0, 2); //AC
        theGraph.addEdge(1, 0); //BA
        theGraph.addEdge(1, 4); //BE
        theGraph.addEdge(4, 2); //EC
        theGraph.addEdge(3, 4); //DE
        
        theGraph.display();
        theGraph.connectivity();
    }
}

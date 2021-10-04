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
public class Vertex {
    public char label;
    public boolean wasVisited;
    
    public Vertex(char label){
        this.label=label;
        wasVisited=false;
    }
    
}

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
public class Graph {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    //private Stack theStack;
    //private Queue theQue;
    private char sortedArray[];
    
    public Graph(){
        //theQue = new Queue(MAX_VERTS);
        //theStack = new Stack(MAX_VERTS);
        vertexList = new Vertex[MAX_VERTS];
        sortedArray = new char[MAX_VERTS];
        adjMat= new int[MAX_VERTS][MAX_VERTS];
        nVerts=0;
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j]=0;
            }
        }
    }
    public void addVertex(char label){
        vertexList[nVerts++]=new Vertex(label);
    }
    public void addEdge(int start, int end){ //untuk Direct graph
        adjMat[start][end]=1;
        //adjMat[end][start]=1;  //digunakan pada Undirect graph
    }
    public void display(){
        System.out.println("Adjecency: ");
        for (int row = 0; row < nVerts; row++) {
            for (int col = 0; col < nVerts /*row*/; col++) {  //jika direct graph maka batas column < nVerts
                if (adjMat[row][col] == 1) {
                    System.out.println(vertexList[row].label + " --> "+vertexList[col].label);
                }
            }
        }
        System.out.println("");
    }
    /*public void dfs(){
        System.out.println("Visit by using"+" DFS algorithm:");
        vertexList[0].wasVisited=true;
        displayVertex(0);
        theStack.push(0);
        while(!theStack.isEmpty()){
            int v=getAdjUnvisitedVertex(theStack.peek());
            if (v == -1) {
                theStack.pop();
            }
            else{
                vertexList[v].wasVisited = true;
                displayVertex(v);
                theStack.push(v);
            }
        }
        System.out.println("");
        resetFlags();
        
    }
    public void displayVertex(int v){
        System.out.print(vertexList[v].label+" ");
    }
    public int getAdjUnvisitedVertex(int v){
        for (int i = 0; i < nVerts; i++) {
            if (adjMat[v][i] == 1 && vertexList[i].wasVisited == false) {
                return i;
            }
        }
        return -1;
    }
    
    public void bfs(){
        System.out.println("Visit by using"+" BFS algorithm: ");
        vertexList[0].wasVisited=true;
        displayVertex(0);
        theQue.insert(0);
        int v2;
        while(!theQue.isEmpty()){
            int v1=theQue.remove();
            while((v2 = getAdjUnvisitedVertex(v1)) != -1){
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                theQue.insert(v2);
            }
        }
        System.out.println("");
        resetFlags();
    }
    public void mst(){
        System.out.println("Minimum spanning"+" tree: ");
        vertexList[0].wasVisited = true;
        theStack.push(0);
        while(!theStack.isEmpty()){
            int currentVertex = theStack.peek();
            int v = getAdjUnvisitedVertex(currentVertex);
            if (v == -1) {
                theStack.pop();
            }
            else{
                vertexList[v].wasVisited = true;
                theStack.push(v);
                
                displayVertex(currentVertex);
                System.out.print(" -- ");
                displayVertex(v);
                System.out.println("");
            }
        }
        resetFlags();
    }*/
    public void resetFlags(){
        for (int i = 0; i < nVerts; i++) {
            vertexList[i].wasVisited = false;
        }
    }
    public void connectivity(){
        System.out.println("Connectivity Table :");
        for (int row = 0; row < nVerts; row++) {
            System.out.print(vertexList[row].label+" ");
            for (int col = 0; col < nVerts; col++) {
                if (adjMat[row][col] == 1) {
                    System.out.print(vertexList[col].label+" ");
                    for (int i = 0; i < nVerts; i++) {
                        if (adjMat[col][i] == 1 && vertexList[i].wasVisited == false) {
                            System.out.print(vertexList[i].label+" ");
                            vertexList[i].wasVisited = true;
                        }
                    }
                }
            }
            resetFlags();
            System.out.println("");
        }
    }
    public void topo(){
        int orig_nVerts=nVerts;
        while(nVerts > 0){
            int currentVertex = noSuccessors();
            if (currentVertex == -1) {
                System.out.println("ERROR: Graph has cycles");
                return;
            }
            sortedArray[nVerts-1]=vertexList[currentVertex].label;
            deleteVertex(currentVertex);
        }
        System.out.println("Topologically sorted order: ");
        for (int i = 0; i < orig_nVerts; i++) {
            System.out.print(sortedArray[i]+" ");
        }
        System.out.println("");
    }
    private int noSuccessors(){
        boolean isEdge;
        for (int row = 0; row < nVerts; row++) {
            isEdge=false;
            for (int col = 0; col < nVerts; col++) {
                if (adjMat[row][col] > 0) {
                    isEdge= true;
                    break;
                }
            }
            if (!isEdge) {
                return row;
            }
        }
        return -1;
    }
    private void deleteVertex(int delVert){
        if (delVert != nVerts - 1) {
            for (int j = delVert; j < nVerts-1; j++) {
                vertexList[j] = vertexList[j+1];
            }
            for (int row = delVert; row < nVerts-1; row++) {
                moveRowUp(row,nVerts);
            }
            for (int col = delVert; col < nVerts-1; col++) {
                moveColLeft(col,nVerts - 1);
            }
        }
        nVerts--;
    }
    private void moveRowUp(int row, int lenght){
        for (int col = 0; col < lenght; col++) {
            adjMat[row][col] = adjMat[row+1][col];
        }
    }
    private void moveColLeft(int col, int length){
        for (int row = 0; row < length; row++) {
            adjMat[row][col]=adjMat[row][col+1];
        }
    }
    
    
}

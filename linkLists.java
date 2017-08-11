/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



class linkLists {
    
    //Every linked lists needs a beginning, head #ofElements
    private Node head;
    private Node tail;
    private int elements;
    
    //Constructor
    public linkLists(){
        head = new Node();
        elements = 0;
    }
  
   
    
    
}
class Node{
    Node previous;
    Node next;
    int data;
    
    //creates new node that points to nothing
    public Node(){
        next = null;
    }
    
    public Node(int x, Node index){
        this.data = x;
        
    }
    
    
    
    
    
    
}
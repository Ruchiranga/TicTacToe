/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.ArrayList;

/**
 *
 * @author ruchiranga
 */
public class Node {

    private int id;

    private ArrayList<Node> children;

    public Node(int id) {
        children = new ArrayList<Node>();
        this.id = id;
    }
    
    public void addChild(Node node){
        children.add(node);
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the children
     */
    public ArrayList<Node> getChildren() {
        return children;
    }

    /**
     * @param children the children to set
     */
    public void setChildren(ArrayList<Node> children) {
        this.children = children;
    }

}

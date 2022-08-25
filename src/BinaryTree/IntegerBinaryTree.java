package BinaryTree;

import BinaryNode.BinaryNode;

import java.util.ArrayList;

public class IntegerBinaryTree {
    BinaryNode<Integer> root;

    IntegerBinaryTree() {
        this.root = null;
    }

    IntegerBinaryTree(Integer value) {
        root = new BinaryNode<Integer>(value);
    }

    IntegerBinaryTree(ArrayList<Integer> vals) {
        //create tree from array
    }

    public void addElement(Integer value) {
        if(root == null) {
            root = new BinaryNode<Integer>(value);
            return;
        }
        root = recursiveAddElement(root, value);
    }

    private BinaryNode recursiveAddElement(BinaryNode<Integer> current,Integer value) {
        //We have an empty tree, insert at root
        if(current == null) {
            return new BinaryNode<Integer>(value);
        }
        if(value < current.getValue()) {
            //less than so go left into tree
            current.setLeft(recursiveAddElement(current.getLeft(), value));
        } else if (value > current.getValue()) {
            //greater than so go right into tree
            current.setRight(recursiveAddElement(current.getRight(), value));
        } else {
            return current;
        }
        return current;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.Stack;

/**
 *
 * @author 62852
 */
public class Tree {

    public Node root;

    public Tree() {
        root = null;
    }

    public Node find(int key) {
        Node current = root;
        while (current.id != key) {
            if (key < current.id) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(int id, String data) {
        Node newNode = new Node();
        newNode.id = id;
        newNode.data = data;
        if (root == null) {
            root = newNode;
        } else {
            if (Duplicate(id)) {
                System.out.println("Data is Duplicate");
            } else {
                Node current = root;
                Node parent;
                while (true) {
                    parent = current;
                    if (id < current.id) {
                        current = current.leftChild;
                        if (current == null) {
                            parent.leftChild = newNode;
                            return;
                        }
                    } else {
                        current = current.rightChild;
                        if (current == null) {
                            parent.rightChild = newNode;
                            return;
                        }
                    }

                }
            }

        }
    }

    public boolean Duplicate(int key) {
        Node current = root;

        while (current.id != key) {
            if (key < current.id) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return false;
            }
        }
        return true;
    }

    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while (current.id != key) {
            parent = current;
            if (key < current.id) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) {
                return false;
            }
        }
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        } else if (current.rightChild == null) {
            if (current == root) {
                root = current.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        } else if (current.leftChild == null) {
            if (current == root) {
                root = current.rightChild;
            } else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        } else {
            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.leftChild = successor;
            } else {
                parent.rightChild = successor;
            }
            successor.leftChild = current.leftChild;
        }
        return true;
    }

    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }

    public void traverse(int traverseType) {
        switch (traverseType) {
            case 1:
                System.out.print("Preorder Traversal : ");
                preOrder(root);
                break;
            case 2:
                System.out.print("Inorder traversal : ");
                inOrder(root);
                break;
            case 3:
                System.out.print("Postorder traversal : ");
                postOrder(root);
                break;
        }
        System.out.println();
    }

    private void preOrder(Node localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.id + " ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    private void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.id + " ");
            inOrder(localRoot.rightChild);
        }
    }

    private void postOrder(Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.id + " ");
        }
    }

    public int valueMIn(Node node) {
        Node current = node;
        while (current.leftChild != null) {
            current = current.leftChild;
        }
        return current.id;
    }

    public int valueMax(Node node) {
        Node current = node;
        while (current.rightChild != null) {
            current = current.rightChild;
        }
        return current.id;
    }

    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println("................................................................");

        while (isRowEmpty == false) {
            Stack locStack = new Stack();
            isRowEmpty = true;
            for (int j = 0; j < nBlanks; j++) {
                System.out.print(' ');
            }
            while (globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.id);
                    locStack.push(temp.leftChild);
                    locStack.push(temp.rightChild);
                    if (temp.leftChild != null || temp.rightChild != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("--");
                    locStack.push(null);
                    locStack.push(null);
                }
                for (int j = 0; j < nBlanks * 2 - 2; j++) {
                    System.out.print(' ');
                }
            }
            System.out.println();
            nBlanks /= 2;
            while (locStack.isEmpty() == false) {
                globalStack.push(locStack.pop());
            }
        }
        System.out.println("................................................................");
    }

}

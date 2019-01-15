package com.BinaryTrees;

class TheBinaryTree {
    private Node root;

    private void addNode(int key, String name) {
        Node newNode = new Node(key, name);
        if (root == null) {
            root = newNode;
            return;
        }
        Node focusNode = root;
        while (true) {
            if (key < focusNode.key) {
                if (focusNode.leftChild == null) {
                    focusNode.leftChild = newNode;
                    return;
                }
                focusNode = focusNode.leftChild;
            } else {
                if (focusNode.rightChild == null) {
                    focusNode.rightChild = newNode;
                    return;
                }
                focusNode = focusNode.rightChild;
            }
        }
    }

    private void inOrderTraversal(Node searchNode) {
        if (searchNode != null) {
            inOrderTraversal(searchNode.leftChild);
            System.out.println(searchNode);
            inOrderTraversal(searchNode.rightChild);
        }
    }

    private void preOrderTraversal(Node searchNode) {
        if (searchNode != null) {
            System.out.println(searchNode);
            preOrderTraversal(searchNode.leftChild);
            preOrderTraversal(searchNode.rightChild);
        }
    }

    private void postOrderTraversal(Node searchNode) {
        if (searchNode != null) {
            postOrderTraversal(searchNode.leftChild);
            postOrderTraversal(searchNode.rightChild);
            System.out.println(searchNode);
        }
    }

    private Node findNode(int key) {
        Node focusNode = root;
        while (true) {
            if (focusNode != null) {
                if (focusNode.key != key) {
                    if (focusNode.key > key) {
                        focusNode = focusNode.leftChild;
                    } else
                        focusNode = focusNode.rightChild;
                } else
                    return focusNode;
            } else {
                return null;
            }
        }
    }

    private Node findNodeByKey(int key) {
        Node focusNode = root;
        while (focusNode != null && focusNode.key != key) {
            if (focusNode.key < key)
                focusNode = focusNode.rightChild;
            else
                focusNode = focusNode.leftChild;
        }
        return focusNode;
    }

    public static void main(String[] args) {
        TheBinaryTree binaryTree = new TheBinaryTree();
        binaryTree.addNode(20, "GrandFather");
        binaryTree.addNode(10, "Son");
        binaryTree.addNode(30, "Daughter");
        binaryTree.addNode(5, "GrandsonI");
        binaryTree.addNode(15, "GrandDaughterI");
        binaryTree.addNode(25, "GrandDaughterII");
        binaryTree.addNode(35, "GrandsonII");
        System.out.println("In-Order Traversal");
        binaryTree.inOrderTraversal(binaryTree.root);
        System.out.println("Pre-Order Traversal");
        binaryTree.preOrderTraversal(binaryTree.root);
        System.out.println("Post-Order Traversal");
        binaryTree.postOrderTraversal(binaryTree.root);
        System.out.println(binaryTree.findNode(35));
        System.out.println(binaryTree.findNodeByKey(35));
    }
}

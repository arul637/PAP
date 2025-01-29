package Day4;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    Node root = null;

    public void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    public void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }
        Node currentNode = root;
        while (true) {
            if (data <= currentNode.data) {
                if (currentNode.left != null) {
                    currentNode = currentNode.left;
                } else {
                    currentNode.left = newNode;
                    break;
                }
            } else {
                if (currentNode.right != null) {
                    currentNode = currentNode.right;
                } else {
                    currentNode.right = newNode;
                    break;
                }

            }
        }

    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(25);
        tree.insert(15);
        tree.insert(50);
        tree.insert(10);
        tree.insert(22);
        tree.insert(35);
        tree.insert(70);
        tree.insert(4);
        tree.insert(12);
        tree.insert(18);
        tree.insert(24);
        tree.insert(31);
        tree.insert(44);
        tree.insert(66);
        tree.insert(90);

        System.out.println("\nIn-Order Traversal:- ");
        tree.inOrderTraversal(tree.root);

        System.out.println("\n\nPre-Order Traversal:- ");
        tree.preOrderTraversal(tree.root);

        System.out.println("\n\nPost-Order Traversal:- ");
        tree.postOrderTraversal(tree.root);
    }
}

package sr.unasat.verkeerslichten.datastructure;

import sr.unasat.verkeerslichten.entities.Voertuig;

import java.util.Vector;

public class Node {

    public String kenteken;
    public Voertuig voertuig;
    public Node left, right;

    public Node(String kenteken, Voertuig value)
    {
        this.kenteken = kenteken;
        this.voertuig = value;
    }

    public Voertuig get(String key )
    {
        if (this.kenteken.equals(key))
        {
            return voertuig;
        }

        if (key.compareTo(this.kenteken) < 0 )
        {
            return left== null ? null : left.get(key);
        }
        else
        {
            return right == null ? null : right.get(key);
        }

    }

    public void put(String key, Voertuig value)
    {

        if (key.compareTo(this.kenteken) < 0)
        {
            if (left != null)
            {
                left.put(key, value);
            }
            else
            {
                left = new Node(key, value);
            }
        }
        else if (key.compareTo(this.kenteken) > 0)
        {
            if (right != null)
            {
                right.put(key, value);
            }
            else
            {
                right = new Node(key, value);
            }
        }
        else {
            this.voertuig = value;
        }
    }

    void storeBSTNodes(Node root, Vector<Node> nodes)
    {
        // Base case
        if (root == null)
            return;

        // Store nodes in Inorder (which is sorted
        // order for BST)
        storeBSTNodes(root.left, nodes);
        nodes.add(root);
        storeBSTNodes(root.right, nodes);
    }

    Node buildTreeUtil(Vector<Node> nodes, int start,int end)
    {
        // base case
        if (start > end)
            return null;

        /* Get the middle element and make it root */
        int mid = (start + end) / 2;
        Node node = nodes.get(mid);

        /* Using index in Inorder traversal, construct
           left and right subtress */
        node.left = buildTreeUtil(nodes, start, mid - 1);
        node.right = buildTreeUtil(nodes, mid + 1, end);

        return node;
    }

    public Node buildTree(Node root)
    {
        // Store nodes of given BST in sorted order
        Vector<Node> nodes = new Vector<Node>();
        storeBSTNodes(root, nodes);

        // Constucts BST from nodes[]
        int n = nodes.size();
        return buildTreeUtil(nodes, 0, n - 1);
    }

}

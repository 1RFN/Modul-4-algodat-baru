class IlhamNode {
    String data;
    IlhamNode left, right;
    IlhamNode next;

    public IlhamNode(String item) {
        data = item;
        left = right = null;
        this.next = null;
    }
}

class Family{
    String nama;
    String jabatan;

    public Family(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan; 
    }
}

class BinaryTree{
    IlhamNode root;

    public BinaryTree() {
        root = null;
    }
    void preOrder(IlhamNode node) {
        if (node == null)
            return;

        System.out.print(node.data + "\n");
        preOrder(node.left);
        preOrder(node.right);
    }
    void inOrder(IlhamNode node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data + "\n");
        inOrder(node.right);
    }
    void postOrder(IlhamNode node) {
        if (node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + "\n");
    }

    void preOrderOutput() {
        preOrder(root);
        System.out.println();
    }
    void inOrderOutput() {
        inOrder(root);
        System.out.println();
    }
    void postOrderOutput() {
        preOrder(root);
        System.out.println();
    }
}

public class IlhamMod4 {
    public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();

    
    tree.root = new IlhamNode("Giovanni Moretti");
    tree.root.left = new IlhamNode("jfkfn");
    
    /* 
    System.out.print("Daftar Anggota Russo Family Secara Pre-Order ");
    System.out.println("Vincenzo Russo (Don)");
    tree.preOrderTraversal();
        */
    tree.preOrderOutput();
    tree.postOrderOutput();
    }
}
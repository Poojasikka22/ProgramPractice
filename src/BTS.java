public class BTS {
    Node root;
    class Node{
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
    public static void main(String args[]){

        BTS bts = new BTS();
       bts.insert(8);
        bts.insert(7);
        bts.insert(6);
        bts.insert(4);
        bts.insert(2);
        bts.show();
    }

    private void show() {
        if (root == null) {
            System.out.println("The tree is empty");
        }
            else
            {
                showRec(root);
            }
        }

    private void showRec(Node root) {

        if(root != null){
            showRec(root.left);
            System.out.println( root.data);
            showRec(root.right);
        }
    }

    private void insert(int data) {
        root = insertRec(root,data);
    }

    private Node insertRec(Node root,int data) {
        if(root == null){
            root = new Node(data);
        }
        else{
            if(data < root.data){
                root.left = insertRec(root.left, data);
            } else if (data> root.data) {
                root.right = insertRec(root.right, data);

            }

        }
        return root;
    }
}

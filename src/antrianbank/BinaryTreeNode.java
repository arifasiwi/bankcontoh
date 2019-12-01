package antrianbank;

    public class BinaryTreeNode{ 
    BinaryTreeNode parent; 
    BinaryTreeNode left; 
    BinaryTreeNode right; 
    int data; 

    BinaryTreeNode(int new_data){ 
            this.data = new_data;
            this.parent = null;
            this.left = null;
            this.right = null;
    } 

    void set_parent(BinaryTreeNode other){ 
        this.parent = other; 
            if(other != null){ 
                if(other.data > this.data){ 
                    other = left; 
                }else{ 
                    other = right;
                } 
        } 
    } 

    void set_left(BinaryTreeNode other){ 
        left = other; 
        if(other != null){ 
            other = parent;
        } 
    } 

    void set_right(BinaryTreeNode other){ 
        right = other; 
        if(other != null){ 
            other = parent;
        } 
    } 

    BinaryTreeNode most_left_child(){ 
        BinaryTreeNode child = this.left; 
            while(child.left != null){ 
                child = child.left;
            } 
        return child; 
    } 

    BinaryTreeNode most_right_child(){ 
        BinaryTreeNode child = this.right; 
            while(child.right != null){ 
                child = child.right;
            } 
        return child; 
    }

    void print(String spaces, String label){ 
        System.out.println(spaces + label + data ); 
        if(this.left != null){ 
            this.left.print(" ", "LEFT"); 
        } 
        if(this.right != null){ 
            this.right.print(" ", "RIGHT"); 
        } 
    }

     void print(){ 
        this.print(" ", "NODE" + "A"); 
    } 
} 
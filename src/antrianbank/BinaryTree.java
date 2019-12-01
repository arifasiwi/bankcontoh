package antrianbank;

public class BinaryTree{ 
BinaryTreeNode root; 

    public BinaryTree(){ 
        this.root = null; 
    } 

    void print(){ 
        if(root != null){ 
            this.root.print(); 
        } 
    } 

    void push(BinaryTreeNode new_node){ 
        if(root == null ){ 
            new_node = root; 
        }else{ 
            BinaryTreeNode current = this.root; 
            while(current != null){ 
                if(new_node.data > current.data){ 
                    if(current == current.right){ 
                        current.set_right(new_node); 
                        break; 
                    }else{ 
                        current = current.right; 
                    } 
                }else{ 
                    if(current == current.left){ 
                        current.set_left(new_node); 
                        break; 
                    }else{ 
                        current = current.left; 
                    } 
                } 
            } 
        } 
    } 

    public void resetdata(){
        for(BinaryTreeNode x = root; x!= null;){
          BinaryTreeNode right = x.right;
          BinaryTreeNode left = x.left;
          x.right = null;
          x.left = null;
          x = right;
          x = left;
        }
        root = null;
    }
}
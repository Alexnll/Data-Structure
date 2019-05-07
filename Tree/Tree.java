class Tree{
    private Node root;   // the only data field in Tree

    public Node find(int key){  //find node according to the key value
        Node current = root;
        while (current.iData != key){
            if (current.iData < key){
                current = current.rightChild;
            }
            else {
                current = current.leftChild;
            }
            if (current == null){
                return null;      // didn't find it
            }
        }
        return current; 
    }    // end of find

    public void insert(int id, float dd){   // insert a new node into the tree
        Node newNode = Node(id, dd);
        if (root == null){
            root = newNode;
        }
        else{
            Node current = root;
            Node parent;
            while(true){
                parent = current;
                if(id < current.iData){
                    current = current.leftChild;
                    if(current == null){
                        parent.leftChild = newNode;
                        return ;    // end if go left
                    }
                }
                if(id > current.iData){
                    current = current.rightChild;
                    if(current == null){
                        parent.rightChild = newNode;
                        return ;    // end if go right
                    }
                }
            }
        }
    }   // end of insert

    public void delete(int id)

}
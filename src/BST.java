public class BST {
    private Node root;

    public void addRoot(String[] array){
        int x= array.length;
        if(x!=0) root=addRoot(array, 0, x-1);
    }

    private Node addRoot(String[] array, int start, int end){
        if(start>end){
            return null;
        }
        int root=(start+end)/2;
        Node name= new Node(array[root]);
        name.setLeft(addRoot(array, start, root-1)) ;
        name.setRight(addRoot(array, root+1, end)) ;
        return name;

    }


    public int depth(){
        return getMax(root, 1);
    }

    private int getMax(Node current, int counter){

        if(current.getRight()==null){
            return counter;
        }
        else{
            return getMax(current.getRight(), counter+1);
        }

    }



    public void reverse(){
        reverse(root);
        System.out.println();
    }
    private void reverse(Node current){
        if(current !=null){
            reverse(current.getRight());
            System.out.print(current.getName()+" ");
            reverse(current.getLeft());

        }
    }

}
package tree.binarysearchtree;

public class Treenode <T> {
    public T data;
    Treenode<T> left;
    Treenode<T> right;
    public Treenode(T key){
        this.data = key;
        this.left = null;
        this.right = null;
    }
}

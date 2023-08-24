package tree.binarysearchtree;

import java.util.Scanner;

public class Treeoperations {

    public static void inorder(Treenode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void preorder(Treenode root){
        if(root==null){
            return ;
        }
        String ans = root.data + " = ";
        if(root.left!=null)
            ans += "L :" + root.left.data;

        if(root.right!=null)
            ans += "L :" + root.right.data;

        preorder(root.left);
        preorder(root.right);
    }
    public static Treenode takeInput(Scanner sc, int arr[], int i){

        if(i==arr.length)
            return null;

        int a = arr[i];
        if(a==-1)
            return null;

        Treenode<Integer> root = new Treenode<>(a);
        root.left = takeInput(sc, arr, i++);
        root.right = takeInput(sc, arr, i++);
        return root;
    }

}

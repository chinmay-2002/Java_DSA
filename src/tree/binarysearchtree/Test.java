package tree.binarysearchtree;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,-1,-1,6,-1,-1,8,9,-1,-1,-1};
        Treenode root = Treeoperations.takeInput(sc, arr, 0);

//        System.out.println(root.data);

//        Treeoperations.inorder(root);
        Treeoperations.preorder(root);









//        Treenode tr1 = new Treenode(10);
//        Treenode tr2 = new Treenode(20);
//        Treenode tr3 = new Treenode(30);
//        Treenode tr4 = new Treenode(40);
//        tr1.left = tr2;
//        tr1.right = tr3;
//        tr3.left = tr4;
////        Treeoperations op = new Treeoperations();
//        Treeoperations.inorder(tr1);
    }
}

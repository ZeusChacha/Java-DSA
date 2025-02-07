package com.apnaCollageBT;

public class Main {
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreeB tree = new BinaryTreeB();
        BinaryTreeB.buildTree(nodes);
        System.out.println(nodes.length);
    }
}

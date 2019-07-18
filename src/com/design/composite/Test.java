package com.design.composite;

import java.util.Collections;
import java.util.Enumeration;

public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree("root");
        TreeNode treeNodeA = new TreeNode("treeNodeA");
        TreeNode treeNodeB = new TreeNode("treeNodeB");
        TreeNode treeNodeA1 = new TreeNode("treeNodeA1");
        TreeNode treeNodeA2 = new TreeNode("treeNodeA2");
        TreeNode treeNodeB1 = new TreeNode("treeNodeB1");

        tree.root.add(treeNodeA);
        treeNodeA.add(treeNodeA1);
        treeNodeA.add(treeNodeA2);
        treeNodeB.add(treeNodeB1);

        System.out.println(tree);
         getNode(tree.root) ;
    }


    public static void getNode(TreeNode node){
        System.out.println(node.getName());
           Enumeration<TreeNode> children = node.getChildren();
           while (children.hasMoreElements()){
               getNode(children.nextElement());
           }


    }
}

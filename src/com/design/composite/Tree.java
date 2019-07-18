package com.design.composite;

public class Tree {
    TreeNode root = null;

    public Tree(String name) {
        this.root = new TreeNode(name);
    }
}

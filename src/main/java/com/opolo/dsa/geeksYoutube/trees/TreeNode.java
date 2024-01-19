package com.opolo.dsa.geeksYoutube.trees;

import lombok.Data;

@Data
public class TreeNode<T> {

    private T nodeValue;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T nodeValue) {
        this.nodeValue = nodeValue;
        this.left = null;
        this.right = null;
    }
}

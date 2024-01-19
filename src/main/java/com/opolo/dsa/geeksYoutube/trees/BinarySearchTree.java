package com.opolo.dsa.geeksYoutube.trees;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class BinarySearchTree {
    public static List<String> depthFirstTraversal(TreeNode<String> root){

        TreeNode<String> current;
        List<String> result = new ArrayList<>();
        Stack<TreeNode<String>> stack = new Stack<>();

        if(root == null) {
            return new ArrayList<>();
        }

        stack.push(root); //push the root node into the stack top

        while(!stack.empty()){
            current = stack.pop();

            result.add(current.getNodeValue());

            if(null != current.getRight()){
                stack.push(current.getRight());
            }

            if(null != current.getLeft()){
                stack.push(current.getLeft());
            }
        }

        return result;
    }

    public static List<String> depthFirstTraversalRecursion(TreeNode<String> root) {
        List<String> resultList = new ArrayList<>();

        if(root == null) { //breaking condition for recursion
            return new ArrayList<>();
        }

        List<String> leftValues = depthFirstTraversalRecursion(root.getLeft()); //[B, D, E]
        List<String> rightValues = depthFirstTraversalRecursion(root.getRight()); //[C,F]

        resultList.add(root.getNodeValue());
        resultList.addAll(leftValues);
        resultList.addAll(rightValues);

        return resultList;
    }

    public static List<String> breadthFirstTraversal(TreeNode<String> root){

        TreeNode<String> current;
        List<String> result = new ArrayList<>();
        Queue<TreeNode<String>> queue = new LinkedList<>(); //implement queue either using LL or PQ

        if(root == null){
            return new ArrayList<>();
        }

        queue.add(root);

        while(!queue.isEmpty()){
            current = queue.remove();

            result.add(current.getNodeValue());

            if(current.getLeft() != null) queue.add(current.getLeft());
            if(current.getRight() != null) queue.add(current.getRight());
        }

        return result;

    }

    public static boolean breadthFirstSearch(TreeNode<String> root, String target){

        Queue<TreeNode<String>> queue = new LinkedList<>();
        TreeNode<String> current;


        if(root == null){
            return false;
        }

        queue.add(root);

        while(!queue.isEmpty()){

            current = queue.remove();
            log.info(current.getNodeValue());

            if(Objects.equals(current.getNodeValue(), target)) return true;

            if(current.getLeft() != null) queue.add(current.getLeft());
            if(current.getRight() != null) queue.add(current.getRight());
        }

        return false;
    }

    public static boolean breadthFirstSearchRecursion(TreeNode<String> root, String target){

        if(root == null) return false;
        if(Objects.equals(root.getNodeValue(), target)) return true;

        return breadthFirstSearchRecursion(root.getLeft(), target) ||
                breadthFirstSearchRecursion(root.getRight(), target);
    }

    public static int dfsTreeSumRecursion(TreeNode<Integer> root){

        if(root == null) return 0;

        return root.getNodeValue() + dfsTreeSumRecursion(root.getLeft())
                + dfsTreeSumRecursion(root.getRight());
    }

    public static double treeMinimumRecursion(TreeNode<Integer> root){
        if(root == null) return Double.POSITIVE_INFINITY;

        double leftMin = treeMinimumRecursion(root.getLeft());
        double rightMin = treeMinimumRecursion(root.getRight());

        return Math.min(root.getNodeValue(), Math.min(leftMin, rightMin));

    }

    public static Double maxRootToLeafPathSum(TreeNode<Integer> root){
        if(root == null) return Double.NEGATIVE_INFINITY;

        //define a leaf node
        if(root.getLeft() == null && root.getRight() == null) {
            return Double.valueOf(root.getNodeValue());
        }

        return root.getNodeValue() + Math.max(maxRootToLeafPathSum(root.getLeft()),
                maxRootToLeafPathSum(root.getRight()));
    }

    public static void main(String[] args) {
        TreeNode<String> a = new TreeNode<String>("A");
        TreeNode<String> b = new TreeNode<String>("B");
        TreeNode<String> c = new TreeNode<String>("C");
        TreeNode<String> d = new TreeNode<String>("D");
        TreeNode<String> e = new TreeNode<String>("E");
        TreeNode<String> f = new TreeNode<String>("F");

        a.setLeft(b);
        a.setRight(c);
        b.setLeft(d);
        b.setRight(e);
        c.setRight(f);

        //log.info("depth traversal result :: "+ depthFirstTraversalRecursion(a));
        //log.info("breadth first search :: "+ breadthFirstSearchRecursion(a, "Z"));

        //       a
        //      / \
        //     b   c
        //    / \   \
        //   d   e   f


        TreeNode<Integer> n1 = new TreeNode<>(3);
        TreeNode<Integer> n2 = new TreeNode<>(5);
        TreeNode<Integer> n3 = new TreeNode<>(7);
        TreeNode<Integer> n4 = new TreeNode<>(11);
        TreeNode<Integer> n5 = new TreeNode<>(12);
        TreeNode<Integer> n6 = new TreeNode<>(8);

        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setRight(n6);

        //log.info("dfs tree sum :: "+ dfsTreeSumRecursion(n1));
        //log.info("tree minimum value : "+ treeMinimumRecursion(n1));
        log.info("max root to leaf path sum : "+ maxRootToLeafPathSum(n1));

        //       3
        //      / \
        //     5   7
        //    / \   \
        //   11  12  8



    }
}

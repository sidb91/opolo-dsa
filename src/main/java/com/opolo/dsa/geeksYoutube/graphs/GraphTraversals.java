package com.opolo.dsa.geeksYoutube.graphs;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class GraphTraversals {

    public static void depthFirstTraversal(Map<String, String[]> graph, String source){
        Stack<String> stack = new Stack<>();

        if(graph.size() == 0) return;

        stack.push(source);

        while(!stack.isEmpty()){

            String current = stack.pop();

            for(String neighbour : graph.get(current)){
                stack.push(neighbour);
            }
        }
    }

    public static void depthFirstTraversalRecursive(Map<String, String[]> graph, String source){
        log.info("current : "+ source);
        for(String neighbour : graph.get(source)){ //breaking point is empty iteration
            depthFirstTraversalRecursive(graph, neighbour);
        }

    }

    public static void breadthFirstTraversal(Map<String, String[]> graph, String source){
        Queue<String> queue = new LinkedList<>();

        if(graph.size() == 0) return;

        queue.add(source);

        while(!queue.isEmpty()){

            String current = queue.remove();
            log.info("current : "+ current);

            for(String neighbour : graph.get(current)){
                queue.add(neighbour);
            }
        }
    }


    public static void main(String[] args) {

        //adjacency list
        Map<String, String[]> graph = new HashMap<>();

        graph.put("a", new String[]{"b", "c"});
        graph.put("b", new String[]{"d"});
        graph.put("c", new String[]{"e"});
        graph.put("d", new String[]{"f"});
        graph.put("e", new String[]{});
        graph.put("f", new String[]{});

        //depthFirstTraversal(graph, "a");
        //depthFirstTraversalRecursive(graph, "a");
        breadthFirstTraversal(graph, "a");

        // f <- d <- b <- a (start) -> c -> e (directional graph)

    }
}

package com.amado;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.apache.commons.lang3.Validate;

public class Graph {
	private final GraphNode _root;
	
	public Graph(final GraphNode root) {
		Validate.notNull(root, "root cannot be null");
		_root = root;
	}
	
	public List<GraphNode> findPath(final GraphNode node) {
		final Set<Integer> visited = new HashSet<Integer>();		
		final Stack<GraphNode> stack = new Stack<GraphNode>();
		stack.push(_root);

		while (!stack.isEmpty()) {
			final GraphNode top = stack.peek();
			final Integer key = top.getKey();			
			visited.add(key);
			if (key.equals(node.getKey())) {
				return stack;
			}
			
			final Map<Integer, GraphNode> graphNodes = top.getGraphNodes();
			if (graphNodes.isEmpty()) {
				stack.pop();
				continue;
			}
			
			final Set<Integer> keySet = graphNodes.keySet();
			Boolean hasUnvisitedNode = Boolean.FALSE;
			for (final Integer integer : keySet) {
				hasUnvisitedNode = !visited.contains(integer);
				if (hasUnvisitedNode) {
					stack.push(graphNodes.get(integer));
					break;
				}
			}
			
			if (!hasUnvisitedNode) {
				stack.pop();	
			}
		}
		
		return stack;
	}
}
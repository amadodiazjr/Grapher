package com.amado;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.Validate;

public class GraphNode {
	private final Integer _key;
	private final Map<Integer, GraphNode> _graphNodes;
	
	public GraphNode(final Integer key) {
		Validate.notNull(key, "key cannot be null.");

		_key = key;
		_graphNodes = new HashMap<Integer, GraphNode>();
	}
	
	public void linkGraphNode(final GraphNode graphNode) {
		Validate.notNull(graphNode, "graphNode cannot be null.");		
		_graphNodes.put(graphNode.getKey(), graphNode);
	}
	
	public Integer getKey() {
		return _key;
	}
	
	public Map<Integer, GraphNode> getGraphNodes() {
		return _graphNodes;
	}
	
}

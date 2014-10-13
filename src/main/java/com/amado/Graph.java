package com.amado;

import org.apache.commons.lang3.Validate;

public class Graph {
	private final GraphNode _root;
	
	public Graph(final GraphNode root) {
		Validate.notNull(root, "root cannot be null");
		_root = root;
	}
	
	
}

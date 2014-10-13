package com.amado.unit;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.amado.GraphNode;

public class GraphNodeTest {

	@Test
	public void canCreateGraphNode() {
		// ~given
		GraphNode node = null;
		
		// ~when
		node = new GraphNode(1);
		
		// ~then
		assertThat(node, is(notNullValue()));
	}
	
	@Test
	public void canLinkGraphNode() {
		// ~given
		final Integer childKey = 2;		
		final GraphNode root = new GraphNode(1);
		final GraphNode child = new GraphNode(childKey);
		
		// ~when
		root.linkGraphNode(child);
		
		// ~then		
		assertThat(root.getGraphNodes().containsKey(childKey), is(Boolean.TRUE));
	}

}
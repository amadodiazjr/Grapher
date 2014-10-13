package com.amado.unit;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.amado.Graph;
import com.amado.GraphNode;

public class GraphTest {

	@Test
	public void canCreateGraph() {
		// ~given
		Graph graph = null;
		
		// ~when
		graph = new Graph(new GraphNode(1));
		
		// ~then
		assertThat(graph, is(notNullValue()));
	}

}

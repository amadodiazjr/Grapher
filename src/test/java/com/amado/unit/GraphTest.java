package com.amado.unit;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.List;

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

	@Test
	public void canFindPath() {
		// ~given
		final GraphNode one = new GraphNode(1);
		final GraphNode two = new GraphNode(2);
		final GraphNode four = new GraphNode(4);
		one.linkGraphNode(two);
		one.linkGraphNode(four);

		final GraphNode three = new GraphNode(3);
		final GraphNode five = new GraphNode(5);
		two.linkGraphNode(three);
		two.linkGraphNode(five);

		final GraphNode seven = new GraphNode(7);
		four.linkGraphNode(seven);
		
		final GraphNode six = new GraphNode(6);
		five.linkGraphNode(six);
		
		final GraphNode nine = new GraphNode(9);
		six.linkGraphNode(nine);
		
		final GraphNode eight = new GraphNode(8);
		nine.linkGraphNode(eight);
		
		final Graph graph = new Graph(one);
		
		// ~when
		List<GraphNode> path = graph.findPath(six);
		
		// ~then
		assertThat(path.get(0).getKey(), is(1));
		assertThat(path.get(1).getKey(), is(2));
		assertThat(path.get(2).getKey(), is(5));
		assertThat(path.get(3).getKey(), is(6));
	}
}
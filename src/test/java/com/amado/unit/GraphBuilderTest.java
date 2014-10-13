package com.amado.unit;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import com.amado.GraphBuilder;

public class GraphBuilderTest {

	@Test
	public void canCreateGraphBuilder() {
		// ~given
		GraphBuilder builder = null;
		
		// ~when
		builder = new GraphBuilder();
		
		// ~then
		assertThat(builder, is(notNullValue()));
	}

}
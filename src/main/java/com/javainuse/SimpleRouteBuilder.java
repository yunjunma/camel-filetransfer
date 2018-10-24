package com.javainuse;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		//noop=true means cut and paste
        from("file:/Users/jun/Desktop/172/servicemixHW/inputFolder?noop=true").to("file:/Users/jun/Desktop/172/servicemixHW/outputFolder ");
		
	}

}

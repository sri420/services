package com.poc.application;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import com.poc.resource.AgentResource;


public class AgentApplication extends Application<AgentConfiguration> {
	    public static void main(String[] args) throws Exception {
	        new AgentApplication().run(args);
	    }

	    @Override
	    public String getName() {
	        return "AgentApplication";
	    }

	    @Override
	    public void initialize(Bootstrap<AgentConfiguration> bootstrap) {
	        // nothing to do yet
	    }

	    @Override
	    public void run(AgentConfiguration configuration,
	                    Environment environment) {
	        final AgentResource resource = new AgentResource( configuration.getTemplate());
	        environment.jersey().register(resource);
	    }
	
	
}

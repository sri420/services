package com.poc.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.poc.model.Agent;


@Path("/agent")
public class AgentResource implements AgentContract{

	 private final String template;
	 
	 public AgentResource(String template) {
	        this.template = template;
	    }
	 
    @GET
    public Agent getAgentDetails(@QueryParam("agentId") String agentId) {
		 if("1".equalsIgnoreCase(agentId)){
			 return new Agent(agentId,"Sam");
		 }else if("2".equalsIgnoreCase(agentId)){
			 return new Agent(agentId,"raj");
		 }else{
			 return new Agent(agentId,"Unknown Agent");
		 }
		 
    }
	
}

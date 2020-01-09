package com.manish.githubconsumeresponse.resources;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.manish.githubconsumeresponse.model.RepoResponse;

@RestController
//@RequestMapping("/payload")
public class ConsumeGithubResponse {

	@RequestMapping("/")
	@ResponseBody
	@Consumes(MediaType.APPLICATION_JSON)
	public String getResponse(@RequestBody RepoResponse repoResponse) {
		return "Hello" + repoResponse.getAction();
		
	}
	
	/*
	 * @POST
	 * 
	 * @RequestMapping("/")
	 * 
	 * @Consumes(MediaType.APPLICATION_JSON) //@Produces(MediaType.APPLICATION_JSON)
	 * public void gethrmessage(RequestBody requestBody) {
	 * System.out.println(requestBody.toString()); //
	 * System.out.println(requestBody.foo); //
	 * System.out.println(requestBody.count); }
	 */

}

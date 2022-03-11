package test;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;

@Path("/hello") 
public class Hello {
 @GET
 @Produces(MediaType.TEXT_XML)
 public String sayHello() {
	 String resource="<?xml version='1.0'?>"
	 		+ "<hello> Hi James This is hello from XML</hello>";
	 	 return resource;
 }
 @GET
 @Produces(MediaType.APPLICATION_JSON)
 public String sayHelloJSON() {
	 String resource=null;
	 
	 return resource;
 }
 @GET
 @Produces(MediaType.TEXT_HTML)
 public String sayHelloHTML(@QueryParam("name") String name, @QueryParam("card_no") String carn_no, @QueryParam("amount") int amount) {
	 System.out.println("Names is :"+name);
	 System.out.println("Amount is: "+amount);
	 String response;
	 if(amount>1000) {
		 System.out.println("Greater than 1000");
		 response="Credit card not approved";
	 }
	 else {
		 System.out.println("Less than 1000");
		 response="Credit card approved";
	 }
	 
	 
	 return "<html><title>Credit Card Authorization: "+name+"</title>"
	 		+ "<body><h1>"+response+"</h1></body></html>";
	 
 }
}

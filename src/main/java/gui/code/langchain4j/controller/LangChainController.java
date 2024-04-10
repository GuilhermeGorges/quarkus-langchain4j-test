package gui.code.langchain4j.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/chat")
public class LangChainController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "test";
    }
}

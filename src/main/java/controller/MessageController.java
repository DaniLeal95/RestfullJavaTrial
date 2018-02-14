package controller;

import javax.ws.rs.*;
import model.Mensaje;

@Path("getMessage")
public class MessageController {

    @GET
    @Produces({"text/plain"})
    public String mostrarMensaje(){
        Mensaje msg = new Mensaje("AJAI GORRION");

        String personality = msg.personalize("Hemos tenido " + msg.getAdder() + " peticiones" );

        return personality;
    }

}


package com.edu.gt.resource;

import com.edu.gt.dto.Temperatura;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;



@Path("/temperaturas")
public class TemperaturasResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    
    public Temperatura medicion(){
        return new Temperatura("Puerto Barrios", 24,41);
    }
}

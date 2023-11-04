package org.utec.apidesercionescolarqry.interfaces.restclient;


import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.utec.apidesercionescolarqry.model.Alumno;
import org.utec.apidesercionescolarqry.model.dto.PrediccionDTO;

@Path("/")
@RegisterRestClient(configKey = "apialgoritmo")
public interface ApiAlgoritmoRestClient {

    @POST
    @Path("predict")
    public PrediccionDTO obtenerPredicion(Alumno alumno);


}

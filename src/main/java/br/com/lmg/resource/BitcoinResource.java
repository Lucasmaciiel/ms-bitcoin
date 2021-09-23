package br.com.lmg.resource;

import br.com.lmg.service.BitcoinService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/bitcoins")
public class BitcoinResource {

    @RestClient
    @Inject
    BitcoinService service;

    @GET
    public Response findAll(){
        var response = service.findAll();

        return Response.ok()
                .entity(response)
                .build();
    }

}

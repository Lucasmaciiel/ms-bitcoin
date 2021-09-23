package br.com.lmg.resource;

import br.com.lmg.model.Bitcoin;
import br.com.lmg.service.BitcoinService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/bitcoins")
public class BitcoinResource {

    @RestClient
    @Inject
    BitcoinService service;

    @GET
    public Response findAll(){
        List<Bitcoin> response = service.findAll();

        return Response.ok()
                .entity(response)
                .build();
    }

}

package br.com.mp.bsbdevfestival;

import br.com.mp.bsbdevfestival.controller.CarController;
import br.com.mp.bsbdevfestival.model.Car;
import io.quarkus.panache.common.Sort;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
@Path("/car")
public class CarResource {

    @Inject
    CarController carController;

    @GET
    public List<Car> list() {
        return Car.listAll(Sort.by("name"));
    }

    @POST
    @Transactional
    public Response create(Car car) {

        car.persist();
        return Response.ok(car).status(201).build();
    }

    @PUT
    @Path("{id}")
    @Transactional
    public Response update(@PathParam("id") Long id, Car car) {

        if (carController.validarNomeCarro(car)) {
            //throw new WebApplicationException("Car name was not set on request", Response.Status.BAD_REQUEST);
            return Response.ok("Car was not found").type(MediaType.APPLICATION_JSON_TYPE).build();

        }

        Car carEntity = Car.findById(id);

        if (carEntity == null) {
            throw new WebApplicationException("Car with id of " + id + " does not exist.", Response.Status.NOT_FOUND);
        }

        carEntity.setName(car.getName());
        carEntity.setBrand(car.getBrand());

        return Response.ok(carEntity).build();
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public Response delete(@PathParam("id") Long id) {
        Car carEntity = Car.findById(id);

        if (carEntity == null) {
            throw new WebApplicationException("Car with id " + id + " does not exist.", Response.Status.NOT_FOUND);
        }

        carEntity.delete();
        return Response.status(204).build();
    }
}
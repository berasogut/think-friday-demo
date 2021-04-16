package io.openliberty.sample.jakarta.jaxrsfinish;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("")
public class InventoryResource {
	@GET
	@Path("/inventory")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Vaccine> listInventory() {
		System.out.println("Listing vaccine inventory...");
		return null;
	}
	
	@POST
	@Path("/{vaccineType}/{numDoses}/{costPerThousandUnits}")
	public void addVaccine(@PathParam("vaccineType") String vaccineType, @PathParam("numDoses") int numDoses, @PathParam("costPerThousandUnits") int costPerThousandUnits) {
		System.out.println("ADDING VACCINE - Vaccine type: " + vaccineType + "; Number of doses: " + numDoses + "; Cost per thousand units: " + costPerThousandUnits);
	}
}
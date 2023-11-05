package org.example;

import org.example.entities.Planet;
import org.example.repositories.PlanetCrud;

public class PlanetService {
    private PlanetCrud planetCrud = new PlanetCrud();

    public void savePlanet(Planet planet) {
        planetCrud.save(planet);
    }

    public Planet findPlanetById(String id) {
        return planetCrud.getById(id);
    }

    public void updatePlanet(Planet planet) {
        planetCrud.update(planet);
    }

    public void deletePlanet(Planet planet) {
        planetCrud.delete(planet);
    }
}

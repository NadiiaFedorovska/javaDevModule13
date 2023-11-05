package org.example;

import org.apache.log4j.Logger;
import org.example.entities.Client;
import org.example.entities.Planet;
import org.example.utils.FlywayMigration;
import org.example.utils.HibernateUtil;

public class App {
    private static final Logger logger = Logger.getLogger(App.class);
    public static void main(String[] args){
        logger.info("The program has started");

        FlywayMigration.migrateDatabase();

        ClientService clientService = new ClientService();

        Client newClient = new Client();
        newClient.setClientName("Petro");
        clientService.saveClient(newClient);
        logger.info("Create new Client " + newClient);

        Client client = clientService.findClientById(3L);
        logger.info("Found Client: "+ client.getClientName());

        client.setClientName("Marta");
        clientService.updateClient(client);
        logger.info("Client name updated. New name: "+ client);

        clientService.deleteClient(client);
        logger.info("Client: "+ client + "was deleted");

        PlanetService planetService = new PlanetService();

        Planet newPlanet = new Planet();
        newPlanet.setPlanetId("NEPTUNE");
        newPlanet.setPlanetName("Neptune");
        planetService.savePlanet(newPlanet);
        logger.info("Create new Planet " + newPlanet);

        Planet planet = planetService.findPlanetById("EAR");
        logger.info("Found Planet: "+ planet.getPlanetId() + " " + planet.getPlanetName());

        planet.setPlanetName("OurHome");
        planetService.updatePlanet(planet);
        logger.info("Planet name updated. New name: "+ planet);

        planetService.deletePlanet(planet);
        logger.info("Planet: "+ planet + "was deleted");

        HibernateUtil.getInstance().close();
        logger.info("The program has finished");
    }
}

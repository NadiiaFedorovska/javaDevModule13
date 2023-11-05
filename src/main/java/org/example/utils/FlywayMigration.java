package org.example.utils;

import org.apache.log4j.Logger;
import org.example.App;
import org.flywaydb.core.Flyway;

public class FlywayMigration {
    private static final Logger logger = Logger.getLogger(App.class);

    private FlywayMigration() {
    }

    public static void migrateDatabase() {
        System.out.println("Flyway migration start");
        logger.info("Flyway start");
        Flyway.configure()
                .dataSource(Config.JDBC_URL, Config.USERNAME, Config.PASSWORD)
                .locations("classpath:flyway/scripts")
                .load()
                .migrate();
        logger.info("Flyway finish");
        System.out.println("Flyway migration completed!");
    }
}

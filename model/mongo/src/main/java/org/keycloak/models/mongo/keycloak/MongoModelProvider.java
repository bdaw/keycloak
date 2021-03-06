package org.keycloak.models.mongo.keycloak;

import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.models.ModelProvider;
import org.keycloak.models.mongo.keycloak.adapters.MongoKeycloakSessionFactory;
import org.keycloak.models.mongo.keycloak.config.MongoClientProvider;
import org.keycloak.models.mongo.keycloak.config.MongoClientProviderHolder;

import java.lang.Override;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public class MongoModelProvider implements ModelProvider {

    @Override
    public String getId() {
        return "mongo";
    }

    @Override
    public KeycloakSessionFactory createFactory() {
        MongoClientProvider mongoClientProvider = MongoClientProviderHolder.getInstance();
        return new MongoKeycloakSessionFactory(mongoClientProvider);
    }
}

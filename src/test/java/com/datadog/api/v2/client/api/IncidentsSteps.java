package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.model.IncidentCreateData;
import com.datadog.api.v2.client.model.IncidentResponse;

import io.cucumber.java.en.Given;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.model.IncidentCreateAttributes;
import com.datadog.api.v2.client.model.IncidentCreateRequest;
import com.datadog.api.World;

public class IncidentsSteps {

    private World world;

    public IncidentsSteps(World world) {
        this.world = world;
    }

    @Given("there is a valid \"incident\" in the system")
    public void thereIsAValidIncidentInTheSystem() throws com.datadog.api.v2.client.ApiException {
        IncidentCreateAttributes ica = new IncidentCreateAttributes().title(world.getUniqueEntityName()).customerImpacted(false);
        IncidentCreateData icd = new IncidentCreateData().attributes(ica);
        IncidentCreateRequest icr = new IncidentCreateRequest().data(icd);
        IncidentsApi incidentsAPI = new IncidentsApi((ApiClient) world.client);
        ((ApiClient) world.client).setUnstableOperationEnabled("createIncident", true);
        IncidentResponse ir = incidentsAPI.createIncident().body(icr).execute();
        ((ApiClient) world.client).setUnstableOperationEnabled("createIncident", false);

        world.context.put("incident", ir);

        world.undo.add(() -> {
            Undo.createIncident(incidentsAPI, (Object) ir);
            return null;
        });
    }

}

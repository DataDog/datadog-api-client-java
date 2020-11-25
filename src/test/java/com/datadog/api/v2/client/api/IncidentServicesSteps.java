package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.model.IncidentServiceCreateData;
import com.datadog.api.v2.client.model.IncidentServiceResponse;

import io.cucumber.java.en.Given;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.model.IncidentServiceCreateAttributes;
import com.datadog.api.v2.client.model.IncidentServiceCreateRequest;
import com.datadog.api.World;

public class IncidentServicesSteps {

    private World world;

    public IncidentServicesSteps(World world) {
        this.world = world;
    }

    @Given("there is a valid \"service\" in the system")
    public void thereIsAValidServiceInTheSystem() throws com.datadog.api.v2.client.ApiException {
        IncidentServiceCreateAttributes tca = new IncidentServiceCreateAttributes().name(world.getUniqueEntityName());
        IncidentServiceCreateData tcd = new IncidentServiceCreateData().attributes(tca);
        IncidentServiceCreateRequest tcr = new IncidentServiceCreateRequest().data(tcd);
        IncidentServicesApi servicesAPI = new IncidentServicesApi((ApiClient) world.client);
        ((ApiClient) world.client).setUnstableOperationEnabled("createIncidentService", true);
        IncidentServiceResponse tr = servicesAPI.createIncidentService().body(tcr).execute();
        ((ApiClient) world.client).setUnstableOperationEnabled("createIncidentService", false);

        world.context.put("service", tr);

        world.undo.add(() -> {
            Undo.createIncidentService(servicesAPI, (Object) tr);
            return null;
        });
    }

}

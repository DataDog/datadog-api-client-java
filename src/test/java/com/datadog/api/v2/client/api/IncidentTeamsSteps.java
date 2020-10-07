package com.datadog.api.v2.client.api;

import io.cucumber.java.en.Given;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.model.IncidentTeamCreateAttributes;
import com.datadog.api.v2.client.model.IncidentTeamCreateData;
import com.datadog.api.v2.client.model.IncidentTeamCreateRequest;
import com.datadog.api.v2.client.model.IncidentTeamResponse;
import com.datadog.api.World;

public class IncidentTeamsSteps {

    private World world;

    public IncidentTeamsSteps(World world) {
        this.world = world;
    }

    @Given("there is a valid \"team\" in the system")
    public void thereIsAValidTeamInTheSystem() throws com.datadog.api.v2.client.ApiException {
        IncidentTeamCreateAttributes tca = new IncidentTeamCreateAttributes().name(world.getUniqueEntityName());
        IncidentTeamCreateData tcd = new IncidentTeamCreateData().attributes(tca);
        IncidentTeamCreateRequest tcr = new IncidentTeamCreateRequest().data(tcd);
        IncidentTeamsApi teamsAPI = new IncidentTeamsApi((ApiClient) world.client);
        ((ApiClient) world.client).setUnstableOperationEnabled("createIncidentTeam", true);
        IncidentTeamResponse tr = teamsAPI.createIncidentTeam().body(tcr).execute();
        ((ApiClient) world.client).setUnstableOperationEnabled("createIncidentTeam", false);

        world.context.put("team", tr);

        world.undo.add(() -> {
            Undo.createIncidentTeam(teamsAPI, (Object) tr);
            return null;
        });
    }

}

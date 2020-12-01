package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.model.RoleCreateResponse;
import com.datadog.api.v2.client.model.IncidentServiceResponse;
import com.datadog.api.v2.client.model.IncidentTeamResponse;
import com.datadog.api.v2.client.model.IncidentResponse;
import com.datadog.api.v2.client.model.UserResponse;

public class Undo {
    public static void createUser(UsersApi api, Object response) throws com.datadog.api.v2.client.ApiException {
        UserResponse r = (UserResponse) response;
        api.disableUser(r.getData().getId());
    }

    public static void createRole(RolesApi api, Object response) throws com.datadog.api.v2.client.ApiException {
        RoleCreateResponse r = (RoleCreateResponse) response;
        api.deleteRole(r.getData().getId());
    }

    public static void createIncidentTeam(IncidentTeamsApi api, Object response)
            throws com.datadog.api.v2.client.ApiException {
        IncidentTeamResponse r = (IncidentTeamResponse) response;

        api.getApiClient().setUnstableOperationEnabled("deleteIncidentTeam", true);
        api.deleteIncidentTeam(r.getData().getId());
        api.getApiClient().setUnstableOperationEnabled("deleteIncidentTeam", false);
    }

    public static void createIncidentService(IncidentServicesApi api, Object response)
            throws com.datadog.api.v2.client.ApiException {
        IncidentServiceResponse r = (IncidentServiceResponse) response;

        api.getApiClient().setUnstableOperationEnabled("deleteIncidentService", true);
        api.deleteIncidentService(r.getData().getId());
        api.getApiClient().setUnstableOperationEnabled("deleteIncidentService", false);
    }

    public static void createIncident(IncidentsApi api, Object response) throws com.datadog.api.v2.client.ApiException {
        IncidentResponse r = (IncidentResponse) response;

        api.getApiClient().setUnstableOperationEnabled("deleteIncident", true);
        api.deleteIncident(r.getData().getId());
        api.getApiClient().setUnstableOperationEnabled("deleteIncident", false);
    }

}

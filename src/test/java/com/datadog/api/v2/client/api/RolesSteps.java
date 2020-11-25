package com.datadog.api.v2.client.api;

import io.cucumber.java.en.Given;

import com.datadog.api.World;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.model.RoleCreateAttributes;
import com.datadog.api.v2.client.model.RoleCreateData;
import com.datadog.api.v2.client.model.RoleCreateRequest;
import com.datadog.api.v2.client.model.RoleCreateResponse;
import com.datadog.api.v2.client.model.UserResponse;
import com.datadog.api.v2.client.model.Permission;
import com.datadog.api.v2.client.model.PermissionsResponse;
import com.datadog.api.v2.client.model.RelationshipToPermission;
import com.datadog.api.v2.client.model.RelationshipToPermissionData;
import com.datadog.api.v2.client.model.RelationshipToUser;
import com.datadog.api.v2.client.model.RelationshipToUserData;

public class RolesSteps {

    private World world;

    public RolesSteps(World world) {
        this.world = world;
    }

    @Given("there is a valid \"role\" in the system")
    public void thereIsAValidRoleInTheSystem() throws com.datadog.api.v2.client.ApiException {
        RoleCreateAttributes rca = new RoleCreateAttributes().name(world.getUniqueEntityName());
        RoleCreateData rcd = new RoleCreateData().attributes(rca);
        RoleCreateRequest rcr = new RoleCreateRequest().data(rcd);
        RolesApi rolesAPI = new RolesApi((ApiClient) world.client);
        RoleCreateResponse rr = rolesAPI.createRole().body(rcr).execute();

        world.context.put("role", rr);

        world.undo.add(() -> {
            Undo.createRole(rolesAPI, (Object) rr);
            return null;
        });
    }

    @Given("there is a valid \"permission\" in the system")
    public void thereIsAValidPermissionInTheSystem() throws com.datadog.api.v2.client.ApiException {
        RolesApi rolesAPI = new RolesApi((ApiClient) world.client);

        PermissionsResponse permissions = rolesAPI.listPermissions().execute();

        world.context.put("permission", permissions.getData().get(0));
    }

    @Given("the \"permission\" is granted to the \"role\"")
    public void thePermissionIsGrantedToTheRole() throws com.datadog.api.v2.client.ApiException {
        Permission permission = (Permission) world.context.get("permission");
        RoleCreateResponse role = (RoleCreateResponse) world.context.get("role");

        RolesApi rolesAPI = new RolesApi((ApiClient) world.client);

        RelationshipToPermissionData data = new RelationshipToPermissionData().id(permission.getId());
        RelationshipToPermission body = new RelationshipToPermission().data(data);

        rolesAPI.addPermissionToRole(role.getData().getId()).body(body).execute();
    }

    @Given("the \"user\" has the \"role\"")
    public void theUserHasTheRole() throws com.datadog.api.v2.client.ApiException {
        UserResponse user = (UserResponse) world.context.get("user");
        RoleCreateResponse role = (RoleCreateResponse) world.context.get("role");

        RolesApi rolesAPI = new RolesApi((ApiClient) world.client);

        RelationshipToUserData data = new RelationshipToUserData().id(user.getData().getId());
        RelationshipToUser body = new RelationshipToUser().data(data);

        rolesAPI.addUserToRole(role.getData().getId()).body(body).execute();
    }
}

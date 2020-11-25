package com.datadog.api.v2.client.api;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.model.RelationshipToUser;
import com.datadog.api.v2.client.model.RelationshipToUserData;
import com.datadog.api.v2.client.model.UserCreateAttributes;
import com.datadog.api.v2.client.model.UserCreateData;
import com.datadog.api.v2.client.model.UserCreateRequest;
import com.datadog.api.v2.client.model.UserInvitationData;
import com.datadog.api.v2.client.model.UserInvitationRelationships;
import com.datadog.api.v2.client.model.UserInvitationsRequest;
import com.datadog.api.v2.client.model.UserInvitationsResponse;
import com.datadog.api.v2.client.model.UserResponse;
import com.datadog.api.World;

public class UsersSteps {

    private World world;

    public UsersSteps(World world) {
        this.world = world;
    }

    @Given("there is a valid \"user\" in the system")
    public void thereIsAValidUserInTheSystem() throws com.datadog.api.v2.client.ApiException {
        final String testingUserName = world.getUniqueEntityName().toLowerCase();
        final String testingUserHandle = testingUserName + "@datadoghq.com";
        UserCreateAttributes uca = new UserCreateAttributes().email(testingUserHandle).name(testingUserName);
        UserCreateData ucd = new UserCreateData().attributes(uca);
        UserCreateRequest ucr = new UserCreateRequest().data(ucd);
        UsersApi usersAPI = new UsersApi((ApiClient) world.client);
        UserResponse ur = usersAPI.createUser().body(ucr).execute();

        world.context.put("user", ur);

        world.undo.add(() -> {
            Undo.createUser(usersAPI, (Object) ur);
            return null;
        });
    }

    @Given("the \"user\" has a \"user_invitation\"")
    public void theUserHasTheRole() throws com.datadog.api.v2.client.ApiException {
        UserResponse user = (UserResponse) world.context.get("user");

        RelationshipToUserData ud = new RelationshipToUserData().id(user.getData().getId());
        RelationshipToUser ru = new RelationshipToUser().data(ud);
        UserInvitationRelationships relationships = new UserInvitationRelationships().user(ru);
        UserInvitationData data = new UserInvitationData().relationships(relationships);
        List<UserInvitationData> ldata = new ArrayList<>();
        ldata.add(data);
        UserInvitationsRequest body = new UserInvitationsRequest().data(ldata);

        UsersApi usersAPI = new UsersApi((ApiClient) world.client);
        UserInvitationsResponse response = usersAPI.sendInvitations().body(body).execute();

        world.context.put("user_invitation", response.getData().get(0));

    }
}

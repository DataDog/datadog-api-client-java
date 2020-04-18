/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.*;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * API tests for UsersApi
 */
public class UsersApiTest extends V1ApiTest {

    private static UsersApi api;
    private static UsersApi fakeAuthApi;
    private static UsersApi unitApi;

    // ObjectMapper instance configure to not fail when encountering unknown properties
    private static ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    private final String apiUri = "/api/v1/user";
    private final String fixturePrefix = "v1/client/api/user_fixtures";

    private final String testingUserHandle = "testinguser@datadoghq.com";
    private final String testingUserName = "Testing User";
    private final AccessRole testingUserAR = AccessRole.STANDARD;
    private ArrayList<String> disableUsers = null;

    @Before
    public void resetDisableUsers() {
        disableUsers = new ArrayList<String>();
    }

    @BeforeClass
    public static void initApi() {
        api = new UsersApi(generalApiClient);
        fakeAuthApi = new UsersApi(generalFakeAuthApiClient);
        unitApi = new UsersApi(generalApiUnitTestClient);
    }

    @After
    public void disableUsers() throws ApiException {
        if (disableUsers != null) {
            for (String handle: disableUsers) {
                UserResponse ugr = api.getUser(handle).execute();
                if (!ugr.getUser().getDisabled()) {
                    api.disableUser(handle).execute();
                }
            }
        }
    }

    /**
     * Create, modify and disable user object, also test getting it
     */
    @Test
    public void userCreateModifyDisableTest() throws ApiException {
        // Test creating user
        User user = new User();
        user.setAccessRole(testingUserAR);
        user.setHandle(testingUserHandle);
        user.setName(testingUserName);
        UserResponse response = api.createUser().body(user).execute();
        // If something fails, make sure we disable the user
        disableUsers.add(testingUserHandle);

        user = response.getUser();
        assertEquals(testingUserHandle, user.getHandle());
        assertEquals(testingUserName, user.getName());
        assertEquals(testingUserAR.toString(), user.getAccessRole().toString());

        // Now test updating user
        user.setName("Updated Name");
        user.setDisabled(false);
        response = api.updateUser(user.getHandle()).body(user).execute();

        assertEquals("Updated Name", response.getUser().getName());

        // Now test getting user
        response = api.getUser(user.getHandle()).execute();
        assertEquals(testingUserHandle, response.getUser().getHandle());
        assertEquals("Updated Name", response.getUser().getName());
        assertEquals(testingUserAR.toString(), response.getUser().getAccessRole().toString());
        assertEquals(false, response.getUser().getDisabled());

        // Now test disabling user
        api.disableUser(user.getHandle()).execute();
        response = api.getUser(user.getHandle()).execute();
        assertEquals(true, response.getUser().getDisabled());
    }

    /**
     * Get all users
     */
    @Test
    public void listUsersTest() throws ApiException {
        Assume.assumeTrue("This test does not support replay from recording", TestUtils.isRecording());
        ArrayList<String> prefixes = new ArrayList<>(Arrays.asList("1", "2", "3"));
        for (String prefix: prefixes) {
            User user = new User();
            user.setAccessRole(testingUserAR);
            user.setHandle(prefix + testingUserHandle);
            user.setName(prefix + testingUserName);
            UserResponse response = api.createUser().body(user).execute();
            disableUsers.add(response.getUser().getHandle());
        }
        UserListResponse response = api.listUsers().execute();
        List<User> users = response.getUsers();
        for (String prefix: prefixes) {
            boolean found = false;
            for (User user: users) {
                if (user.getHandle().equals(prefix + testingUserHandle)) {
                    found = true;
                }
            }
            assertTrue(String.format("User %s%s not found", prefix, testingUserHandle), found);
        }
    }

    @Test
    public void userCreateErrorsTest() throws IOException {
        try {
            api.createUser().body(new User()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.createUser().body(new User()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void userCreate409ErrorsTest() throws IOException {
        String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_409.json");
        stubFor(post(urlPathEqualTo(apiUri))
                .willReturn(okJson(fixtureData).withStatus(409))
        );

        try {
            unitApi.createUser().body(new User()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(409, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void testUserListErrorsTest() throws IOException {
        try {
            fakeAuthApi.listUsers().execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void userGetErrorsTest() throws IOException {
        try {
            fakeAuthApi.getUser("notahandle").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            api.getUser("notahandle").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void userUpdateErrorsTest() throws ApiException, IOException {
        // Test creating user
        User user = new User();
        user.setAccessRole(testingUserAR);
        user.setHandle(testingUserHandle);
        user.setName(testingUserName);
        UserResponse response = api.createUser().body(user).execute();
        // If something fails, make sure we disable the user
        disableUsers.add(testingUserHandle);

        User badUser = new User();
        badUser.setEmail("notanemail");

        try {
            api.updateUser(user.getHandle()).body(badUser).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.updateUser("notahandle").body(badUser).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            api.updateUser("notahandle").body(badUser).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }
    @Test
    public void userDisableErrorsTest() throws ApiException, IOException {
        // Test creating user
        User user = new User();
        user.setAccessRole(testingUserAR);
        user.setHandle(testingUserHandle);
        user.setName(testingUserName);
        UserResponse response = api.createUser().body(user).execute();
        // If something fails, make sure we disable the user
        disableUsers.add(testingUserHandle);

        try {
            api.disableUser(user.getHandle()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.disableUser("notahandle").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            api.disableUser("notahandle").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }
}
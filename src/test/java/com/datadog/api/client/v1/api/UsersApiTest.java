/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static org.junit.Assert.*;

import com.datadog.api.RecordingMode;
import com.datadog.api.TestUtils;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.model.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.junit.*;

/** API tests for UsersApi */
public class UsersApiTest extends V1ApiTest {

  private static UsersApi api;
  private static UsersApi fakeAuthApi;
  private static UsersApi unitApi;

  // ObjectMapper instance configure to not fail when encountering unknown properties
  private static ObjectMapper objectMapper =
      new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  private final String apiUri = "/api/v1/user";
  private final String fixturePrefix = "client/v1/api/user_fixtures";

  private ArrayList<String> disableUsers = null;

  @Override
  public String getTracingEndpoint() {
    return "users";
  }

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
      for (String handle : disableUsers) {
        UserResponse ugr = api.getUser(handle);
        if (!ugr.getUser().getDisabled()) {
          api.disableUser(handle);
        }
      }
    }
  }

  /** Create, modify and disable user object, also test getting it */
  @Test
  public void userCreateModifyDisableTest() throws ApiException {
    // Test creating user
    // max name length is 55, so get 47 + add "-updated" below
    String testingUserName = getUniqueEntityName(47);
    String testingUserHandle = testingUserName.toLowerCase() + "@datadoghq.com";
    User user = new User();
    user.setHandle(testingUserHandle);
    user.setName(testingUserName);
    UserResponse response = api.createUser(user);
    // If something fails, make sure we disable the user
    disableUsers.add(testingUserHandle);

    user = response.getUser();
    assertEquals(testingUserHandle, user.getHandle());
    assertEquals(testingUserName, user.getName());

    // Now test updating user
    User updatedUser = new User();
    updatedUser.setHandle(testingUserHandle);
    updatedUser.setName(testingUserName + "-updated");
    updatedUser.setDisabled(false);

    response = api.updateUser(user.getHandle(), updatedUser);

    assertEquals(testingUserName + "-updated", response.getUser().getName());

    // Now test getting user
    response = api.getUser(user.getHandle());
    assertEquals(testingUserHandle, response.getUser().getHandle());
    assertEquals(testingUserName + "-updated", response.getUser().getName());
    assertEquals(false, response.getUser().getDisabled());

    // Now test disabling user
    api.disableUser(user.getHandle());
    response = api.getUser(user.getHandle());
    assertEquals(true, response.getUser().getDisabled());
  }

  /** Get all users */
  @Test
  public void listUsersTest() throws ApiException {
    Assume.assumeTrue(
        "This test does not support replay from recording",
        TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE));
    ArrayList<String> suffixes = new ArrayList<>(Arrays.asList("1", "2", "3"));
    // max name length is 55, so get 53 + add "-X" below
    String testingUserName = getUniqueEntityName(53);
    for (String suffix : suffixes) {
      User user = new User();
      user.setHandle(String.format("%s-%s@datadoghq.com", testingUserName, suffix));
      user.setName(String.format("%s-%s", testingUserName, suffix));
      UserResponse response = api.createUser(user);
      disableUsers.add(response.getUser().getHandle());
    }
    UserListResponse response = api.listUsers();
    List<User> users = response.getUsers();
    for (String suffix : suffixes) {
      boolean found = false;
      // user names are stored in lowercase, so make sure the string is properly lowercased before
      // we try to search for it
      String handle = String.format("%s-%s@datadoghq.com", testingUserName, suffix).toLowerCase();
      for (User user : users) {
        if (user.getHandle().equals(handle)) {
          found = true;
        }
      }
      assertTrue(String.format("User %s not found", handle), found);
    }
  }

  /**
   * Get all users async
   *
   * @throws ExecutionException
   * @throws InterruptedException
   */
  @Test
  public void listUsersTestAsync() throws ApiException, InterruptedException, ExecutionException {
    Assume.assumeTrue(
        "This test does not support replay from recording",
        TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE));
    UserListResponse response = api.listUsersAsync().get();
    List<User> users = response.getUsers();
    assertNotNull(users);
  }

  @Test
  public void userCreateErrorsTest() throws IOException {
    try {
      api.createUser(new User());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.createUser(new User());
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
    stubFor(post(urlPathEqualTo(apiUri)).willReturn(okJson(fixtureData).withStatus(409)));

    try {
      unitApi.createUser(new User());
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
      fakeAuthApi.listUsers();
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
      fakeAuthApi.getUser("notahandle");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.getUser("notahandle");
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
    String testingUserName = getUniqueEntityName(55);
    String testingUserHandle = testingUserName + "@datadoghq.com";
    User user = new User();
    user.setHandle(testingUserHandle);
    user.setName(testingUserName);
    UserResponse response = api.createUser(user);
    // If something fails, make sure we disable the user
    disableUsers.add(testingUserHandle);

    User badUser = new User();
    badUser.setEmail("notanemail");

    try {
      api.updateUser(user.getHandle(), badUser);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.updateUser("notahandle", badUser);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.updateUser("notahandle", badUser);
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
    String testingUserName = getUniqueEntityName(55);
    String testingUserHandle = testingUserName + "@datadoghq.com";
    User user = new User();
    user.setHandle(testingUserHandle);
    user.setName(testingUserName);
    UserResponse response = api.createUser(user);
    // If something fails, make sure we disable the user
    disableUsers.add(testingUserHandle);

    User updatedUser = new User();
    updatedUser.setHandle(response.getUser().getHandle());
    updatedUser.setName(response.getUser().getName());
    updatedUser.setDisabled(true);

    api.updateUser(updatedUser.getHandle(), updatedUser);

    try {
      api.disableUser(updatedUser.getHandle());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.disableUser("notahandle");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.disableUser("notahandle");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }
}

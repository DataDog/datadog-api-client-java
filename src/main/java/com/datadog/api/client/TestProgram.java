package com.datadog.api.client;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.v2.api.UsersApi;
import com.datadog.api.client.v2.api.UsersApi.ListUsersOptionalParameters;
import com.datadog.api.client.v2.model.UsersResponse;

/**
 * Test program to verify PAT auth works using the EXISTING OAuth2/bearer token
 * support (setAccessToken on the AuthZ scheme), NOT the new DD_BEARER_TOKEN env var.
 *
 * This mirrors the Go test_program.go which uses datadog.ContextAccessToken.
 *
 * Usage: mvn compile exec:java -Dexec.mainClass="TestProgram"
 */
public class TestProgram {
  public static void main(String[] args) throws Exception {
    String pat = "ddpat_REPLACE_WITH_YOUR_PAT";

    ApiClient client = new ApiClient();

    // Point to staging
    client.setBasePath("https://dd.datad0g.com");

    // Set the PAT as an OAuth2 access token on the pre-existing "AuthZ" scheme.
    // This causes the client to send "Authorization: Bearer <PAT>" on requests
    // that include AuthZ in their auth names (like ListUsers).
    // No API key or app key is set — only the bearer token.
    client.setAccessToken(pat);

    // Enable debug to see raw HTTP request/response
    client.setDebugging(true);

    UsersApi usersApi = new UsersApi(client);

    try {
      ApiResponse<UsersResponse> response =
          usersApi.listUsersWithHttpInfo(
              new ListUsersOptionalParameters().pageSize(2L));

      System.out.println("Status code: " + response.getStatusCode());
      System.out.println("Response: " + response.getData());
    } catch (ApiException e) {
      System.err.println("Error calling ListUsers: " + e.getMessage());
      System.err.println("Status code: " + e.getCode());
      System.err.println("Response body: " + e.getResponseBody());
      System.exit(1);
    }
  }
}

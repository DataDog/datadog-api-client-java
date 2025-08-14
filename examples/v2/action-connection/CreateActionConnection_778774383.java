// Create a new Action Connection with HTTPBasicAuth returns "Successfully created Action
// Connection" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionConnectionApi;
import com.datadog.api.client.v2.model.ActionConnectionAttributes;
import com.datadog.api.client.v2.model.ActionConnectionData;
import com.datadog.api.client.v2.model.ActionConnectionDataType;
import com.datadog.api.client.v2.model.ActionConnectionIntegration;
import com.datadog.api.client.v2.model.CreateActionConnectionRequest;
import com.datadog.api.client.v2.model.CreateActionConnectionResponse;
import com.datadog.api.client.v2.model.HTTPBasicAuth;
import com.datadog.api.client.v2.model.HTTPBasicAuthType;
import com.datadog.api.client.v2.model.HTTPCredentials;
import com.datadog.api.client.v2.model.HTTPIntegration;
import com.datadog.api.client.v2.model.HTTPIntegrationType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ActionConnectionApi apiInstance = new ActionConnectionApi(defaultClient);

    CreateActionConnectionRequest body =
        new CreateActionConnectionRequest()
            .data(
                new ActionConnectionData()
                    .type(ActionConnectionDataType.ACTION_CONNECTION)
                    .attributes(
                        new ActionConnectionAttributes()
                            .name("HTTP Basic Auth Connection exampleactionconnection")
                            .integration(
                                new ActionConnectionIntegration(
                                    new HTTPIntegration()
                                        .type(HTTPIntegrationType.HTTP)
                                        .baseUrl("https://api.example.com")
                                        .credentials(
                                            new HTTPCredentials(
                                                new HTTPBasicAuth()
                                                    .type(HTTPBasicAuthType.HTTPBASICAUTH)
                                                    .username("test-user")
                                                    .password("test-password")))))));

    try {
      CreateActionConnectionResponse result = apiInstance.createActionConnection(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionConnectionApi#createActionConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

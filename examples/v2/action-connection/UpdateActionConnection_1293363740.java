// Update an existing Action Connection with HTTPBasicAuth returns "Successfully updated Action
// Connection" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionConnectionApi;
import com.datadog.api.client.v2.model.ActionConnectionAttributesUpdate;
import com.datadog.api.client.v2.model.ActionConnectionDataType;
import com.datadog.api.client.v2.model.ActionConnectionDataUpdate;
import com.datadog.api.client.v2.model.ActionConnectionIntegrationUpdate;
import com.datadog.api.client.v2.model.HTTPBasicAuthType;
import com.datadog.api.client.v2.model.HTTPBasicAuthUpdate;
import com.datadog.api.client.v2.model.HTTPCredentialsUpdate;
import com.datadog.api.client.v2.model.HTTPIntegrationType;
import com.datadog.api.client.v2.model.HTTPIntegrationUpdate;
import com.datadog.api.client.v2.model.UpdateActionConnectionRequest;
import com.datadog.api.client.v2.model.UpdateActionConnectionResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ActionConnectionApi apiInstance = new ActionConnectionApi(defaultClient);

    UpdateActionConnectionRequest body =
        new UpdateActionConnectionRequest()
            .data(
                new ActionConnectionDataUpdate()
                    .type(ActionConnectionDataType.ACTION_CONNECTION)
                    .attributes(
                        new ActionConnectionAttributesUpdate()
                            .name("HTTP Basic Auth Updated")
                            .integration(
                                new ActionConnectionIntegrationUpdate(
                                    new HTTPIntegrationUpdate()
                                        .type(HTTPIntegrationType.HTTP)
                                        .baseUrl("https://api.updated.com")
                                        .credentials(
                                            new HTTPCredentialsUpdate(
                                                new HTTPBasicAuthUpdate()
                                                    .type(HTTPBasicAuthType.HTTPBASICAUTH)
                                                    .username("updated-user")
                                                    .password("updated-password")))))));

    try {
      UpdateActionConnectionResponse result =
          apiInstance.updateActionConnection("cb460d51-3c88-4e87-adac-d47131d0423d", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionConnectionApi#updateActionConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

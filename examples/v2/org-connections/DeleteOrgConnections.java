// Delete Org Connection returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgConnectionsApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OrgConnectionsApi apiInstance = new OrgConnectionsApi(defaultClient);

    // there is a valid "org_connection" in the system
    UUID ORG_CONNECTION_DATA_ID = null;
    try {
      ORG_CONNECTION_DATA_ID = UUID.fromString(System.getenv("ORG_CONNECTION_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    try {
      apiInstance.deleteOrgConnections(ORG_CONNECTION_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgConnectionsApi#deleteOrgConnections");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

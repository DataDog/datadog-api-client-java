// Update Org Connection returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgConnectionsApi;
import com.datadog.api.client.v2.model.OrgConnectionResponse;
import com.datadog.api.client.v2.model.OrgConnectionType;
import com.datadog.api.client.v2.model.OrgConnectionTypeEnum;
import com.datadog.api.client.v2.model.OrgConnectionUpdate;
import com.datadog.api.client.v2.model.OrgConnectionUpdateAttributes;
import com.datadog.api.client.v2.model.OrgConnectionUpdateRequest;
import java.util.Arrays;
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

    OrgConnectionUpdateRequest body =
        new OrgConnectionUpdateRequest()
            .data(
                new OrgConnectionUpdate()
                    .type(OrgConnectionType.ORG_CONNECTION)
                    .id(ORG_CONNECTION_DATA_ID)
                    .attributes(
                        new OrgConnectionUpdateAttributes()
                            .connectionTypes(
                                Arrays.asList(
                                    OrgConnectionTypeEnum.LOGS, OrgConnectionTypeEnum.METRICS))));

    try {
      OrgConnectionResponse result = apiInstance.updateOrgConnections(ORG_CONNECTION_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgConnectionsApi#updateOrgConnections");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

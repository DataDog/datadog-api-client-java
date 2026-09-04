// Update the MCP Cross-App Access issuer URL returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrganizationsApi;
import com.datadog.api.client.v2.model.McpCrossAppAccessIssuerUrlType;
import com.datadog.api.client.v2.model.McpCrossAppAccessIssuerUrlUpdateAttributes;
import com.datadog.api.client.v2.model.McpCrossAppAccessIssuerUrlUpdateData;
import com.datadog.api.client.v2.model.McpCrossAppAccessIssuerUrlUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled(
        "v2.updateLoginOrgConfigsMcpCrossAppAccessIssuerUrl", true);
    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);

    McpCrossAppAccessIssuerUrlUpdateRequest body =
        new McpCrossAppAccessIssuerUrlUpdateRequest()
            .data(
                new McpCrossAppAccessIssuerUrlUpdateData()
                    .attributes(
                        new McpCrossAppAccessIssuerUrlUpdateAttributes()
                            .issuerUrl("https://your-subdomain.okta.com"))
                    .type(McpCrossAppAccessIssuerUrlType.ORG_CONFIG));

    try {
      apiInstance.updateLoginOrgConfigsMcpCrossAppAccessIssuerUrl(body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " OrganizationsApi#updateLoginOrgConfigsMcpCrossAppAccessIssuerUrl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

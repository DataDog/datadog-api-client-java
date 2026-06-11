// Update an org authorized client returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgAuthorizedClientsApi;
import com.datadog.api.client.v2.model.OrgAuthorizedClientResponse;
import com.datadog.api.client.v2.model.OrgAuthorizedClientType;
import com.datadog.api.client.v2.model.OrgAuthorizedClientUpdateAttributes;
import com.datadog.api.client.v2.model.OrgAuthorizedClientUpdateData;
import com.datadog.api.client.v2.model.OrgAuthorizedClientUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OrgAuthorizedClientsApi apiInstance = new OrgAuthorizedClientsApi(defaultClient);

    OrgAuthorizedClientUpdateRequest body =
        new OrgAuthorizedClientUpdateRequest()
            .data(
                new OrgAuthorizedClientUpdateData()
                    .attributes(new OrgAuthorizedClientUpdateAttributes().disabled(true))
                    .id("00000000-0000-0000-0000-000000000001")
                    .type(OrgAuthorizedClientType.ORG_AUTHORIZED_CLIENTS));

    try {
      OrgAuthorizedClientResponse result =
          apiInstance.updateOrgAuthorizedClient("00000000-0000-0000-0000-000000000001", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling OrgAuthorizedClientsApi#updateOrgAuthorizedClient");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

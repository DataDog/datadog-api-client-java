// Update a specific Org Config returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrganizationsApi;
import com.datadog.api.client.v2.model.OrgConfigGetResponse;
import com.datadog.api.client.v2.model.OrgConfigType;
import com.datadog.api.client.v2.model.OrgConfigWrite;
import com.datadog.api.client.v2.model.OrgConfigWriteAttributes;
import com.datadog.api.client.v2.model.OrgConfigWriteRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);

    OrgConfigWriteRequest body =
        new OrgConfigWriteRequest()
            .data(
                new OrgConfigWrite()
                    .attributes(new OrgConfigWriteAttributes().value("UTC"))
                    .type(OrgConfigType.ORG_CONFIGS));

    try {
      OrgConfigGetResponse result = apiInstance.updateOrgConfig("monitor_timezone", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#updateOrgConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

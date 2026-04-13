// Create an org group returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgGroupsApi;
import com.datadog.api.client.v2.model.OrgGroupCreateAttributes;
import com.datadog.api.client.v2.model.OrgGroupCreateData;
import com.datadog.api.client.v2.model.OrgGroupCreateRequest;
import com.datadog.api.client.v2.model.OrgGroupResponse;
import com.datadog.api.client.v2.model.OrgGroupType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createOrgGroup", true);
    OrgGroupsApi apiInstance = new OrgGroupsApi(defaultClient);

    OrgGroupCreateRequest body =
        new OrgGroupCreateRequest()
            .data(
                new OrgGroupCreateData()
                    .attributes(new OrgGroupCreateAttributes().name("My Org Group"))
                    .type(OrgGroupType.ORG_GROUPS));

    try {
      OrgGroupResponse result = apiInstance.createOrgGroup(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgGroupsApi#createOrgGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

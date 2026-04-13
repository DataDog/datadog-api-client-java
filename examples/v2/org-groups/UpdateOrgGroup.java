// Update an org group returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgGroupsApi;
import com.datadog.api.client.v2.model.OrgGroupResponse;
import com.datadog.api.client.v2.model.OrgGroupType;
import com.datadog.api.client.v2.model.OrgGroupUpdateAttributes;
import com.datadog.api.client.v2.model.OrgGroupUpdateData;
import com.datadog.api.client.v2.model.OrgGroupUpdateRequest;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateOrgGroup", true);
    OrgGroupsApi apiInstance = new OrgGroupsApi(defaultClient);

    OrgGroupUpdateRequest body =
        new OrgGroupUpdateRequest()
            .data(
                new OrgGroupUpdateData()
                    .attributes(new OrgGroupUpdateAttributes().name("Updated Org Group Name"))
                    .id(UUID.fromString("a1b2c3d4-e5f6-7890-abcd-ef0123456789"))
                    .type(OrgGroupType.ORG_GROUPS));

    try {
      OrgGroupResponse result =
          apiInstance.updateOrgGroup(UUID.fromString("a1b2c3d4-e5f6-7890-abcd-ef0123456789"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgGroupsApi#updateOrgGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

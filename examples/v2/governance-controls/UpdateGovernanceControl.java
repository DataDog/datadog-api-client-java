// Update a governance control returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GovernanceControlsApi;
import com.datadog.api.client.v2.model.GovernanceControlResourceType;
import com.datadog.api.client.v2.model.GovernanceControlResponse;
import com.datadog.api.client.v2.model.GovernanceControlUpdateAttributes;
import com.datadog.api.client.v2.model.GovernanceControlUpdateData;
import com.datadog.api.client.v2.model.GovernanceControlUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateGovernanceControl", true);
    GovernanceControlsApi apiInstance = new GovernanceControlsApi(defaultClient);

    GovernanceControlUpdateRequest body =
        new GovernanceControlUpdateRequest()
            .data(
                new GovernanceControlUpdateData()
                    .attributes(
                        new GovernanceControlUpdateAttributes()
                            .detectionFrequency("daily")
                            .mitigationType("revoke_api_key")
                            .name("Unused API Keys")
                            .notificationFrequency("daily")
                            .notificationType("slack"))
                    .id("0d4e6f8a-1b2c-3d4e-5f6a-7b8c9d0e1f2a")
                    .type(GovernanceControlResourceType.GOVERNANCE_CONTROL));

    try {
      GovernanceControlResponse result =
          apiInstance.updateGovernanceControl("unused_api_keys", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GovernanceControlsApi#updateGovernanceControl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

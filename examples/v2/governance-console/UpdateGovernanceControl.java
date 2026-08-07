// Update a control returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GovernanceConsoleApi;
import com.datadog.api.client.v2.model.GovernanceControlResourceType;
import com.datadog.api.client.v2.model.GovernanceControlResponse;
import com.datadog.api.client.v2.model.GovernanceControlUpdateAttributes;
import com.datadog.api.client.v2.model.GovernanceControlUpdateData;
import com.datadog.api.client.v2.model.GovernanceControlUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateGovernanceControl", true);
    GovernanceConsoleApi apiInstance = new GovernanceConsoleApi(defaultClient);

    GovernanceControlUpdateRequest body =
        new GovernanceControlUpdateRequest()
            .data(
                new GovernanceControlUpdateData()
                    .attributes(
                        new GovernanceControlUpdateAttributes().mitigationType("revoke_api_key"))
                    .type(GovernanceControlResourceType.GOVERNANCE_CONTROL));

    try {
      GovernanceControlResponse result =
          apiInstance.updateGovernanceControl("unused_api_keys", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GovernanceConsoleApi#updateGovernanceControl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

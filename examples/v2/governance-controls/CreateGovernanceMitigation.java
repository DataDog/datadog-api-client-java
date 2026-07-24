// Mitigate governance detections returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GovernanceControlsApi;
import com.datadog.api.client.v2.model.GovernanceControlDetectionResourceType;
import com.datadog.api.client.v2.model.GovernanceMitigationRequest;
import com.datadog.api.client.v2.model.GovernanceMitigationRequestAttributes;
import com.datadog.api.client.v2.model.GovernanceMitigationRequestData;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createGovernanceMitigation", true);
    GovernanceControlsApi apiInstance = new GovernanceControlsApi(defaultClient);

    GovernanceMitigationRequest body =
        new GovernanceMitigationRequest()
            .data(
                new GovernanceMitigationRequestData()
                    .attributes(
                        new GovernanceMitigationRequestAttributes()
                            .detectionIds(
                                Collections.singletonList("3f9b2c1a-8d4e-4a6b-9c2f-1e7d5a0b3c4d"))
                            .detectionType("unused_api_keys")
                            .mitigationType("revoke_api_key"))
                    .type(GovernanceControlDetectionResourceType.GOVERNANCE_CONTROL_DETECTION));

    try {
      apiInstance.createGovernanceMitigation(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling GovernanceControlsApi#createGovernanceMitigation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

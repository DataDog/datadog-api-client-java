// Update a governance control detection returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GovernanceControlsApi;
import com.datadog.api.client.v2.model.GovernanceControlDetectionResourceType;
import com.datadog.api.client.v2.model.GovernanceControlDetectionResponse;
import com.datadog.api.client.v2.model.GovernanceControlDetectionUpdateAttributes;
import com.datadog.api.client.v2.model.GovernanceControlDetectionUpdateData;
import com.datadog.api.client.v2.model.GovernanceControlDetectionUpdateRequest;
import com.datadog.api.client.v2.model.GovernanceControlDetectionUpdateState;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateGovernanceControlDetection", true);
    GovernanceControlsApi apiInstance = new GovernanceControlsApi(defaultClient);

    GovernanceControlDetectionUpdateRequest body =
        new GovernanceControlDetectionUpdateRequest()
            .data(
                new GovernanceControlDetectionUpdateData()
                    .attributes(
                        new GovernanceControlDetectionUpdateAttributes()
                            .assignedTeam("platform-security")
                            .assignedTo("11111111-2222-3333-4444-555555555555")
                            .mitigateAfter(OffsetDateTime.parse("2024-03-15T00:00:00Z"))
                            .state(GovernanceControlDetectionUpdateState.EXCEPTION))
                    .type(GovernanceControlDetectionResourceType.GOVERNANCE_CONTROL_DETECTION));

    try {
      GovernanceControlDetectionResponse result =
          apiInstance.updateGovernanceControlDetection(
              "unused_api_keys", "3f9b2c1a-8d4e-4a6b-9c2f-1e7d5a0b3c4d", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling GovernanceControlsApi#updateGovernanceControlDetection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

// Set the approval requirement for a feature flag returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.model.FeatureFlagApprovalsDataType;
import com.datadog.api.client.v2.model.FeatureFlagResponse;
import com.datadog.api.client.v2.model.UpdateFeatureFlagApprovalsAttributes;
import com.datadog.api.client.v2.model.UpdateFeatureFlagApprovalsData;
import com.datadog.api.client.v2.model.UpdateFeatureFlagApprovalsRequest;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    UpdateFeatureFlagApprovalsRequest body =
        new UpdateFeatureFlagApprovalsRequest()
            .data(
                new UpdateFeatureFlagApprovalsData()
                    .attributes(new UpdateFeatureFlagApprovalsAttributes().enabled(true))
                    .type(FeatureFlagApprovalsDataType.FEATURE_FLAG_APPROVALS));

    try {
      FeatureFlagResponse result =
          apiInstance.updateFeatureFlagApprovals(
              UUID.fromString("550e8400-e29b-41d4-a716-446655440000"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsApi#updateFeatureFlagApprovals");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

// Mute or unmute a finding returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.FindingMuteReason;
import com.datadog.api.client.v2.model.FindingType;
import com.datadog.api.client.v2.model.MuteFindingRequest;
import com.datadog.api.client.v2.model.MuteFindingRequestAttributes;
import com.datadog.api.client.v2.model.MuteFindingRequestData;
import com.datadog.api.client.v2.model.MuteFindingRequestProperties;
import com.datadog.api.client.v2.model.MuteFindingResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateFinding", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    MuteFindingRequest body =
        new MuteFindingRequest()
            .data(
                new MuteFindingRequestData()
                    .attributes(
                        new MuteFindingRequestAttributes()
                            .mute(
                                new MuteFindingRequestProperties()
                                    .description("To be resolved later")
                                    .expirationDate(1778721573794L)
                                    .muted(true)
                                    .reason(FindingMuteReason.ACCEPTED_RISK)))
                    .id("AQAAAYbb1i0gijTHEQAAAABBWWJiMWkwZ0FBQ2FuNzBJVGZXZ3B3QUE")
                    .type(FindingType.FINDING));

    try {
      MuteFindingResponse result =
          apiInstance.updateFinding(
              "AQAAAYbb1i0gijTHEQAAAABBWWJiMWkwZ0FBQ2FuNzBJVGZXZ3B3QUE", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#updateFinding");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

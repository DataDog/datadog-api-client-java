// Generate replay summary returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumReplayApi;
import com.datadog.api.client.v2.model.ReplaySummaryDataRequest;
import com.datadog.api.client.v2.model.ReplaySummaryRequest;
import com.datadog.api.client.v2.model.ReplaySummaryRequestType;
import com.datadog.api.client.v2.model.ReplaySummaryResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.generateReplaySummary", true);
    RumReplayApi apiInstance = new RumReplayApi(defaultClient);

    ReplaySummaryRequest body =
        new ReplaySummaryRequest()
            .data(
                new ReplaySummaryDataRequest()
                    .type(ReplaySummaryRequestType.REPLAY_SUMMARY_REQUEST));

    try {
      ReplaySummaryResponse result =
          apiInstance.generateReplaySummary("00000000-0000-0000-0000-000000000001", "rum", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumReplayApi#generateReplaySummary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

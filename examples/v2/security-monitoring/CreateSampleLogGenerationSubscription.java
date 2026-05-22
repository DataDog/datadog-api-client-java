// Subscribe to sample log generation returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SampleLogGenerationDuration;
import com.datadog.api.client.v2.model.SampleLogGenerationSubscriptionCreateAttributes;
import com.datadog.api.client.v2.model.SampleLogGenerationSubscriptionCreateData;
import com.datadog.api.client.v2.model.SampleLogGenerationSubscriptionCreateRequest;
import com.datadog.api.client.v2.model.SampleLogGenerationSubscriptionRequestType;
import com.datadog.api.client.v2.model.SampleLogGenerationSubscriptionResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createSampleLogGenerationSubscription", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SampleLogGenerationSubscriptionCreateRequest body =
        new SampleLogGenerationSubscriptionCreateRequest()
            .data(
                new SampleLogGenerationSubscriptionCreateData()
                    .attributes(
                        new SampleLogGenerationSubscriptionCreateAttributes()
                            .contentPackId("aws-cloudtrail")
                            .duration(SampleLogGenerationDuration.THREE_DAYS))
                    .type(SampleLogGenerationSubscriptionRequestType.SUBSCRIPTION_REQUESTS));

    try {
      SampleLogGenerationSubscriptionResponse result =
          apiInstance.createSampleLogGenerationSubscription(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#createSampleLogGenerationSubscription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

// Bulk subscribe to sample log generation returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SampleLogGenerationBulkSubscriptionAttributes;
import com.datadog.api.client.v2.model.SampleLogGenerationBulkSubscriptionData;
import com.datadog.api.client.v2.model.SampleLogGenerationBulkSubscriptionRequest;
import com.datadog.api.client.v2.model.SampleLogGenerationBulkSubscriptionRequestType;
import com.datadog.api.client.v2.model.SampleLogGenerationBulkSubscriptionResponse;
import com.datadog.api.client.v2.model.SampleLogGenerationDuration;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled(
        "v2.bulkCreateSampleLogGenerationSubscriptions", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SampleLogGenerationBulkSubscriptionRequest body =
        new SampleLogGenerationBulkSubscriptionRequest()
            .data(
                new SampleLogGenerationBulkSubscriptionData()
                    .attributes(
                        new SampleLogGenerationBulkSubscriptionAttributes()
                            .contentPackIds(Collections.singletonList("aws-cloudtrail"))
                            .duration(SampleLogGenerationDuration.THREE_DAYS))
                    .type(
                        SampleLogGenerationBulkSubscriptionRequestType.BULK_SUBSCRIPTION_REQUESTS));

    try {
      SampleLogGenerationBulkSubscriptionResponse result =
          apiInstance.bulkCreateSampleLogGenerationSubscriptions(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#bulkCreateSampleLogGenerationSubscriptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

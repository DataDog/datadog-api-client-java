// Query aggregated long tasks returns "Successful response" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumInsightsApi;
import com.datadog.api.client.v2.model.AggregatedLongTasksRequest;
import com.datadog.api.client.v2.model.AggregatedLongTasksRequestAttributes;
import com.datadog.api.client.v2.model.AggregatedLongTasksRequestData;
import com.datadog.api.client.v2.model.AggregatedLongTasksRequestType;
import com.datadog.api.client.v2.model.AggregatedLongTasksResponse;
import com.datadog.api.client.v2.model.AggregatedWaterfallPerformanceCriteria;
import com.datadog.api.client.v2.model.AggregatedWaterfallPerformanceCriteriaMetric;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.queryAggregatedLongTasks", true);
    RumInsightsApi apiInstance = new RumInsightsApi(defaultClient);

    AggregatedLongTasksRequest body =
        new AggregatedLongTasksRequest()
            .data(
                new AggregatedLongTasksRequestData()
                    .attributes(
                        new AggregatedLongTasksRequestAttributes()
                            .applicationId("ccbc53b1-74f2-496b-bdd7-9a8fa7b7376b")
                            .criteria(
                                new AggregatedWaterfallPerformanceCriteria()
                                    .max(5.0)
                                    .metric(
                                        AggregatedWaterfallPerformanceCriteriaMetric
                                            .LARGEST_CONTENTFUL_PAINT)
                                    .min(2.5))
                            .filter("@session.type:user")
                            .from(1762437564L)
                            .sampleSize(20)
                            .to(1762523964L)
                            .viewName("/account/login(/:type)"))
                    .type(AggregatedLongTasksRequestType.AGGREGATED_LONG_TASKS));

    try {
      AggregatedLongTasksResponse result = apiInstance.queryAggregatedLongTasks(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumInsightsApi#queryAggregatedLongTasks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

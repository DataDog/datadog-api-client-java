// Query aggregated waterfall returns "Successful response" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumInsightsApi;
import com.datadog.api.client.v2.model.AggregatedWaterfallPerformanceCriteria;
import com.datadog.api.client.v2.model.AggregatedWaterfallPerformanceCriteriaMetric;
import com.datadog.api.client.v2.model.AggregatedWaterfallRequest;
import com.datadog.api.client.v2.model.AggregatedWaterfallRequestAttributes;
import com.datadog.api.client.v2.model.AggregatedWaterfallRequestData;
import com.datadog.api.client.v2.model.AggregatedWaterfallRequestType;
import com.datadog.api.client.v2.model.AggregatedWaterfallResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.queryAggregatedWaterfall", true);
    RumInsightsApi apiInstance = new RumInsightsApi(defaultClient);

    AggregatedWaterfallRequest body =
        new AggregatedWaterfallRequest()
            .data(
                new AggregatedWaterfallRequestData()
                    .attributes(
                        new AggregatedWaterfallRequestAttributes()
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
                            .includeGlobalAppearance(false)
                            .sampleSize(20)
                            .to(1762523964L)
                            .viewName("/account/login(/:type)"))
                    .type(AggregatedWaterfallRequestType.AGGREGATED_WATERFALL));

    try {
      AggregatedWaterfallResponse result = apiInstance.queryAggregatedWaterfall(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumInsightsApi#queryAggregatedWaterfall");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

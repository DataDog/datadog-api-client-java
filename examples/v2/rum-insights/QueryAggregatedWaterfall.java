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
import java.time.OffsetDateTime;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.queryAggregatedWaterfall", true);
    RumInsightsApi apiInstance = new RumInsightsApi(defaultClient);

    AggregatedWaterfallRequest body =
        new AggregatedWaterfallRequest()
            .data(
                new AggregatedWaterfallRequestData()
                    .attributes(
                        new AggregatedWaterfallRequestAttributes()
                            .applicationId(UUID.fromString("ccbc53b1-74f2-496b-bdd7-9a8fa7b7376b"))
                            .criteria(
                                new AggregatedWaterfallPerformanceCriteria()
                                    .max(5.0)
                                    .metric(
                                        AggregatedWaterfallPerformanceCriteriaMetric
                                            .LARGEST_CONTENTFUL_PAINT)
                                    .min(2.5))
                            .filter("@session.type:user")
                            .from(OffsetDateTime.now().plusHours(-1).toInstant().getEpochSecond())
                            .includeGlobalAppearance(false)
                            .sampleSize(20)
                            .to(OffsetDateTime.now().toInstant().getEpochSecond())
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

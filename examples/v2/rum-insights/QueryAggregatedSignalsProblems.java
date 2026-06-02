// Query aggregated signals and problems returns "Successful response" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumInsightsApi;
import com.datadog.api.client.v2.model.AggregatedSignalsProblemsRequest;
import com.datadog.api.client.v2.model.AggregatedSignalsProblemsRequestAttributes;
import com.datadog.api.client.v2.model.AggregatedSignalsProblemsRequestData;
import com.datadog.api.client.v2.model.AggregatedSignalsProblemsRequestType;
import com.datadog.api.client.v2.model.AggregatedSignalsProblemsResponse;
import com.datadog.api.client.v2.model.AggregatedWaterfallPerformanceCriteria;
import com.datadog.api.client.v2.model.AggregatedWaterfallPerformanceCriteriaMetric;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.queryAggregatedSignalsProblems", true);
    RumInsightsApi apiInstance = new RumInsightsApi(defaultClient);

    AggregatedSignalsProblemsRequest body =
        new AggregatedSignalsProblemsRequest()
            .data(
                new AggregatedSignalsProblemsRequestData()
                    .attributes(
                        new AggregatedSignalsProblemsRequestAttributes()
                            .applicationId("ccbc53b1-74f2-496b-bdd7-9a8fa7b7376b")
                            .criteria(
                                new AggregatedWaterfallPerformanceCriteria()
                                    .max(5.0)
                                    .metric(
                                        AggregatedWaterfallPerformanceCriteriaMetric
                                            .LARGEST_CONTENTFUL_PAINT)
                                    .min(2.5))
                            .detectionTypes(
                                Arrays.asList("high_script_evaluations", "uncompressed_resources"))
                            .filter("@session.type:user")
                            .from(1762437564L)
                            .sampleSize(30)
                            .to(1762523964L)
                            .viewName("/account/login(/:type)"))
                    .type(AggregatedSignalsProblemsRequestType.AGGREGATED_SIGNALS_PROBLEMS));

    try {
      AggregatedSignalsProblemsResponse result = apiInstance.queryAggregatedSignalsProblems(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumInsightsApi#queryAggregatedSignalsProblems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

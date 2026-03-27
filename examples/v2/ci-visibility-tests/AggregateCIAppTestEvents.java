// Aggregate tests events returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CiVisibilityTestsApi;
import com.datadog.api.client.v2.model.CIAppAggregateSort;
import com.datadog.api.client.v2.model.CIAppAggregationFunction;
import com.datadog.api.client.v2.model.CIAppCompute;
import com.datadog.api.client.v2.model.CIAppComputeType;
import com.datadog.api.client.v2.model.CIAppGroupByTotal;
import com.datadog.api.client.v2.model.CIAppQueryOptions;
import com.datadog.api.client.v2.model.CIAppSortOrder;
import com.datadog.api.client.v2.model.CIAppTestsAggregateRequest;
import com.datadog.api.client.v2.model.CIAppTestsAnalyticsAggregateResponse;
import com.datadog.api.client.v2.model.CIAppTestsGroupBy;
import com.datadog.api.client.v2.model.CIAppTestsQueryFilter;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CiVisibilityTestsApi apiInstance = new CiVisibilityTestsApi(defaultClient);

    CIAppTestsAggregateRequest body =
        new CIAppTestsAggregateRequest()
            .compute(
                Collections.singletonList(
                    new CIAppCompute()
                        .aggregation(CIAppAggregationFunction.COUNT)
                        .metric("@test.is_flaky")
                        .type(CIAppComputeType.TOTAL)))
            .filter(
                new CIAppTestsQueryFilter()
                    .from("now-15m")
                    .query("@language:(python OR go)")
                    .to("now"))
            .groupBy(
                Collections.singletonList(
                    new CIAppTestsGroupBy()
                        .facet("@git.branch")
                        .limit(10L)
                        .sort(new CIAppAggregateSort().order(CIAppSortOrder.ASCENDING))
                        .total(new CIAppGroupByTotal(false))))
            .options(new CIAppQueryOptions().timezone("GMT"));

    try {
      CIAppTestsAnalyticsAggregateResponse result = apiInstance.aggregateCIAppTestEvents(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CiVisibilityTestsApi#aggregateCIAppTestEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

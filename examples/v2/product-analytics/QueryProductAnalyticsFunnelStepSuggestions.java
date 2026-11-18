// Get funnel step suggestions returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ProductAnalyticsApi;
import com.datadog.api.client.v2.model.ProductAnalyticsFunnelStepSuggestionsRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsFunnelStepSuggestionsRequestAttributes;
import com.datadog.api.client.v2.model.ProductAnalyticsFunnelStepSuggestionsRequestData;
import com.datadog.api.client.v2.model.ProductAnalyticsFunnelStepSuggestionsRequestType;
import com.datadog.api.client.v2.model.ProductAnalyticsFunnelStepSuggestionsResponse;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled(
        "v2.queryProductAnalyticsFunnelStepSuggestions", true);
    ProductAnalyticsApi apiInstance = new ProductAnalyticsApi(defaultClient);

    ProductAnalyticsFunnelStepSuggestionsRequest body =
        new ProductAnalyticsFunnelStepSuggestionsRequest()
            .data(
                new ProductAnalyticsFunnelStepSuggestionsRequestData()
                    .attributes(
                        new ProductAnalyticsFunnelStepSuggestionsRequestAttributes()
                            .applicationId("40d8ca4b-2ac0-481f-b16e-f110699ecff6")
                            .expression("node_01->node_02")
                            .steps(
                                Map.ofEntries(
                                    Map.entry("node_01", "@type:view @view.name:/checkout"),
                                    Map.entry("node_02", "@type:action @action.name:pay"))))
                    .type(
                        ProductAnalyticsFunnelStepSuggestionsRequestType
                            .FUNNEL_SUGGESTIONS_STEPS_REQUEST));

    try {
      ProductAnalyticsFunnelStepSuggestionsResponse result =
          apiInstance.queryProductAnalyticsFunnelStepSuggestions(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ProductAnalyticsApi#queryProductAnalyticsFunnelStepSuggestions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

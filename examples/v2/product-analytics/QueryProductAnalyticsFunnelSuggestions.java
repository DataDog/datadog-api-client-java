// Get feature suggestions returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ProductAnalyticsApi;
import com.datadog.api.client.v2.model.ProductAnalyticsFunnelSuggestionsRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsFunnelSuggestionsRequestAttributes;
import com.datadog.api.client.v2.model.ProductAnalyticsFunnelSuggestionsRequestData;
import com.datadog.api.client.v2.model.ProductAnalyticsFunnelSuggestionsRequestType;
import com.datadog.api.client.v2.model.ProductAnalyticsFunnelSuggestionsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.queryProductAnalyticsFunnelSuggestions", true);
    ProductAnalyticsApi apiInstance = new ProductAnalyticsApi(defaultClient);

    ProductAnalyticsFunnelSuggestionsRequest body =
        new ProductAnalyticsFunnelSuggestionsRequest()
            .data(
                new ProductAnalyticsFunnelSuggestionsRequestData()
                    .attributes(
                        new ProductAnalyticsFunnelSuggestionsRequestAttributes()
                            .applicationId("40d8ca4b-2ac0-481f-b16e-f110699ecff6"))
                    .type(ProductAnalyticsFunnelSuggestionsRequestType.FUNNEL_SUGGESTIONS_REQUEST));

    try {
      ProductAnalyticsFunnelSuggestionsResponse result =
          apiInstance.queryProductAnalyticsFunnelSuggestions(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ProductAnalyticsApi#queryProductAnalyticsFunnelSuggestions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

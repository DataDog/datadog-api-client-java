// Get SPA recommendations v2 returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SpaApi;
import com.datadog.api.client.v2.model.RecommendationDocument;
import com.datadog.api.client.v2.model.RecommendationV2RequestAttributes;
import com.datadog.api.client.v2.model.RecommendationV2RequestBody;
import com.datadog.api.client.v2.model.RecommendationV2RequestData;
import com.datadog.api.client.v2.model.RecommendationV2RequestType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getSPARecommendationsV2", true);
    SpaApi apiInstance = new SpaApi(defaultClient);

    RecommendationV2RequestBody body =
        new RecommendationV2RequestBody()
            .data(
                new RecommendationV2RequestData()
                    .attributes(
                        new RecommendationV2RequestAttributes()
                            .arguments(Collections.singletonList("")))
                    .type(RecommendationV2RequestType.RECOMMENDATION_V2_REQUEST));

    try {
      RecommendationDocument result = apiInstance.getSPARecommendationsV2("service", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpaApi#getSPARecommendationsV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

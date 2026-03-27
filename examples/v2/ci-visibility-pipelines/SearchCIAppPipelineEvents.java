// Search pipelines events returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CiVisibilityPipelinesApi;
import com.datadog.api.client.v2.api.CiVisibilityPipelinesApi.SearchCIAppPipelineEventsOptionalParameters;
import com.datadog.api.client.v2.model.CIAppPipelineEventsRequest;
import com.datadog.api.client.v2.model.CIAppPipelineEventsResponse;
import com.datadog.api.client.v2.model.CIAppPipelinesQueryFilter;
import com.datadog.api.client.v2.model.CIAppQueryOptions;
import com.datadog.api.client.v2.model.CIAppQueryPageOptions;
import com.datadog.api.client.v2.model.CIAppSort;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CiVisibilityPipelinesApi apiInstance = new CiVisibilityPipelinesApi(defaultClient);

    CIAppPipelineEventsRequest body =
        new CIAppPipelineEventsRequest()
            .filter(
                new CIAppPipelinesQueryFilter()
                    .from("now-15m")
                    .query("@ci.provider.name:github AND @ci.status:error")
                    .to("now"))
            .options(new CIAppQueryOptions().timezone("GMT"))
            .page(new CIAppQueryPageOptions().limit(5))
            .sort(CIAppSort.TIMESTAMP_ASCENDING);

    try {
      CIAppPipelineEventsResponse result =
          apiInstance.searchCIAppPipelineEvents(
              new SearchCIAppPipelineEventsOptionalParameters().body(body));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CiVisibilityPipelinesApi#searchCIAppPipelineEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

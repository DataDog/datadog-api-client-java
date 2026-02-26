// Search pipelines events returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.CiVisibilityPipelinesApi;
import com.datadog.api.client.v2.api.CiVisibilityPipelinesApi.SearchCIAppPipelineEventsOptionalParameters;
import com.datadog.api.client.v2.model.CIAppPipelineEvent;
import com.datadog.api.client.v2.model.CIAppPipelineEventsRequest;
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
            .filter(new CIAppPipelinesQueryFilter().from("now-30s").to("now"))
            .options(new CIAppQueryOptions().timezone("GMT"))
            .page(new CIAppQueryPageOptions().limit(2))
            .sort(CIAppSort.TIMESTAMP_ASCENDING);

    try {
      PaginationIterable<CIAppPipelineEvent> iterable =
          apiInstance.searchCIAppPipelineEventsWithPagination(
              new SearchCIAppPipelineEventsOptionalParameters().body(body));

      for (CIAppPipelineEvent item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling"
              + " CiVisibilityPipelinesApi#searchCIAppPipelineEventsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}

// Get a list of pipelines events returns "OK" response with pagination
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.CiVisibilityPipelinesApi;
import com.datadog.api.client.v2.api.CiVisibilityPipelinesApi.ListCIAppPipelineEventsOptionalParameters;
import com.datadog.api.client.v2.model.CIAppPipelineEvent;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CiVisibilityPipelinesApi apiInstance = new CiVisibilityPipelinesApi(defaultClient);

    try {
      PaginationIterable<CIAppPipelineEvent> iterable =
          apiInstance.listCIAppPipelineEventsWithPagination(
              new ListCIAppPipelineEventsOptionalParameters()
                  .filterFrom(OffsetDateTime.now().plusSeconds(-30))
                  .filterTo(OffsetDateTime.now())
                  .pageLimit(2));

      for (CIAppPipelineEvent item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling CiVisibilityPipelinesApi#listCIAppPipelineEventsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}

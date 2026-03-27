// Search tests events returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CiVisibilityTestsApi;
import com.datadog.api.client.v2.api.CiVisibilityTestsApi.SearchCIAppTestEventsOptionalParameters;
import com.datadog.api.client.v2.model.CIAppQueryOptions;
import com.datadog.api.client.v2.model.CIAppQueryPageOptions;
import com.datadog.api.client.v2.model.CIAppSort;
import com.datadog.api.client.v2.model.CIAppTestEventsRequest;
import com.datadog.api.client.v2.model.CIAppTestEventsResponse;
import com.datadog.api.client.v2.model.CIAppTestsQueryFilter;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CiVisibilityTestsApi apiInstance = new CiVisibilityTestsApi(defaultClient);

    CIAppTestEventsRequest body =
        new CIAppTestEventsRequest()
            .filter(
                new CIAppTestsQueryFilter()
                    .from("now-15m")
                    .query("@test.service:web-ui-tests AND @test.status:skip")
                    .to("now"))
            .options(new CIAppQueryOptions().timezone("GMT"))
            .page(new CIAppQueryPageOptions().limit(25))
            .sort(CIAppSort.TIMESTAMP_ASCENDING);

    try {
      CIAppTestEventsResponse result =
          apiInstance.searchCIAppTestEvents(
              new SearchCIAppTestEventsOptionalParameters().body(body));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CiVisibilityTestsApi#searchCIAppTestEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

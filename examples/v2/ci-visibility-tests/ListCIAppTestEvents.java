// Get a list of tests events returns "OK" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CiVisibilityTestsApi;
import com.datadog.api.client.v2.api.CiVisibilityTestsApi.ListCIAppTestEventsOptionalParameters;
import com.datadog.api.client.v2.model.CIAppTestEventsResponse;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CiVisibilityTestsApi apiInstance = new CiVisibilityTestsApi(defaultClient);

    try {
      CIAppTestEventsResponse result =
          apiInstance.listCIAppTestEvents(
              new ListCIAppTestEventsOptionalParameters()
                  .filterQuery("@test.service:web-ui-tests")
                  .filterFrom(OffsetDateTime.now().plusSeconds(-30))
                  .filterTo(OffsetDateTime.now())
                  .pageLimit(5));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CiVisibilityTestsApi#listCIAppTestEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.IncidentsApi;
import com.datadog.api.v2.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    List<IncidentRelatedObject> include =
        Arrays.asList(); // List<IncidentRelatedObject> | Specifies which types of related objects
    // should be included in the response.
    Long pageSize = 10L; // Long | Size for a given page.
    Long pageOffset = 0L; // Long | Specific offset to use as the beginning of the returned page.
    try {
      IncidentsResponse result =
          apiInstance.listIncidents(
              new IncidentsApi.ListIncidentsOptionalParameters()
                  .include(include)
                  .pageSize(pageSize)
                  .pageOffset(pageOffset));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#listIncidents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

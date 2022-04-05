import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.IncidentTeamsApi;
import com.datadog.api.v2.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    IncidentTeamsApi apiInstance = new IncidentTeamsApi(defaultClient);
    IncidentRelatedObject include =
        IncidentRelatedObject.fromValue(
            "users"); // IncidentRelatedObject | Specifies which types of related objects should be
    // included in the response.
    Long pageSize = 10L; // Long | Size for a given page.
    Long pageOffset = 0L; // Long | Specific offset to use as the beginning of the returned page.
    String filter = "ExampleTeamName"; // String | A search query that filters teams by name.
    try {
      IncidentTeamsResponse result =
          apiInstance.listIncidentTeams(
              new IncidentTeamsApi.ListIncidentTeamsOptionalParameters()
                  .include(include)
                  .pageSize(pageSize)
                  .pageOffset(pageOffset)
                  .filter(filter));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentTeamsApi#listIncidentTeams");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

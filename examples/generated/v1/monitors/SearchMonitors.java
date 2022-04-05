import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.MonitorsApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    MonitorsApi apiInstance = new MonitorsApi(defaultClient);
    String query =
        "query_example"; // String | After entering a search query in your [Manage Monitor page][1]
                         // use the query parameter value in the URL of the page as value for this
                         // parameter. Consult the dedicated [manage monitor documentation][2] page
                         // to learn more.  The query can contain any number of space-separated
                         // monitor attributes, for instance `query=\"type:metric status:alert\"`.
                         // [1]: https://app.datadoghq.com/monitors/manage [2]:
                         // /monitors/manage/#find-the-monitors
    Long page = 0L; // Long | Page to start paginating from.
    Long perPage = 30L; // Long | Number of monitors to return per page.
    String sort =
        "sort_example"; // String | String for sort order, composed of field and sort order separate
                        // by a comma, for example `name,asc`. Supported sort directions: `asc`,
                        // `desc`. Supported fields:  * `name` * `status` * `tags`
    try {
      MonitorSearchResponse result =
          apiInstance.searchMonitors(
              new MonitorsApi.SearchMonitorsOptionalParameters()
                  .query(query)
                  .page(page)
                  .perPage(perPage)
                  .sort(sort));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#searchMonitors");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

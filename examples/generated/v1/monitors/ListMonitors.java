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
    String groupStates =
        "alert"; // String | When specified, shows additional information about the group states.
                 // Choose one or more from `all`, `alert`, `warn`, and `no data`.
    String name = "name_example"; // String | A string to filter monitors by name.
    String tags =
        "host:host0"; // String | A comma separated list indicating what tags, if any, should be
                      // used to filter the list of monitors by scope. For example, `host:host0`.
    String monitorTags =
        "service:my-app"; // String | A comma separated list indicating what service and/or custom
                          // tags, if any, should be used to filter the list of monitors. Tags
                          // created in the Datadog UI automatically have the service key prepended.
                          // For example, `service:my-app`.
    Boolean withDowntimes =
        true; // Boolean | If this argument is set to true, then the returned data includes all
              // current active downtimes for each monitor.
    Long idOffset =
        56L; // Long | Use this parameter for paginating through large sets of monitors. Start with
             // a value of zero, make a request, set the value to the last ID of result set, and
             // then repeat until the response is empty.
    Long page =
        0L; // Long | The page to start paginating from. If this argument is not specified, the
            // request returns all monitors without pagination.
    Integer pageSize =
        20; // Integer | The number of monitors to return per page. If the page argument is not
            // specified, the default behavior returns all monitors without a `page_size` limit.
            // However, if page is specified and `page_size` is not, the argument defaults to 100.
    try {
      List<Monitor> result =
          apiInstance.listMonitors(
              new MonitorsApi.ListMonitorsOptionalParameters()
                  .groupStates(groupStates)
                  .name(name)
                  .tags(tags)
                  .monitorTags(monitorTags)
                  .withDowntimes(withDowntimes)
                  .idOffset(idOffset)
                  .page(page)
                  .pageSize(pageSize));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#listMonitors");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

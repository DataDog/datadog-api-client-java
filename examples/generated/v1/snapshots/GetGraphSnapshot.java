import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.SnapshotsApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    SnapshotsApi apiInstance = new SnapshotsApi(defaultClient);
    Long start = 56L; // Long | The POSIX timestamp of the start of the query.
    Long end = 56L; // Long | The POSIX timestamp of the end of the query.
    String metricQuery = "metricQuery_example"; // String | The metric query.
    String eventQuery =
        "eventQuery_example"; // String | A query that adds event bands to the graph.
    String graphDef =
        "graphDef_example"; // String | A JSON document defining the graph. `graph_def` can be used
    // instead of `metric_query`. The JSON document uses the [grammar
    // defined
    // here](https://docs.datadoghq.com/graphing/graphing_json/#grammar) and
    // should be formatted to a single line then URL encoded.
    String title =
        "title_example"; // String | A title for the graph. If no title is specified, the graph does
    // not have a title.
    try {
      GraphSnapshot result =
          apiInstance.getGraphSnapshot(
              start,
              end,
              new SnapshotsApi.GetGraphSnapshotOptionalParameters()
                  .metricQuery(metricQuery)
                  .eventQuery(eventQuery)
                  .graphDef(graphDef)
                  .title(title));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotsApi#getGraphSnapshot");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

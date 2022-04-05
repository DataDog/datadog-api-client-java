import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.ProcessesApi;
import com.datadog.api.v2.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    ProcessesApi apiInstance = new ProcessesApi(defaultClient);
    String search = "search_example"; // String | String to search processes by.
    String tags =
        "account:prod,user:admin"; // String | Comma-separated list of tags to filter processes by.
    Long from =
        56L; // Long | Unix timestamp (number of seconds since epoch) of the start of the query
             // window. If not provided, the start of the query window will be 15 minutes before the
             // `to` timestamp. If neither `from` nor `to` are provided, the query window will be
             // `[now - 15m, now]`.
    Long to =
        56L; // Long | Unix timestamp (number of seconds since epoch) of the end of the query
             // window. If not provided, the end of the query window will be 15 minutes after the
             // `from` timestamp. If neither `from` nor `to` are provided, the query window will be
             // `[now - 15m, now]`.
    Integer pageLimit = 1000; // Integer | Maximum number of results returned.
    String pageCursor =
        "pageCursor_example"; // String | String to query the next page of results. This key is
                              // provided with each valid response from the API in
                              // `meta.page.after`.
    try {
      ProcessSummariesResponse result =
          apiInstance.listProcesses(
              new ProcessesApi.ListProcessesOptionalParameters()
                  .search(search)
                  .tags(tags)
                  .from(from)
                  .to(to)
                  .pageLimit(pageLimit)
                  .pageCursor(pageCursor));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessesApi#listProcesses");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

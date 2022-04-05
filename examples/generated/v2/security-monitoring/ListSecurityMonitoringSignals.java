import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;
import com.datadog.api.v2.client.model.*;
import java.time.OffsetDateTime;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
    String filterQuery =
        "security:attack status:high"; // String | The search query for security signals.
    OffsetDateTime filterFrom =
        OffsetDateTime.parse(
            "2019-01-02T09:42:36.320Z"); // OffsetDateTime | The minimum timestamp for requested
                                         // security signals.
    OffsetDateTime filterTo =
        OffsetDateTime.parse(
            "2019-01-03T09:42:36.320Z"); // OffsetDateTime | The maximum timestamp for requested
                                         // security signals.
    SecurityMonitoringSignalsSort sort =
        SecurityMonitoringSignalsSort.fromValue(
            "timestamp"); // SecurityMonitoringSignalsSort | The order of the security signals in
    // results.
    String pageCursor =
        "eyJzdGFydEF0IjoiQVFBQUFYS2tMS3pPbm40NGV3QUFBQUJCV0V0clRFdDZVbG8zY3pCRmNsbHJiVmxDWlEifQ=="; // String | A list of results using the cursor provided in the previous query.
    Integer pageLimit = 10; // Integer | The maximum number of security signals in the response.
    try {
      SecurityMonitoringSignalsListResponse result =
          apiInstance.listSecurityMonitoringSignals(
              new SecurityMonitoringApi.ListSecurityMonitoringSignalsOptionalParameters()
                  .filterQuery(filterQuery)
                  .filterFrom(filterFrom)
                  .filterTo(filterTo)
                  .sort(sort)
                  .pageCursor(pageCursor)
                  .pageLimit(pageLimit));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#listSecurityMonitoringSignals");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

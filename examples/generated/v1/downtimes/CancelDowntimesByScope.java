import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DowntimesApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    DowntimesApi apiInstance = new DowntimesApi(defaultClient);
    CancelDowntimesByScopeRequest body =
        new CancelDowntimesByScopeRequest(); // CancelDowntimesByScopeRequest | Scope to cancel
                                             // downtimes for.
    try {
      CanceledDowntimesIds result = apiInstance.cancelDowntimesByScope(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#cancelDowntimesByScope");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

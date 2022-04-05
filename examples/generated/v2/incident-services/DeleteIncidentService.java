import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.IncidentServicesApi;
import com.datadog.api.v2.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    IncidentServicesApi apiInstance = new IncidentServicesApi(defaultClient);
    String serviceId = "serviceId_example"; // String | The ID of the incident service.
    try {
      apiInstance.deleteIncidentService(serviceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentServicesApi#deleteIncidentService");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

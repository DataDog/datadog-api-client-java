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
    IncidentServiceCreateRequest body =
        new IncidentServiceCreateRequest(); // IncidentServiceCreateRequest | Incident Service
                                            // Payload.
    try {
      IncidentServiceResponse result = apiInstance.createIncidentService(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentServicesApi#createIncidentService");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

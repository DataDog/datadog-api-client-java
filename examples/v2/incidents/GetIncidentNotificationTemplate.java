// Get incident notification template returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentNotificationTemplate;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getIncidentNotificationTemplate", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "notification_template" in the system
    UUID NOTIFICATION_TEMPLATE_DATA_ID = null;
    try {
      NOTIFICATION_TEMPLATE_DATA_ID =
          UUID.fromString(System.getenv("NOTIFICATION_TEMPLATE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    try {
      IncidentNotificationTemplate result =
          apiInstance.getIncidentNotificationTemplate(NOTIFICATION_TEMPLATE_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#getIncidentNotificationTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

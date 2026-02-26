// Update global incident settings returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.GlobalIncidentSettingsResponse;
import com.datadog.api.client.v2.model.GlobalIncidentSettingsAttributesRequest;
import com.datadog.api.client.v2.model.GlobalIncidentSettingsDataRequest;
import com.datadog.api.client.v2.model.GlobalIncidentSettingsRequest;
import com.datadog.api.client.v2.model.GlobalIncidentSettingsType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateGlobalIncidentSettings", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    GlobalIncidentSettingsRequest body = new GlobalIncidentSettingsRequest()
.data(new GlobalIncidentSettingsDataRequest()
.attributes(new GlobalIncidentSettingsAttributesRequest()
.analyticsDashboardId("abc-123-def"))
.type(GlobalIncidentSettingsType.INCIDENTS_GLOBAL_SETTINGS));

    try {
      GlobalIncidentSettingsResponse result = apiInstance.updateGlobalIncidentSettings(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateGlobalIncidentSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
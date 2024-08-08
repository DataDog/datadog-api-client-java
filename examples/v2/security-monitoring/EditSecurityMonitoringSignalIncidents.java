// Change the related incidents of a security signal returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalTriageUpdateResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalIncidentsUpdateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalIncidentsUpdateData;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalIncidentsUpdateRequest;
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
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringSignalIncidentsUpdateRequest body = new SecurityMonitoringSignalIncidentsUpdateRequest()
.data(new SecurityMonitoringSignalIncidentsUpdateData()
.attributes(new SecurityMonitoringSignalIncidentsUpdateAttributes()
.incidentIds(Collections.singletonList(2066L))));

    try {
      SecurityMonitoringSignalTriageUpdateResponse result = apiInstance.editSecurityMonitoringSignalIncidents("AQAAAYG1bl5K4HuUewAAAABBWUcxYmw1S0FBQmt2RmhRN0V4ZUVnQUE", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#editSecurityMonitoringSignalIncidents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
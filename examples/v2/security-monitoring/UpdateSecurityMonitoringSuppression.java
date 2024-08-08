// Update a suppression rule returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionType;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionUpdateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionUpdateData;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionUpdateRequest;
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

    // there is a valid "suppression" in the system
    String SUPPRESSION_DATA_ID = System.getenv("SUPPRESSION_DATA_ID");

    SecurityMonitoringSuppressionUpdateRequest body = new SecurityMonitoringSuppressionUpdateRequest()
.data(new SecurityMonitoringSuppressionUpdateData()
.attributes(new SecurityMonitoringSuppressionUpdateAttributes()
.suppressionQuery("env:staging status:low"))
.type(SecurityMonitoringSuppressionType.SUPPRESSIONS));

    try {
      SecurityMonitoringSuppressionResponse result = apiInstance.updateSecurityMonitoringSuppression(SUPPRESSION_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#updateSecurityMonitoringSuppression");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
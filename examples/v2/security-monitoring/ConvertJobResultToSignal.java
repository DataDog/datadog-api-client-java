// Convert a job result to a signal returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.ConvertJobResultsToSignalsAttributes;
import com.datadog.api.client.v2.model.ConvertJobResultsToSignalsData;
import com.datadog.api.client.v2.model.ConvertJobResultsToSignalsDataType;
import com.datadog.api.client.v2.model.ConvertJobResultsToSignalsRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSeverity;
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
    defaultClient.setUnstableOperationEnabled("v2.convertJobResultToSignal", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    ConvertJobResultsToSignalsRequest body = new ConvertJobResultsToSignalsRequest()
.data(new ConvertJobResultsToSignalsData()
.attributes(new ConvertJobResultsToSignalsAttributes()
.jobResultIds(Collections.singletonList(""))
.notifications(Collections.singletonList(""))
.signalMessage("A large number of failed login attempts.")
.signalSeverity(SecurityMonitoringRuleSeverity.CRITICAL))
.type(ConvertJobResultsToSignalsDataType.HISTORICALDETECTIONSJOBRESULTSIGNALCONVERSION));

    try {
      apiInstance.convertJobResultToSignal(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#convertJobResultToSignal");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
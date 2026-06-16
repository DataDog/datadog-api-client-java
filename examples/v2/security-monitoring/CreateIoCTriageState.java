// Create or update an indicator triage state returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.IoCTriageState;
import com.datadog.api.client.v2.model.IoCTriageWriteRequest;
import com.datadog.api.client.v2.model.IoCTriageWriteRequestAttributes;
import com.datadog.api.client.v2.model.IoCTriageWriteRequestData;
import com.datadog.api.client.v2.model.IoCTriageWriteResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIoCTriageState", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    IoCTriageWriteRequest body =
        new IoCTriageWriteRequest()
            .data(
                new IoCTriageWriteRequestData()
                    .attributes(
                        new IoCTriageWriteRequestAttributes()
                            .indicator("192.0.2.1")
                            .triageState(IoCTriageState.REVIEWED))
                    .type("ioc_triage_state"));

    try {
      IoCTriageWriteResponse result = apiInstance.createIoCTriageState(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#createIoCTriageState");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

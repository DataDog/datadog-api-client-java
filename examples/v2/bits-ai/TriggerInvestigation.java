// Trigger a Bits AI investigation returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.BitsAiApi;
import com.datadog.api.client.v2.model.MonitorAlertTriggerAttributes;
import com.datadog.api.client.v2.model.TriggerAttributes;
import com.datadog.api.client.v2.model.TriggerInvestigationRequest;
import com.datadog.api.client.v2.model.TriggerInvestigationRequestData;
import com.datadog.api.client.v2.model.TriggerInvestigationRequestDataAttributes;
import com.datadog.api.client.v2.model.TriggerInvestigationRequestType;
import com.datadog.api.client.v2.model.TriggerInvestigationResponse;
import com.datadog.api.client.v2.model.TriggerType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.triggerInvestigation", true);
    BitsAiApi apiInstance = new BitsAiApi(defaultClient);

    TriggerInvestigationRequest body =
        new TriggerInvestigationRequest()
            .data(
                new TriggerInvestigationRequestData()
                    .attributes(
                        new TriggerInvestigationRequestDataAttributes()
                            .trigger(
                                new TriggerAttributes()
                                    .monitorAlertTrigger(
                                        new MonitorAlertTriggerAttributes()
                                            .eventId("1234567890123456789")
                                            .eventTs(1700000000000L)
                                            .monitorId(12345678L))
                                    .type(TriggerType.MONITOR_ALERT_TRIGGER)))
                    .type(TriggerInvestigationRequestType.TRIGGER_INVESTIGATION_REQUEST));

    try {
      TriggerInvestigationResponse result = apiInstance.triggerInvestigation(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BitsAiApi#triggerInvestigation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

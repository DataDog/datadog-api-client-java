// Reorder the list of inbox rules in the pipeline returns "The list of inbox rules" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.InboxRulesType;
import com.datadog.api.client.v2.model.ReorderInboxRulesParameters;
import com.datadog.api.client.v2.model.ReorderInboxRulesParametersData;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    ReorderInboxRulesParameters body =
        new ReorderInboxRulesParameters()
            .data(
                Collections.singletonList(
                    new ReorderInboxRulesParametersData()
                        .id(UUID.fromString("123e4567-e89b-12d3-a456-426655440000"))
                        .type(InboxRulesType.INBOX_RULES)));

    try {
      apiInstance.reorderInboxRules(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#reorderInboxRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

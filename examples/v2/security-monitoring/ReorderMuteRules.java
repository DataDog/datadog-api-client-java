// Reorder the list of mute rules in the pipeline returns "The list of mute rules" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.MuteRulesType;
import com.datadog.api.client.v2.model.ReorderMuteRulesParameters;
import com.datadog.api.client.v2.model.ReorderMuteRulesParametersData;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    ReorderMuteRulesParameters body =
        new ReorderMuteRulesParameters()
            .data(
                Collections.singletonList(
                    new ReorderMuteRulesParametersData()
                        .id(UUID.fromString("123e4567-e89b-12d3-a456-426655440000"))
                        .type(MuteRulesType.MUTE_RULES)));

    try {
      apiInstance.reorderMuteRules(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#reorderMuteRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

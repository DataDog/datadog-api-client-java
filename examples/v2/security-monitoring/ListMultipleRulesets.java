// Ruleset get multiple returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.GetMultipleRulesetsRequest;
import com.datadog.api.client.v2.model.GetMultipleRulesetsRequestData;
import com.datadog.api.client.v2.model.GetMultipleRulesetsRequestDataAttributes;
import com.datadog.api.client.v2.model.GetMultipleRulesetsRequestDataType;
import com.datadog.api.client.v2.model.GetMultipleRulesetsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listMultipleRulesets", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    GetMultipleRulesetsRequest body =
        new GetMultipleRulesetsRequest()
            .data(
                new GetMultipleRulesetsRequestData()
                    .attributes(new GetMultipleRulesetsRequestDataAttributes())
                    .type(GetMultipleRulesetsRequestDataType.GET_MULTIPLE_RULESETS_REQUEST));

    try {
      GetMultipleRulesetsResponse result = apiInstance.listMultipleRulesets(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#listMultipleRulesets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

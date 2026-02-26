// Create Custom Rule returns "Successfully created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StaticAnalysisApi;
import com.datadog.api.client.v2.model.CustomRuleDataType;
import com.datadog.api.client.v2.model.CustomRuleRequest;
import com.datadog.api.client.v2.model.CustomRuleRequestData;
import com.datadog.api.client.v2.model.CustomRuleRequestDataAttributes;
import com.datadog.api.client.v2.model.CustomRuleResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createCustomRule", true);
    StaticAnalysisApi apiInstance = new StaticAnalysisApi(defaultClient);

    CustomRuleRequest body =
        new CustomRuleRequest()
            .data(
                new CustomRuleRequestData()
                    .attributes(new CustomRuleRequestDataAttributes())
                    .type(CustomRuleDataType.CUSTOM_RULE));

    try {
      CustomRuleResponse result = apiInstance.createCustomRule("ruleset_name", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticAnalysisApi#createCustomRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

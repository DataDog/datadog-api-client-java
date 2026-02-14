// Set up rules for organization returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ServiceScorecardsApi;
import com.datadog.api.client.v2.model.SetupRulesRequest;
import com.datadog.api.client.v2.model.SetupRulesRequestAttributes;
import com.datadog.api.client.v2.model.SetupRulesRequestData;
import com.datadog.api.client.v2.model.SetupRulesRequestDataType;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.setupScorecardRules", true);
    ServiceScorecardsApi apiInstance = new ServiceScorecardsApi(defaultClient);

    SetupRulesRequest body =
        new SetupRulesRequest()
            .data(
                new SetupRulesRequestData()
                    .attributes(
                        new SetupRulesRequestAttributes()
                            .disabledDefaultRules(
                                Arrays.asList("q8MQxk8TCqrHnWkx", "r9NRyl9UDrsIoXly")))
                    .type(SetupRulesRequestDataType.SETUP));

    try {
      apiInstance.setupScorecardRules(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceScorecardsApi#setupScorecardRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

// List LLM integration accounts returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsIntegrationAccount;
import com.datadog.api.client.v2.model.LLMObsIntegrationName;
import java.util.List;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listLLMObsIntegrationAccounts", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    try {
      List<LLMObsIntegrationAccount> result =
          apiInstance.listLLMObsIntegrationAccounts(LLMObsIntegrationName.OPENAI);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling LlmObservabilityApi#listLLMObsIntegrationAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

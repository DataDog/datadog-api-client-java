// Create or update a patterns configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsPatternsConfigResponse;
import com.datadog.api.client.v2.model.LLMObsPatternsConfigType;
import com.datadog.api.client.v2.model.LLMObsPatternsConfigUpsertRequest;
import com.datadog.api.client.v2.model.LLMObsPatternsConfigUpsertRequestAttributes;
import com.datadog.api.client.v2.model.LLMObsPatternsConfigUpsertRequestData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.upsertLLMObsPatternsConfig", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsPatternsConfigUpsertRequest body =
        new LLMObsPatternsConfigUpsertRequest()
            .data(
                new LLMObsPatternsConfigUpsertRequestData()
                    .attributes(
                        new LLMObsPatternsConfigUpsertRequestAttributes()
                            .accountId("1000000001")
                            .configId("a7c8d9e0-1234-5678-9abc-def012345678")
                            .evpQuery("@ml_app:support-bot")
                            .hierarchyDepth(2)
                            .integrationProvider("openai")
                            .modelName("gpt-4o")
                            .name("Support chatbot topics")
                            .numRecords(1000)
                            .samplingRatio(0.1)
                            .scope("")
                            .template(""))
                    .type(LLMObsPatternsConfigType.TOPIC_DISCOVERY_CONFIGS));

    try {
      LLMObsPatternsConfigResponse result = apiInstance.upsertLLMObsPatternsConfig(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#upsertLLMObsPatternsConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

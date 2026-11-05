// Add a model to an AI Gateway provider returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayModelCatalogEntryResponse;
import com.datadog.api.client.v2.model.AiGatewayModelCatalogEntryType;
import com.datadog.api.client.v2.model.AiGatewayModelCreateAttributes;
import com.datadog.api.client.v2.model.AiGatewayModelCreateData;
import com.datadog.api.client.v2.model.AiGatewayModelCreateRequest;
import com.datadog.api.client.v2.model.AiGatewaySupportedOperation;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createAiGatewayModel", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    AiGatewayModelCreateRequest body =
        new AiGatewayModelCreateRequest()
            .data(
                new AiGatewayModelCreateData()
                    .attributes(
                        new AiGatewayModelCreateAttributes()
                            .modelIdCanonical("gpt-5.2-codex")
                            .modelIdWire("gpt-5.2-codex-20260801")
                            .supportedOperations(
                                Collections.singletonList(
                                    AiGatewaySupportedOperation.OPENAI_CHAT_COMPLETIONS)))
                    .type(AiGatewayModelCatalogEntryType.MODEL_CATALOG_ENTRIES));

    try {
      AiGatewayModelCatalogEntryResponse result = apiInstance.createAiGatewayModel(42L, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#createAiGatewayModel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

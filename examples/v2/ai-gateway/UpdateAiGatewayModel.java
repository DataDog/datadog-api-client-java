// Update a model for an AI Gateway provider returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayModelCatalogEntryResponse;
import com.datadog.api.client.v2.model.AiGatewayModelCatalogEntryType;
import com.datadog.api.client.v2.model.AiGatewayModelUpdateAttributes;
import com.datadog.api.client.v2.model.AiGatewayModelUpdateData;
import com.datadog.api.client.v2.model.AiGatewayModelUpdateRequest;
import com.datadog.api.client.v2.model.AiGatewaySupportedOperation;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateAiGatewayModel", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    AiGatewayModelUpdateRequest body =
        new AiGatewayModelUpdateRequest()
            .data(
                new AiGatewayModelUpdateData()
                    .attributes(
                        new AiGatewayModelUpdateAttributes()
                            .modelIdWire("gpt-5.2-codex-20260801")
                            .supportedOperations(
                                Collections.singletonList(
                                    AiGatewaySupportedOperation.OPENAI_CHAT_COMPLETIONS)))
                    .id("101")
                    .type(AiGatewayModelCatalogEntryType.MODEL_CATALOG_ENTRIES));

    try {
      AiGatewayModelCatalogEntryResponse result =
          apiInstance.updateAiGatewayModel(42L, "gpt-5.2-codex", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#updateAiGatewayModel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

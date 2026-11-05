// Add multiple models to an AI Gateway provider returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayModelCatalogEntryListResponse;
import com.datadog.api.client.v2.model.AiGatewayModelCatalogEntryType;
import com.datadog.api.client.v2.model.AiGatewayModelCreateAttributes;
import com.datadog.api.client.v2.model.AiGatewayModelsBulkCreateAttributes;
import com.datadog.api.client.v2.model.AiGatewayModelsBulkCreateData;
import com.datadog.api.client.v2.model.AiGatewayModelsBulkCreateRequest;
import com.datadog.api.client.v2.model.AiGatewaySupportedOperation;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.bulkCreateAiGatewayModels", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    AiGatewayModelsBulkCreateRequest body =
        new AiGatewayModelsBulkCreateRequest()
            .data(
                new AiGatewayModelsBulkCreateData()
                    .attributes(
                        new AiGatewayModelsBulkCreateAttributes()
                            .models(
                                Collections.singletonList(
                                    new AiGatewayModelCreateAttributes()
                                        .modelIdCanonical("gpt-5.2-codex")
                                        .modelIdWire("gpt-5.2-codex-20260801")
                                        .supportedOperations(
                                            Collections.singletonList(
                                                AiGatewaySupportedOperation
                                                    .OPENAI_CHAT_COMPLETIONS)))))
                    .type(AiGatewayModelCatalogEntryType.MODEL_CATALOG_ENTRIES));

    try {
      AiGatewayModelCatalogEntryListResponse result =
          apiInstance.bulkCreateAiGatewayModels(42L, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#bulkCreateAiGatewayModels");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

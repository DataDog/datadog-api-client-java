// Delete an AI Gateway data capture override returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayCaptureDeleteRequest;
import com.datadog.api.client.v2.model.AiGatewayCaptureDeleteRequestData;
import com.datadog.api.client.v2.model.AiGatewayCaptureDeleteRequestDataAttributes;
import com.datadog.api.client.v2.model.AiGatewayCaptureDeleteRequestDataAttributesMode;
import com.datadog.api.client.v2.model.AiGatewayCaptureDeleteRequestDataAttributesOperation;
import com.datadog.api.client.v2.model.AiGatewayCaptureDeleteRequestDataType;
import com.datadog.api.client.v2.model.AiGatewayCaptureScope;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.deleteAiGatewayDataCaptureOverride", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    AiGatewayCaptureDeleteRequest body =
        new AiGatewayCaptureDeleteRequest()
            .data(
                new AiGatewayCaptureDeleteRequestData()
                    .attributes(
                        new AiGatewayCaptureDeleteRequestDataAttributes()
                            .configurationRevision("capture-revision-1")
                            .mode(AiGatewayCaptureDeleteRequestDataAttributesMode.METADATA_ONLY)
                            .name("Research")
                            .operation(AiGatewayCaptureDeleteRequestDataAttributesOperation.CREATE)
                            .revision(1L)
                            .scope(
                                new AiGatewayCaptureScope()
                                    .tags(Map.ofEntries(Map.entry("env", "prod")))))
                    .id(UUID.fromString("11111111-1111-4111-8111-111111111111"))
                    .type(AiGatewayCaptureDeleteRequestDataType.DATA_CAPTURE_OVERRIDES));

    try {
      apiInstance.deleteAiGatewayDataCaptureOverride(
          UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"), body);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#deleteAiGatewayDataCaptureOverride");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

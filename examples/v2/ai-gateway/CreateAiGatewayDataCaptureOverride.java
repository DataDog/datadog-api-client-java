// Create an AI Gateway data capture override returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayCaptureCreateRequest;
import com.datadog.api.client.v2.model.AiGatewayCaptureCreateRequestData;
import com.datadog.api.client.v2.model.AiGatewayCaptureCreateRequestDataAttributes;
import com.datadog.api.client.v2.model.AiGatewayCaptureCreateRequestDataAttributesMode;
import com.datadog.api.client.v2.model.AiGatewayCaptureCreateRequestDataAttributesOperation;
import com.datadog.api.client.v2.model.AiGatewayCaptureCreateRequestDataType;
import com.datadog.api.client.v2.model.AiGatewayCaptureOverrideResponse;
import com.datadog.api.client.v2.model.AiGatewayCaptureScope;
import com.datadog.api.client.v2.model.AiGatewayMetadataCaptureItem;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createAiGatewayDataCaptureOverride", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    AiGatewayCaptureCreateRequest body =
        new AiGatewayCaptureCreateRequest()
            .data(
                new AiGatewayCaptureCreateRequestData()
                    .attributes(
                        new AiGatewayCaptureCreateRequestDataAttributes()
                            .configurationRevision("capture-revision-1")
                            .metadataCapture(
                                Arrays.asList(
                                    AiGatewayMetadataCaptureItem.TOOL_USAGE,
                                    AiGatewayMetadataCaptureItem.TOOL_OUTPUT_SIZE,
                                    AiGatewayMetadataCaptureItem.TOOL_NAMES))
                            .mode(AiGatewayCaptureCreateRequestDataAttributesMode.METADATA_ONLY)
                            .name("Research")
                            .operation(AiGatewayCaptureCreateRequestDataAttributesOperation.CREATE)
                            .revision(1L)
                            .scope(
                                new AiGatewayCaptureScope()
                                    .tags(Map.ofEntries(Map.entry("env", "prod")))))
                    .id(UUID.fromString("11111111-1111-4111-8111-111111111111"))
                    .type(AiGatewayCaptureCreateRequestDataType.DATA_CAPTURE_OVERRIDES));

    try {
      AiGatewayCaptureOverrideResponse result =
          apiInstance.createAiGatewayDataCaptureOverride(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#createAiGatewayDataCaptureOverride");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

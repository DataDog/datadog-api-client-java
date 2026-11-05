// Replace an AI Gateway data capture override returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayCaptureOverrideResponse;
import com.datadog.api.client.v2.model.AiGatewayCaptureScope;
import com.datadog.api.client.v2.model.AiGatewayCaptureUpdateRequest;
import com.datadog.api.client.v2.model.AiGatewayCaptureUpdateRequestData;
import com.datadog.api.client.v2.model.AiGatewayCaptureUpdateRequestDataAttributes;
import com.datadog.api.client.v2.model.AiGatewayCaptureUpdateRequestDataAttributesMode;
import com.datadog.api.client.v2.model.AiGatewayCaptureUpdateRequestDataAttributesOperation;
import com.datadog.api.client.v2.model.AiGatewayCaptureUpdateRequestDataType;
import com.datadog.api.client.v2.model.AiGatewayMetadataCaptureItem;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateAiGatewayDataCaptureOverride", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    AiGatewayCaptureUpdateRequest body =
        new AiGatewayCaptureUpdateRequest()
            .data(
                new AiGatewayCaptureUpdateRequestData()
                    .attributes(
                        new AiGatewayCaptureUpdateRequestDataAttributes()
                            .configurationRevision("capture-revision-1")
                            .metadataCapture(
                                Arrays.asList(
                                    AiGatewayMetadataCaptureItem.TOOL_USAGE,
                                    AiGatewayMetadataCaptureItem.TOOL_OUTPUT_SIZE,
                                    AiGatewayMetadataCaptureItem.TOOL_NAMES))
                            .mode(AiGatewayCaptureUpdateRequestDataAttributesMode.METADATA_ONLY)
                            .name("Research")
                            .operation(AiGatewayCaptureUpdateRequestDataAttributesOperation.CREATE)
                            .revision(1L)
                            .scope(
                                new AiGatewayCaptureScope()
                                    .tags(Map.ofEntries(Map.entry("env", "prod")))))
                    .id(UUID.fromString("11111111-1111-4111-8111-111111111111"))
                    .type(AiGatewayCaptureUpdateRequestDataType.DATA_CAPTURE_OVERRIDES));

    try {
      AiGatewayCaptureOverrideResponse result =
          apiInstance.updateAiGatewayDataCaptureOverride(
              UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#updateAiGatewayDataCaptureOverride");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

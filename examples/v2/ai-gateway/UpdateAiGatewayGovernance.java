// Replace AI Gateway governance controls returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayDataCaptureMode;
import com.datadog.api.client.v2.model.AiGatewayGovernanceReplaceAttributes;
import com.datadog.api.client.v2.model.AiGatewayGovernanceReplaceData;
import com.datadog.api.client.v2.model.AiGatewayGovernanceReplaceRequest;
import com.datadog.api.client.v2.model.AiGatewayGovernanceResponse;
import com.datadog.api.client.v2.model.AiGatewayGovernanceType;
import com.datadog.api.client.v2.model.AiGatewayMetadataCaptureItem;
import com.datadog.api.client.v2.model.AiGatewayZDRMode;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateAiGatewayGovernance", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    AiGatewayGovernanceReplaceRequest body =
        new AiGatewayGovernanceReplaceRequest()
            .data(
                new AiGatewayGovernanceReplaceData()
                    .attributes(
                        new AiGatewayGovernanceReplaceAttributes()
                            .dataCaptureMode(AiGatewayDataCaptureMode.METADATA_ONLY)
                            .metadataCapture(
                                Arrays.asList(
                                    AiGatewayMetadataCaptureItem.TOOL_USAGE,
                                    AiGatewayMetadataCaptureItem.TOOL_OUTPUT_SIZE,
                                    AiGatewayMetadataCaptureItem.TOOL_NAMES))
                            .zdrMode(AiGatewayZDRMode.OFF))
                    .id("organization")
                    .type(AiGatewayGovernanceType.GOVERNANCE));

    try {
      AiGatewayGovernanceResponse result = apiInstance.updateAiGatewayGovernance(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#updateAiGatewayGovernance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

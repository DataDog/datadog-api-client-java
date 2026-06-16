// Submit libraries for vulnerability scanning returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StaticAnalysisApi;
import com.datadog.api.client.v2.model.McpScanRequest;
import com.datadog.api.client.v2.model.McpScanRequestData;
import com.datadog.api.client.v2.model.McpScanRequestDataAttributes;
import com.datadog.api.client.v2.model.McpScanRequestDataAttributesLibrariesItems;
import com.datadog.api.client.v2.model.McpScanRequestDataType;
import com.datadog.api.client.v2.model.McpScanRequestResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createSCAScan", true);
    StaticAnalysisApi apiInstance = new StaticAnalysisApi(defaultClient);

    McpScanRequest body =
        new McpScanRequest()
            .data(
                new McpScanRequestData()
                    .attributes(
                        new McpScanRequestDataAttributes()
                            .commitHash("0e9fc8de83eaabecd722e1cd0ed44fb489fe15fc")
                            .libraries(
                                Collections.singletonList(
                                    new McpScanRequestDataAttributesLibrariesItems()
                                        .isDev(false)
                                        .isDirect(true)
                                        .packageManager("nuget")
                                        .purl("pkg:nuget/Newtonsoft.Json@13.0.1")))
                            .resourceName("my-org/my-repo"))
                    .type(McpScanRequestDataType.MCPSCANREQUEST));

    try {
      McpScanRequestResponse result = apiInstance.createSCAScan(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticAnalysisApi#createSCAScan");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

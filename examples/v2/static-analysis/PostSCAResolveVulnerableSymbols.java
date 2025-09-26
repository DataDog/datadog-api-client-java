// Post vulnerable symbols returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StaticAnalysisApi;
import com.datadog.api.client.v2.model.ResolveVulnerableSymbolsRequest;
import com.datadog.api.client.v2.model.ResolveVulnerableSymbolsRequestData;
import com.datadog.api.client.v2.model.ResolveVulnerableSymbolsRequestDataAttributes;
import com.datadog.api.client.v2.model.ResolveVulnerableSymbolsRequestDataType;
import com.datadog.api.client.v2.model.ResolveVulnerableSymbolsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.postSCAResolveVulnerableSymbols", true);
    StaticAnalysisApi apiInstance = new StaticAnalysisApi(defaultClient);

    ResolveVulnerableSymbolsRequest body =
        new ResolveVulnerableSymbolsRequest()
            .data(
                new ResolveVulnerableSymbolsRequestData()
                    .attributes(new ResolveVulnerableSymbolsRequestDataAttributes())
                    .type(
                        ResolveVulnerableSymbolsRequestDataType
                            .RESOLVE_VULNERABLE_SYMBOLS_REQUEST));

    try {
      ResolveVulnerableSymbolsResponse result = apiInstance.postSCAResolveVulnerableSymbols(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling StaticAnalysisApi#postSCAResolveVulnerableSymbols");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

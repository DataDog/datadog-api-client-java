// POST request to resolve vulnerable symbols returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.StaticAnalysisApi;
import com.datadog.api.client.v2.model.ResolveVulnerableSymbolsResponse;
import com.datadog.api.client.v2.model.ResolveVulnerableSymbolsRequest;
import com.datadog.api.client.v2.model.ResolveVulnerableSymbolsRequestData;
import com.datadog.api.client.v2.model.ResolveVulnerableSymbolsRequestDataAttributes;
import com.datadog.api.client.v2.model.ResolveVulnerableSymbolsRequestDataType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createSCAResolveVulnerableSymbols", true);
    StaticAnalysisApi apiInstance = new StaticAnalysisApi(defaultClient);

    ResolveVulnerableSymbolsRequest body = new ResolveVulnerableSymbolsRequest()
.data(new ResolveVulnerableSymbolsRequestData()
.attributes(new ResolveVulnerableSymbolsRequestDataAttributes())
.type(ResolveVulnerableSymbolsRequestDataType.RESOLVE_VULNERABLE_SYMBOLS_REQUEST));

    try {
      ResolveVulnerableSymbolsResponse result = apiInstance.createSCAResolveVulnerableSymbols(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticAnalysisApi#createSCAResolveVulnerableSymbols");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
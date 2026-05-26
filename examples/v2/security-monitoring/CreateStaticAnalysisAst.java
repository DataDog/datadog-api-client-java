// Get AST for source code returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.GetAstRequest;
import com.datadog.api.client.v2.model.GetAstRequestData;
import com.datadog.api.client.v2.model.GetAstRequestDataAttributes;
import com.datadog.api.client.v2.model.GetAstRequestDataType;
import com.datadog.api.client.v2.model.GetAstResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createStaticAnalysisAst", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    GetAstRequest body =
        new GetAstRequest()
            .data(
                new GetAstRequestData()
                    .attributes(
                        new GetAstRequestDataAttributes()
                            .code("aW1wb3J0IHN5cw==")
                            .fileEncoding("utf-8")
                            .language("python"))
                    .type(GetAstRequestDataType.GET_AST_REQUEST));

    try {
      GetAstResponse result = apiInstance.createStaticAnalysisAst(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#createStaticAnalysisAst");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

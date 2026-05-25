// Analyze code returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.AnalysisRequest;
import com.datadog.api.client.v2.model.AnalysisRequestData;
import com.datadog.api.client.v2.model.AnalysisRequestDataAttributes;
import com.datadog.api.client.v2.model.AnalysisRequestDataType;
import com.datadog.api.client.v2.model.AnalysisRequestRule;
import com.datadog.api.client.v2.model.AnalysisResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createStaticAnalysisServerAnalysis", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    AnalysisRequest body =
        new AnalysisRequest()
            .data(
                new AnalysisRequestData()
                    .attributes(
                        new AnalysisRequestDataAttributes()
                            .code("aW1wb3J0IHN5cw==")
                            .fileEncoding("utf-8")
                            .filename("test.py")
                            .language("python")
                            .rules(
                                Collections.singletonList(
                                    new AnalysisRequestRule()
                                        .category("BEST_PRACTICES")
                                        .checksum("abc123def456")
                                        .code("ZnVuY3Rpb24gdmlzaXQobm9kZSkge30=")
                                        .entityChecked(null)
                                        .id("python-best-practices/no-exit")
                                        .language("python")
                                        .regex(null)
                                        .severity("WARNING")
                                        .treeSitterQuery("KGNhbGwgbmFtZTogKGF0dHJpYnV0ZSkpQHZhbA==")
                                        .type("TREE_SITTER_QUERY"))))
                    .type(AnalysisRequestDataType.ANALYSIS_REQUEST));

    try {
      AnalysisResponse result = apiInstance.createStaticAnalysisServerAnalysis(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#createStaticAnalysisServerAnalysis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

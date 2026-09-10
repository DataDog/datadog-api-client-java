// Get code coverage summary for a pull request returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CodeCoverageApi;
import com.datadog.api.client.v2.model.CoverageSummaryResponse;
import com.datadog.api.client.v2.model.PRCoverageSummaryRequest;
import com.datadog.api.client.v2.model.PRCoverageSummaryRequestAttributes;
import com.datadog.api.client.v2.model.PRCoverageSummaryRequestData;
import com.datadog.api.client.v2.model.PRCoverageSummaryRequestType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CodeCoverageApi apiInstance = new CodeCoverageApi(defaultClient);

    PRCoverageSummaryRequest body =
        new PRCoverageSummaryRequest()
            .data(
                new PRCoverageSummaryRequestData()
                    .attributes(
                        new PRCoverageSummaryRequestAttributes()
                            .prNumber(42L)
                            .repositoryUrl("https://github.com/datadog/shopist"))
                    .type(PRCoverageSummaryRequestType.CI_APP_COVERAGE_PR_SUMMARY_REQUEST));

    try {
      CoverageSummaryResponse result = apiInstance.getCodeCoveragePRSummary(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeCoverageApi#getCodeCoveragePRSummary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

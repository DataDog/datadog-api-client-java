// Get code coverage summary for an existing commit with valid repository

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CodeCoverageApi;
import com.datadog.api.client.v2.model.CommitCoverageSummaryRequest;
import com.datadog.api.client.v2.model.CommitCoverageSummaryRequestAttributes;
import com.datadog.api.client.v2.model.CommitCoverageSummaryRequestData;
import com.datadog.api.client.v2.model.CommitCoverageSummaryRequestType;
import com.datadog.api.client.v2.model.CoverageSummaryResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getCodeCoverageCommitSummary", true);
    CodeCoverageApi apiInstance = new CodeCoverageApi(defaultClient);

    CommitCoverageSummaryRequest body =
        new CommitCoverageSummaryRequest()
            .data(
                new CommitCoverageSummaryRequestData()
                    .attributes(
                        new CommitCoverageSummaryRequestAttributes()
                            .repositoryId("github.com/datadog/shopist")
                            .commitSha("c55b0ce584e139bde41a00002ab31bc7d75f791d"))
                    .type(CommitCoverageSummaryRequestType.CI_APP_COVERAGE_COMMIT_SUMMARY_REQUEST));

    try {
      CoverageSummaryResponse result = apiInstance.getCodeCoverageCommitSummary(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeCoverageApi#getCodeCoverageCommitSummary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

// Get code coverage summary for a commit returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CodeCoverageApi;
import com.datadog.api.client.v2.model.CoverageSummaryResponse;
import com.datadog.api.client.v2.model.CommitCoverageSummaryRequest;
import com.datadog.api.client.v2.model.CommitCoverageSummaryRequestAttributes;
import com.datadog.api.client.v2.model.CommitCoverageSummaryRequestData;
import com.datadog.api.client.v2.model.CommitCoverageSummaryRequestType;
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
    defaultClient.setUnstableOperationEnabled("v2.getCodeCoverageCommitSummary", true);
    CodeCoverageApi apiInstance = new CodeCoverageApi(defaultClient);

    CommitCoverageSummaryRequest body = new CommitCoverageSummaryRequest()
.data(new CommitCoverageSummaryRequestData()
.attributes(new CommitCoverageSummaryRequestAttributes()
.commitSha("66adc9350f2cc9b250b69abddab733dd55e1a588")
.repositoryId("github.com/datadog/shopist"))
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
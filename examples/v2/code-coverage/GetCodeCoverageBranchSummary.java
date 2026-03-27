// Get code coverage summary for a branch returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CodeCoverageApi;
import com.datadog.api.client.v2.model.CoverageSummaryResponse;
import com.datadog.api.client.v2.model.BranchCoverageSummaryRequest;
import com.datadog.api.client.v2.model.BranchCoverageSummaryRequestAttributes;
import com.datadog.api.client.v2.model.BranchCoverageSummaryRequestData;
import com.datadog.api.client.v2.model.BranchCoverageSummaryRequestType;
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
    defaultClient.setUnstableOperationEnabled("v2.getCodeCoverageBranchSummary", true);
    CodeCoverageApi apiInstance = new CodeCoverageApi(defaultClient);

    BranchCoverageSummaryRequest body = new BranchCoverageSummaryRequest()
.data(new BranchCoverageSummaryRequestData()
.attributes(new BranchCoverageSummaryRequestAttributes()
.branch("prod")
.repositoryId("github.com/datadog/shopist"))
.type(BranchCoverageSummaryRequestType.CI_APP_COVERAGE_BRANCH_SUMMARY_REQUEST));

    try {
      CoverageSummaryResponse result = apiInstance.getCodeCoverageBranchSummary(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeCoverageApi#getCodeCoverageBranchSummary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
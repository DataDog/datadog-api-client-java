// Get per-file code coverage data returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CodeCoverageApi;
import com.datadog.api.client.v2.model.FilesCoverageRequest;
import com.datadog.api.client.v2.model.FilesCoverageRequestAttributes;
import com.datadog.api.client.v2.model.FilesCoverageRequestData;
import com.datadog.api.client.v2.model.FilesCoverageRequestType;
import com.datadog.api.client.v2.model.FilesCoverageResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CodeCoverageApi apiInstance = new CodeCoverageApi(defaultClient);

    FilesCoverageRequest body =
        new FilesCoverageRequest()
            .data(
                new FilesCoverageRequestData()
                    .attributes(
                        new FilesCoverageRequestAttributes()
                            .changedOnly(true)
                            .commitSha("66adc9350f2cc9b250b69abddab733dd55e1a588")
                            .repositoryUrl("https://github.com/datadog/shopist"))
                    .type(FilesCoverageRequestType.CI_APP_COVERAGE_FILES_REQUEST));

    try {
      FilesCoverageResponse result = apiInstance.getCodeCoverageFiles(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeCoverageApi#getCodeCoverageFiles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

// Detach security findings from their case returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.CaseDataType;
import com.datadog.api.client.v2.model.DetachCaseRequest;
import com.datadog.api.client.v2.model.DetachCaseRequestData;
import com.datadog.api.client.v2.model.DetachCaseRequestDataRelationships;
import com.datadog.api.client.v2.model.FindingData;
import com.datadog.api.client.v2.model.FindingDataType;
import com.datadog.api.client.v2.model.Findings;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    DetachCaseRequest body =
        new DetachCaseRequest()
            .data(
                new DetachCaseRequestData()
                    .relationships(
                        new DetachCaseRequestDataRelationships()
                            .findings(
                                new Findings()
                                    .data(
                                        Collections.singletonList(
                                            new FindingData()
                                                .id(
                                                    "YzM2MTFjYzcyNmY0Zjg4MTAxZmRlNjQ1MWU1ZGQwYzR-YzI5NzE5Y2Y4MzU4ZjliNzhkNjYxNTY0ODIzZDQ2YTM=")
                                                .type(FindingDataType.FINDINGS)))))
                    .type(CaseDataType.CASES));

    try {
      apiInstance.detachCase(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#detachCase");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

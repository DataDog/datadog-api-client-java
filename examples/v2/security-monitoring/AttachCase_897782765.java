// Attach security finding to a case returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.AttachCaseRequest;
import com.datadog.api.client.v2.model.AttachCaseRequestData;
import com.datadog.api.client.v2.model.AttachCaseRequestDataRelationships;
import com.datadog.api.client.v2.model.CaseDataType;
import com.datadog.api.client.v2.model.FindingCaseResponse;
import com.datadog.api.client.v2.model.FindingData;
import com.datadog.api.client.v2.model.FindingDataType;
import com.datadog.api.client.v2.model.Findings;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    AttachCaseRequest body =
        new AttachCaseRequest()
            .data(
                new AttachCaseRequestData()
                    .id("7d16945b-baf8-411e-ab2a-20fe43af1ea3")
                    .relationships(
                        new AttachCaseRequestDataRelationships()
                            .findings(
                                new Findings()
                                    .data(
                                        Collections.singletonList(
                                            new FindingData()
                                                .id(
                                                    "ZGZhMDI3ZjdjMDM3YjJmNzcxNTlhZGMwMjdmZWNiNTZ-MTVlYTNmYWU3NjNlOTNlYTE2YjM4N2JmZmI4Yjk5N2Y=")
                                                .type(FindingDataType.FINDINGS)))))
                    .type(CaseDataType.CASES));

    try {
      FindingCaseResponse result =
          apiInstance.attachCase("7d16945b-baf8-411e-ab2a-20fe43af1ea3", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#attachCase");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

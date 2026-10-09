// Apply a severity override to security findings returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.FindingData;
import com.datadog.api.client.v2.model.FindingDataType;
import com.datadog.api.client.v2.model.Findings;
import com.datadog.api.client.v2.model.SeverityOverrideAttributes;
import com.datadog.api.client.v2.model.SeverityOverrideDataType;
import com.datadog.api.client.v2.model.SeverityOverrideRequest;
import com.datadog.api.client.v2.model.SeverityOverrideRequestData;
import com.datadog.api.client.v2.model.SeverityOverrideRequestDataAttributes;
import com.datadog.api.client.v2.model.SeverityOverrideRequestDataRelationships;
import com.datadog.api.client.v2.model.SeverityOverrideResponse;
import com.datadog.api.client.v2.model.SeverityOverrideSet;
import com.datadog.api.client.v2.model.SeverityOverrideSetActionType;
import com.datadog.api.client.v2.model.SeverityOverrideValue;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateFindingsSeverity", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SeverityOverrideRequest body =
        new SeverityOverrideRequest()
            .data(
                new SeverityOverrideRequestData()
                    .attributes(
                        new SeverityOverrideRequestDataAttributes()
                            .severity(
                                new SeverityOverrideAttributes(
                                    new SeverityOverrideSet()
                                        .action(SeverityOverrideSetActionType.SET)
                                        .description("Database contains sensitive data.")
                                        .value(SeverityOverrideValue.HIGH))))
                    .relationships(
                        new SeverityOverrideRequestDataRelationships()
                            .findings(
                                new Findings()
                                    .data(
                                        Collections.singletonList(
                                            new FindingData()
                                                .id(
                                                    "ZGVmLTAwMC0wYmd-MDE4NjcyMDJkMzE4MDE5ODY5MGE4ZmQ2MmFlMjg0Y2M=")
                                                .type(FindingDataType.FINDINGS)))))
                    .type(SeverityOverrideDataType.SEVERITY_OVERRIDE));

    try {
      SeverityOverrideResponse result = apiInstance.updateFindingsSeverity(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#updateFindingsSeverity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

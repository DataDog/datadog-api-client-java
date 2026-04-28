// Mute or unmute security findings returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.FindingData;
import com.datadog.api.client.v2.model.FindingDataType;
import com.datadog.api.client.v2.model.Findings;
import com.datadog.api.client.v2.model.MuteDataType;
import com.datadog.api.client.v2.model.MuteFindingsMuteAttributes;
import com.datadog.api.client.v2.model.MuteFindingsReason;
import com.datadog.api.client.v2.model.MuteFindingsRequest;
import com.datadog.api.client.v2.model.MuteFindingsRequestData;
import com.datadog.api.client.v2.model.MuteFindingsRequestDataAttributes;
import com.datadog.api.client.v2.model.MuteFindingsRequestDataRelationships;
import com.datadog.api.client.v2.model.MuteFindingsResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.muteSecurityFindings", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    MuteFindingsRequest body =
        new MuteFindingsRequest()
            .data(
                new MuteFindingsRequestData()
                    .attributes(
                        new MuteFindingsRequestDataAttributes()
                            .mute(
                                new MuteFindingsMuteAttributes()
                                    .description("To be resolved later.")
                                    .expireAt(1778721573794L)
                                    .isMuted(true)
                                    .reason(MuteFindingsReason.PENDING_FIX)))
                    .id("93bfeb70-af47-424d-908a-948d3f08e37f")
                    .relationships(
                        new MuteFindingsRequestDataRelationships()
                            .findings(
                                new Findings()
                                    .data(
                                        Collections.singletonList(
                                            new FindingData()
                                                .id("ZGVmLTAwcC1pZXJ-aS0wZjhjNjMyZDNmMzRlZTgzNw==")
                                                .type(FindingDataType.FINDINGS)))))
                    .type(MuteDataType.MUTE));

    try {
      MuteFindingsResponse result = apiInstance.muteSecurityFindings(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#muteSecurityFindings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

// Mute or unmute a batch of findings returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.BulkMuteFindingsResponse;
import com.datadog.api.client.v2.model.BulkMuteFindingsRequest;
import com.datadog.api.client.v2.model.BulkMuteFindingsRequestAttributes;
import com.datadog.api.client.v2.model.BulkMuteFindingsRequestData;
import com.datadog.api.client.v2.model.BulkMuteFindingsRequestMeta;
import com.datadog.api.client.v2.model.BulkMuteFindingsRequestMetaFindings;
import com.datadog.api.client.v2.model.BulkMuteFindingsRequestProperties;
import com.datadog.api.client.v2.model.FindingMuteReason;
import com.datadog.api.client.v2.model.FindingType;
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
    defaultClient.setUnstableOperationEnabled("v2.muteFindings", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    BulkMuteFindingsRequest body = new BulkMuteFindingsRequest()
.data(new BulkMuteFindingsRequestData()
.attributes(new BulkMuteFindingsRequestAttributes()
.mute(new BulkMuteFindingsRequestProperties()
.expirationDate(1778721573794L)
.muted(true)
.reason(FindingMuteReason.ACCEPTED_RISK)))
.id("dbe5f567-192b-4404-b908-29b70e1c9f76")
.meta(new BulkMuteFindingsRequestMeta()
.findings(Collections.singletonList(new BulkMuteFindingsRequestMetaFindings()
.findingId("ZGVmLTAwcC1pZXJ-aS0wZjhjNjMyZDNmMzRlZTgzNw=="))))
.type(FindingType.FINDING));

    try {
      BulkMuteFindingsResponse result = apiInstance.muteFindings(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#muteFindings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
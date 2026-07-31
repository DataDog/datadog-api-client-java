// Ingest STIX threat intelligence returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ThreatIntelligenceApi;
import com.datadog.api.client.v2.model.STIXBundleRequest;
import com.datadog.api.client.v2.model.STIXBundleType;
import com.datadog.api.client.v2.model.STIXIndicatorObject;
import com.datadog.api.client.v2.model.STIXIndicatorType;
import com.datadog.api.client.v2.model.STIXIngestResponse;
import com.datadog.api.client.v2.model.STIXPatternType;
import com.datadog.api.client.v2.model.STIXSpecVersion;
import java.time.OffsetDateTime;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.ingestStixThreatIntel", true);
    ThreatIntelligenceApi apiInstance = new ThreatIntelligenceApi(defaultClient);

    STIXBundleRequest body =
        new STIXBundleRequest()
            .id("bundle--44444444-4444-4444-8444-444444444444")
            .objects(
                Collections.singletonList(
                    new STIXIndicatorObject()
                        .created(OffsetDateTime.parse("2026-07-22T12:00:00Z"))
                        .id("indicator--55555555-5555-4555-8555-555555555555")
                        .modified(OffsetDateTime.parse("2026-07-22T12:00:00Z"))
                        .pattern("[ipv4-addr:value = '198.51.100.42']")
                        .patternType(STIXPatternType.STIX)
                        .specVersion(STIXSpecVersion.VERSION_2_1)
                        .type(STIXIndicatorType.INDICATOR)
                        .validFrom(OffsetDateTime.parse("2026-07-22T12:00:00Z"))))
            .specVersion(STIXSpecVersion.VERSION_2_1)
            .type(STIXBundleType.BUNDLE);

    try {
      STIXIngestResponse result = apiInstance.ingestStixThreatIntel("Acme-Inc", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreatIntelligenceApi#ingestStixThreatIntel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

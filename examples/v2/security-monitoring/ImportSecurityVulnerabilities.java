// Import security vulnerabilities returns "Vulnerabilities accepted successfully." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.CycloneDXBom;
import com.datadog.api.client.v2.model.CycloneDXComponent;
import com.datadog.api.client.v2.model.CycloneDXComponentType;
import com.datadog.api.client.v2.model.CycloneDXMetadata;
import com.datadog.api.client.v2.model.CycloneDXMetadataComponent;
import com.datadog.api.client.v2.model.CycloneDXMetadataTools;
import com.datadog.api.client.v2.model.CycloneDXToolComponent;
import com.datadog.api.client.v2.model.CycloneDXVulnerability;
import com.datadog.api.client.v2.model.CycloneDXVulnerabilityAdvisory;
import com.datadog.api.client.v2.model.CycloneDXVulnerabilityAffects;
import com.datadog.api.client.v2.model.CycloneDXVulnerabilityAnalysis;
import com.datadog.api.client.v2.model.CycloneDXVulnerabilityRating;
import com.datadog.api.client.v2.model.CycloneDXVulnerabilityReference;
import com.datadog.api.client.v2.model.CycloneDXVulnerabilityReferenceSource;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.importSecurityVulnerabilities", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    CycloneDXBom body =
        new CycloneDXBom()
            .bomFormat("CycloneDX")
            .components(
                Collections.singletonList(
                    new CycloneDXComponent()
                        .bomRef("a3390fca-c315-41ae-ae05-af5e7859cdee")
                        .name("lodash")
                        .purl("pkg:npm/lodash@4.17.21")
                        .type(CycloneDXComponentType.LIBRARY)
                        .version("4.17.21")))
            .metadata(
                new CycloneDXMetadata()
                    .component(
                        new CycloneDXMetadataComponent()
                            .bomRef("host-ref-abc123")
                            .name("i-12345")
                            .type("operating-system"))
                    .tools(
                        new CycloneDXMetadataTools()
                            .components(
                                Collections.singletonList(
                                    new CycloneDXToolComponent()
                                        .name("my-scanner")
                                        .type("application")))))
            .specVersion("1.5")
            .version(1L)
            .vulnerabilities(
                Collections.singletonList(
                    new CycloneDXVulnerability()
                        .advisories(
                            Collections.singletonList(
                                new CycloneDXVulnerabilityAdvisory()
                                    .url("https://example.com/advisory/CVE-2021-1234")))
                        .affects(
                            Collections.singletonList(
                                new CycloneDXVulnerabilityAffects()
                                    .ref("a3390fca-c315-41ae-ae05-af5e7859cdee")))
                        .analysis(new CycloneDXVulnerabilityAnalysis().state("resolved"))
                        .cwes(Arrays.asList(123L, 345L))
                        .description("Sample vulnerability detected in the application.")
                        .detail("Details about the vulnerability.")
                        .id("CVE-2021-1234")
                        .ratings(
                            Collections.singletonList(
                                new CycloneDXVulnerabilityRating()
                                    .score(9.0)
                                    .severity("high")
                                    .vector("CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:C/C:H/I:H/A:N")))
                        .references(
                            Collections.singletonList(
                                new CycloneDXVulnerabilityReference()
                                    .id("GHSA-35m5-8cvj-8783")
                                    .source(
                                        new CycloneDXVulnerabilityReferenceSource()
                                            .url("https://example.com"))))));

    try {
      apiInstance.importSecurityVulnerabilities(body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#importSecurityVulnerabilities");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

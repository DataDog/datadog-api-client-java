// Import vulnerabilities returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.CycloneDXAdvisory;
import com.datadog.api.client.v2.model.CycloneDXAffect;
import com.datadog.api.client.v2.model.CycloneDXAssetComponent;
import com.datadog.api.client.v2.model.CycloneDXBOM;
import com.datadog.api.client.v2.model.CycloneDXComponent;
import com.datadog.api.client.v2.model.CycloneDXComponentType;
import com.datadog.api.client.v2.model.CycloneDXMetadata;
import com.datadog.api.client.v2.model.CycloneDXRating;
import com.datadog.api.client.v2.model.CycloneDXReference;
import com.datadog.api.client.v2.model.CycloneDXReferenceSource;
import com.datadog.api.client.v2.model.CycloneDXToolComponent;
import com.datadog.api.client.v2.model.CycloneDXTools;
import com.datadog.api.client.v2.model.CycloneDXVulnerability;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.importSecurityVulnerabilities", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    CycloneDXBOM body =
        new CycloneDXBOM()
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
                        new CycloneDXAssetComponent()
                            .bomRef("asset-ref-123")
                            .name("i-12345")
                            .type("operating-system"))
                    .tools(
                        new CycloneDXTools()
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
                                new CycloneDXAdvisory()
                                    .url("https://example.com/advisory/CVE-2021-1234")))
                        .affects(
                            Collections.singletonList(
                                new CycloneDXAffect().ref("a3390fca-c315-41ae-ae05-af5e7859cdee")))
                        .cwes(Arrays.asList(123, 345))
                        .description("Sample vulnerability detected in the application.")
                        .detail("Details about the vulnerability")
                        .id("CVE-2021-1234")
                        .ratings(
                            Collections.singletonList(
                                new CycloneDXRating()
                                    .score(9.0)
                                    .severity("high")
                                    .vector("CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:C/C:H/I:H/A:N")))
                        .references(
                            Collections.singletonList(
                                new CycloneDXReference()
                                    .id("GHSA-35m5-8cvj-8783")
                                    .source(
                                        new CycloneDXReferenceSource()
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

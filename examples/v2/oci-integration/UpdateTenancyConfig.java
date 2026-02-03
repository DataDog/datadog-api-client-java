// Update tenancy config returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OciIntegrationApi;
import com.datadog.api.client.v2.model.TenancyConfig;
import com.datadog.api.client.v2.model.UpdateTenancyConfigData;
import com.datadog.api.client.v2.model.UpdateTenancyConfigDataAttributes;
import com.datadog.api.client.v2.model.UpdateTenancyConfigDataAttributesAuthCredentials;
import com.datadog.api.client.v2.model.UpdateTenancyConfigDataAttributesLogsConfig;
import com.datadog.api.client.v2.model.UpdateTenancyConfigDataAttributesMetricsConfig;
import com.datadog.api.client.v2.model.UpdateTenancyConfigDataAttributesRegionsConfig;
import com.datadog.api.client.v2.model.UpdateTenancyConfigDataType;
import com.datadog.api.client.v2.model.UpdateTenancyConfigRequest;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OciIntegrationApi apiInstance = new OciIntegrationApi(defaultClient);

    UpdateTenancyConfigRequest body =
        new UpdateTenancyConfigRequest()
            .data(
                new UpdateTenancyConfigData()
                    .attributes(
                        new UpdateTenancyConfigDataAttributes()
                            .authCredentials(
                                new UpdateTenancyConfigDataAttributesAuthCredentials()
                                    .fingerprint("")
                                    .privateKey(
                                        """
----BEGIN PRIVATE KEY-----
MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCdvSMmlfLyeD4M
QsA3WlrWBqKdWa5eVV3/uODyqT3wWMEMIJHcG3/quNs8nh9xrK1/JkQT2qoKEHqR
C5k59jN6Vp8em8ARJthMgam9K37ELt+IQ/G8ySTSuqZG8T4cHp/cs3fAclNqttOl
YnGr4RbVAgMBAAECggEAGZNLGbyCUbIRTW6Kh4d8ZVC+eZtJMqGmGJ3KfVaW8Pjn
QGWfSuJCEe2o2Y8G3phlidFauICnZ44enXA17Rhi+I/whnr7FIyQk2bR7rv+1Uhc
mOJygWX5eFFMsledgVAdIAl9Luk2nykx7Un3g6rtbl/Vs+5k4m7ITLFMpCHzsJLU
nm8kBzDOqY2JUkMd08nL88KL6QywWtal05UESzQpNFXd0e5kxYfexeMCsLsWP0mc
quMLRbn7NuBjCbe9VU2kmIvcfDDaWjurT7d5m1OXx1cc8p6P4PFZTVyCjdhiWOr3
LQXZ4/vdZNR3zgEHypRoM6D9Yq99LWUOUEMrdiSLQQKBgQDQkh7C1OtAXnpy7F6R
W+/I3zBHici2p7A57UT7VECQ1IVGg37/uus83DkuOtdZ33JmHLAVrwLFJvUlbyjx
l6dc/1ms40L5HFdLgaVtd4k0rSPFeOSDr6evz0lX4yBuzlP0fEh+o3XHW7mwe2G+
rWCULF/Uqza66fjbCSKMNgLIXQKBgQDBm9nZg/s4S0THWCFNWcB1tXBG0p/sH5eY
PC1H/VmTEINIixStrS4ufczf31X8rcoSjSbO7+vZDTTATdk7OLn1I2uGFVYl8M59
86BYT2Hi7cwp7YVzOc/cJigVeBAqSRW/iYYyWBEUTiW1gbkV0sRWwhPp67m+c0sP
XpY/iEZA2QKBgB1w8tynt4l/jKNaUEMOijt9ndALWATIiOy0XG9pxi9rgGCiwTOS
DBCsOXoYHjv2eayGUijNaoOv6xzcoxfvQ1WySdNIxTRq1ru20kYwgHKqGgmO9hrM
mcwMY5r/WZ2qjFlPjeAqbL62aPDLidGjoaVo2iIoBPK/gjxQ/5f0MS4N/YQ0zWoYBueSQ0DGs
-----END PRIVATE KEY-----
"""))
                            .costCollectionEnabled(true)
                            .homeRegion("us-ashburn-1")
                            .logsConfig(
                                new UpdateTenancyConfigDataAttributesLogsConfig()
                                    .compartmentTagFilters(
                                        Arrays.asList("datadog:true", "env:prod"))
                                    .enabled(true)
                                    .enabledServices(Arrays.asList("service_1", "service_1")))
                            .metricsConfig(
                                new UpdateTenancyConfigDataAttributesMetricsConfig()
                                    .compartmentTagFilters(
                                        Arrays.asList("datadog:true", "env:prod"))
                                    .enabled(true)
                                    .excludedServices(Arrays.asList("service_1", "service_1")))
                            .regionsConfig(
                                new UpdateTenancyConfigDataAttributesRegionsConfig()
                                    .available(Arrays.asList("us-ashburn-1", "us-phoenix-1"))
                                    .disabled(Collections.singletonList("us-phoenix-1"))
                                    .enabled(Collections.singletonList("us-ashburn-1")))
                            .resourceCollectionEnabled(true)
                            .userOcid("ocid.user.test"))
                    .id("ocid.tenancy.test")
                    .type(UpdateTenancyConfigDataType.OCI_TENANCY));

    try {
      TenancyConfig result = apiInstance.updateTenancyConfig("tenancy_ocid", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OciIntegrationApi#updateTenancyConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

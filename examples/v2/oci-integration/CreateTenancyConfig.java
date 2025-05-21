// Create tenancy config returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OciIntegrationApi;
import com.datadog.api.client.v2.model.AuthCredentials;
import com.datadog.api.client.v2.model.CreateTenancyConfig;
import com.datadog.api.client.v2.model.CreateTenancyConfigData;
import com.datadog.api.client.v2.model.CreateTenancyConfigDataAttributes;
import com.datadog.api.client.v2.model.CreateTenancyConfigDataType;
import com.datadog.api.client.v2.model.OCILogsConfig;
import com.datadog.api.client.v2.model.OCIMetricsConfig;
import com.datadog.api.client.v2.model.TenancyConfig;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OciIntegrationApi apiInstance = new OciIntegrationApi(defaultClient);

    CreateTenancyConfig body =
        new CreateTenancyConfig()
            .data(
                new CreateTenancyConfigData()
                    .attributes(
                        new CreateTenancyConfigDataAttributes()
                            .authCredentials(
                                new AuthCredentials()
                                    .fingerprint("a7:b5:54:f2:da:a2:d7:b0:ed:f4:79:47:93:64:12:b1")
                                    .privateKey(
                                        """
-----BEGIN PRIVATE KEY-----
o9kEwoumo8yHVn5Ztp4F2cxaD6+MzSJ/I6WesPyePUD7sPeorXByg1UNOXyzqDub
/aU4/sNo2f8epM9l7QGiCtY=
-----END PRIVATE KEY-----
"""))
                            .configVersion(2L)
                            .homeRegion("us-ashburn-1")
                            .logsConfig(
                                new OCILogsConfig()
                                    .compartmentTagFilters(
                                        Arrays.asList("datadog:true", "env:prod"))
                                    .enabled(true)
                                    .enabledServices(
                                        Collections.singletonList("oacnativeproduction")))
                            .metricsConfig(
                                new OCIMetricsConfig()
                                    .compartmentTagFilters(
                                        Arrays.asList("datadog:true", "env:prod"))
                                    .enabled(true)
                                    .excludedServices(Collections.singletonList("oci_compute")))
                            .resourceCollectionEnabled(true)
                            .userOcid("ocid1.user.test"))
                    .id("ocid1.tenancy.dummy_value")
                    .type(CreateTenancyConfigDataType.OCI_TENANCY));

    try {
      TenancyConfig result = apiInstance.createTenancyConfig(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OciIntegrationApi#createTenancyConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

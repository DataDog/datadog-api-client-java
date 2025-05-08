// Update tenancy config returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OciIntegrationApi;
import com.datadog.api.client.v2.model.OCIMetricsConfig;
import com.datadog.api.client.v2.model.TenancyConfig;
import com.datadog.api.client.v2.model.UpdateTenancyConfig;
import com.datadog.api.client.v2.model.UpdateTenancyConfigData;
import com.datadog.api.client.v2.model.UpdateTenancyConfigDataAttributes;
import com.datadog.api.client.v2.model.UpdateTenancyConfigDataType;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OciIntegrationApi apiInstance = new OciIntegrationApi(defaultClient);

    // there is a valid "oci_tenancy" resource in the system
    String OCI_TENANCY_DATA_ID = System.getenv("OCI_TENANCY_DATA_ID");

    UpdateTenancyConfig body =
        new UpdateTenancyConfig()
            .data(
                new UpdateTenancyConfigData()
                    .attributes(
                        new UpdateTenancyConfigDataAttributes()
                            .homeRegion("us-sanjose-1")
                            .metricsConfig(
                                new OCIMetricsConfig()
                                    .compartmentTagFilters(
                                        Arrays.asList("datadog:true", "env:prod"))
                                    .enabled(false))
                            .resourceCollectionEnabled(false)
                            .userOcid("ocid1.user.test_updated"))
                    .id(OCI_TENANCY_DATA_ID)
                    .type(UpdateTenancyConfigDataType.OCI_TENANCY));

    try {
      TenancyConfig result = apiInstance.updateTenancyConfig(OCI_TENANCY_DATA_ID, body);
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

// Update a single service object returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.OpsgenieIntegrationApi;
import com.datadog.api.v2.client.model.OpsgenieServiceRegionType;
import com.datadog.api.v2.client.model.OpsgenieServiceResponse;
import com.datadog.api.v2.client.model.OpsgenieServiceType;
import com.datadog.api.v2.client.model.OpsgenieServiceUpdateAttributes;
import com.datadog.api.v2.client.model.OpsgenieServiceUpdateData;
import com.datadog.api.v2.client.model.OpsgenieServiceUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    OpsgenieIntegrationApi apiInstance = new OpsgenieIntegrationApi(defaultClient);

    OpsgenieServiceUpdateRequest body =
        new OpsgenieServiceUpdateRequest()
            .data(
                new OpsgenieServiceUpdateData()
                    .attributes(
                        new OpsgenieServiceUpdateAttributes()
                            .customUrl("https://example.com")
                            .name("fake-opsgenie-service-name")
                            .opsgenieApiKey("00000000-0000-0000-0000-000000000000")
                            .region(OpsgenieServiceRegionType.US))
                    .id("596da4af-0563-4097-90ff-07230c3f9db3")
                    .type(OpsgenieServiceType.OPSGENIE_SERVICE));

    try {
      OpsgenieServiceResponse result =
          apiInstance.updateOpsgenieService("integration_service_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpsgenieIntegrationApi#updateOpsgenieService");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

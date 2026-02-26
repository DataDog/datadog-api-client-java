// Update a single service object returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OpsgenieIntegrationApi;
import com.datadog.api.client.v2.model.OpsgenieServiceRegionType;
import com.datadog.api.client.v2.model.OpsgenieServiceResponse;
import com.datadog.api.client.v2.model.OpsgenieServiceType;
import com.datadog.api.client.v2.model.OpsgenieServiceUpdateAttributes;
import com.datadog.api.client.v2.model.OpsgenieServiceUpdateData;
import com.datadog.api.client.v2.model.OpsgenieServiceUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OpsgenieIntegrationApi apiInstance = new OpsgenieIntegrationApi(defaultClient);

    // there is a valid "opsgenie_service" in the system
    String OPSGENIE_SERVICE_DATA_ATTRIBUTES_NAME =
        System.getenv("OPSGENIE_SERVICE_DATA_ATTRIBUTES_NAME");
    String OPSGENIE_SERVICE_DATA_ID = System.getenv("OPSGENIE_SERVICE_DATA_ID");

    OpsgenieServiceUpdateRequest body =
        new OpsgenieServiceUpdateRequest()
            .data(
                new OpsgenieServiceUpdateData()
                    .attributes(
                        new OpsgenieServiceUpdateAttributes()
                            .name("fake-opsgenie-service-name--updated")
                            .opsgenieApiKey("00000000-0000-0000-0000-000000000000")
                            .region(OpsgenieServiceRegionType.EU))
                    .id(OPSGENIE_SERVICE_DATA_ID)
                    .type(OpsgenieServiceType.OPSGENIE_SERVICE));

    try {
      OpsgenieServiceResponse result =
          apiInstance.updateOpsgenieService(OPSGENIE_SERVICE_DATA_ID, body);
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

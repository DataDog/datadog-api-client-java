// Create a new service object returns "CREATED" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.OpsgenieIntegrationApi;
import com.datadog.api.v2.client.model.OpsgenieServiceCreateAttributes;
import com.datadog.api.v2.client.model.OpsgenieServiceCreateData;
import com.datadog.api.v2.client.model.OpsgenieServiceCreateRequest;
import com.datadog.api.v2.client.model.OpsgenieServiceRegionType;
import com.datadog.api.v2.client.model.OpsgenieServiceResponse;
import com.datadog.api.v2.client.model.OpsgenieServiceType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    OpsgenieIntegrationApi apiInstance = new OpsgenieIntegrationApi(defaultClient);

    OpsgenieServiceCreateRequest body =
        new OpsgenieServiceCreateRequest()
            .data(
                new OpsgenieServiceCreateData()
                    .attributes(
                        new OpsgenieServiceCreateAttributes()
                            .name("Example-Create_a_new_service_object_returns_CREATED_response")
                            .opsgenieApiKey("00000000-0000-0000-0000-000000000000")
                            .region(OpsgenieServiceRegionType.US))
                    .type(OpsgenieServiceType.OPSGENIE_SERVICE));

    try {
      OpsgenieServiceResponse result = apiInstance.createOpsgenieService(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpsgenieIntegrationApi#createOpsgenieService");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

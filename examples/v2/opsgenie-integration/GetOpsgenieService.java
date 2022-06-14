// Get a single service object returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.OpsgenieIntegrationApi;
import com.datadog.api.v2.client.model.OpsgenieServiceResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    OpsgenieIntegrationApi apiInstance = new OpsgenieIntegrationApi(defaultClient);

    // there is a valid "opsgenie_service" in the system
    String OPSGENIE_SERVICE_DATA_ID = System.getenv("OPSGENIE_SERVICE_DATA_ID");

    try {
      OpsgenieServiceResponse result = apiInstance.getOpsgenieService(OPSGENIE_SERVICE_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpsgenieIntegrationApi#getOpsgenieService");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

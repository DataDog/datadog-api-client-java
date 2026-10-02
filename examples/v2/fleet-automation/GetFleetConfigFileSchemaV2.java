// Get a configuration file's schema by path returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FleetAutomationApi;
import com.datadog.api.client.v2.model.FleetConfigFileSchemaV2Response;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    FleetAutomationApi apiInstance = new FleetAutomationApi(defaultClient);

    try {
      FleetConfigFileSchemaV2Response result =
          apiInstance.getFleetConfigFileSchemaV2("conf.d/postgres.d/conf.yaml");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FleetAutomationApi#getFleetConfigFileSchemaV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

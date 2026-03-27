// Get a single service definition returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ServiceDefinitionApi;
import com.datadog.api.client.v2.api.ServiceDefinitionApi.GetServiceDefinitionOptionalParameters;
import com.datadog.api.client.v2.model.ServiceDefinitionGetResponse;
import com.datadog.api.client.v2.model.ServiceDefinitionSchemaVersions;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ServiceDefinitionApi apiInstance = new ServiceDefinitionApi(defaultClient);

    try {
      ServiceDefinitionGetResponse result =
          apiInstance.getServiceDefinition(
              "service-definition-test",
              new GetServiceDefinitionOptionalParameters()
                  .schemaVersion(ServiceDefinitionSchemaVersions.V2_1));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceDefinitionApi#getServiceDefinition");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

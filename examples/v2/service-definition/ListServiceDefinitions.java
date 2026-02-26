// Get all service definitions returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ServiceDefinitionApi;
import com.datadog.api.client.v2.api.ServiceDefinitionApi.ListServiceDefinitionsOptionalParameters;
import com.datadog.api.client.v2.model.ServiceDefinitionSchemaVersions;
import com.datadog.api.client.v2.model.ServiceDefinitionsListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ServiceDefinitionApi apiInstance = new ServiceDefinitionApi(defaultClient);

    try {
      ServiceDefinitionsListResponse result =
          apiInstance.listServiceDefinitions(
              new ListServiceDefinitionsOptionalParameters()
                  .schemaVersion(ServiceDefinitionSchemaVersions.V2_1));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceDefinitionApi#listServiceDefinitions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

// Update an API returns "API updated successfully" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ApiManagementApi;
import com.datadog.api.client.v2.api.ApiManagementApi.UpdateOpenAPIOptionalParameters;
import com.datadog.api.client.v2.model.UpdateOpenAPIResponse;
import java.io.File;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateOpenAPI", true);
    ApiManagementApi apiInstance = new ApiManagementApi(defaultClient);

    // there is a valid "managed_api" in the system
    UUID MANAGED_API_DATA_ID = null;
    try {
      MANAGED_API_DATA_ID = UUID.fromString(System.getenv("MANAGED_API_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    try {
      UpdateOpenAPIResponse result =
          apiInstance.updateOpenAPI(
              MANAGED_API_DATA_ID,
              new UpdateOpenAPIOptionalParameters().openapiSpecFile(new File("openapi-spec.yaml")));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiManagementApi#updateOpenAPI");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

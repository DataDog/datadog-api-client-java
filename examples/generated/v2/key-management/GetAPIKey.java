import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.KeyManagementApi;
import com.datadog.api.v2.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);
    String apiKeyId = "apiKeyId_example"; // String | The ID of the API key.
    String include =
        "created_by,modified_by"; // String | Comma separated list of resource paths for related
                                  // resources to include in the response. Supported resource paths
                                  // are `created_by` and `modified_by`.
    try {
      APIKeyResponse result =
          apiInstance.getAPIKey(
              apiKeyId, new KeyManagementApi.GetAPIKeyOptionalParameters().include(include));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyManagementApi#getAPIKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

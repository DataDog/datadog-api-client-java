// Delete an AuthN Mapping returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AuthNMappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AuthNMappingsApi apiInstance = new AuthNMappingsApi(defaultClient);

    // there is a valid "authn_mapping" in the system
    String AUTHN_MAPPING_DATA_ID = System.getenv("AUTHN_MAPPING_DATA_ID");

    try {
      apiInstance.deleteAuthNMapping(AUTHN_MAPPING_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthNMappingsApi#deleteAuthNMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

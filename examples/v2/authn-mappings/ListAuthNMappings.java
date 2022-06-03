// List all AuthN Mappings returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.AuthNMappingsApi;
import com.datadog.api.v2.client.api.AuthNMappingsApi.ListAuthNMappingsOptionalParameters;
import com.datadog.api.v2.client.model.AuthNMappingsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    AuthNMappingsApi apiInstance = new AuthNMappingsApi(defaultClient);

    // there is a valid "authn_mapping" in the system
    String AUTHN_MAPPING_DATA_ATTRIBUTES_ATTRIBUTE_KEY =
        System.getenv("AUTHN_MAPPING_DATA_ATTRIBUTES_ATTRIBUTE_KEY");

    try {
      AuthNMappingsResponse result =
          apiInstance.listAuthNMappings(
              new ListAuthNMappingsOptionalParameters()
                  .filter(AUTHN_MAPPING_DATA_ATTRIBUTES_ATTRIBUTE_KEY));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthNMappingsApi#listAuthNMappings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

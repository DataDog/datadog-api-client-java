import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.AuthNMappingsApi;
import com.datadog.api.v2.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    AuthNMappingsApi apiInstance = new AuthNMappingsApi(defaultClient);
    String authnMappingId = "authnMappingId_example"; // String | The UUID of the AuthN Mapping.
    AuthNMappingUpdateRequest body = new AuthNMappingUpdateRequest(); // AuthNMappingUpdateRequest |
    try {
      AuthNMappingResponse result = apiInstance.updateAuthNMapping(authnMappingId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthNMappingsApi#updateAuthNMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

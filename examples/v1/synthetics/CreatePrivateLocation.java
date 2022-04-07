// Create a private location returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.SyntheticsApi;
import com.datadog.api.v1.client.model.SyntheticsPrivateLocation;
import com.datadog.api.v1.client.model.SyntheticsPrivateLocationCreationResponse;
import com.datadog.api.v1.client.model.SyntheticsPrivateLocationMetadata;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    // there is a valid "role" in the system
    String ROLE_DATA_ID = System.getenv("ROLE_DATA_ID");

    SyntheticsPrivateLocation body =
        new SyntheticsPrivateLocation()
            .description("Test Example-Create_a_private_location_returns_OK_response description")
            .metadata(
                new SyntheticsPrivateLocationMetadata()
                    .restrictedRoles(Collections.singletonList(ROLE_DATA_ID)))
            .name("Example-Create_a_private_location_returns_OK_response")
            .tags(Collections.singletonList("test:examplecreateaprivatelocationreturnsokresponse"));

    try {
      SyntheticsPrivateLocationCreationResponse result = apiInstance.createPrivateLocation(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#createPrivateLocation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

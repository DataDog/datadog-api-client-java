// Create a private location returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsPrivateLocationCreationResponse;
import com.datadog.api.client.v1.model.SyntheticsPrivateLocation;
import com.datadog.api.client.v1.model.SyntheticsPrivateLocationMetadata;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    // there is a valid "role" in the system
    String ROLE_DATA_ID = System.getenv("ROLE_DATA_ID");

    SyntheticsPrivateLocation body = new SyntheticsPrivateLocation()
.description("Test Example-Synthetic description")
.metadata(new SyntheticsPrivateLocationMetadata()
.restrictedRoles(Collections.singletonList(ROLE_DATA_ID)))
.name("Example-Synthetic")
.tags(Collections.singletonList("test:examplesynthetic"));

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
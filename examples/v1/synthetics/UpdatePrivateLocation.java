// Edit a private location returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsPrivateLocation;
import com.datadog.api.client.v1.model.SyntheticsPrivateLocationMetadata;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsPrivateLocation body =
        new SyntheticsPrivateLocation()
            .description("Description of private location")
            .metadata(
                new SyntheticsPrivateLocationMetadata()
                    .restrictedRoles(
                        Collections.singletonList("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")))
            .name("New private location")
            .tags(Collections.singletonList("team:front"));

    try {
      SyntheticsPrivateLocation result = apiInstance.updatePrivateLocation("location_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#updatePrivateLocation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

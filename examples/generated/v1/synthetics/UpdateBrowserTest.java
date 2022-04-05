import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.SyntheticsApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
    String publicId = "publicId_example"; // String | The public ID of the test to get details from.
    SyntheticsBrowserTest body =
        new SyntheticsBrowserTest(); // SyntheticsBrowserTest | New test details to be saved.
    try {
      SyntheticsBrowserTest result = apiInstance.updateBrowserTest(publicId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#updateBrowserTest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

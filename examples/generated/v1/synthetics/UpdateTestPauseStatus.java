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
    String publicId = "publicId_example"; // String | The public ID of the Synthetic test to update.
    SyntheticsUpdateTestPauseStatusPayload body =
        new SyntheticsUpdateTestPauseStatusPayload(); // SyntheticsUpdateTestPauseStatusPayload |
                                                      // Status to set the given Synthetic test to.
    try {
      Boolean result = apiInstance.updateTestPauseStatus(publicId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#updateTestPauseStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

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
    String publicId =
        "publicId_example"; // String | The public ID of the API test to which the target result
    // belongs.
    String resultId = "resultId_example"; // String | The ID of the result to get.
    try {
      SyntheticsAPITestResultFull result = apiInstance.getAPITestResult(publicId, resultId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#getAPITestResult");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

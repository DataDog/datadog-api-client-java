// Pause or start a test returns "OK - Returns a boolean indicating if the update was successful."
// response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.SyntheticsApi;
import com.datadog.api.v1.client.model.SyntheticsTestPauseStatus;
import com.datadog.api.v1.client.model.SyntheticsUpdateTestPauseStatusPayload;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsUpdateTestPauseStatusPayload body =
        new SyntheticsUpdateTestPauseStatusPayload().newStatus(SyntheticsTestPauseStatus.LIVE);

    try {
      apiInstance.updateTestPauseStatus("public_id", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#updateTestPauseStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

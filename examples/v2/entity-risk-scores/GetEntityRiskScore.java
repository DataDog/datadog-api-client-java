// Get Entity Risk Score returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.EntityRiskScoresApi;
import com.datadog.api.client.v2.model.SecurityEntityRiskScoreResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getEntityRiskScore", true);
    EntityRiskScoresApi apiInstance = new EntityRiskScoresApi(defaultClient);

    try {
      SecurityEntityRiskScoreResponse result =
          apiInstance.getEntityRiskScore("arn:aws:iam::123456789012:user/john.doe");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRiskScoresApi#getEntityRiskScore");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

// Delete a campaign returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ScorecardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ScorecardsApi apiInstance = new ScorecardsApi(defaultClient);

    try {
      apiInstance.deleteScorecardCampaign("c10ODp0VCrrIpXmz");
    } catch (ApiException e) {
      System.err.println("Exception when calling ScorecardsApi#deleteScorecardCampaign");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

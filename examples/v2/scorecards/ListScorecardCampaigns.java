// List all campaigns returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ScorecardsApi;
import com.datadog.api.client.v2.model.ListCampaignsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ScorecardsApi apiInstance = new ScorecardsApi(defaultClient);

    try {
      ListCampaignsResponse result = apiInstance.listScorecardCampaigns();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScorecardsApi#listScorecardCampaigns");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

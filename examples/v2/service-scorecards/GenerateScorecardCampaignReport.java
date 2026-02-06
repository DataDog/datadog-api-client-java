// Generate campaign report returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ServiceScorecardsApi;
import com.datadog.api.client.v2.model.GenerateCampaignReportRequest;
import com.datadog.api.client.v2.model.GenerateCampaignReportRequestAttributes;
import com.datadog.api.client.v2.model.GenerateCampaignReportRequestData;
import com.datadog.api.client.v2.model.GenerateCampaignReportRequestDataType;
import com.datadog.api.client.v2.model.SlackRoutingOptions;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.generateScorecardCampaignReport", true);
    ServiceScorecardsApi apiInstance = new ServiceScorecardsApi(defaultClient);

    GenerateCampaignReportRequest body =
        new GenerateCampaignReportRequest()
            .data(
                new GenerateCampaignReportRequestData()
                    .attributes(
                        new GenerateCampaignReportRequestAttributes()
                            .slack(
                                new SlackRoutingOptions()
                                    .channelId("C024BDQ4N")
                                    .channelName("service-scorecards")
                                    .workspaceId("T024BDQ4N")
                                    .workspaceName("datadog-workspace")))
                    .type(GenerateCampaignReportRequestDataType.CAMPAIGN_REPORT));

    try {
      apiInstance.generateScorecardCampaignReport("c10ODp0VCrrIpXmz", body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ServiceScorecardsApi#generateScorecardCampaignReport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

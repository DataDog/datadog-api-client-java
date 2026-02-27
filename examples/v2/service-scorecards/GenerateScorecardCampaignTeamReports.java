// Generate team-specific campaign reports returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ServiceScorecardsApi;
import com.datadog.api.client.v2.model.EntityOwnerDestination;
import com.datadog.api.client.v2.model.GenerateCampaignTeamReportsRequest;
import com.datadog.api.client.v2.model.GenerateCampaignTeamReportsRequestAttributes;
import com.datadog.api.client.v2.model.GenerateCampaignTeamReportsRequestData;
import com.datadog.api.client.v2.model.GenerateCampaignTeamReportsRequestDataType;
import com.datadog.api.client.v2.model.SlackRoutingOptions;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.generateScorecardCampaignTeamReports", true);
    ServiceScorecardsApi apiInstance = new ServiceScorecardsApi(defaultClient);

    GenerateCampaignTeamReportsRequest body =
        new GenerateCampaignTeamReportsRequest()
            .data(
                new GenerateCampaignTeamReportsRequestData()
                    .attributes(
                        new GenerateCampaignTeamReportsRequestAttributes()
                            .entityOwners(
                                Collections.singletonList(
                                    new EntityOwnerDestination()
                                        .slack(
                                            new SlackRoutingOptions()
                                                .channelId("C024BDQ4N")
                                                .workspaceId("T024BDQ4N"))
                                        .teamId("550e8400-e29b-41d4-a716-446655440000"))))
                    .type(GenerateCampaignTeamReportsRequestDataType.CAMPAIGN_TEAM_REPORT));

    try {
      apiInstance.generateScorecardCampaignTeamReports("c10ODp0VCrrIpXmz", body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ServiceScorecardsApi#generateScorecardCampaignTeamReports");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

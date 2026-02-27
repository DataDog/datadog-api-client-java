// Create a new campaign returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ServiceScorecardsApi;
import com.datadog.api.client.v2.model.CampaignResponse;
import com.datadog.api.client.v2.model.CampaignStatus;
import com.datadog.api.client.v2.model.CampaignType;
import com.datadog.api.client.v2.model.CreateCampaignRequest;
import com.datadog.api.client.v2.model.CreateCampaignRequestAttributes;
import com.datadog.api.client.v2.model.CreateCampaignRequestData;
import java.time.OffsetDateTime;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createScorecardCampaign", true);
    ServiceScorecardsApi apiInstance = new ServiceScorecardsApi(defaultClient);

    CreateCampaignRequest body =
        new CreateCampaignRequest()
            .data(
                new CreateCampaignRequestData()
                    .attributes(
                        new CreateCampaignRequestAttributes()
                            .description("Campaign to improve security posture for Q1 2024.")
                            .dueDate(OffsetDateTime.parse("2024-03-31T23:59:59Z"))
                            .entityScope("kind:service AND team:platform")
                            .guidance("Please ensure all services pass the security requirements.")
                            .key("q1-security-2024")
                            .name("Q1 Security Campaign")
                            .ownerId("550e8400-e29b-41d4-a716-446655440000")
                            .ruleIds(Arrays.asList("q8MQxk8TCqrHnWkx", "r9NRyl9UDrsIoXly"))
                            .startDate(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                            .status(CampaignStatus.IN_PROGRESS))
                    .type(CampaignType.CAMPAIGN));

    try {
      CampaignResponse result = apiInstance.createScorecardCampaign(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceScorecardsApi#createScorecardCampaign");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

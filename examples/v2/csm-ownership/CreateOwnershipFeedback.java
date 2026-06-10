// Submit feedback on an ownership inference returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CsmOwnershipApi;
import com.datadog.api.client.v2.model.OwnershipFeedbackAction;
import com.datadog.api.client.v2.model.OwnershipFeedbackRequest;
import com.datadog.api.client.v2.model.OwnershipFeedbackRequestAttributes;
import com.datadog.api.client.v2.model.OwnershipFeedbackRequestData;
import com.datadog.api.client.v2.model.OwnershipFeedbackResponse;
import com.datadog.api.client.v2.model.OwnershipFeedbackType;
import com.datadog.api.client.v2.model.OwnershipOwnerType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createOwnershipFeedback", true);
    CsmOwnershipApi apiInstance = new CsmOwnershipApi(defaultClient);

    OwnershipFeedbackRequest body =
        new OwnershipFeedbackRequest()
            .data(
                new OwnershipFeedbackRequestData()
                    .attributes(
                        new OwnershipFeedbackRequestAttributes()
                            .action(OwnershipFeedbackAction.CONFIRM)
                            .actorHandle("user@example.com")
                            .actorType("user")
                            .correctedOwnerHandle("team-b")
                            .correctedOwnerType("team")
                            .inferenceChecksum("abc123")
                            .reason("Confirmed by team lead."))
                    .type(OwnershipFeedbackType.OWNERSHIP_FEEDBACK));

    try {
      OwnershipFeedbackResponse result =
          apiInstance.createOwnershipFeedback("res-1", OwnershipOwnerType.TEAM, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsmOwnershipApi#createOwnershipFeedback");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

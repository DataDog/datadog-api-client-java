// Create an email access policy returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.CreateStatusPageEmailAccessPolicyRequest;
import com.datadog.api.client.v2.model.CreateStatusPageEmailAccessPolicyRequestData;
import com.datadog.api.client.v2.model.CreateStatusPageEmailAccessPolicyRequestDataAttributes;
import com.datadog.api.client.v2.model.ExecutionPolicyEffect;
import com.datadog.api.client.v2.model.StatusPageEmailAccessPolicyResponse;
import com.datadog.api.client.v2.model.StatusPageEmailAccessPolicyType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    CreateStatusPageEmailAccessPolicyRequest body =
        new CreateStatusPageEmailAccessPolicyRequest()
            .data(
                new CreateStatusPageEmailAccessPolicyRequestData()
                    .attributes(
                        new CreateStatusPageEmailAccessPolicyRequestDataAttributes()
                            .effect(ExecutionPolicyEffect.ALLOW)
                            .pattern("@example.com"))
                    .type(StatusPageEmailAccessPolicyType.EMAIL_ACCESS_POLICIES));

    try {
      StatusPageEmailAccessPolicyResponse result =
          apiInstance.createEmailAccessPolicy(
              UUID.fromString("1234abcd-12ab-34cd-56ef-123456abcdef"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#createEmailAccessPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

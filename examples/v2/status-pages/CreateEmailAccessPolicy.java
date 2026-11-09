// Create an email access policy returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.AccessPolicyEffect;
import com.datadog.api.client.v2.model.CreateStatusPageEmailAccessPolicyRequest;
import com.datadog.api.client.v2.model.CreateStatusPageEmailAccessPolicyRequestData;
import com.datadog.api.client.v2.model.CreateStatusPageEmailAccessPolicyRequestDataAttributes;
import com.datadog.api.client.v2.model.StatusPageEmailAccessPolicyResponse;
import com.datadog.api.client.v2.model.StatusPageEmailAccessPolicyType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    // there is a valid "private_status_page" in the system
    UUID PRIVATE_STATUS_PAGE_DATA_ID = null;
    try {
      PRIVATE_STATUS_PAGE_DATA_ID = UUID.fromString(System.getenv("PRIVATE_STATUS_PAGE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    CreateStatusPageEmailAccessPolicyRequest body =
        new CreateStatusPageEmailAccessPolicyRequest()
            .data(
                new CreateStatusPageEmailAccessPolicyRequestData()
                    .attributes(
                        new CreateStatusPageEmailAccessPolicyRequestDataAttributes()
                            .effect(AccessPolicyEffect.ALLOW)
                            .pattern("@example.com"))
                    .type(StatusPageEmailAccessPolicyType.EMAIL_ACCESS_POLICIES));

    try {
      StatusPageEmailAccessPolicyResponse result =
          apiInstance.createEmailAccessPolicy(PRIVATE_STATUS_PAGE_DATA_ID, body);
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

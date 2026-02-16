// Update maximum session duration returns "No Content - The maximum session duration was
// successfully updated." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrganizationsApi;
import com.datadog.api.client.v2.model.MaxSessionDurationUpdateAttributes;
import com.datadog.api.client.v2.model.MaxSessionDurationUpdateRequest;
import com.datadog.api.client.v2.model.MaxSessionDurationUpdateRequestData;
import com.datadog.api.client.v2.model.MaxSessionDurationUpdateRequestDataType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateLoginOrgConfigMaxSessionDuration", true);
    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);

    MaxSessionDurationUpdateRequest body =
        new MaxSessionDurationUpdateRequest()
            .data(
                new MaxSessionDurationUpdateRequestData()
                    .attributes(new MaxSessionDurationUpdateAttributes().maxSessionDuration(60L))
                    .type(MaxSessionDurationUpdateRequestDataType.MAX_SESSION_DURATION));

    try {
      apiInstance.updateLoginOrgConfigMaxSessionDuration(body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling OrganizationsApi#updateLoginOrgConfigMaxSessionDuration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

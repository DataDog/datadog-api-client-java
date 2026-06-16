// Update the maximum session duration returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrganizationsApi;
import com.datadog.api.client.v2.model.MaxSessionDurationType;
import com.datadog.api.client.v2.model.MaxSessionDurationUpdateAttributes;
import com.datadog.api.client.v2.model.MaxSessionDurationUpdateData;
import com.datadog.api.client.v2.model.MaxSessionDurationUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);

    MaxSessionDurationUpdateRequest body =
        new MaxSessionDurationUpdateRequest()
            .data(
                new MaxSessionDurationUpdateData()
                    .attributes(
                        new MaxSessionDurationUpdateAttributes().maxSessionDuration(604800L))
                    .type(MaxSessionDurationType.MAX_SESSION_DURATION));

    try {
      apiInstance.updateLoginOrgConfigsMaxSessionDuration(body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling OrganizationsApi#updateLoginOrgConfigsMaxSessionDuration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

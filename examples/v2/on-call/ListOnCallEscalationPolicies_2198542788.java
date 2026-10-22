// List On-Call escalation policies returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.model.EscalationPolicyListItem;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    try {
      PaginationIterable<EscalationPolicyListItem> iterable =
          apiInstance.listOnCallEscalationPoliciesWithPagination();

      for (EscalationPolicyListItem item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling OnCallApi#listOnCallEscalationPoliciesWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}

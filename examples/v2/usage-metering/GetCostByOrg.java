<<<<<<< HEAD
// Get cost across multi-org account returns "OK" response
||||||| parent of ebb74b06e (Fix examples)
// Get Cost Across Multi-Org Account returns "OK" response
=======
// Get Cost Across Multi-Org Account returns "OK" response
import com.datadog.api.client.ApiException;
>>>>>>> ebb74b06e (Fix examples)
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.UsageMeteringApi;
import com.datadog.api.v2.client.model.CostByOrgResponse;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      CostByOrgResponse result = apiInstance.getCostByOrg(OffsetDateTime.now().plusDays(-3));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#getCostByOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

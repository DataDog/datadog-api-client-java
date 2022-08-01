// GetEstimatedCostByOrg with start_date returns "OK" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UsageMeteringApi;
import com.datadog.api.client.v2.api.UsageMeteringApi.GetEstimatedCostByOrgOptionalParameters;
import com.datadog.api.client.v2.model.CostByOrgResponse;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getEstimatedCostByOrg", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      CostByOrgResponse result =
          apiInstance.getEstimatedCostByOrg(
              "sub-org",
              new GetEstimatedCostByOrgOptionalParameters()
                  .startDate(OffsetDateTime.now().plusDays(-5)));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#getEstimatedCostByOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

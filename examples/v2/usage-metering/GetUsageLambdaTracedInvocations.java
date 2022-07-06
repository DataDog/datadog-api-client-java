// Get hourly usage for Lambda Traced Invocations returns "OK" response
import com.datadog.api.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.UsageMeteringApi;
import com.datadog.api.v2.client.api.UsageMeteringApi.GetUsageLambdaTracedInvocationsOptionalParameters;
import com.datadog.api.v2.client.model.UsageLambdaTracedInvocationsResponse;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      UsageLambdaTracedInvocationsResponse result =
          apiInstance.getUsageLambdaTracedInvocations(
              OffsetDateTime.now().plusDays(-5),
              new GetUsageLambdaTracedInvocationsOptionalParameters()
                  .endHr(OffsetDateTime.now().plusDays(-3)));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#getUsageLambdaTracedInvocations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

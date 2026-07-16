// Get available fields for usage summary returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UsageMeteringApi;
import com.datadog.api.client.v2.model.UsageSummaryAvailableFieldsAttributes;
import com.datadog.api.client.v2.model.UsageSummaryAvailableFieldsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      UsageSummaryAvailableFieldsResponse result = apiInstance.getUsageSummaryAvailableFields();
      UsageSummaryAvailableFieldsAttributes attrs = result.getData().getAttributes();

      System.out.printf("response_fields (%d):%n", attrs.getResponseFields().size());
      for (String f : attrs.getResponseFields()) {
        System.out.println("  " + f);
      }

      System.out.printf("date_fields (%d):%n", attrs.getDateFields().size());
      for (String f : attrs.getDateFields()) {
        System.out.println("  " + f);
      }

      System.out.printf("date_org_fields (%d):%n", attrs.getDateOrgFields().size());
      for (String f : attrs.getDateOrgFields()) {
        System.out.println("  " + f);
      }
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#getUsageSummaryAvailableFields");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

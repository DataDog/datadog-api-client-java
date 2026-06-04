// Disable the authenticated customer organization returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CustomerOrgApi;
import com.datadog.api.client.v2.model.CustomerOrgDisableRequest;
import com.datadog.api.client.v2.model.CustomerOrgDisableRequestAttributes;
import com.datadog.api.client.v2.model.CustomerOrgDisableRequestData;
import com.datadog.api.client.v2.model.CustomerOrgDisableResponse;
import com.datadog.api.client.v2.model.CustomerOrgDisableType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.disableCustomerOrg", true);
    CustomerOrgApi apiInstance = new CustomerOrgApi(defaultClient);

    CustomerOrgDisableRequest body =
        new CustomerOrgDisableRequest()
            .data(
                new CustomerOrgDisableRequestData()
                    .attributes(
                        new CustomerOrgDisableRequestAttributes()
                            .orgUuid("abcdef01-2345-6789-abcd-ef0123456789"))
                    .id("1")
                    .type(CustomerOrgDisableType.CUSTOMER_ORG_DISABLE));

    try {
      CustomerOrgDisableResponse result = apiInstance.disableCustomerOrg(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerOrgApi#disableCustomerOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

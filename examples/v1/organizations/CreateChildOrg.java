// Create a child organization returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.OrganizationsApi;
import com.datadog.api.client.v1.model.OrganizationCreateResponse;
import com.datadog.api.client.v1.model.OrganizationBilling;
import com.datadog.api.client.v1.model.OrganizationCreateBody;
import com.datadog.api.client.v1.model.OrganizationSubscription;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);

    OrganizationCreateBody body = new OrganizationCreateBody()
.billing(new OrganizationBilling()
.type("parent_billing"))
.name("New child org")
.subscription(new OrganizationSubscription()
.type("pro"));

    try {
      OrganizationCreateResponse result = apiInstance.createChildOrg(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#createChildOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
// Create a child organization returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.OrganizationsApi;
import com.datadog.api.v1.client.model.OrganizationBilling;
import com.datadog.api.v1.client.model.OrganizationCreateBody;
import com.datadog.api.v1.client.model.OrganizationCreateResponse;
import com.datadog.api.v1.client.model.OrganizationSubscription;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);

    OrganizationCreateBody body =
        new OrganizationCreateBody()
            .billing(new OrganizationBilling().type("parent_billing"))
            .name("New child org")
            .subscription(new OrganizationSubscription().type("pro"));

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

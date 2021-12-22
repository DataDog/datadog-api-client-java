// Create an app key for this service account returns "Created" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.ServiceAccountsApi;
import com.datadog.api.v2.client.model.ApplicationKeyCreateAttributes;
import com.datadog.api.v2.client.model.ApplicationKeyCreateData;
import com.datadog.api.v2.client.model.ApplicationKeyCreateRequest;
import com.datadog.api.v2.client.model.ApplicationKeyResponse;
import com.datadog.api.v2.client.model.ApplicationKeysType;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);

    // there is a valid "service_account_user" in the system
    String SERVICE_ACCOUNT_USER_DATA_ID = System.getenv("SERVICE_ACCOUNT_USER_DATA_ID");

    ApplicationKeyCreateRequest body =
        new ApplicationKeyCreateRequest()
            .data(
                new ApplicationKeyCreateData()
                    .attributes(
                        new ApplicationKeyCreateAttributes()
                            .name(
                                "Example-Create_an_app_key_for_this_service_account_returns_Created_response"))
                    .type(ApplicationKeysType.APPLICATION_KEYS));

    try {
      ApplicationKeyResponse result =
          apiInstance.createServiceAccountApplicationKey(SERVICE_ACCOUNT_USER_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ServiceAccountsApi#createServiceAccountApplicationKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

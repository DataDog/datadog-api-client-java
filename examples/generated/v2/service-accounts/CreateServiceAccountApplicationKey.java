import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.ServiceAccountsApi;
import com.datadog.api.v2.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
    String serviceAccountId =
        "00000000-0000-1234-0000-000000000000"; // String | The ID of the service account.
    ApplicationKeyCreateRequest body =
        new ApplicationKeyCreateRequest(); // ApplicationKeyCreateRequest |
    try {
      ApplicationKeyResponse result =
          apiInstance.createServiceAccountApplicationKey(serviceAccountId, body);
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

// Get seats users returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SeatsApi;
import com.datadog.api.client.v2.model.SeatUserDataArray;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SeatsApi apiInstance = new SeatsApi(defaultClient);

    try {
      SeatUserDataArray result = apiInstance.getSeatsUsersV2("product_code");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeatsApi#getSeatsUsersV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

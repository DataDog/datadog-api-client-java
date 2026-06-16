// Get widgets from an image returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StegadographyApi;
import com.datadog.api.client.v2.model.StegadographyGetWidgetsResponse;
import java.io.File;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StegadographyApi apiInstance = new StegadographyApi(defaultClient);

    try {
      StegadographyGetWidgetsResponse result =
          apiInstance.getStegadographyWidgets(new File("fixtures/stegadography/image.png"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StegadographyApi#getStegadographyWidgets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

// Delete Scanning Group returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SensitiveDataScannerApi;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupDeleteResponse;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupDeleteRequest;
import com.datadog.api.client.v2.model.SensitiveDataScannerMetaVersionOnly;
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
    SensitiveDataScannerApi apiInstance = new SensitiveDataScannerApi(defaultClient);

    // there is a valid "scanning_group" in the system
    String GROUP_DATA_ID = System.getenv("GROUP_DATA_ID");

    SensitiveDataScannerGroupDeleteRequest body = new SensitiveDataScannerGroupDeleteRequest()
.meta(new SensitiveDataScannerMetaVersionOnly());

    try {
      SensitiveDataScannerGroupDeleteResponse result = apiInstance.deleteScanningGroup(GROUP_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveDataScannerApi#deleteScanningGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
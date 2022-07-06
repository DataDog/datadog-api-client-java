// Get the latest Cloud Workload Security policy returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v2.api.CloudWorkloadSecurityApi;
import java.io.File;

public class DownloadCloudWorkloadPolicyFile {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    CloudWorkloadSecurityApi apiInstance = new CloudWorkloadSecurityApi(defaultClient);

    try {
      File result = apiInstance.downloadCloudWorkloadPolicyFile();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudWorkloadSecurityApi#downloadCloudWorkloadPolicyFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

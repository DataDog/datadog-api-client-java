// Get Model Lab artifact content returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ModelLabApiApi;
import java.io.File;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getModelLabArtifactContent", true);
    ModelLabApiApi apiInstance = new ModelLabApiApi(defaultClient);

    try {
      File result = apiInstance.getModelLabArtifactContent("1", "runs/42/model/weights.pt");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelLabApiApi#getModelLabArtifactContent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

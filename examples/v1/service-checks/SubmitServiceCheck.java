// Submit a Service Check returns "Payload accepted" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.ServiceChecksApi;
import com.datadog.api.v1.client.model.IntakePayloadAccepted;
import com.datadog.api.v1.client.model.ServiceCheck;
import com.datadog.api.v1.client.model.ServiceCheckStatus;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ServiceChecksApi apiInstance = new ServiceChecksApi(defaultClient);

    ArrayList<ServiceCheck> body =
        new ArrayList<ServiceCheck>() {
          {
            add(
                new ServiceCheck()
                    .check("app.ok")
                    .hostName("host")
                    .status(ServiceCheckStatus.OK)
                    .tags(
                        new ArrayList<String>() {
                          {
                            add("test:ExampleSubmitaServiceCheckreturnsPayloadacceptedresponse");
                          }
                        }));
          }
        };

    try {
      IntakePayloadAccepted result = apiInstance.submitServiceCheck(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#updateDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

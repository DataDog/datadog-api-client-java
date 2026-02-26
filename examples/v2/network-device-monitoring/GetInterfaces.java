// Get the list of interfaces of the device returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.NetworkDeviceMonitoringApi;
import com.datadog.api.client.v2.api.NetworkDeviceMonitoringApi.GetInterfacesOptionalParameters;
import com.datadog.api.client.v2.model.GetInterfacesResponse;
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
    NetworkDeviceMonitoringApi apiInstance = new NetworkDeviceMonitoringApi(defaultClient);

    try {
      GetInterfacesResponse result = apiInstance.getInterfaces("default:1.2.3.4",new GetInterfacesOptionalParameters().getIpAddresses(true));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkDeviceMonitoringApi#getInterfaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.HostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        HostsApi apiInstance = new HostsApi(defaultClient);
        String hostName = "hostName_example"; // String | Name of the host to unmute.
        try {
            HostMuteResponse result = apiInstance.unmuteHost(hostName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HostsApi#unmuteHost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

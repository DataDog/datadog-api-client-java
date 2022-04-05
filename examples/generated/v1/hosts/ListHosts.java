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
        String filter = "filter_example"; // String | String to filter search results.
        String sortField = "sortField_example"; // String | Sort hosts by this field.
        String sortDir = "sortDir_example"; // String | Direction of sort. Options include `asc` and `desc`.
        Long start = 56L; // Long | Host result to start search from.
        Long count = 56L; // Long | Number of hosts to return. Max 1000.
        Long from = 56L; // Long | Number of seconds since UNIX epoch from which you want to search your hosts.
        Boolean includeMutedHostsData = true; // Boolean | Include information on the muted status of hosts and when the mute expires.
        Boolean includeHostsMetadata = true; // Boolean | Include additional metadata about the hosts (agent_version, machine, platform, processor, etc.).
        try {
            HostListResponse result = apiInstance.listHosts(new HostsApi.ListHostsOptionalParameters()
                .filter(filter)
                .sortField(sortField)
                .sortDir(sortDir)
                .start(start)
                .count(count)
                .from(from)
                .includeMutedHostsData(includeMutedHostsData)
                .includeHostsMetadata(includeHostsMetadata));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HostsApi#listHosts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

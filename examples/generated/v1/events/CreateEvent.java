import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        EventsApi apiInstance = new EventsApi(defaultClient);
        EventCreateRequest body = new EventCreateRequest(); // EventCreateRequest | Event request object
        try {
            EventCreateResponse result = apiInstance.createEvent(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#createEvent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

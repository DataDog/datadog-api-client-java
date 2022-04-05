import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.LogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsApi apiInstance = new LogsApi(defaultClient);
        List<HTTPLogItem> body = Arrays.asList(); // List<HTTPLogItem> | Log to send (JSON format).
        ContentEncoding contentEncoding = ContentEncoding.fromValue("gzip"); // ContentEncoding | HTTP header used to compress the media-type.
        String ddtags = "env:prod,user:my-user"; // String | Log tags can be passed as query parameters with `text/plain` content type.
        try {
            Object result = apiInstance.submitLog(body, new LogsApi.SubmitLogOptionalParameters()
                .contentEncoding(contentEncoding)
                .ddtags(ddtags));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsApi#submitLog");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

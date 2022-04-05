import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userHandle = "test@datadoghq.com"; // String | The ID of the user.
        User body = new User(); // User | Description of the update.
        try {
            UserResponse result = apiInstance.updateUser(userHandle, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#updateUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

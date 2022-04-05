import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        RolesApi apiInstance = new RolesApi(defaultClient);
        String roleId = "roleId_example"; // String | The unique identifier of the role.
        RoleUpdateRequest body = new RoleUpdateRequest(); // RoleUpdateRequest |
        try {
            RoleUpdateResponse result = apiInstance.updateRole(roleId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#updateRole");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

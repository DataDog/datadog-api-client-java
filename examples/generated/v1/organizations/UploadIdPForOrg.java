import java.io.File;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String publicId = "abc123"; // String | The `public_id` of the organization you are operating with
        File idpFile = new File("/path/to/file"); // File | The path to the XML metadata file you wish to upload.
        try {
            IdpResponse result = apiInstance.uploadIdPForOrg(publicId, idpFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#uploadIdPForOrg");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

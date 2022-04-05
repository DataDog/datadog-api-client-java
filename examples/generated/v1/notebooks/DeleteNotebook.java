import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.NotebooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        NotebooksApi apiInstance = new NotebooksApi(defaultClient);
        Long notebookId = 56L; // Long | Unique ID, assigned when you create the notebook.
        try {
            apiInstance.deleteNotebook(notebookId);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotebooksApi#deleteNotebook");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

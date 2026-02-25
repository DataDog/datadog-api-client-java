// Create a TOTP global variable returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariable;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableOptions;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableRequest;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableTOTPParameters;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableValue;
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
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsGlobalVariableRequest body = new SyntheticsGlobalVariableRequest()
.description("")
.isTotp(true)
.name("GLOBAL_VARIABLE_TOTP_PAYLOAD_EXAMPLESYNTHETIC")
.value(new SyntheticsGlobalVariableValue()
.secure(false)
.value("")
.options(new SyntheticsGlobalVariableOptions()
.totpParameters(new SyntheticsGlobalVariableTOTPParameters()
.digits(6)
.refreshInterval(30))));

    try {
      SyntheticsGlobalVariable result = apiInstance.createGlobalVariable(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#createGlobalVariable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
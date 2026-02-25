// Create case for security findings returns "Created" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.FindingCaseResponseArray;
import com.datadog.api.client.v2.model.CaseDataType;
import com.datadog.api.client.v2.model.CaseManagementProject;
import com.datadog.api.client.v2.model.CaseManagementProjectData;
import com.datadog.api.client.v2.model.CaseManagementProjectDataType;
import com.datadog.api.client.v2.model.CreateCaseRequestArray;
import com.datadog.api.client.v2.model.CreateCaseRequestData;
import com.datadog.api.client.v2.model.CreateCaseRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateCaseRequestDataRelationships;
import com.datadog.api.client.v2.model.FindingData;
import com.datadog.api.client.v2.model.FindingDataType;
import com.datadog.api.client.v2.model.Findings;
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
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    CreateCaseRequestArray body = new CreateCaseRequestArray()
.data(Collections.singletonList(new CreateCaseRequestData()
.attributes(new CreateCaseRequestDataAttributes()
.title("A title")
.description("A description"))
.relationships(new CreateCaseRequestDataRelationships()
.findings(new Findings()
.data(Arrays.asList(new FindingData()
.id("ZTd5LWNuYi1seWV-aS0wMjI2NGZjZjRmZWQ5ODMyMg==")
.type(FindingDataType.FINDINGS), new FindingData()
.id("c2FuLXhyaS1kZnN-aS0wODM3MjVhMTM2MDExNzNkOQ==")
.type(FindingDataType.FINDINGS))))
.project(new CaseManagementProject()
.data(new CaseManagementProjectData()
.id("959a6f71-bac8-4027-b1d3-2264f569296f")
.type(CaseManagementProjectDataType.PROJECTS))))
.type(CaseDataType.CASES)));

    try {
      FindingCaseResponseArray result = apiInstance.createCases(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#createCases");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
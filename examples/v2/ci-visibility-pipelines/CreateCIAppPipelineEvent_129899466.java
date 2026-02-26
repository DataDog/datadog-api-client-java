// Send pipeline job event returns "Request accepted for processing" response
import java.time.OffsetDateTime;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CiVisibilityPipelinesApi;
import com.datadog.api.client.v2.model.CIAppCreatePipelineEventRequest;
import com.datadog.api.client.v2.model.CIAppCreatePipelineEventRequestAttributes;
import com.datadog.api.client.v2.model.CIAppCreatePipelineEventRequestAttributesResource;
import com.datadog.api.client.v2.model.CIAppCreatePipelineEventRequestData;
import com.datadog.api.client.v2.model.CIAppCreatePipelineEventRequestDataSingleOrArray;
import com.datadog.api.client.v2.model.CIAppCreatePipelineEventRequestDataType;
import com.datadog.api.client.v2.model.CIAppPipelineEventJob;
import com.datadog.api.client.v2.model.CIAppPipelineEventJobLevel;
import com.datadog.api.client.v2.model.CIAppPipelineEventJobStatus;
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
    CiVisibilityPipelinesApi apiInstance = new CiVisibilityPipelinesApi(defaultClient);

    CIAppCreatePipelineEventRequest body = new CIAppCreatePipelineEventRequest()
.data(new CIAppCreatePipelineEventRequestDataSingleOrArray(
new CIAppCreatePipelineEventRequestData()
.attributes(new CIAppCreatePipelineEventRequestAttributes()
.resource(new CIAppCreatePipelineEventRequestAttributesResource(
new CIAppPipelineEventJob()
.level(CIAppPipelineEventJobLevel.JOB)
.id("cf9456de-8b9e-4c27-aa79-27b1e78c1a33")
.name("Build image")
.pipelineUniqueId("3eacb6f3-ff04-4e10-8a9c-46e6d054024a")
.pipelineName("Deploy to AWS")
.start(OffsetDateTime.now().plusSeconds(-120))
.end(OffsetDateTime.now().plusSeconds(-30))
.status(CIAppPipelineEventJobStatus.ERROR)
.url("https://my-ci-provider.example/jobs/my-jobs/run/1"))))
.type(CIAppCreatePipelineEventRequestDataType.CIPIPELINE_RESOURCE_REQUEST)));

    try {
      apiInstance.createCIAppPipelineEvent(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling CiVisibilityPipelinesApi#createCIAppPipelineEvent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
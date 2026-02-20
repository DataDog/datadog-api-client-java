// Edit a mobile test returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsCheckType;
import com.datadog.api.client.v1.model.SyntheticsConfigVariable;
import com.datadog.api.client.v1.model.SyntheticsConfigVariableType;
import com.datadog.api.client.v1.model.SyntheticsMobileStep;
import com.datadog.api.client.v1.model.SyntheticsMobileStepParams;
import com.datadog.api.client.v1.model.SyntheticsMobileStepParamsDirection;
import com.datadog.api.client.v1.model.SyntheticsMobileStepParamsElement;
import com.datadog.api.client.v1.model.SyntheticsMobileStepParamsElementContextType;
import com.datadog.api.client.v1.model.SyntheticsMobileStepParamsElementRelativePosition;
import com.datadog.api.client.v1.model.SyntheticsMobileStepParamsElementUserLocator;
import com.datadog.api.client.v1.model.SyntheticsMobileStepParamsElementUserLocatorValuesItems;
import com.datadog.api.client.v1.model.SyntheticsMobileStepParamsElementUserLocatorValuesItemsType;
import com.datadog.api.client.v1.model.SyntheticsMobileStepParamsPositionsItems;
import com.datadog.api.client.v1.model.SyntheticsMobileStepParamsVariable;
import com.datadog.api.client.v1.model.SyntheticsMobileStepType;
import com.datadog.api.client.v1.model.SyntheticsMobileTest;
import com.datadog.api.client.v1.model.SyntheticsMobileTestConfig;
import com.datadog.api.client.v1.model.SyntheticsMobileTestOptions;
import com.datadog.api.client.v1.model.SyntheticsMobileTestType;
import com.datadog.api.client.v1.model.SyntheticsMobileTestsMobileApplication;
import com.datadog.api.client.v1.model.SyntheticsMobileTestsMobileApplicationReferenceType;
import com.datadog.api.client.v1.model.SyntheticsTestCiOptions;
import com.datadog.api.client.v1.model.SyntheticsTestExecutionRule;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsMonitorOptions;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsMonitorOptionsNotificationPresetName;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsRetry;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsScheduling;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsSchedulingTimeframe;
import com.datadog.api.client.v1.model.SyntheticsTestPauseStatus;
import com.datadog.api.client.v1.model.SyntheticsTestRestrictionPolicyBinding;
import com.datadog.api.client.v1.model.SyntheticsTestRestrictionPolicyBindingRelation;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsMobileTest body =
        new SyntheticsMobileTest()
            .config(
                new SyntheticsMobileTestConfig()
                    .variables(
                        Collections.singletonList(
                            new SyntheticsConfigVariable()
                                .name("VARIABLE_NAME")
                                .secure(false)
                                .type(SyntheticsConfigVariableType.TEXT))))
            .deviceIds(Collections.singletonList("chrome.laptop_large"))
            .message("Notification message")
            .name("Example test name")
            .options(
                new SyntheticsMobileTestOptions()
                    .bindings(
                        Collections.singletonList(
                            new SyntheticsTestRestrictionPolicyBinding()
                                .relation(SyntheticsTestRestrictionPolicyBindingRelation.EDITOR)))
                    .ci(
                        new SyntheticsTestCiOptions()
                            .executionRule(SyntheticsTestExecutionRule.BLOCKING))
                    .deviceIds(
                        Collections.singletonList(
                            "synthetics:mobile:device:apple_ipad_10th_gen_2022_ios_16"))
                    .mobileApplication(
                        new SyntheticsMobileTestsMobileApplication()
                            .applicationId("00000000-0000-0000-0000-aaaaaaaaaaaa")
                            .referenceId("00000000-0000-0000-0000-aaaaaaaaaaab")
                            .referenceType(
                                SyntheticsMobileTestsMobileApplicationReferenceType.LATEST))
                    .monitorOptions(
                        new SyntheticsTestOptionsMonitorOptions()
                            .notificationPresetName(
                                SyntheticsTestOptionsMonitorOptionsNotificationPresetName.SHOW_ALL))
                    .restrictedRoles(
                        Collections.singletonList("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"))
                    .retry(new SyntheticsTestOptionsRetry())
                    .scheduling(
                        new SyntheticsTestOptionsScheduling()
                            .timeframes(
                                Arrays.asList(
                                    new SyntheticsTestOptionsSchedulingTimeframe()
                                        .day(1)
                                        .from("07:00")
                                        .to("16:00"),
                                    new SyntheticsTestOptionsSchedulingTimeframe()
                                        .day(3)
                                        .from("07:00")
                                        .to("16:00")))
                            .timezone("America/New_York"))
                    .tickEvery(300L))
            .status(SyntheticsTestPauseStatus.LIVE)
            .steps(
                Collections.singletonList(
                    new SyntheticsMobileStep()
                        .name("")
                        .params(
                            new SyntheticsMobileStepParams()
                                .check(SyntheticsCheckType.EQUALS)
                                .direction(SyntheticsMobileStepParamsDirection.UP)
                                .element(
                                    new SyntheticsMobileStepParamsElement()
                                        .contextType(
                                            SyntheticsMobileStepParamsElementContextType.NATIVE)
                                        .relativePosition(
                                            new SyntheticsMobileStepParamsElementRelativePosition())
                                        .userLocator(
                                            new SyntheticsMobileStepParamsElementUserLocator()
                                                .values(
                                                    Collections.singletonList(
                                                        new SyntheticsMobileStepParamsElementUserLocatorValuesItems()
                                                            .type(
                                                                SyntheticsMobileStepParamsElementUserLocatorValuesItemsType
                                                                    .ACCESSIBILITY_ID)))))
                                .positions(
                                    Collections.singletonList(
                                        new SyntheticsMobileStepParamsPositionsItems()))
                                .variable(
                                    new SyntheticsMobileStepParamsVariable()
                                        .example("")
                                        .name("VAR_NAME")))
                        .publicId("pub-lic-id0")
                        .type(SyntheticsMobileStepType.ASSERTELEMENTCONTENT)))
            .tags(Collections.singletonList("env:production"))
            .type(SyntheticsMobileTestType.MOBILE);

    try {
      SyntheticsMobileTest result = apiInstance.updateMobileTest("public_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#updateMobileTest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Detailed result data for the fast test run. The exact shape of nested fields (<code>request
 * </code>, <code>response</code>, <code>assertions</code>, etc.) depends on the test subtype.
 */
@JsonPropertyOrder({
  SyntheticsFastTestResultDetail.JSON_PROPERTY_ASSERTIONS,
  SyntheticsFastTestResultDetail.JSON_PROPERTY_CALL_TYPE,
  SyntheticsFastTestResultDetail.JSON_PROPERTY_CERT,
  SyntheticsFastTestResultDetail.JSON_PROPERTY_DURATION,
  SyntheticsFastTestResultDetail.JSON_PROPERTY_FAILURE,
  SyntheticsFastTestResultDetail.JSON_PROPERTY_FINISHED_AT,
  SyntheticsFastTestResultDetail.JSON_PROPERTY_ID,
  SyntheticsFastTestResultDetail.JSON_PROPERTY_IS_FAST_RETRY,
  SyntheticsFastTestResultDetail.JSON_PROPERTY_REQUEST,
  SyntheticsFastTestResultDetail.JSON_PROPERTY_RESOLVED_IP,
  SyntheticsFastTestResultDetail.JSON_PROPERTY_RESPONSE,
  SyntheticsFastTestResultDetail.JSON_PROPERTY_RUN_TYPE,
  SyntheticsFastTestResultDetail.JSON_PROPERTY_STARTED_AT,
  SyntheticsFastTestResultDetail.JSON_PROPERTY_STATUS,
  SyntheticsFastTestResultDetail.JSON_PROPERTY_STEPS,
  SyntheticsFastTestResultDetail.JSON_PROPERTY_TIMINGS,
  SyntheticsFastTestResultDetail.JSON_PROPERTY_TRACEROUTE,
  SyntheticsFastTestResultDetail.JSON_PROPERTY_TRIGGERED_AT,
  SyntheticsFastTestResultDetail.JSON_PROPERTY_TUNNEL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsFastTestResultDetail {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSERTIONS = "assertions";
  private List<SyntheticsTestResultAssertionResult> assertions = null;

  public static final String JSON_PROPERTY_CALL_TYPE = "call_type";
  private String callType;

  public static final String JSON_PROPERTY_CERT = "cert";
  private SyntheticsTestResultCertificate cert;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Double duration;

  public static final String JSON_PROPERTY_FAILURE = "failure";
  private SyntheticsTestResultFailure failure;

  public static final String JSON_PROPERTY_FINISHED_AT = "finished_at";
  private Long finishedAt;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_FAST_RETRY = "is_fast_retry";
  private Boolean isFastRetry;

  public static final String JSON_PROPERTY_REQUEST = "request";
  private SyntheticsTestResultRequestInfo request;

  public static final String JSON_PROPERTY_RESOLVED_IP = "resolved_ip";
  private String resolvedIp;

  public static final String JSON_PROPERTY_RESPONSE = "response";
  private SyntheticsTestResultResponseInfo response;

  public static final String JSON_PROPERTY_RUN_TYPE = "run_type";
  private SyntheticsTestResultRunType runType;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private Long startedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<SyntheticsTestResultStep> steps = null;

  public static final String JSON_PROPERTY_TIMINGS = "timings";
  private Map<String, Object> timings = null;

  public static final String JSON_PROPERTY_TRACEROUTE = "traceroute";
  private List<SyntheticsTestResultTracerouteHop> traceroute = null;

  public static final String JSON_PROPERTY_TRIGGERED_AT = "triggered_at";
  private Long triggeredAt;

  public static final String JSON_PROPERTY_TUNNEL = "tunnel";
  private Boolean tunnel;

  public SyntheticsFastTestResultDetail assertions(
      List<SyntheticsTestResultAssertionResult> assertions) {
    this.assertions = assertions;
    for (SyntheticsTestResultAssertionResult item : assertions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsFastTestResultDetail addAssertionsItem(
      SyntheticsTestResultAssertionResult assertionsItem) {
    if (this.assertions == null) {
      this.assertions = new ArrayList<>();
    }
    this.assertions.add(assertionsItem);
    this.unparsed |= assertionsItem.unparsed;
    return this;
  }

  /**
   * Results of each assertion evaluated during the test.
   *
   * @return assertions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSERTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestResultAssertionResult> getAssertions() {
    return assertions;
  }

  public void setAssertions(List<SyntheticsTestResultAssertionResult> assertions) {
    this.assertions = assertions;
  }

  public SyntheticsFastTestResultDetail callType(String callType) {
    this.callType = callType;
    return this;
  }

  /**
   * gRPC call type (for example, <code>unary</code>, <code>healthCheck</code>, or <code>reflection
   * </code>).
   *
   * @return callType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CALL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCallType() {
    return callType;
  }

  public void setCallType(String callType) {
    this.callType = callType;
  }

  public SyntheticsFastTestResultDetail cert(SyntheticsTestResultCertificate cert) {
    this.cert = cert;
    this.unparsed |= cert.unparsed;
    return this;
  }

  /**
   * SSL/TLS certificate information returned from an SSL test.
   *
   * @return cert
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultCertificate getCert() {
    return cert;
  }

  public void setCert(SyntheticsTestResultCertificate cert) {
    this.cert = cert;
  }

  public SyntheticsFastTestResultDetail duration(Double duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Total duration of the test in milliseconds.
   *
   * @return duration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDuration() {
    return duration;
  }

  public void setDuration(Double duration) {
    this.duration = duration;
  }

  public SyntheticsFastTestResultDetail failure(SyntheticsTestResultFailure failure) {
    this.failure = failure;
    this.unparsed |= failure.unparsed;
    return this;
  }

  /**
   * Details about the failure of a Synthetic test.
   *
   * @return failure
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultFailure getFailure() {
    return failure;
  }

  public void setFailure(SyntheticsTestResultFailure failure) {
    this.failure = failure;
  }

  public SyntheticsFastTestResultDetail finishedAt(Long finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * Unix timestamp (ms) of when the test finished.
   *
   * @return finishedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(Long finishedAt) {
    this.finishedAt = finishedAt;
  }

  public SyntheticsFastTestResultDetail id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The result ID. Set to the fast test UUID because no persistent result ID exists for fast tests.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SyntheticsFastTestResultDetail isFastRetry(Boolean isFastRetry) {
    this.isFastRetry = isFastRetry;
    return this;
  }

  /**
   * Whether this result is from an automatic fast retry.
   *
   * @return isFastRetry
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_FAST_RETRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsFastRetry() {
    return isFastRetry;
  }

  public void setIsFastRetry(Boolean isFastRetry) {
    this.isFastRetry = isFastRetry;
  }

  public SyntheticsFastTestResultDetail request(SyntheticsTestResultRequestInfo request) {
    this.request = request;
    this.unparsed |= request.unparsed;
    return this;
  }

  /**
   * Details of the outgoing request made during the test execution.
   *
   * @return request
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultRequestInfo getRequest() {
    return request;
  }

  public void setRequest(SyntheticsTestResultRequestInfo request) {
    this.request = request;
  }

  public SyntheticsFastTestResultDetail resolvedIp(String resolvedIp) {
    this.resolvedIp = resolvedIp;
    return this;
  }

  /**
   * IP address resolved for the target host.
   *
   * @return resolvedIp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOLVED_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResolvedIp() {
    return resolvedIp;
  }

  public void setResolvedIp(String resolvedIp) {
    this.resolvedIp = resolvedIp;
  }

  public SyntheticsFastTestResultDetail response(SyntheticsTestResultResponseInfo response) {
    this.response = response;
    this.unparsed |= response.unparsed;
    return this;
  }

  /**
   * Details of the response received during the test execution.
   *
   * @return response
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultResponseInfo getResponse() {
    return response;
  }

  public void setResponse(SyntheticsTestResultResponseInfo response) {
    this.response = response;
  }

  public SyntheticsFastTestResultDetail runType(SyntheticsTestResultRunType runType) {
    this.runType = runType;
    this.unparsed |= !runType.isValid();
    return this;
  }

  /**
   * The type of run for a Synthetic test result.
   *
   * @return runType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultRunType getRunType() {
    return runType;
  }

  public void setRunType(SyntheticsTestResultRunType runType) {
    if (!runType.isValid()) {
      this.unparsed = true;
    }
    this.runType = runType;
  }

  public SyntheticsFastTestResultDetail startedAt(Long startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Unix timestamp (ms) of when the test started.
   *
   * @return startedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(Long startedAt) {
    this.startedAt = startedAt;
  }

  public SyntheticsFastTestResultDetail status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the test result (<code>passed</code> or <code>failed</code>).
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SyntheticsFastTestResultDetail steps(List<SyntheticsTestResultStep> steps) {
    this.steps = steps;
    for (SyntheticsTestResultStep item : steps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsFastTestResultDetail addStepsItem(SyntheticsTestResultStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    this.unparsed |= stepsItem.unparsed;
    return this;
  }

  /**
   * Step results for multistep API tests.
   *
   * @return steps
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestResultStep> getSteps() {
    return steps;
  }

  public void setSteps(List<SyntheticsTestResultStep> steps) {
    this.steps = steps;
  }

  public SyntheticsFastTestResultDetail timings(Map<String, Object> timings) {
    this.timings = timings;
    return this;
  }

  public SyntheticsFastTestResultDetail putTimingsItem(String key, Object timingsItem) {
    if (this.timings == null) {
      this.timings = new HashMap<>();
    }
    this.timings.put(key, timingsItem);
    return this;
  }

  /**
   * Timing breakdown of the test request phases (for example, DNS, TCP, TLS, first byte).
   *
   * @return timings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getTimings() {
    return timings;
  }

  public void setTimings(Map<String, Object> timings) {
    this.timings = timings;
  }

  public SyntheticsFastTestResultDetail traceroute(
      List<SyntheticsTestResultTracerouteHop> traceroute) {
    this.traceroute = traceroute;
    for (SyntheticsTestResultTracerouteHop item : traceroute) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsFastTestResultDetail addTracerouteItem(
      SyntheticsTestResultTracerouteHop tracerouteItem) {
    if (this.traceroute == null) {
      this.traceroute = new ArrayList<>();
    }
    this.traceroute.add(tracerouteItem);
    this.unparsed |= tracerouteItem.unparsed;
    return this;
  }

  /**
   * Traceroute hop results, present for ICMP and TCP tests.
   *
   * @return traceroute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACEROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestResultTracerouteHop> getTraceroute() {
    return traceroute;
  }

  public void setTraceroute(List<SyntheticsTestResultTracerouteHop> traceroute) {
    this.traceroute = traceroute;
  }

  public SyntheticsFastTestResultDetail triggeredAt(Long triggeredAt) {
    this.triggeredAt = triggeredAt;
    return this;
  }

  /**
   * Unix timestamp (ms) of when the test was triggered.
   *
   * @return triggeredAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRIGGERED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTriggeredAt() {
    return triggeredAt;
  }

  public void setTriggeredAt(Long triggeredAt) {
    this.triggeredAt = triggeredAt;
  }

  public SyntheticsFastTestResultDetail tunnel(Boolean tunnel) {
    this.tunnel = tunnel;
    return this;
  }

  /**
   * Whether the test was run through a Synthetics tunnel.
   *
   * @return tunnel
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TUNNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTunnel() {
    return tunnel;
  }

  public void setTunnel(Boolean tunnel) {
    this.tunnel = tunnel;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SyntheticsFastTestResultDetail
   */
  @JsonAnySetter
  public SyntheticsFastTestResultDetail putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this SyntheticsFastTestResultDetail object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsFastTestResultDetail syntheticsFastTestResultDetail =
        (SyntheticsFastTestResultDetail) o;
    return Objects.equals(this.assertions, syntheticsFastTestResultDetail.assertions)
        && Objects.equals(this.callType, syntheticsFastTestResultDetail.callType)
        && Objects.equals(this.cert, syntheticsFastTestResultDetail.cert)
        && Objects.equals(this.duration, syntheticsFastTestResultDetail.duration)
        && Objects.equals(this.failure, syntheticsFastTestResultDetail.failure)
        && Objects.equals(this.finishedAt, syntheticsFastTestResultDetail.finishedAt)
        && Objects.equals(this.id, syntheticsFastTestResultDetail.id)
        && Objects.equals(this.isFastRetry, syntheticsFastTestResultDetail.isFastRetry)
        && Objects.equals(this.request, syntheticsFastTestResultDetail.request)
        && Objects.equals(this.resolvedIp, syntheticsFastTestResultDetail.resolvedIp)
        && Objects.equals(this.response, syntheticsFastTestResultDetail.response)
        && Objects.equals(this.runType, syntheticsFastTestResultDetail.runType)
        && Objects.equals(this.startedAt, syntheticsFastTestResultDetail.startedAt)
        && Objects.equals(this.status, syntheticsFastTestResultDetail.status)
        && Objects.equals(this.steps, syntheticsFastTestResultDetail.steps)
        && Objects.equals(this.timings, syntheticsFastTestResultDetail.timings)
        && Objects.equals(this.traceroute, syntheticsFastTestResultDetail.traceroute)
        && Objects.equals(this.triggeredAt, syntheticsFastTestResultDetail.triggeredAt)
        && Objects.equals(this.tunnel, syntheticsFastTestResultDetail.tunnel)
        && Objects.equals(
            this.additionalProperties, syntheticsFastTestResultDetail.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assertions,
        callType,
        cert,
        duration,
        failure,
        finishedAt,
        id,
        isFastRetry,
        request,
        resolvedIp,
        response,
        runType,
        startedAt,
        status,
        steps,
        timings,
        traceroute,
        triggeredAt,
        tunnel,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsFastTestResultDetail {\n");
    sb.append("    assertions: ").append(toIndentedString(assertions)).append("\n");
    sb.append("    callType: ").append(toIndentedString(callType)).append("\n");
    sb.append("    cert: ").append(toIndentedString(cert)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isFastRetry: ").append(toIndentedString(isFastRetry)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    resolvedIp: ").append(toIndentedString(resolvedIp)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    runType: ").append(toIndentedString(runType)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    timings: ").append(toIndentedString(timings)).append("\n");
    sb.append("    traceroute: ").append(toIndentedString(traceroute)).append("\n");
    sb.append("    triggeredAt: ").append(toIndentedString(triggeredAt)).append("\n");
    sb.append("    tunnel: ").append(toIndentedString(tunnel)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

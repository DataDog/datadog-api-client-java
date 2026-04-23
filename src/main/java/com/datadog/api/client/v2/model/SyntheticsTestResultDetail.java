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

/** Full result details for a Synthetic test execution. */
@JsonPropertyOrder({
  SyntheticsTestResultDetail.JSON_PROPERTY_ASSERTIONS,
  SyntheticsTestResultDetail.JSON_PROPERTY_BUCKET_KEYS,
  SyntheticsTestResultDetail.JSON_PROPERTY_CALL_TYPE,
  SyntheticsTestResultDetail.JSON_PROPERTY_CERT,
  SyntheticsTestResultDetail.JSON_PROPERTY_COMPRESSED_JSON_DESCRIPTOR,
  SyntheticsTestResultDetail.JSON_PROPERTY_COMPRESSED_STEPS,
  SyntheticsTestResultDetail.JSON_PROPERTY_CONNECTION_OUTCOME,
  SyntheticsTestResultDetail.JSON_PROPERTY_DNS_RESOLUTION,
  SyntheticsTestResultDetail.JSON_PROPERTY_DURATION,
  SyntheticsTestResultDetail.JSON_PROPERTY_EXITED_ON_STEP_SUCCESS,
  SyntheticsTestResultDetail.JSON_PROPERTY_FAILURE,
  SyntheticsTestResultDetail.JSON_PROPERTY_FINISHED_AT,
  SyntheticsTestResultDetail.JSON_PROPERTY_HANDSHAKE,
  SyntheticsTestResultDetail.JSON_PROPERTY_ID,
  SyntheticsTestResultDetail.JSON_PROPERTY_INITIAL_ID,
  SyntheticsTestResultDetail.JSON_PROPERTY_IS_FAST_RETRY,
  SyntheticsTestResultDetail.JSON_PROPERTY_IS_LAST_RETRY,
  SyntheticsTestResultDetail.JSON_PROPERTY_NETPATH,
  SyntheticsTestResultDetail.JSON_PROPERTY_NETSTATS,
  SyntheticsTestResultDetail.JSON_PROPERTY_OCSP,
  SyntheticsTestResultDetail.JSON_PROPERTY_PING,
  SyntheticsTestResultDetail.JSON_PROPERTY_RECEIVED_EMAIL_COUNT,
  SyntheticsTestResultDetail.JSON_PROPERTY_RECEIVED_MESSAGE,
  SyntheticsTestResultDetail.JSON_PROPERTY_REQUEST,
  SyntheticsTestResultDetail.JSON_PROPERTY_RESOLVED_IP,
  SyntheticsTestResultDetail.JSON_PROPERTY_RESPONSE,
  SyntheticsTestResultDetail.JSON_PROPERTY_RUN_TYPE,
  SyntheticsTestResultDetail.JSON_PROPERTY_SENT_MESSAGE,
  SyntheticsTestResultDetail.JSON_PROPERTY_START_URL,
  SyntheticsTestResultDetail.JSON_PROPERTY_STARTED_AT,
  SyntheticsTestResultDetail.JSON_PROPERTY_STATUS,
  SyntheticsTestResultDetail.JSON_PROPERTY_STEPS,
  SyntheticsTestResultDetail.JSON_PROPERTY_TIME_TO_INTERACTIVE,
  SyntheticsTestResultDetail.JSON_PROPERTY_TIMINGS,
  SyntheticsTestResultDetail.JSON_PROPERTY_TRACE,
  SyntheticsTestResultDetail.JSON_PROPERTY_TRACEROUTE,
  SyntheticsTestResultDetail.JSON_PROPERTY_TRIGGERED_AT,
  SyntheticsTestResultDetail.JSON_PROPERTY_TUNNEL,
  SyntheticsTestResultDetail.JSON_PROPERTY_TURNS,
  SyntheticsTestResultDetail.JSON_PROPERTY_UNHEALTHY,
  SyntheticsTestResultDetail.JSON_PROPERTY_VARIABLES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultDetail {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSERTIONS = "assertions";
  private List<SyntheticsTestResultAssertionResult> assertions = null;

  public static final String JSON_PROPERTY_BUCKET_KEYS = "bucket_keys";
  private SyntheticsTestResultBucketKeys bucketKeys;

  public static final String JSON_PROPERTY_CALL_TYPE = "call_type";
  private String callType;

  public static final String JSON_PROPERTY_CERT = "cert";
  private SyntheticsTestResultCertificate cert;

  public static final String JSON_PROPERTY_COMPRESSED_JSON_DESCRIPTOR =
      "compressed_json_descriptor";
  private String compressedJsonDescriptor;

  public static final String JSON_PROPERTY_COMPRESSED_STEPS = "compressed_steps";
  private String compressedSteps;

  public static final String JSON_PROPERTY_CONNECTION_OUTCOME = "connection_outcome";
  private String connectionOutcome;

  public static final String JSON_PROPERTY_DNS_RESOLUTION = "dns_resolution";
  private SyntheticsTestResultDnsResolution dnsResolution;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Double duration;

  public static final String JSON_PROPERTY_EXITED_ON_STEP_SUCCESS = "exited_on_step_success";
  private Boolean exitedOnStepSuccess;

  public static final String JSON_PROPERTY_FAILURE = "failure";
  private SyntheticsTestResultFailure failure;

  public static final String JSON_PROPERTY_FINISHED_AT = "finished_at";
  private Long finishedAt;

  public static final String JSON_PROPERTY_HANDSHAKE = "handshake";
  private SyntheticsTestResultHandshake handshake;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INITIAL_ID = "initial_id";
  private String initialId;

  public static final String JSON_PROPERTY_IS_FAST_RETRY = "is_fast_retry";
  private Boolean isFastRetry;

  public static final String JSON_PROPERTY_IS_LAST_RETRY = "is_last_retry";
  private Boolean isLastRetry;

  public static final String JSON_PROPERTY_NETPATH = "netpath";
  private SyntheticsTestResultNetpath netpath;

  public static final String JSON_PROPERTY_NETSTATS = "netstats";
  private SyntheticsTestResultNetstats netstats;

  public static final String JSON_PROPERTY_OCSP = "ocsp";
  private SyntheticsTestResultOCSPResponse ocsp;

  public static final String JSON_PROPERTY_PING = "ping";
  private SyntheticsTestResultTracerouteHop ping;

  public static final String JSON_PROPERTY_RECEIVED_EMAIL_COUNT = "received_email_count";
  private Long receivedEmailCount;

  public static final String JSON_PROPERTY_RECEIVED_MESSAGE = "received_message";
  private String receivedMessage;

  public static final String JSON_PROPERTY_REQUEST = "request";
  private SyntheticsTestResultRequestInfo request;

  public static final String JSON_PROPERTY_RESOLVED_IP = "resolved_ip";
  private String resolvedIp;

  public static final String JSON_PROPERTY_RESPONSE = "response";
  private SyntheticsTestResultResponseInfo response;

  public static final String JSON_PROPERTY_RUN_TYPE = "run_type";
  private SyntheticsTestResultRunType runType;

  public static final String JSON_PROPERTY_SENT_MESSAGE = "sent_message";
  private String sentMessage;

  public static final String JSON_PROPERTY_START_URL = "start_url";
  private String startUrl;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private Long startedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SyntheticsTestResultStatus status;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<SyntheticsTestResultStep> steps = null;

  public static final String JSON_PROPERTY_TIME_TO_INTERACTIVE = "time_to_interactive";
  private Long timeToInteractive;

  public static final String JSON_PROPERTY_TIMINGS = "timings";
  private Map<String, Object> timings = null;

  public static final String JSON_PROPERTY_TRACE = "trace";
  private SyntheticsTestResultTrace trace;

  public static final String JSON_PROPERTY_TRACEROUTE = "traceroute";
  private List<SyntheticsTestResultTracerouteHop> traceroute = null;

  public static final String JSON_PROPERTY_TRIGGERED_AT = "triggered_at";
  private Long triggeredAt;

  public static final String JSON_PROPERTY_TUNNEL = "tunnel";
  private Boolean tunnel;

  public static final String JSON_PROPERTY_TURNS = "turns";
  private List<SyntheticsTestResultTurn> turns = null;

  public static final String JSON_PROPERTY_UNHEALTHY = "unhealthy";
  private Boolean unhealthy;

  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private SyntheticsTestResultVariables variables;

  public SyntheticsTestResultDetail assertions(
      List<SyntheticsTestResultAssertionResult> assertions) {
    this.assertions = assertions;
    for (SyntheticsTestResultAssertionResult item : assertions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestResultDetail addAssertionsItem(
      SyntheticsTestResultAssertionResult assertionsItem) {
    if (this.assertions == null) {
      this.assertions = new ArrayList<>();
    }
    this.assertions.add(assertionsItem);
    this.unparsed |= assertionsItem.unparsed;
    return this;
  }

  /**
   * Assertion results produced by the test.
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

  public SyntheticsTestResultDetail bucketKeys(SyntheticsTestResultBucketKeys bucketKeys) {
    this.bucketKeys = bucketKeys;
    this.unparsed |= bucketKeys.unparsed;
    return this;
  }

  /**
   * Storage bucket keys for artifacts produced during a step or test.
   *
   * @return bucketKeys
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUCKET_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultBucketKeys getBucketKeys() {
    return bucketKeys;
  }

  public void setBucketKeys(SyntheticsTestResultBucketKeys bucketKeys) {
    this.bucketKeys = bucketKeys;
  }

  public SyntheticsTestResultDetail callType(String callType) {
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

  public SyntheticsTestResultDetail cert(SyntheticsTestResultCertificate cert) {
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

  public SyntheticsTestResultDetail compressedJsonDescriptor(String compressedJsonDescriptor) {
    this.compressedJsonDescriptor = compressedJsonDescriptor;
    return this;
  }

  /**
   * Compressed JSON descriptor for the test (internal format).
   *
   * @return compressedJsonDescriptor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPRESSED_JSON_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCompressedJsonDescriptor() {
    return compressedJsonDescriptor;
  }

  public void setCompressedJsonDescriptor(String compressedJsonDescriptor) {
    this.compressedJsonDescriptor = compressedJsonDescriptor;
  }

  public SyntheticsTestResultDetail compressedSteps(String compressedSteps) {
    this.compressedSteps = compressedSteps;
    return this;
  }

  /**
   * Compressed representation of the test steps (internal format).
   *
   * @return compressedSteps
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPRESSED_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCompressedSteps() {
    return compressedSteps;
  }

  public void setCompressedSteps(String compressedSteps) {
    this.compressedSteps = compressedSteps;
  }

  public SyntheticsTestResultDetail connectionOutcome(String connectionOutcome) {
    this.connectionOutcome = connectionOutcome;
    return this;
  }

  /**
   * Outcome of the connection attempt (for example, <code>established</code>, <code>refused</code>
   * ).
   *
   * @return connectionOutcome
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTION_OUTCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getConnectionOutcome() {
    return connectionOutcome;
  }

  public void setConnectionOutcome(String connectionOutcome) {
    this.connectionOutcome = connectionOutcome;
  }

  public SyntheticsTestResultDetail dnsResolution(SyntheticsTestResultDnsResolution dnsResolution) {
    this.dnsResolution = dnsResolution;
    this.unparsed |= dnsResolution.unparsed;
    return this;
  }

  /**
   * DNS resolution details recorded during the test execution.
   *
   * @return dnsResolution
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultDnsResolution getDnsResolution() {
    return dnsResolution;
  }

  public void setDnsResolution(SyntheticsTestResultDnsResolution dnsResolution) {
    this.dnsResolution = dnsResolution;
  }

  public SyntheticsTestResultDetail duration(Double duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Duration of the test execution (in milliseconds).
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

  public SyntheticsTestResultDetail exitedOnStepSuccess(Boolean exitedOnStepSuccess) {
    this.exitedOnStepSuccess = exitedOnStepSuccess;
    return this;
  }

  /**
   * Whether the test exited early because a step marked with <code>exitIfSucceed</code> passed.
   *
   * @return exitedOnStepSuccess
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXITED_ON_STEP_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExitedOnStepSuccess() {
    return exitedOnStepSuccess;
  }

  public void setExitedOnStepSuccess(Boolean exitedOnStepSuccess) {
    this.exitedOnStepSuccess = exitedOnStepSuccess;
  }

  public SyntheticsTestResultDetail failure(SyntheticsTestResultFailure failure) {
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

  public SyntheticsTestResultDetail finishedAt(Long finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * Timestamp of when the test finished (in milliseconds).
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

  public SyntheticsTestResultDetail handshake(SyntheticsTestResultHandshake handshake) {
    this.handshake = handshake;
    this.unparsed |= handshake.unparsed;
    return this;
  }

  /**
   * Handshake request and response for protocol-level tests.
   *
   * @return handshake
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HANDSHAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultHandshake getHandshake() {
    return handshake;
  }

  public void setHandshake(SyntheticsTestResultHandshake handshake) {
    this.handshake = handshake;
  }

  public SyntheticsTestResultDetail id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this result.
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

  public SyntheticsTestResultDetail initialId(String initialId) {
    this.initialId = initialId;
    return this;
  }

  /**
   * The initial result ID before any retries.
   *
   * @return initialId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INITIAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInitialId() {
    return initialId;
  }

  public void setInitialId(String initialId) {
    this.initialId = initialId;
  }

  public SyntheticsTestResultDetail isFastRetry(Boolean isFastRetry) {
    this.isFastRetry = isFastRetry;
    return this;
  }

  /**
   * Whether this result is from a fast retry.
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

  public SyntheticsTestResultDetail isLastRetry(Boolean isLastRetry) {
    this.isLastRetry = isLastRetry;
    return this;
  }

  /**
   * Whether this result is from the last retry.
   *
   * @return isLastRetry
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_LAST_RETRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsLastRetry() {
    return isLastRetry;
  }

  public void setIsLastRetry(Boolean isLastRetry) {
    this.isLastRetry = isLastRetry;
  }

  public SyntheticsTestResultDetail netpath(SyntheticsTestResultNetpath netpath) {
    this.netpath = netpath;
    this.unparsed |= netpath.unparsed;
    return this;
  }

  /**
   * Network Path test result capturing the path between source and destination.
   *
   * @return netpath
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETPATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultNetpath getNetpath() {
    return netpath;
  }

  public void setNetpath(SyntheticsTestResultNetpath netpath) {
    this.netpath = netpath;
  }

  public SyntheticsTestResultDetail netstats(SyntheticsTestResultNetstats netstats) {
    this.netstats = netstats;
    this.unparsed |= netstats.unparsed;
    return this;
  }

  /**
   * Aggregated network statistics from the test execution.
   *
   * @return netstats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETSTATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultNetstats getNetstats() {
    return netstats;
  }

  public void setNetstats(SyntheticsTestResultNetstats netstats) {
    this.netstats = netstats;
  }

  public SyntheticsTestResultDetail ocsp(SyntheticsTestResultOCSPResponse ocsp) {
    this.ocsp = ocsp;
    this.unparsed |= ocsp.unparsed;
    return this;
  }

  /**
   * OCSP response received while validating a certificate.
   *
   * @return ocsp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OCSP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultOCSPResponse getOcsp() {
    return ocsp;
  }

  public void setOcsp(SyntheticsTestResultOCSPResponse ocsp) {
    this.ocsp = ocsp;
  }

  public SyntheticsTestResultDetail ping(SyntheticsTestResultTracerouteHop ping) {
    this.ping = ping;
    this.unparsed |= ping.unparsed;
    return this;
  }

  /**
   * A network probe result, used for traceroute hops and ping summaries.
   *
   * @return ping
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultTracerouteHop getPing() {
    return ping;
  }

  public void setPing(SyntheticsTestResultTracerouteHop ping) {
    this.ping = ping;
  }

  public SyntheticsTestResultDetail receivedEmailCount(Long receivedEmailCount) {
    this.receivedEmailCount = receivedEmailCount;
    return this;
  }

  /**
   * Number of emails received during the test (email tests).
   *
   * @return receivedEmailCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVED_EMAIL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getReceivedEmailCount() {
    return receivedEmailCount;
  }

  public void setReceivedEmailCount(Long receivedEmailCount) {
    this.receivedEmailCount = receivedEmailCount;
  }

  public SyntheticsTestResultDetail receivedMessage(String receivedMessage) {
    this.receivedMessage = receivedMessage;
    return this;
  }

  /**
   * Message received from the target (for WebSocket/TCP/UDP tests).
   *
   * @return receivedMessage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVED_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReceivedMessage() {
    return receivedMessage;
  }

  public void setReceivedMessage(String receivedMessage) {
    this.receivedMessage = receivedMessage;
  }

  public SyntheticsTestResultDetail request(SyntheticsTestResultRequestInfo request) {
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

  public SyntheticsTestResultDetail resolvedIp(String resolvedIp) {
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

  public SyntheticsTestResultDetail response(SyntheticsTestResultResponseInfo response) {
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

  public SyntheticsTestResultDetail runType(SyntheticsTestResultRunType runType) {
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

  public SyntheticsTestResultDetail sentMessage(String sentMessage) {
    this.sentMessage = sentMessage;
    return this;
  }

  /**
   * Message sent to the target (for WebSocket/TCP/UDP tests).
   *
   * @return sentMessage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENT_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSentMessage() {
    return sentMessage;
  }

  public void setSentMessage(String sentMessage) {
    this.sentMessage = sentMessage;
  }

  public SyntheticsTestResultDetail startUrl(String startUrl) {
    this.startUrl = startUrl;
    return this;
  }

  /**
   * Start URL for the test (browser tests).
   *
   * @return startUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStartUrl() {
    return startUrl;
  }

  public void setStartUrl(String startUrl) {
    this.startUrl = startUrl;
  }

  public SyntheticsTestResultDetail startedAt(Long startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Timestamp of when the test started (in milliseconds).
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

  public SyntheticsTestResultDetail status(SyntheticsTestResultStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Status of a Synthetic test result.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultStatus getStatus() {
    return status;
  }

  public void setStatus(SyntheticsTestResultStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public SyntheticsTestResultDetail steps(List<SyntheticsTestResultStep> steps) {
    this.steps = steps;
    for (SyntheticsTestResultStep item : steps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestResultDetail addStepsItem(SyntheticsTestResultStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    this.unparsed |= stepsItem.unparsed;
    return this;
  }

  /**
   * Step results (for browser, mobile, and multistep API tests).
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

  public SyntheticsTestResultDetail timeToInteractive(Long timeToInteractive) {
    this.timeToInteractive = timeToInteractive;
    return this;
  }

  /**
   * Time to interactive in milliseconds (browser tests).
   *
   * @return timeToInteractive
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_TO_INTERACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimeToInteractive() {
    return timeToInteractive;
  }

  public void setTimeToInteractive(Long timeToInteractive) {
    this.timeToInteractive = timeToInteractive;
  }

  public SyntheticsTestResultDetail timings(Map<String, Object> timings) {
    this.timings = timings;
    return this;
  }

  public SyntheticsTestResultDetail putTimingsItem(String key, Object timingsItem) {
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

  public SyntheticsTestResultDetail trace(SyntheticsTestResultTrace trace) {
    this.trace = trace;
    this.unparsed |= trace.unparsed;
    return this;
  }

  /**
   * Trace identifiers associated with a Synthetic test result.
   *
   * @return trace
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultTrace getTrace() {
    return trace;
  }

  public void setTrace(SyntheticsTestResultTrace trace) {
    this.trace = trace;
  }

  public SyntheticsTestResultDetail traceroute(List<SyntheticsTestResultTracerouteHop> traceroute) {
    this.traceroute = traceroute;
    for (SyntheticsTestResultTracerouteHop item : traceroute) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestResultDetail addTracerouteItem(
      SyntheticsTestResultTracerouteHop tracerouteItem) {
    if (this.traceroute == null) {
      this.traceroute = new ArrayList<>();
    }
    this.traceroute.add(tracerouteItem);
    this.unparsed |= tracerouteItem.unparsed;
    return this;
  }

  /**
   * Traceroute hop results (for network tests).
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

  public SyntheticsTestResultDetail triggeredAt(Long triggeredAt) {
    this.triggeredAt = triggeredAt;
    return this;
  }

  /**
   * Timestamp of when the test was triggered (in milliseconds).
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

  public SyntheticsTestResultDetail tunnel(Boolean tunnel) {
    this.tunnel = tunnel;
    return this;
  }

  /**
   * Whether the test was executed through a tunnel.
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

  public SyntheticsTestResultDetail turns(List<SyntheticsTestResultTurn> turns) {
    this.turns = turns;
    for (SyntheticsTestResultTurn item : turns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestResultDetail addTurnsItem(SyntheticsTestResultTurn turnsItem) {
    if (this.turns == null) {
      this.turns = new ArrayList<>();
    }
    this.turns.add(turnsItem);
    this.unparsed |= turnsItem.unparsed;
    return this;
  }

  /**
   * Turns executed by a goal-based browser test.
   *
   * @return turns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TURNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestResultTurn> getTurns() {
    return turns;
  }

  public void setTurns(List<SyntheticsTestResultTurn> turns) {
    this.turns = turns;
  }

  public SyntheticsTestResultDetail unhealthy(Boolean unhealthy) {
    this.unhealthy = unhealthy;
    return this;
  }

  /**
   * Whether the test runner was unhealthy at the time of execution.
   *
   * @return unhealthy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNHEALTHY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUnhealthy() {
    return unhealthy;
  }

  public void setUnhealthy(Boolean unhealthy) {
    this.unhealthy = unhealthy;
  }

  public SyntheticsTestResultDetail variables(SyntheticsTestResultVariables variables) {
    this.variables = variables;
    this.unparsed |= variables.unparsed;
    return this;
  }

  /**
   * Variables captured during a test step.
   *
   * @return variables
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultVariables getVariables() {
    return variables;
  }

  public void setVariables(SyntheticsTestResultVariables variables) {
    this.variables = variables;
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
   * @return SyntheticsTestResultDetail
   */
  @JsonAnySetter
  public SyntheticsTestResultDetail putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultDetail object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultDetail syntheticsTestResultDetail = (SyntheticsTestResultDetail) o;
    return Objects.equals(this.assertions, syntheticsTestResultDetail.assertions)
        && Objects.equals(this.bucketKeys, syntheticsTestResultDetail.bucketKeys)
        && Objects.equals(this.callType, syntheticsTestResultDetail.callType)
        && Objects.equals(this.cert, syntheticsTestResultDetail.cert)
        && Objects.equals(
            this.compressedJsonDescriptor, syntheticsTestResultDetail.compressedJsonDescriptor)
        && Objects.equals(this.compressedSteps, syntheticsTestResultDetail.compressedSteps)
        && Objects.equals(this.connectionOutcome, syntheticsTestResultDetail.connectionOutcome)
        && Objects.equals(this.dnsResolution, syntheticsTestResultDetail.dnsResolution)
        && Objects.equals(this.duration, syntheticsTestResultDetail.duration)
        && Objects.equals(this.exitedOnStepSuccess, syntheticsTestResultDetail.exitedOnStepSuccess)
        && Objects.equals(this.failure, syntheticsTestResultDetail.failure)
        && Objects.equals(this.finishedAt, syntheticsTestResultDetail.finishedAt)
        && Objects.equals(this.handshake, syntheticsTestResultDetail.handshake)
        && Objects.equals(this.id, syntheticsTestResultDetail.id)
        && Objects.equals(this.initialId, syntheticsTestResultDetail.initialId)
        && Objects.equals(this.isFastRetry, syntheticsTestResultDetail.isFastRetry)
        && Objects.equals(this.isLastRetry, syntheticsTestResultDetail.isLastRetry)
        && Objects.equals(this.netpath, syntheticsTestResultDetail.netpath)
        && Objects.equals(this.netstats, syntheticsTestResultDetail.netstats)
        && Objects.equals(this.ocsp, syntheticsTestResultDetail.ocsp)
        && Objects.equals(this.ping, syntheticsTestResultDetail.ping)
        && Objects.equals(this.receivedEmailCount, syntheticsTestResultDetail.receivedEmailCount)
        && Objects.equals(this.receivedMessage, syntheticsTestResultDetail.receivedMessage)
        && Objects.equals(this.request, syntheticsTestResultDetail.request)
        && Objects.equals(this.resolvedIp, syntheticsTestResultDetail.resolvedIp)
        && Objects.equals(this.response, syntheticsTestResultDetail.response)
        && Objects.equals(this.runType, syntheticsTestResultDetail.runType)
        && Objects.equals(this.sentMessage, syntheticsTestResultDetail.sentMessage)
        && Objects.equals(this.startUrl, syntheticsTestResultDetail.startUrl)
        && Objects.equals(this.startedAt, syntheticsTestResultDetail.startedAt)
        && Objects.equals(this.status, syntheticsTestResultDetail.status)
        && Objects.equals(this.steps, syntheticsTestResultDetail.steps)
        && Objects.equals(this.timeToInteractive, syntheticsTestResultDetail.timeToInteractive)
        && Objects.equals(this.timings, syntheticsTestResultDetail.timings)
        && Objects.equals(this.trace, syntheticsTestResultDetail.trace)
        && Objects.equals(this.traceroute, syntheticsTestResultDetail.traceroute)
        && Objects.equals(this.triggeredAt, syntheticsTestResultDetail.triggeredAt)
        && Objects.equals(this.tunnel, syntheticsTestResultDetail.tunnel)
        && Objects.equals(this.turns, syntheticsTestResultDetail.turns)
        && Objects.equals(this.unhealthy, syntheticsTestResultDetail.unhealthy)
        && Objects.equals(this.variables, syntheticsTestResultDetail.variables)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultDetail.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assertions,
        bucketKeys,
        callType,
        cert,
        compressedJsonDescriptor,
        compressedSteps,
        connectionOutcome,
        dnsResolution,
        duration,
        exitedOnStepSuccess,
        failure,
        finishedAt,
        handshake,
        id,
        initialId,
        isFastRetry,
        isLastRetry,
        netpath,
        netstats,
        ocsp,
        ping,
        receivedEmailCount,
        receivedMessage,
        request,
        resolvedIp,
        response,
        runType,
        sentMessage,
        startUrl,
        startedAt,
        status,
        steps,
        timeToInteractive,
        timings,
        trace,
        traceroute,
        triggeredAt,
        tunnel,
        turns,
        unhealthy,
        variables,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultDetail {\n");
    sb.append("    assertions: ").append(toIndentedString(assertions)).append("\n");
    sb.append("    bucketKeys: ").append(toIndentedString(bucketKeys)).append("\n");
    sb.append("    callType: ").append(toIndentedString(callType)).append("\n");
    sb.append("    cert: ").append(toIndentedString(cert)).append("\n");
    sb.append("    compressedJsonDescriptor: ")
        .append(toIndentedString(compressedJsonDescriptor))
        .append("\n");
    sb.append("    compressedSteps: ").append(toIndentedString(compressedSteps)).append("\n");
    sb.append("    connectionOutcome: ").append(toIndentedString(connectionOutcome)).append("\n");
    sb.append("    dnsResolution: ").append(toIndentedString(dnsResolution)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    exitedOnStepSuccess: ")
        .append(toIndentedString(exitedOnStepSuccess))
        .append("\n");
    sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    handshake: ").append(toIndentedString(handshake)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initialId: ").append(toIndentedString(initialId)).append("\n");
    sb.append("    isFastRetry: ").append(toIndentedString(isFastRetry)).append("\n");
    sb.append("    isLastRetry: ").append(toIndentedString(isLastRetry)).append("\n");
    sb.append("    netpath: ").append(toIndentedString(netpath)).append("\n");
    sb.append("    netstats: ").append(toIndentedString(netstats)).append("\n");
    sb.append("    ocsp: ").append(toIndentedString(ocsp)).append("\n");
    sb.append("    ping: ").append(toIndentedString(ping)).append("\n");
    sb.append("    receivedEmailCount: ").append(toIndentedString(receivedEmailCount)).append("\n");
    sb.append("    receivedMessage: ").append(toIndentedString(receivedMessage)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    resolvedIp: ").append(toIndentedString(resolvedIp)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    runType: ").append(toIndentedString(runType)).append("\n");
    sb.append("    sentMessage: ").append(toIndentedString(sentMessage)).append("\n");
    sb.append("    startUrl: ").append(toIndentedString(startUrl)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    timeToInteractive: ").append(toIndentedString(timeToInteractive)).append("\n");
    sb.append("    timings: ").append(toIndentedString(timings)).append("\n");
    sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
    sb.append("    traceroute: ").append(toIndentedString(traceroute)).append("\n");
    sb.append("    triggeredAt: ").append(toIndentedString(triggeredAt)).append("\n");
    sb.append("    tunnel: ").append(toIndentedString(tunnel)).append("\n");
    sb.append("    turns: ").append(toIndentedString(turns)).append("\n");
    sb.append("    unhealthy: ").append(toIndentedString(unhealthy)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

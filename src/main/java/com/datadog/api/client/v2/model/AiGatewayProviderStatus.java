/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Read-only. Whether the provider is working, based on the model sync and live calls. Omitted for
 * providers that are never checked, which include providers without an integration account, and
 * Azure OpenAI and Gemini providers until live traffic records a status.
 */
@JsonPropertyOrder({
  AiGatewayProviderStatus.JSON_PROPERTY_CHECKED_AT,
  AiGatewayProviderStatus.JSON_PROPERTY_ENDPOINT,
  AiGatewayProviderStatus.JSON_PROPERTY_FIX,
  AiGatewayProviderStatus.JSON_PROPERTY_HTTP_STATUS,
  AiGatewayProviderStatus.JSON_PROPERTY_LABEL,
  AiGatewayProviderStatus.JSON_PROPERTY_LAST_OK_AT,
  AiGatewayProviderStatus.JSON_PROPERTY_MESSAGE,
  AiGatewayProviderStatus.JSON_PROPERTY_REASON,
  AiGatewayProviderStatus.JSON_PROPERTY_STATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayProviderStatus {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHECKED_AT = "checked_at";
  private OffsetDateTime checkedAt;

  public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
  private String endpoint;

  public static final String JSON_PROPERTY_FIX = "fix";
  private String fix;

  public static final String JSON_PROPERTY_HTTP_STATUS = "http_status";
  private Long httpStatus;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_LAST_OK_AT = "last_ok_at";
  private OffsetDateTime lastOkAt;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public static final String JSON_PROPERTY_STATE = "state";
  private AiGatewayProviderStatusState state;

  public AiGatewayProviderStatus() {}

  @JsonCreator
  public AiGatewayProviderStatus(
      @JsonProperty(required = true, value = JSON_PROPERTY_STATE)
          AiGatewayProviderStatusState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
  }

  public AiGatewayProviderStatus checkedAt(OffsetDateTime checkedAt) {
    this.checkedAt = checkedAt;
    return this;
  }

  /**
   * Time of the last observation.
   *
   * @return checkedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECKED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCheckedAt() {
    return checkedAt;
  }

  public void setCheckedAt(OffsetDateTime checkedAt) {
    this.checkedAt = checkedAt;
  }

  public AiGatewayProviderStatus endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Address of the models endpoint that the gateway called, for custom providers.
   *
   * @return endpoint
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public AiGatewayProviderStatus fix(String fix) {
    this.fix = fix;
    return this;
  }

  /**
   * Display text saying how to fix the provider. Clients render it as-is.
   *
   * @return fix
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFix() {
    return fix;
  }

  public void setFix(String fix) {
    this.fix = fix;
  }

  public AiGatewayProviderStatus httpStatus(Long httpStatus) {
    this.httpStatus = httpStatus;
    return this;
  }

  /**
   * HTTP status code that the provider returned.
   *
   * @return httpStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getHttpStatus() {
    return httpStatus;
  }

  public void setHttpStatus(Long httpStatus) {
    this.httpStatus = httpStatus;
  }

  public AiGatewayProviderStatus label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Display text for the reason. Clients render it as-is.
   *
   * @return label
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public AiGatewayProviderStatus lastOkAt(OffsetDateTime lastOkAt) {
    this.lastOkAt = lastOkAt;
    return this;
  }

  /**
   * Time of the last observation in which the provider worked.
   *
   * @return lastOkAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_OK_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getLastOkAt() {
    return lastOkAt;
  }

  public void setLastOkAt(OffsetDateTime lastOkAt) {
    this.lastOkAt = lastOkAt;
  }

  public AiGatewayProviderStatus message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The provider's own error message, with credentials removed. Never set for custom providers.
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AiGatewayProviderStatus reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Why the provider is invalid, as a stable code such as <code>credentials_rejected</code>. Set
   * only when <code>state</code> is <code>invalid</code>.
   *
   * @return reason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public AiGatewayProviderStatus state(AiGatewayProviderStatusState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * Whether the provider is working. <code>checking</code> means no observation has been recorded
   * yet, not that a check is running.
   *
   * @return state
   */
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayProviderStatusState getState() {
    return state;
  }

  public void setState(AiGatewayProviderStatusState state) {
    if (!state.isValid()) {
      this.unparsed = true;
    }
    this.state = state;
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
   * @return AiGatewayProviderStatus
   */
  @JsonAnySetter
  public AiGatewayProviderStatus putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayProviderStatus object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayProviderStatus aiGatewayProviderStatus = (AiGatewayProviderStatus) o;
    return Objects.equals(this.checkedAt, aiGatewayProviderStatus.checkedAt)
        && Objects.equals(this.endpoint, aiGatewayProviderStatus.endpoint)
        && Objects.equals(this.fix, aiGatewayProviderStatus.fix)
        && Objects.equals(this.httpStatus, aiGatewayProviderStatus.httpStatus)
        && Objects.equals(this.label, aiGatewayProviderStatus.label)
        && Objects.equals(this.lastOkAt, aiGatewayProviderStatus.lastOkAt)
        && Objects.equals(this.message, aiGatewayProviderStatus.message)
        && Objects.equals(this.reason, aiGatewayProviderStatus.reason)
        && Objects.equals(this.state, aiGatewayProviderStatus.state)
        && Objects.equals(this.additionalProperties, aiGatewayProviderStatus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        checkedAt,
        endpoint,
        fix,
        httpStatus,
        label,
        lastOkAt,
        message,
        reason,
        state,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayProviderStatus {\n");
    sb.append("    checkedAt: ").append(toIndentedString(checkedAt)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    fix: ").append(toIndentedString(fix)).append("\n");
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    lastOkAt: ").append(toIndentedString(lastOkAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

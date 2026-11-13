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
 * Why the scheduled end couldn't run. It isn't retried until the end or fallback changes. Absent
 * when there's no failure.
 */
@JsonPropertyOrder({
  ExperimentsBanditScheduledEndFailureV2.JSON_PROPERTY_FAILED_AT,
  ExperimentsBanditScheduledEndFailureV2.JSON_PROPERTY_REASON
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditScheduledEndFailureV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FAILED_AT = "failed_at";
  private OffsetDateTime failedAt;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public ExperimentsBanditScheduledEndFailureV2() {}

  @JsonCreator
  public ExperimentsBanditScheduledEndFailureV2(
      @JsonProperty(required = true, value = JSON_PROPERTY_FAILED_AT) OffsetDateTime failedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_REASON) String reason) {
    this.failedAt = failedAt;
    this.reason = reason;
  }

  public ExperimentsBanditScheduledEndFailureV2 failedAt(OffsetDateTime failedAt) {
    this.failedAt = failedAt;
    return this;
  }

  /**
   * When the scheduled end failed.
   *
   * @return failedAt
   */
  @JsonProperty(JSON_PROPERTY_FAILED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getFailedAt() {
    return failedAt;
  }

  public void setFailedAt(OffsetDateTime failedAt) {
    this.failedAt = failedAt;
  }

  public ExperimentsBanditScheduledEndFailureV2 reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Why the scheduled end failed.
   *
   * @return reason
   */
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
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
   * @return ExperimentsBanditScheduledEndFailureV2
   */
  @JsonAnySetter
  public ExperimentsBanditScheduledEndFailureV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsBanditScheduledEndFailureV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditScheduledEndFailureV2 experimentsBanditScheduledEndFailureV2 =
        (ExperimentsBanditScheduledEndFailureV2) o;
    return Objects.equals(this.failedAt, experimentsBanditScheduledEndFailureV2.failedAt)
        && Objects.equals(this.reason, experimentsBanditScheduledEndFailureV2.reason)
        && Objects.equals(
            this.additionalProperties, experimentsBanditScheduledEndFailureV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failedAt, reason, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditScheduledEndFailureV2 {\n");
    sb.append("    failedAt: ").append(toIndentedString(failedAt)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

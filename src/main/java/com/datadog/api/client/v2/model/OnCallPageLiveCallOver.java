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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Information about a live call that has ended. */
@JsonPropertyOrder({
  OnCallPageLiveCallOver.JSON_PROPERTY_OUTCOME,
  OnCallPageLiveCallOver.JSON_PROPERTY_SUPPORT_HOURS_START_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OnCallPageLiveCallOver {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OUTCOME = "outcome";
  private OnCallPageLiveCallOutcome outcome;

  public static final String JSON_PROPERTY_SUPPORT_HOURS_START_AT = "support_hours_start_at";
  private OffsetDateTime supportHoursStartAt;

  public OnCallPageLiveCallOver outcome(OnCallPageLiveCallOutcome outcome) {
    this.outcome = outcome;
    this.unparsed |= !outcome.isValid();
    return this;
  }

  /**
   * The outcome of a live call that has ended.
   *
   * @return outcome
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OnCallPageLiveCallOutcome getOutcome() {
    return outcome;
  }

  public void setOutcome(OnCallPageLiveCallOutcome outcome) {
    if (!outcome.isValid()) {
      this.unparsed = true;
    }
    this.outcome = outcome;
  }

  public OnCallPageLiveCallOver supportHoursStartAt(OffsetDateTime supportHoursStartAt) {
    this.supportHoursStartAt = supportHoursStartAt;
    return this;
  }

  /**
   * When support hours start, if the call was placed outside support hours.
   *
   * @return supportHoursStartAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPORT_HOURS_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getSupportHoursStartAt() {
    return supportHoursStartAt;
  }

  public void setSupportHoursStartAt(OffsetDateTime supportHoursStartAt) {
    this.supportHoursStartAt = supportHoursStartAt;
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
   * @return OnCallPageLiveCallOver
   */
  @JsonAnySetter
  public OnCallPageLiveCallOver putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OnCallPageLiveCallOver object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnCallPageLiveCallOver onCallPageLiveCallOver = (OnCallPageLiveCallOver) o;
    return Objects.equals(this.outcome, onCallPageLiveCallOver.outcome)
        && Objects.equals(this.supportHoursStartAt, onCallPageLiveCallOver.supportHoursStartAt)
        && Objects.equals(this.additionalProperties, onCallPageLiveCallOver.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcome, supportHoursStartAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnCallPageLiveCallOver {\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    supportHoursStartAt: ")
        .append(toIndentedString(supportHoursStartAt))
        .append("\n");
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

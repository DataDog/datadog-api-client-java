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

/** A single entry in an indicator's triage history timeline. */
@JsonPropertyOrder({
  IoCTriageEvent.JSON_PROPERTY_TRIAGE_STATE,
  IoCTriageEvent.JSON_PROPERTY_TRIAGED_AT,
  IoCTriageEvent.JSON_PROPERTY_TRIAGED_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IoCTriageEvent {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TRIAGE_STATE = "triage_state";
  private String triageState;

  public static final String JSON_PROPERTY_TRIAGED_AT = "triaged_at";
  private OffsetDateTime triagedAt;

  public static final String JSON_PROPERTY_TRIAGED_BY = "triaged_by";
  private String triagedBy;

  public IoCTriageEvent triageState(String triageState) {
    this.triageState = triageState;
    return this;
  }

  /**
   * Triage state set by this action: not_reviewed or reviewed.
   *
   * @return triageState
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRIAGE_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTriageState() {
    return triageState;
  }

  public void setTriageState(String triageState) {
    this.triageState = triageState;
  }

  public IoCTriageEvent triagedAt(OffsetDateTime triagedAt) {
    this.triagedAt = triagedAt;
    return this;
  }

  /**
   * Timestamp when this triage action occurred.
   *
   * @return triagedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRIAGED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getTriagedAt() {
    return triagedAt;
  }

  public void setTriagedAt(OffsetDateTime triagedAt) {
    this.triagedAt = triagedAt;
  }

  public IoCTriageEvent triagedBy(String triagedBy) {
    this.triagedBy = triagedBy;
    return this;
  }

  /**
   * UUID of the user who performed this triage action.
   *
   * @return triagedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRIAGED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTriagedBy() {
    return triagedBy;
  }

  public void setTriagedBy(String triagedBy) {
    this.triagedBy = triagedBy;
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
   * @return IoCTriageEvent
   */
  @JsonAnySetter
  public IoCTriageEvent putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IoCTriageEvent object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoCTriageEvent ioCTriageEvent = (IoCTriageEvent) o;
    return Objects.equals(this.triageState, ioCTriageEvent.triageState)
        && Objects.equals(this.triagedAt, ioCTriageEvent.triagedAt)
        && Objects.equals(this.triagedBy, ioCTriageEvent.triagedBy)
        && Objects.equals(this.additionalProperties, ioCTriageEvent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(triageState, triagedAt, triagedBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoCTriageEvent {\n");
    sb.append("    triageState: ").append(toIndentedString(triageState)).append("\n");
    sb.append("    triagedAt: ").append(toIndentedString(triagedAt)).append("\n");
    sb.append("    triagedBy: ").append(toIndentedString(triagedBy)).append("\n");
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

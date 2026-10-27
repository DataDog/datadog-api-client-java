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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Details about why the job failed. Only present when the job has failed and won't be retried. */
@JsonPropertyOrder({
  HistoricalJobFailure.JSON_PROPERTY_HINT,
  HistoricalJobFailure.JSON_PROPERTY_REASON
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HistoricalJobFailure {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HINT = "hint";
  private String hint;

  public static final String JSON_PROPERTY_REASON = "reason";
  private HistoricalJobFailureReason reason;

  public HistoricalJobFailure hint(String hint) {
    this.hint = hint;
    return this;
  }

  /**
   * A suggestion to fix the failure.
   *
   * @return hint
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHint() {
    return hint;
  }

  public void setHint(String hint) {
    this.hint = hint;
  }

  public HistoricalJobFailure reason(HistoricalJobFailureReason reason) {
    this.reason = reason;
    this.unparsed |= !reason.isValid();
    return this;
  }

  /**
   * The reason why the job failed.
   *
   * @return reason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HistoricalJobFailureReason getReason() {
    return reason;
  }

  public void setReason(HistoricalJobFailureReason reason) {
    if (!reason.isValid()) {
      this.unparsed = true;
    }
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
   * @return HistoricalJobFailure
   */
  @JsonAnySetter
  public HistoricalJobFailure putAdditionalProperty(String key, Object value) {
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

  /** Return true if this HistoricalJobFailure object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalJobFailure historicalJobFailure = (HistoricalJobFailure) o;
    return Objects.equals(this.hint, historicalJobFailure.hint)
        && Objects.equals(this.reason, historicalJobFailure.reason)
        && Objects.equals(this.additionalProperties, historicalJobFailure.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hint, reason, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalJobFailure {\n");
    sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
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

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

/**
 * Request-level confidence threshold override. <code>flagging_global</code> is the global threshold
 * applied to every threat category. Any other property is a per-category override keyed by an AI
 * Guard threat tag; per-category values take precedence over <code>flagging_global</code>, and
 * categories without an entry fall back to it. When this object omits flagging_global, the fallback
 * is <code>0.5</code>. Recognized category keys include policy-evasion, indirect-prompt-injection,
 * system-and-capability-discovery, credential-access, sensitive-data-collection,
 * privilege-escalation, malicious-execution, private-network-target, destructive-or-resource-abuse,
 * tool-abuse, poisoning-or-persistence, and <code>data-exfiltration</code>. Unknown category keys
 * are ignored.
 */
@JsonPropertyOrder({AIGuardConfidenceThreshold.JSON_PROPERTY_FLAGGING_GLOBAL})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AIGuardConfidenceThreshold {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FLAGGING_GLOBAL = "flagging_global";
  private Double flaggingGlobal;

  public AIGuardConfidenceThreshold flaggingGlobal(Double flaggingGlobal) {
    this.flaggingGlobal = flaggingGlobal;
    return this;
  }

  /**
   * The global confidence threshold applied to categories without a specific override.
   *
   * @return flaggingGlobal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLAGGING_GLOBAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFlaggingGlobal() {
    return flaggingGlobal;
  }

  public void setFlaggingGlobal(Double flaggingGlobal) {
    this.flaggingGlobal = flaggingGlobal;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Double> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return AIGuardConfidenceThreshold
   */
  @JsonAnySetter
  public AIGuardConfidenceThreshold putAdditionalProperty(String key, Double value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Double>();
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
  public Map<String, Double> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Double getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this AIGuardConfidenceThreshold object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AIGuardConfidenceThreshold aiGuardConfidenceThreshold = (AIGuardConfidenceThreshold) o;
    return Objects.equals(this.flaggingGlobal, aiGuardConfidenceThreshold.flaggingGlobal)
        && Objects.equals(
            this.additionalProperties, aiGuardConfidenceThreshold.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flaggingGlobal, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AIGuardConfidenceThreshold {\n");
    sb.append("    flaggingGlobal: ").append(toIndentedString(flaggingGlobal)).append("\n");
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

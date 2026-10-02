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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Decision to record when concluding the experiment. */
@JsonPropertyOrder({
  ExperimentsConcludeExperimentV2RequestDataAttributes.JSON_PROPERTY_DECISION_VARIANT_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsConcludeExperimentV2RequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DECISION_VARIANT_KEY = "decision_variant_key";
  private String decisionVariantKey;

  public ExperimentsConcludeExperimentV2RequestDataAttributes() {}

  @JsonCreator
  public ExperimentsConcludeExperimentV2RequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DECISION_VARIANT_KEY)
          String decisionVariantKey) {
    this.decisionVariantKey = decisionVariantKey;
  }

  public ExperimentsConcludeExperimentV2RequestDataAttributes decisionVariantKey(
      String decisionVariantKey) {
    this.decisionVariantKey = decisionVariantKey;
    return this;
  }

  /**
   * Key of the winning variant. Must match a variant on the experiment and must not be blank.
   *
   * @return decisionVariantKey
   */
  @JsonProperty(JSON_PROPERTY_DECISION_VARIANT_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDecisionVariantKey() {
    return decisionVariantKey;
  }

  public void setDecisionVariantKey(String decisionVariantKey) {
    this.decisionVariantKey = decisionVariantKey;
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
   * @return ExperimentsConcludeExperimentV2RequestDataAttributes
   */
  @JsonAnySetter
  public ExperimentsConcludeExperimentV2RequestDataAttributes putAdditionalProperty(
      String key, Object value) {
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

  /**
   * Return true if this ExperimentsConcludeExperimentV2RequestDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsConcludeExperimentV2RequestDataAttributes
        experimentsConcludeExperimentV2RequestDataAttributes =
            (ExperimentsConcludeExperimentV2RequestDataAttributes) o;
    return Objects.equals(
            this.decisionVariantKey,
            experimentsConcludeExperimentV2RequestDataAttributes.decisionVariantKey)
        && Objects.equals(
            this.additionalProperties,
            experimentsConcludeExperimentV2RequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decisionVariantKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsConcludeExperimentV2RequestDataAttributes {\n");
    sb.append("    decisionVariantKey: ").append(toIndentedString(decisionVariantKey)).append("\n");
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

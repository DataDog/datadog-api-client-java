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

/** A field and direction to sort results by. */
@JsonPropertyOrder({
  LLMObsExperimentationSortField.JSON_PROPERTY_DIRECTION,
  LLMObsExperimentationSortField.JSON_PROPERTY_FIELD
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsExperimentationSortField {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private LLMObsExperimentationSortFieldDirection direction;

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public LLMObsExperimentationSortField() {}

  @JsonCreator
  public LLMObsExperimentationSortField(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIELD) String field) {
    this.field = field;
  }

  public LLMObsExperimentationSortField direction(
      LLMObsExperimentationSortFieldDirection direction) {
    this.direction = direction;
    this.unparsed |= !direction.isValid();
    return this;
  }

  /**
   * Sort direction.
   *
   * @return direction
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsExperimentationSortFieldDirection getDirection() {
    return direction;
  }

  public void setDirection(LLMObsExperimentationSortFieldDirection direction) {
    if (!direction.isValid()) {
      this.unparsed = true;
    }
    this.direction = direction;
  }

  public LLMObsExperimentationSortField field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The field name to sort on.
   *
   * @return field
   */
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
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
   * @return LLMObsExperimentationSortField
   */
  @JsonAnySetter
  public LLMObsExperimentationSortField putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsExperimentationSortField object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsExperimentationSortField llmObsExperimentationSortField =
        (LLMObsExperimentationSortField) o;
    return Objects.equals(this.direction, llmObsExperimentationSortField.direction)
        && Objects.equals(this.field, llmObsExperimentationSortField.field)
        && Objects.equals(
            this.additionalProperties, llmObsExperimentationSortField.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, field, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsExperimentationSortField {\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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

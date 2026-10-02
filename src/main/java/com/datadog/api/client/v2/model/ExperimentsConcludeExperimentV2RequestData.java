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

/** Experiment conclusion resource with the experiment identifier and decision. */
@JsonPropertyOrder({
  ExperimentsConcludeExperimentV2RequestData.JSON_PROPERTY_ATTRIBUTES,
  ExperimentsConcludeExperimentV2RequestData.JSON_PROPERTY_ID,
  ExperimentsConcludeExperimentV2RequestData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsConcludeExperimentV2RequestData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private ExperimentsConcludeExperimentV2RequestDataAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ExperimentsConcludeExperimentV2RequestDataType type =
      ExperimentsConcludeExperimentV2RequestDataType.CONCLUDE_EXPERIMENT_REQUEST;

  public ExperimentsConcludeExperimentV2RequestData() {}

  @JsonCreator
  public ExperimentsConcludeExperimentV2RequestData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          ExperimentsConcludeExperimentV2RequestDataAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ExperimentsConcludeExperimentV2RequestDataType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ExperimentsConcludeExperimentV2RequestData attributes(
      ExperimentsConcludeExperimentV2RequestDataAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Decision to record when concluding the experiment.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsConcludeExperimentV2RequestDataAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ExperimentsConcludeExperimentV2RequestDataAttributes attributes) {
    this.attributes = attributes;
    if (attributes != null) {
      this.unparsed |= attributes.unparsed;
    }
  }

  public ExperimentsConcludeExperimentV2RequestData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the experiment to conclude.
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

  public ExperimentsConcludeExperimentV2RequestData type(
      ExperimentsConcludeExperimentV2RequestDataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Conclude experiment request resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsConcludeExperimentV2RequestDataType getType() {
    return type;
  }

  public void setType(ExperimentsConcludeExperimentV2RequestDataType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return ExperimentsConcludeExperimentV2RequestData
   */
  @JsonAnySetter
  public ExperimentsConcludeExperimentV2RequestData putAdditionalProperty(
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

  /** Return true if this ExperimentsConcludeExperimentV2RequestData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsConcludeExperimentV2RequestData experimentsConcludeExperimentV2RequestData =
        (ExperimentsConcludeExperimentV2RequestData) o;
    return Objects.equals(this.attributes, experimentsConcludeExperimentV2RequestData.attributes)
        && Objects.equals(this.id, experimentsConcludeExperimentV2RequestData.id)
        && Objects.equals(this.type, experimentsConcludeExperimentV2RequestData.type)
        && Objects.equals(
            this.additionalProperties,
            experimentsConcludeExperimentV2RequestData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsConcludeExperimentV2RequestData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

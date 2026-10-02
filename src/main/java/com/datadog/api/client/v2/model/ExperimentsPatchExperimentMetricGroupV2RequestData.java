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
import java.util.UUID;

/** JSON:API resource containing the experiment metric group identity and fields. */
@JsonPropertyOrder({
  ExperimentsPatchExperimentMetricGroupV2RequestData.JSON_PROPERTY_ATTRIBUTES,
  ExperimentsPatchExperimentMetricGroupV2RequestData.JSON_PROPERTY_ID,
  ExperimentsPatchExperimentMetricGroupV2RequestData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsPatchExperimentMetricGroupV2RequestData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private ExperimentsPatchExperimentMetricGroupV2RequestDataAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ExperimentsPatchExperimentMetricGroupV2RequestDataType type =
      ExperimentsPatchExperimentMetricGroupV2RequestDataType.EXPERIMENT_METRIC_GROUPS;

  public ExperimentsPatchExperimentMetricGroupV2RequestData() {}

  @JsonCreator
  public ExperimentsPatchExperimentMetricGroupV2RequestData(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ExperimentsPatchExperimentMetricGroupV2RequestDataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ExperimentsPatchExperimentMetricGroupV2RequestData attributes(
      ExperimentsPatchExperimentMetricGroupV2RequestDataAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Fields supplied to update the experiment metric group.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsPatchExperimentMetricGroupV2RequestDataAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(
      ExperimentsPatchExperimentMetricGroupV2RequestDataAttributes attributes) {
    this.attributes = attributes;
    if (attributes != null) {
      this.unparsed |= attributes.unparsed;
    }
  }

  public ExperimentsPatchExperimentMetricGroupV2RequestData id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the experiment metric group.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ExperimentsPatchExperimentMetricGroupV2RequestData type(
      ExperimentsPatchExperimentMetricGroupV2RequestDataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Experiment metric groups resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsPatchExperimentMetricGroupV2RequestDataType getType() {
    return type;
  }

  public void setType(ExperimentsPatchExperimentMetricGroupV2RequestDataType type) {
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
   * @return ExperimentsPatchExperimentMetricGroupV2RequestData
   */
  @JsonAnySetter
  public ExperimentsPatchExperimentMetricGroupV2RequestData putAdditionalProperty(
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
   * Return true if this ExperimentsPatchExperimentMetricGroupV2RequestData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsPatchExperimentMetricGroupV2RequestData
        experimentsPatchExperimentMetricGroupV2RequestData =
            (ExperimentsPatchExperimentMetricGroupV2RequestData) o;
    return Objects.equals(
            this.attributes, experimentsPatchExperimentMetricGroupV2RequestData.attributes)
        && Objects.equals(this.id, experimentsPatchExperimentMetricGroupV2RequestData.id)
        && Objects.equals(this.type, experimentsPatchExperimentMetricGroupV2RequestData.type)
        && Objects.equals(
            this.additionalProperties,
            experimentsPatchExperimentMetricGroupV2RequestData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsPatchExperimentMetricGroupV2RequestData {\n");
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

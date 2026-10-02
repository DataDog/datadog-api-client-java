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

/** Experiment diagnostics resource with its identifier and check results. */
@JsonPropertyOrder({
  ExperimentsExperimentDiagnosticsV2DTOData.JSON_PROPERTY_ATTRIBUTES,
  ExperimentsExperimentDiagnosticsV2DTOData.JSON_PROPERTY_ID,
  ExperimentsExperimentDiagnosticsV2DTOData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsExperimentDiagnosticsV2DTOData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private ExperimentsExperimentDiagnosticsV2DTODataAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ExperimentsExperimentDiagnosticsV2DTODataType type =
      ExperimentsExperimentDiagnosticsV2DTODataType.EXPERIMENT_DIAGNOSTICS;

  public ExperimentsExperimentDiagnosticsV2DTOData() {}

  @JsonCreator
  public ExperimentsExperimentDiagnosticsV2DTOData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) UUID id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ExperimentsExperimentDiagnosticsV2DTODataType type) {
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ExperimentsExperimentDiagnosticsV2DTOData attributes(
      ExperimentsExperimentDiagnosticsV2DTODataAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Diagnostic check results and their evaluation state.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsExperimentDiagnosticsV2DTODataAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ExperimentsExperimentDiagnosticsV2DTODataAttributes attributes) {
    this.attributes = attributes;
    if (attributes != null) {
      this.unparsed |= attributes.unparsed;
    }
  }

  public ExperimentsExperimentDiagnosticsV2DTOData id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the experiment whose diagnostics are returned.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ExperimentsExperimentDiagnosticsV2DTOData type(
      ExperimentsExperimentDiagnosticsV2DTODataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Experiment diagnostics resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsExperimentDiagnosticsV2DTODataType getType() {
    return type;
  }

  public void setType(ExperimentsExperimentDiagnosticsV2DTODataType type) {
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
   * @return ExperimentsExperimentDiagnosticsV2DTOData
   */
  @JsonAnySetter
  public ExperimentsExperimentDiagnosticsV2DTOData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsExperimentDiagnosticsV2DTOData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsExperimentDiagnosticsV2DTOData experimentsExperimentDiagnosticsV2DtoData =
        (ExperimentsExperimentDiagnosticsV2DTOData) o;
    return Objects.equals(this.attributes, experimentsExperimentDiagnosticsV2DtoData.attributes)
        && Objects.equals(this.id, experimentsExperimentDiagnosticsV2DtoData.id)
        && Objects.equals(this.type, experimentsExperimentDiagnosticsV2DtoData.type)
        && Objects.equals(
            this.additionalProperties,
            experimentsExperimentDiagnosticsV2DtoData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsExperimentDiagnosticsV2DTOData {\n");
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

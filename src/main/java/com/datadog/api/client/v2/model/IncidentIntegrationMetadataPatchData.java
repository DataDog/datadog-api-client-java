/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Incident integration metadata data for a patch request. */
@JsonPropertyOrder({
  IncidentIntegrationMetadataPatchData.JSON_PROPERTY_ATTRIBUTES,
  IncidentIntegrationMetadataPatchData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentIntegrationMetadataPatchData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private IncidentIntegrationMetadataAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private IncidentIntegrationMetadataType type =
      IncidentIntegrationMetadataType.INCIDENT_INTEGRATIONS;

  public IncidentIntegrationMetadataPatchData() {}

  @JsonCreator
  public IncidentIntegrationMetadataPatchData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          IncidentIntegrationMetadataAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          IncidentIntegrationMetadataType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public IncidentIntegrationMetadataPatchData attributes(
      IncidentIntegrationMetadataAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Incident integration metadata's attributes for a create request.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentIntegrationMetadataAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(IncidentIntegrationMetadataAttributes attributes) {
    this.attributes = attributes;
  }

  public IncidentIntegrationMetadataPatchData type(IncidentIntegrationMetadataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Integration metadata resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentIntegrationMetadataType getType() {
    return type;
  }

  public void setType(IncidentIntegrationMetadataType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this IncidentIntegrationMetadataPatchData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentIntegrationMetadataPatchData incidentIntegrationMetadataPatchData =
        (IncidentIntegrationMetadataPatchData) o;
    return Objects.equals(this.attributes, incidentIntegrationMetadataPatchData.attributes)
        && Objects.equals(this.type, incidentIntegrationMetadataPatchData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentIntegrationMetadataPatchData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
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

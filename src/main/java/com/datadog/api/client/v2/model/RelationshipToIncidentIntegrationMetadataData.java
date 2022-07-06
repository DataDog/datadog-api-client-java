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

/** A relationship reference for an integration metadata object. */
@JsonPropertyOrder({
  RelationshipToIncidentIntegrationMetadataData.JSON_PROPERTY_ID,
  RelationshipToIncidentIntegrationMetadataData.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RelationshipToIncidentIntegrationMetadataData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private IncidentIntegrationMetadataType type =
      IncidentIntegrationMetadataType.INCIDENT_INTEGRATIONS;

  public RelationshipToIncidentIntegrationMetadataData() {}

  @JsonCreator
  public RelationshipToIncidentIntegrationMetadataData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          IncidentIntegrationMetadataType type) {
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public RelationshipToIncidentIntegrationMetadataData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier that represents the integration metadata.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RelationshipToIncidentIntegrationMetadataData type(IncidentIntegrationMetadataType type) {
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

  /** Return true if this RelationshipToIncidentIntegrationMetadataData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationshipToIncidentIntegrationMetadataData relationshipToIncidentIntegrationMetadataData =
        (RelationshipToIncidentIntegrationMetadataData) o;
    return Objects.equals(this.id, relationshipToIncidentIntegrationMetadataData.id)
        && Objects.equals(this.type, relationshipToIncidentIntegrationMetadataData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipToIncidentIntegrationMetadataData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

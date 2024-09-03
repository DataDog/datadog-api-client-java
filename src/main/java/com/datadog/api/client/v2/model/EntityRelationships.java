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

/** Entity relationships. */
@JsonPropertyOrder({
  EntityRelationships.JSON_PROPERTY_INCIDENTS,
  EntityRelationships.JSON_PROPERTY_ONCALL,
  EntityRelationships.JSON_PROPERTY_RAW_SCHEMA,
  EntityRelationships.JSON_PROPERTY_RELATED_ENTITIES,
  EntityRelationships.JSON_PROPERTY_SCHEMA
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCIDENTS = "incidents";
  private EntityToIncidents incidents;

  public static final String JSON_PROPERTY_ONCALL = "oncall";
  private EntityToOncalls oncall;

  public static final String JSON_PROPERTY_RAW_SCHEMA = "rawSchema";
  private EntityToRawSchema rawSchema;

  public static final String JSON_PROPERTY_RELATED_ENTITIES = "relatedEntities";
  private EntityToRelatedEntities relatedEntities;

  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private EntityToSchema schema;

  public EntityRelationships incidents(EntityToIncidents incidents) {
    this.incidents = incidents;
    this.unparsed |= incidents.unparsed;
    return this;
  }

  /**
   * Entity to incidents relationship.
   *
   * @return incidents
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCIDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityToIncidents getIncidents() {
    return incidents;
  }

  public void setIncidents(EntityToIncidents incidents) {
    this.incidents = incidents;
  }

  public EntityRelationships oncall(EntityToOncalls oncall) {
    this.oncall = oncall;
    this.unparsed |= oncall.unparsed;
    return this;
  }

  /**
   * Entity to oncalls relationship.
   *
   * @return oncall
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ONCALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityToOncalls getOncall() {
    return oncall;
  }

  public void setOncall(EntityToOncalls oncall) {
    this.oncall = oncall;
  }

  public EntityRelationships rawSchema(EntityToRawSchema rawSchema) {
    this.rawSchema = rawSchema;
    this.unparsed |= rawSchema.unparsed;
    return this;
  }

  /**
   * Entity to raw schema relationship.
   *
   * @return rawSchema
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RAW_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityToRawSchema getRawSchema() {
    return rawSchema;
  }

  public void setRawSchema(EntityToRawSchema rawSchema) {
    this.rawSchema = rawSchema;
  }

  public EntityRelationships relatedEntities(EntityToRelatedEntities relatedEntities) {
    this.relatedEntities = relatedEntities;
    this.unparsed |= relatedEntities.unparsed;
    return this;
  }

  /**
   * Entity to related entities relationship.
   *
   * @return relatedEntities
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATED_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityToRelatedEntities getRelatedEntities() {
    return relatedEntities;
  }

  public void setRelatedEntities(EntityToRelatedEntities relatedEntities) {
    this.relatedEntities = relatedEntities;
  }

  public EntityRelationships schema(EntityToSchema schema) {
    this.schema = schema;
    this.unparsed |= schema.unparsed;
    return this;
  }

  /**
   * Entity to detail schema relationship.
   *
   * @return schema
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityToSchema getSchema() {
    return schema;
  }

  public void setSchema(EntityToSchema schema) {
    this.schema = schema;
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
   * @return EntityRelationships
   */
  @JsonAnySetter
  public EntityRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this EntityRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityRelationships entityRelationships = (EntityRelationships) o;
    return Objects.equals(this.incidents, entityRelationships.incidents)
        && Objects.equals(this.oncall, entityRelationships.oncall)
        && Objects.equals(this.rawSchema, entityRelationships.rawSchema)
        && Objects.equals(this.relatedEntities, entityRelationships.relatedEntities)
        && Objects.equals(this.schema, entityRelationships.schema)
        && Objects.equals(this.additionalProperties, entityRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        incidents, oncall, rawSchema, relatedEntities, schema, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityRelationships {\n");
    sb.append("    incidents: ").append(toIndentedString(incidents)).append("\n");
    sb.append("    oncall: ").append(toIndentedString(oncall)).append("\n");
    sb.append("    rawSchema: ").append(toIndentedString(rawSchema)).append("\n");
    sb.append("    relatedEntities: ").append(toIndentedString(relatedEntities)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

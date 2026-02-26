/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**

 */
@JsonPropertyOrder({
  EntityResponseDataRelationships.JSON_PROPERTY_INCIDENTS,
  EntityResponseDataRelationships.JSON_PROPERTY_ONCALLS,
  EntityResponseDataRelationships.JSON_PROPERTY_RAW_SCHEMA,
  EntityResponseDataRelationships.JSON_PROPERTY_RELATED_ENTITIES,
  EntityResponseDataRelationships.JSON_PROPERTY_SCHEMA
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityResponseDataRelationships {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCIDENTS = "incidents";
  private EntityResponseDataRelationshipsIncidents incidents;

  public static final String JSON_PROPERTY_ONCALLS = "oncalls";
  private EntityResponseDataRelationshipsOncalls oncalls;

  public static final String JSON_PROPERTY_RAW_SCHEMA = "rawSchema";
  private EntityResponseDataRelationshipsRawSchema rawSchema;

  public static final String JSON_PROPERTY_RELATED_ENTITIES = "relatedEntities";
  private EntityResponseDataRelationshipsRelatedEntities relatedEntities;

  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private EntityResponseDataRelationshipsSchema schema;

  public EntityResponseDataRelationships incidents(EntityResponseDataRelationshipsIncidents incidents) {
    this.incidents = incidents;
    this.unparsed |= incidents.unparsed;
    return this;
  }

  /**
   * <p>Getincidents</p>
   * @return incidents
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INCIDENTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EntityResponseDataRelationshipsIncidents getIncidents() {
        return incidents;
      }
  public void setIncidents(EntityResponseDataRelationshipsIncidents incidents) {
    this.incidents = incidents;
  }
  public EntityResponseDataRelationships oncalls(EntityResponseDataRelationshipsOncalls oncalls) {
    this.oncalls = oncalls;
    this.unparsed |= oncalls.unparsed;
    return this;
  }

  /**
   * <p>Getoncalls</p>
   * @return oncalls
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ONCALLS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EntityResponseDataRelationshipsOncalls getOncalls() {
        return oncalls;
      }
  public void setOncalls(EntityResponseDataRelationshipsOncalls oncalls) {
    this.oncalls = oncalls;
  }
  public EntityResponseDataRelationships rawSchema(EntityResponseDataRelationshipsRawSchema rawSchema) {
    this.rawSchema = rawSchema;
    this.unparsed |= rawSchema.unparsed;
    return this;
  }

  /**
   * <p>GetrawSchema</p>
   * @return rawSchema
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RAW_SCHEMA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EntityResponseDataRelationshipsRawSchema getRawSchema() {
        return rawSchema;
      }
  public void setRawSchema(EntityResponseDataRelationshipsRawSchema rawSchema) {
    this.rawSchema = rawSchema;
  }
  public EntityResponseDataRelationships relatedEntities(EntityResponseDataRelationshipsRelatedEntities relatedEntities) {
    this.relatedEntities = relatedEntities;
    this.unparsed |= relatedEntities.unparsed;
    return this;
  }

  /**
   * <p>GetrelatedEntities</p>
   * @return relatedEntities
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RELATED_ENTITIES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EntityResponseDataRelationshipsRelatedEntities getRelatedEntities() {
        return relatedEntities;
      }
  public void setRelatedEntities(EntityResponseDataRelationshipsRelatedEntities relatedEntities) {
    this.relatedEntities = relatedEntities;
  }
  public EntityResponseDataRelationships schema(EntityResponseDataRelationshipsSchema schema) {
    this.schema = schema;
    this.unparsed |= schema.unparsed;
    return this;
  }

  /**
   * <p>Getschema</p>
   * @return schema
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SCHEMA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EntityResponseDataRelationshipsSchema getSchema() {
        return schema;
      }
  public void setSchema(EntityResponseDataRelationshipsSchema schema) {
    this.schema = schema;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return EntityResponseDataRelationships
   */
  @JsonAnySetter
  public EntityResponseDataRelationships putAdditionalProperty(String key, Object value) {
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
   * Return true if this EntityResponseDataRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityResponseDataRelationships entityResponseDataRelationships = (EntityResponseDataRelationships) o;
    return Objects.equals(this.incidents, entityResponseDataRelationships.incidents) && Objects.equals(this.oncalls, entityResponseDataRelationships.oncalls) && Objects.equals(this.rawSchema, entityResponseDataRelationships.rawSchema) && Objects.equals(this.relatedEntities, entityResponseDataRelationships.relatedEntities) && Objects.equals(this.schema, entityResponseDataRelationships.schema) && Objects.equals(this.additionalProperties, entityResponseDataRelationships.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(incidents,oncalls,rawSchema,relatedEntities,schema, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityResponseDataRelationships {\n");
    sb.append("    incidents: ").append(toIndentedString(incidents)).append("\n");
    sb.append("    oncalls: ").append(toIndentedString(oncalls)).append("\n");
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
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** The incident impact's attributes for a create request. */
@JsonPropertyOrder({
  IncidentImpactCreateAttributes.JSON_PROPERTY_DESCRIPTION,
  IncidentImpactCreateAttributes.JSON_PROPERTY_END_AT,
  IncidentImpactCreateAttributes.JSON_PROPERTY_FIELDS,
  IncidentImpactCreateAttributes.JSON_PROPERTY_START_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentImpactCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_END_AT = "end_at";
  private JsonNullable<OffsetDateTime> endAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private JsonNullable<Map<String, Object>> fields = JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_START_AT = "start_at";
  private OffsetDateTime startAt;

  public IncidentImpactCreateAttributes() {}

  @JsonCreator
  public IncidentImpactCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_START_AT) OffsetDateTime startAt) {
    this.description = description;
    this.startAt = startAt;
  }

  public IncidentImpactCreateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the impact.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IncidentImpactCreateAttributes endAt(OffsetDateTime endAt) {
    this.endAt = JsonNullable.<OffsetDateTime>of(endAt);
    return this;
  }

  /**
   * Timestamp when the impact ended.
   *
   * @return endAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getEndAt() {
    return endAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getEndAt_JsonNullable() {
    return endAt;
  }

  @JsonProperty(JSON_PROPERTY_END_AT)
  public void setEndAt_JsonNullable(JsonNullable<OffsetDateTime> endAt) {
    this.endAt = endAt;
  }

  public void setEndAt(OffsetDateTime endAt) {
    this.endAt = JsonNullable.<OffsetDateTime>of(endAt);
  }

  public IncidentImpactCreateAttributes fields(Map<String, Object> fields) {
    this.fields = JsonNullable.<Map<String, Object>>of(fields);
    return this;
  }

  public IncidentImpactCreateAttributes putFieldsItem(String key, Object fieldsItem) {
    if (this.fields == null || !this.fields.isPresent()) {
      this.fields = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.fields.get().put(key, fieldsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * An object mapping impact field names to field values.
   *
   * @return fields
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, Object> getFields() {
    return fields.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, Object>> getFields_JsonNullable() {
    return fields;
  }

  @JsonProperty(JSON_PROPERTY_FIELDS)
  public void setFields_JsonNullable(JsonNullable<Map<String, Object>> fields) {
    this.fields = fields;
  }

  public void setFields(Map<String, Object> fields) {
    this.fields = JsonNullable.<Map<String, Object>>of(fields);
  }

  public IncidentImpactCreateAttributes startAt(OffsetDateTime startAt) {
    this.startAt = startAt;
    return this;
  }

  /**
   * Timestamp when the impact started.
   *
   * @return startAt
   */
  @JsonProperty(JSON_PROPERTY_START_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getStartAt() {
    return startAt;
  }

  public void setStartAt(OffsetDateTime startAt) {
    this.startAt = startAt;
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
   * @return IncidentImpactCreateAttributes
   */
  @JsonAnySetter
  public IncidentImpactCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentImpactCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentImpactCreateAttributes incidentImpactCreateAttributes =
        (IncidentImpactCreateAttributes) o;
    return Objects.equals(this.description, incidentImpactCreateAttributes.description)
        && Objects.equals(this.endAt, incidentImpactCreateAttributes.endAt)
        && Objects.equals(this.fields, incidentImpactCreateAttributes.fields)
        && Objects.equals(this.startAt, incidentImpactCreateAttributes.startAt)
        && Objects.equals(
            this.additionalProperties, incidentImpactCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, endAt, fields, startAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentImpactCreateAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
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

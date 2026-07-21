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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes for creating an impact field. */
@JsonPropertyOrder({
  IncidentImpactFieldDataAttributesRequest.JSON_PROPERTY_DISPLAY_NAME,
  IncidentImpactFieldDataAttributesRequest.JSON_PROPERTY_FIELD_CHOICES,
  IncidentImpactFieldDataAttributesRequest.JSON_PROPERTY_FIELD_TYPE,
  IncidentImpactFieldDataAttributesRequest.JSON_PROPERTY_NAME,
  IncidentImpactFieldDataAttributesRequest.JSON_PROPERTY_TAG_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentImpactFieldDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_FIELD_CHOICES = "field_choices";
  private List<IncidentImpactFieldChoice> fieldChoices = null;

  public static final String JSON_PROPERTY_FIELD_TYPE = "field_type";
  private IncidentImpactFieldValueType fieldType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TAG_KEY = "tag_key";
  private JsonNullable<String> tagKey = JsonNullable.<String>undefined();

  public IncidentImpactFieldDataAttributesRequest() {}

  @JsonCreator
  public IncidentImpactFieldDataAttributesRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_DISPLAY_NAME) String displayName,
      @JsonProperty(required = true, value = JSON_PROPERTY_FIELD_TYPE)
          IncidentImpactFieldValueType fieldType,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.displayName = displayName;
    this.fieldType = fieldType;
    this.unparsed |= !fieldType.isValid();
    this.name = name;
  }

  public IncidentImpactFieldDataAttributesRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the impact field.
   *
   * @return displayName
   */
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public IncidentImpactFieldDataAttributesRequest fieldChoices(
      List<IncidentImpactFieldChoice> fieldChoices) {
    this.fieldChoices = fieldChoices;
    if (fieldChoices != null) {
      for (IncidentImpactFieldChoice item : fieldChoices) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public IncidentImpactFieldDataAttributesRequest addFieldChoicesItem(
      IncidentImpactFieldChoice fieldChoicesItem) {
    if (this.fieldChoices == null) {
      this.fieldChoices = new ArrayList<>();
    }
    this.fieldChoices.add(fieldChoicesItem);
    this.unparsed |= fieldChoicesItem.unparsed;
    return this;
  }

  /**
   * The choices for dropdown or multiselect fields.
   *
   * @return fieldChoices
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD_CHOICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentImpactFieldChoice> getFieldChoices() {
    return fieldChoices;
  }

  public void setFieldChoices(List<IncidentImpactFieldChoice> fieldChoices) {
    this.fieldChoices = fieldChoices;
    if (fieldChoices != null) {
      for (IncidentImpactFieldChoice item : fieldChoices) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public IncidentImpactFieldDataAttributesRequest fieldType(
      IncidentImpactFieldValueType fieldType) {
    this.fieldType = fieldType;
    this.unparsed |= !fieldType.isValid();
    return this;
  }

  /**
   * The type of an impact field.
   *
   * @return fieldType
   */
  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentImpactFieldValueType getFieldType() {
    return fieldType;
  }

  public void setFieldType(IncidentImpactFieldValueType fieldType) {
    if (!fieldType.isValid()) {
      this.unparsed = true;
    }
    this.fieldType = fieldType;
  }

  public IncidentImpactFieldDataAttributesRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The normalized name of the impact field (used as identifier).
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IncidentImpactFieldDataAttributesRequest tagKey(String tagKey) {
    this.tagKey = JsonNullable.<String>of(tagKey);
    return this;
  }

  /**
   * The tag key associated with the field (for metrictag type).
   *
   * @return tagKey
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getTagKey() {
    return tagKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAG_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTagKey_JsonNullable() {
    return tagKey;
  }

  @JsonProperty(JSON_PROPERTY_TAG_KEY)
  public void setTagKey_JsonNullable(JsonNullable<String> tagKey) {
    this.tagKey = tagKey;
  }

  public void setTagKey(String tagKey) {
    this.tagKey = JsonNullable.<String>of(tagKey);
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
   * @return IncidentImpactFieldDataAttributesRequest
   */
  @JsonAnySetter
  public IncidentImpactFieldDataAttributesRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentImpactFieldDataAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentImpactFieldDataAttributesRequest incidentImpactFieldDataAttributesRequest =
        (IncidentImpactFieldDataAttributesRequest) o;
    return Objects.equals(this.displayName, incidentImpactFieldDataAttributesRequest.displayName)
        && Objects.equals(this.fieldChoices, incidentImpactFieldDataAttributesRequest.fieldChoices)
        && Objects.equals(this.fieldType, incidentImpactFieldDataAttributesRequest.fieldType)
        && Objects.equals(this.name, incidentImpactFieldDataAttributesRequest.name)
        && Objects.equals(this.tagKey, incidentImpactFieldDataAttributesRequest.tagKey)
        && Objects.equals(
            this.additionalProperties,
            incidentImpactFieldDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, fieldChoices, fieldType, name, tagKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentImpactFieldDataAttributesRequest {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    fieldChoices: ").append(toIndentedString(fieldChoices)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
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

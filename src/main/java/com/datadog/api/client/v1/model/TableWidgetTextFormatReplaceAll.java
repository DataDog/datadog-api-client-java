/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Match All definition. */
@JsonPropertyOrder({
  TableWidgetTextFormatReplaceAll.JSON_PROPERTY_TYPE,
  TableWidgetTextFormatReplaceAll.JSON_PROPERTY_WITH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableWidgetTextFormatReplaceAll {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private TableWidgetTextFormatReplaceAllType type;

  public static final String JSON_PROPERTY_WITH = "with";
  private String with;

  public TableWidgetTextFormatReplaceAll() {}

  @JsonCreator
  public TableWidgetTextFormatReplaceAll(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          TableWidgetTextFormatReplaceAllType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_WITH) String with) {
    this.type = type;
    this.unparsed |= !type.isValid();
    this.with = with;
  }

  public TableWidgetTextFormatReplaceAll type(TableWidgetTextFormatReplaceAllType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Table widget text format replace all type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TableWidgetTextFormatReplaceAllType getType() {
    return type;
  }

  public void setType(TableWidgetTextFormatReplaceAllType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public TableWidgetTextFormatReplaceAll with(String with) {
    this.with = with;
    return this;
  }

  /**
   * Replace All type.
   *
   * @return with
   */
  @JsonProperty(JSON_PROPERTY_WITH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getWith() {
    return with;
  }

  public void setWith(String with) {
    this.with = with;
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
   * @return TableWidgetTextFormatReplaceAll
   */
  @JsonAnySetter
  public TableWidgetTextFormatReplaceAll putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TableWidgetTextFormatReplaceAll object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableWidgetTextFormatReplaceAll tableWidgetTextFormatReplaceAll =
        (TableWidgetTextFormatReplaceAll) o;
    return Objects.equals(this.type, tableWidgetTextFormatReplaceAll.type)
        && Objects.equals(this.with, tableWidgetTextFormatReplaceAll.with)
        && Objects.equals(
            this.additionalProperties, tableWidgetTextFormatReplaceAll.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, with, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableWidgetTextFormatReplaceAll {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    with: ").append(toIndentedString(with)).append("\n");
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

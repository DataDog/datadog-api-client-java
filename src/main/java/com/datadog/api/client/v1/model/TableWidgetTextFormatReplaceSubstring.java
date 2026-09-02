/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Match Sub-string definition.</p>
 */
@JsonPropertyOrder({
  TableWidgetTextFormatReplaceSubstring.JSON_PROPERTY_SUBSTRING,
  TableWidgetTextFormatReplaceSubstring.JSON_PROPERTY_TYPE,
  TableWidgetTextFormatReplaceSubstring.JSON_PROPERTY_WITH
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableWidgetTextFormatReplaceSubstring {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_SUBSTRING = "substring";
  private String substring;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TableWidgetTextFormatReplaceSubstringType type;

  public static final String JSON_PROPERTY_WITH = "with";
  private String with;

  public TableWidgetTextFormatReplaceSubstring() {}

  @JsonCreator
  public TableWidgetTextFormatReplaceSubstring(
            @JsonProperty(required=true, value=JSON_PROPERTY_SUBSTRING)String substring,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)TableWidgetTextFormatReplaceSubstringType type,
            @JsonProperty(required=true, value=JSON_PROPERTY_WITH)String with) {
        this.substring = substring;
        this.type = type;
        this.unparsed |= !type.isValid();
        this.with = with;
  }
  public TableWidgetTextFormatReplaceSubstring substring(String substring) {
    this.substring = substring;
    return this;
  }

  /**
   * <p>Text that will be replaced.</p>
   * @return substring
  **/
      @JsonProperty(JSON_PROPERTY_SUBSTRING)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getSubstring() {
        return substring;
      }
  public void setSubstring(String substring) {
    this.substring = substring;
  }
  public TableWidgetTextFormatReplaceSubstring type(TableWidgetTextFormatReplaceSubstringType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Table widget text format replace sub-string type.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public TableWidgetTextFormatReplaceSubstringType getType() {
        return type;
      }
  public void setType(TableWidgetTextFormatReplaceSubstringType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }
  public TableWidgetTextFormatReplaceSubstring with(String with) {
    this.with = with;
    return this;
  }

  /**
   * <p>Text that will replace original sub-string.</p>
   * @return with
  **/
      @JsonProperty(JSON_PROPERTY_WITH)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getWith() {
        return with;
      }
  public void setWith(String with) {
    this.with = with;
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
   * @return TableWidgetTextFormatReplaceSubstring
   */
  @JsonAnySetter
  public TableWidgetTextFormatReplaceSubstring putAdditionalProperty(String key, Object value) {
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
   * Return true if this TableWidgetTextFormatReplaceSubstring object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableWidgetTextFormatReplaceSubstring tableWidgetTextFormatReplaceSubstring = (TableWidgetTextFormatReplaceSubstring) o;
    return Objects.equals(this.substring, tableWidgetTextFormatReplaceSubstring.substring) && Objects.equals(this.type, tableWidgetTextFormatReplaceSubstring.type) && Objects.equals(this.with, tableWidgetTextFormatReplaceSubstring.with) && Objects.equals(this.additionalProperties, tableWidgetTextFormatReplaceSubstring.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(substring,type,with, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableWidgetTextFormatReplaceSubstring {\n");
    sb.append("    substring: ").append(toIndentedString(substring)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    with: ").append(toIndentedString(with)).append("\n");
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

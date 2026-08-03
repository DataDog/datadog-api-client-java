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
   * <p>A column containing the tag keys and values in a group.</p>
 */
@JsonPropertyOrder({
  GroupScalarColumn.JSON_PROPERTY_NAME,
  GroupScalarColumn.JSON_PROPERTY_TYPE,
  GroupScalarColumn.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GroupScalarColumn {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ScalarColumnTypeGroup type = ScalarColumnTypeGroup.GROUP;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<List<String>> values = null;

  public GroupScalarColumn name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the tag key or group.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public GroupScalarColumn type(ScalarColumnTypeGroup type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The type of column present for groups.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ScalarColumnTypeGroup getType() {
        return type;
      }
  public void setType(ScalarColumnTypeGroup type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }
  public GroupScalarColumn values(List<List<String>> values) {
    this.values = values;
    return this;
  }
  public GroupScalarColumn addValuesItem(List<String> valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * <p>The array of tag values for each group found for the results of the formulas or queries.</p>
   * @return values
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VALUES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<List<String>> getValues() {
        return values;
      }
  public void setValues(List<List<String>> values) {
    this.values = values;
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
   * @return GroupScalarColumn
   */
  @JsonAnySetter
  public GroupScalarColumn putAdditionalProperty(String key, Object value) {
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
   * Return true if this GroupScalarColumn object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupScalarColumn groupScalarColumn = (GroupScalarColumn) o;
    return Objects.equals(this.name, groupScalarColumn.name) && Objects.equals(this.type, groupScalarColumn.type) && Objects.equals(this.values, groupScalarColumn.values) && Objects.equals(this.additionalProperties, groupScalarColumn.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(name,type,values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupScalarColumn {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

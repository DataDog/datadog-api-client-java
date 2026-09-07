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
   * <p>Readable attributes of an Org Config.</p>
 */
@JsonPropertyOrder({
  OrgConfigReadAttributes.JSON_PROPERTY_DESCRIPTION,
  OrgConfigReadAttributes.JSON_PROPERTY_MODIFIED_AT,
  OrgConfigReadAttributes.JSON_PROPERTY_NAME,
  OrgConfigReadAttributes.JSON_PROPERTY_VALUE,
  OrgConfigReadAttributes.JSON_PROPERTY_VALUE_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrgConfigReadAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private JsonNullable<OffsetDateTime> modifiedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Object value = new Object();

  public static final String JSON_PROPERTY_VALUE_TYPE = "value_type";
  private String valueType;

  public OrgConfigReadAttributes() {}

  @JsonCreator
  public OrgConfigReadAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_DESCRIPTION)String description,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_VALUE)Object value,
            @JsonProperty(required=true, value=JSON_PROPERTY_VALUE_TYPE)String valueType) {
        this.description = description;
        this.name = name;
        this.value = value;
        this.valueType = valueType;
  }
  public OrgConfigReadAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>The description of an Org Config.</p>
   * @return description
  **/
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public OrgConfigReadAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = JsonNullable.<OffsetDateTime>of(modifiedAt);
    return this;
  }

  /**
   * <p>The timestamp of the last Org Config update (if any).</p>
   * @return modifiedAt
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public OffsetDateTime getModifiedAt() {
        return modifiedAt.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getModifiedAt_JsonNullable() {
    return modifiedAt;
  }
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)public void setModifiedAt_JsonNullable(JsonNullable<OffsetDateTime> modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = JsonNullable.<OffsetDateTime>of(modifiedAt);
  }
  public OrgConfigReadAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The machine-friendly name of an Org Config.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public OrgConfigReadAttributes value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * <p>The value of an Org Config.</p>
   * @return value
  **/
      @JsonProperty(JSON_PROPERTY_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Object getValue() {
        return value;
      }
  public void setValue(Object value) {
    this.value = value;
  }
  public OrgConfigReadAttributes valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * <p>The type of an Org Config value.</p>
   * @return valueType
  **/
      @JsonProperty(JSON_PROPERTY_VALUE_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getValueType() {
        return valueType;
      }
  public void setValueType(String valueType) {
    this.valueType = valueType;
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
   * @return OrgConfigReadAttributes
   */
  @JsonAnySetter
  public OrgConfigReadAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this OrgConfigReadAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgConfigReadAttributes orgConfigReadAttributes = (OrgConfigReadAttributes) o;
    return Objects.equals(this.description, orgConfigReadAttributes.description) && Objects.equals(this.modifiedAt, orgConfigReadAttributes.modifiedAt) && Objects.equals(this.name, orgConfigReadAttributes.name) && Objects.equals(this.value, orgConfigReadAttributes.value) && Objects.equals(this.valueType, orgConfigReadAttributes.valueType) && Objects.equals(this.additionalProperties, orgConfigReadAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(description,modifiedAt,name,value,valueType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgConfigReadAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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

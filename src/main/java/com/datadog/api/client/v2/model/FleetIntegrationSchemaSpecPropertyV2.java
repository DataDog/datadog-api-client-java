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

/**
 * A property of an object-typed configuration value. A <code>oneOf</code> keyword (an array of
 * exclusive alternative value specifications this property can match) can appear directly on this
 * object when alternatives apply.
 */
@JsonPropertyOrder({
  FleetIntegrationSchemaSpecPropertyV2.JSON_PROPERTY_ADDITIONAL_PROPERTIES,
  FleetIntegrationSchemaSpecPropertyV2.JSON_PROPERTY_ANY_OF,
  FleetIntegrationSchemaSpecPropertyV2.JSON_PROPERTY_ITEMS,
  FleetIntegrationSchemaSpecPropertyV2.JSON_PROPERTY_NAME,
  FleetIntegrationSchemaSpecPropertyV2.JSON_PROPERTY_PROPERTIES,
  FleetIntegrationSchemaSpecPropertyV2.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetIntegrationSchemaSpecPropertyV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDITIONAL_PROPERTIES = "additionalProperties";
  private Object additionalProperties = null;

  public static final String JSON_PROPERTY_ANY_OF = "anyOf";
  private List<FleetIntegrationSchemaSpecValueV2> anyOf = null;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private FleetIntegrationSchemaSpecValueV2 items;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private List<FleetIntegrationSchemaSpecPropertyV2> properties = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public FleetIntegrationSchemaSpecPropertyV2() {}

  @JsonCreator
  public FleetIntegrationSchemaSpecPropertyV2(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public FleetIntegrationSchemaSpecPropertyV2 additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  /**
   * Whether, or which, additional properties are allowed on the object. Can be a boolean or a
   * nested schema. Present only when <code>type</code> is <code>object</code>.
   *
   * @return additionalProperties
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public FleetIntegrationSchemaSpecPropertyV2 anyOf(List<FleetIntegrationSchemaSpecValueV2> anyOf) {
    this.anyOf = anyOf;
    if (anyOf != null) {
      for (FleetIntegrationSchemaSpecValueV2 item : anyOf) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FleetIntegrationSchemaSpecPropertyV2 addAnyOfItem(
      FleetIntegrationSchemaSpecValueV2 anyOfItem) {
    if (this.anyOf == null) {
      this.anyOf = new ArrayList<>();
    }
    this.anyOf.add(anyOfItem);
    this.unparsed |= anyOfItem.unparsed;
    return this;
  }

  /**
   * Alternative value specifications this property can match. Absent when none apply.
   *
   * @return anyOf
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANY_OF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FleetIntegrationSchemaSpecValueV2> getAnyOf() {
    return anyOf;
  }

  public void setAnyOf(List<FleetIntegrationSchemaSpecValueV2> anyOf) {
    this.anyOf = anyOf;
    if (anyOf != null) {
      for (FleetIntegrationSchemaSpecValueV2 item : anyOf) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FleetIntegrationSchemaSpecPropertyV2 items(FleetIntegrationSchemaSpecValueV2 items) {
    this.items = items;
    this.unparsed |= items.unparsed;
    return this;
  }

  /**
   * A JSON Schema-like specification for a configuration value.
   *
   * <p>Object-typed values always include a <code>properties</code> array, even when empty.
   * Non-object-typed values never include <code>properties</code>. Throughout this schema, an empty
   * array is meaningfully different from an absent field.
   *
   * <p>Three further JSON Schema keywords can appear directly on this object but are not listed
   * among its properties below to avoid clashing with this document's own schema composition
   * keywords: <code>enum</code> (an array of allowed values, present only when there are enum
   * constraints), <code>required</code> (an array of required property names, present only when
   * <code>type</code> is <code>object</code>), and <code>oneOf</code> (an array of exclusive
   * alternative value specifications this value can match, present only when there are
   * alternatives).
   *
   * @return items
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FleetIntegrationSchemaSpecValueV2 getItems() {
    return items;
  }

  public void setItems(FleetIntegrationSchemaSpecValueV2 items) {
    this.items = items;
    if (items != null) {
      this.unparsed |= items.unparsed;
    }
  }

  public FleetIntegrationSchemaSpecPropertyV2 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The property name.
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

  public FleetIntegrationSchemaSpecPropertyV2 properties(
      List<FleetIntegrationSchemaSpecPropertyV2> properties) {
    this.properties = properties;
    if (properties != null) {
      for (FleetIntegrationSchemaSpecPropertyV2 item : properties) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FleetIntegrationSchemaSpecPropertyV2 addPropertiesItem(
      FleetIntegrationSchemaSpecPropertyV2 propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    this.unparsed |= propertiesItem.unparsed;
    return this;
  }

  /**
   * Nested properties. Present only when <code>type</code> is <code>object</code> and the object
   * declares properties.
   *
   * @return properties
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FleetIntegrationSchemaSpecPropertyV2> getProperties() {
    return properties;
  }

  public void setProperties(List<FleetIntegrationSchemaSpecPropertyV2> properties) {
    this.properties = properties;
    if (properties != null) {
      for (FleetIntegrationSchemaSpecPropertyV2 item : properties) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FleetIntegrationSchemaSpecPropertyV2 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The JSON Schema type of the property, such as <code>string</code> or <code>boolean</code>.
   * Absent when not set.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
   * @return FleetIntegrationSchemaSpecPropertyV2
   */
  @JsonAnySetter
  public FleetIntegrationSchemaSpecPropertyV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetIntegrationSchemaSpecPropertyV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetIntegrationSchemaSpecPropertyV2 fleetIntegrationSchemaSpecPropertyV2 =
        (FleetIntegrationSchemaSpecPropertyV2) o;
    return Objects.equals(
            this.additionalProperties, fleetIntegrationSchemaSpecPropertyV2.additionalProperties)
        && Objects.equals(this.anyOf, fleetIntegrationSchemaSpecPropertyV2.anyOf)
        && Objects.equals(this.items, fleetIntegrationSchemaSpecPropertyV2.items)
        && Objects.equals(this.name, fleetIntegrationSchemaSpecPropertyV2.name)
        && Objects.equals(this.properties, fleetIntegrationSchemaSpecPropertyV2.properties)
        && Objects.equals(this.type, fleetIntegrationSchemaSpecPropertyV2.type)
        && Objects.equals(
            this.additionalProperties, fleetIntegrationSchemaSpecPropertyV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        additionalProperties, anyOf, items, name, properties, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetIntegrationSchemaSpecPropertyV2 {\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("    anyOf: ").append(toIndentedString(anyOf)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * A JSON Schema-like specification for a configuration value.
 *
 * <p>Object-typed values always include a <code>properties</code> array, even when empty.
 * Non-object-typed values never include <code>properties</code>. Throughout this schema, an empty
 * array is meaningfully different from an absent field.
 *
 * <p>Three further JSON Schema keywords can appear directly on this object but are not listed among
 * its properties below to avoid clashing with this document's own schema composition keywords:
 * <code>enum</code> (an array of allowed values, present only when there are enum constraints),
 * <code>required</code> (an array of required property names, present only when <code>type</code>
 * is <code>object</code>), and <code>oneOf</code> (an array of exclusive alternative value
 * specifications this value can match, present only when there are alternatives).
 */
@JsonPropertyOrder({
  FleetIntegrationSchemaSpecValueV2.JSON_PROPERTY_ADDITIONAL_PROPERTIES,
  FleetIntegrationSchemaSpecValueV2.JSON_PROPERTY_ANY_OF,
  FleetIntegrationSchemaSpecValueV2.JSON_PROPERTY_DEFAULT,
  FleetIntegrationSchemaSpecValueV2.JSON_PROPERTY_DESCRIPTION,
  FleetIntegrationSchemaSpecValueV2.JSON_PROPERTY_DISPLAY_DEFAULT,
  FleetIntegrationSchemaSpecValueV2.JSON_PROPERTY_EXAMPLE,
  FleetIntegrationSchemaSpecValueV2.JSON_PROPERTY_EXCLUSIVE_MAXIMUM,
  FleetIntegrationSchemaSpecValueV2.JSON_PROPERTY_EXCLUSIVE_MINIMUM,
  FleetIntegrationSchemaSpecValueV2.JSON_PROPERTY_ITEMS,
  FleetIntegrationSchemaSpecValueV2.JSON_PROPERTY_MAX_LENGTH,
  FleetIntegrationSchemaSpecValueV2.JSON_PROPERTY_MAXIMUM,
  FleetIntegrationSchemaSpecValueV2.JSON_PROPERTY_MIN_LENGTH,
  FleetIntegrationSchemaSpecValueV2.JSON_PROPERTY_MINIMUM,
  FleetIntegrationSchemaSpecValueV2.JSON_PROPERTY_PATTERN,
  FleetIntegrationSchemaSpecValueV2.JSON_PROPERTY_PROPERTIES,
  FleetIntegrationSchemaSpecValueV2.JSON_PROPERTY_SECRET,
  FleetIntegrationSchemaSpecValueV2.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetIntegrationSchemaSpecValueV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDITIONAL_PROPERTIES = "additionalProperties";
  private Object additionalProperties = null;

  public static final String JSON_PROPERTY_ANY_OF = "anyOf";
  private List<FleetIntegrationSchemaSpecValueV2> anyOf = null;

  public static final String JSON_PROPERTY_DEFAULT = "default";
  private Object _default = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_DEFAULT = "display_default";
  private Object displayDefault = null;

  public static final String JSON_PROPERTY_EXAMPLE = "example";
  private Object example = null;

  public static final String JSON_PROPERTY_EXCLUSIVE_MAXIMUM = "exclusiveMaximum";
  private Double exclusiveMaximum;

  public static final String JSON_PROPERTY_EXCLUSIVE_MINIMUM = "exclusiveMinimum";
  private Double exclusiveMinimum;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private FleetIntegrationSchemaSpecValueV2 items;

  public static final String JSON_PROPERTY_MAX_LENGTH = "maxLength";
  private Long maxLength;

  public static final String JSON_PROPERTY_MAXIMUM = "maximum";
  private Double maximum;

  public static final String JSON_PROPERTY_MIN_LENGTH = "minLength";
  private Long minLength;

  public static final String JSON_PROPERTY_MINIMUM = "minimum";
  private Double minimum;

  public static final String JSON_PROPERTY_PATTERN = "pattern";
  private String pattern;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private List<FleetIntegrationSchemaSpecPropertyV2> properties = null;

  public static final String JSON_PROPERTY_SECRET = "secret";
  private Boolean secret;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public FleetIntegrationSchemaSpecValueV2 additionalProperties(Object additionalProperties) {
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

  public FleetIntegrationSchemaSpecValueV2 anyOf(List<FleetIntegrationSchemaSpecValueV2> anyOf) {
    this.anyOf = anyOf;
    if (anyOf != null) {
      for (FleetIntegrationSchemaSpecValueV2 item : anyOf) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FleetIntegrationSchemaSpecValueV2 addAnyOfItem(
      FleetIntegrationSchemaSpecValueV2 anyOfItem) {
    if (this.anyOf == null) {
      this.anyOf = new ArrayList<>();
    }
    this.anyOf.add(anyOfItem);
    this.unparsed |= anyOfItem.unparsed;
    return this;
  }

  /**
   * Alternative value specifications this value can match. Absent when none apply.
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

  public FleetIntegrationSchemaSpecValueV2 _default(Object _default) {
    this._default = _default;
    return this;
  }

  /**
   * The default value. Can be any JSON type. Absent when not set.
   *
   * @return _default
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getDefault() {
    return _default;
  }

  public void setDefault(Object _default) {
    this._default = _default;
  }

  public FleetIntegrationSchemaSpecValueV2 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human-readable description of the value. Absent when not set.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FleetIntegrationSchemaSpecValueV2 displayDefault(Object displayDefault) {
    this.displayDefault = displayDefault;
    return this;
  }

  /**
   * A legacy, display-formatted representation of the default value. Can be any JSON type. Absent
   * when not set.
   *
   * @return displayDefault
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getDisplayDefault() {
    return displayDefault;
  }

  public void setDisplayDefault(Object displayDefault) {
    this.displayDefault = displayDefault;
  }

  public FleetIntegrationSchemaSpecValueV2 example(Object example) {
    this.example = example;
    return this;
  }

  /**
   * An example value. Can be any JSON type. Absent when not set.
   *
   * @return example
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXAMPLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getExample() {
    return example;
  }

  public void setExample(Object example) {
    this.example = example;
  }

  public FleetIntegrationSchemaSpecValueV2 exclusiveMaximum(Double exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
    return this;
  }

  /**
   * The maximum allowed numeric value, exclusive. Absent when not set.
   *
   * @return exclusiveMaximum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUSIVE_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getExclusiveMaximum() {
    return exclusiveMaximum;
  }

  public void setExclusiveMaximum(Double exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
  }

  public FleetIntegrationSchemaSpecValueV2 exclusiveMinimum(Double exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
    return this;
  }

  /**
   * The minimum allowed numeric value, exclusive. Absent when not set.
   *
   * @return exclusiveMinimum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUSIVE_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getExclusiveMinimum() {
    return exclusiveMinimum;
  }

  public void setExclusiveMinimum(Double exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
  }

  public FleetIntegrationSchemaSpecValueV2 items(FleetIntegrationSchemaSpecValueV2 items) {
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

  public FleetIntegrationSchemaSpecValueV2 maxLength(Long maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * The maximum allowed string length. Absent when not set.
   *
   * @return maxLength
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Long maxLength) {
    this.maxLength = maxLength;
  }

  public FleetIntegrationSchemaSpecValueV2 maximum(Double maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * The maximum allowed numeric value, inclusive. Absent when not set.
   *
   * @return maximum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMaximum() {
    return maximum;
  }

  public void setMaximum(Double maximum) {
    this.maximum = maximum;
  }

  public FleetIntegrationSchemaSpecValueV2 minLength(Long minLength) {
    this.minLength = minLength;
    return this;
  }

  /**
   * The minimum allowed string length. Absent when not set.
   *
   * @return minLength
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMinLength() {
    return minLength;
  }

  public void setMinLength(Long minLength) {
    this.minLength = minLength;
  }

  public FleetIntegrationSchemaSpecValueV2 minimum(Double minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * The minimum allowed numeric value, inclusive. Absent when not set.
   *
   * @return minimum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMinimum() {
    return minimum;
  }

  public void setMinimum(Double minimum) {
    this.minimum = minimum;
  }

  public FleetIntegrationSchemaSpecValueV2 pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * A regular expression the string value must match. Absent when not set.
   *
   * @return pattern
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public FleetIntegrationSchemaSpecValueV2 properties(
      List<FleetIntegrationSchemaSpecPropertyV2> properties) {
    this.properties = properties;
    if (properties != null) {
      for (FleetIntegrationSchemaSpecPropertyV2 item : properties) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FleetIntegrationSchemaSpecValueV2 addPropertiesItem(
      FleetIntegrationSchemaSpecPropertyV2 propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    this.unparsed |= propertiesItem.unparsed;
    return this;
  }

  /**
   * The object's declared properties. Present when <code>type</code> is <code>object</code>,
   * including as an empty array when the object declares no properties. Absent for non-object
   * types.
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

  public FleetIntegrationSchemaSpecValueV2 secret(Boolean secret) {
    this.secret = secret;
    return this;
  }

  /**
   * Whether the value is a secret that should be masked. Absent when not set.
   *
   * @return secret
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSecret() {
    return secret;
  }

  public void setSecret(Boolean secret) {
    this.secret = secret;
  }

  public FleetIntegrationSchemaSpecValueV2 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The JSON Schema type of the value, such as <code>string</code> or <code>object</code>. Absent
   * when not set.
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
   * @return FleetIntegrationSchemaSpecValueV2
   */
  @JsonAnySetter
  public FleetIntegrationSchemaSpecValueV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetIntegrationSchemaSpecValueV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetIntegrationSchemaSpecValueV2 fleetIntegrationSchemaSpecValueV2 =
        (FleetIntegrationSchemaSpecValueV2) o;
    return Objects.equals(
            this.additionalProperties, fleetIntegrationSchemaSpecValueV2.additionalProperties)
        && Objects.equals(this.anyOf, fleetIntegrationSchemaSpecValueV2.anyOf)
        && Objects.equals(this._default, fleetIntegrationSchemaSpecValueV2._default)
        && Objects.equals(this.description, fleetIntegrationSchemaSpecValueV2.description)
        && Objects.equals(this.displayDefault, fleetIntegrationSchemaSpecValueV2.displayDefault)
        && Objects.equals(this.example, fleetIntegrationSchemaSpecValueV2.example)
        && Objects.equals(this.exclusiveMaximum, fleetIntegrationSchemaSpecValueV2.exclusiveMaximum)
        && Objects.equals(this.exclusiveMinimum, fleetIntegrationSchemaSpecValueV2.exclusiveMinimum)
        && Objects.equals(this.items, fleetIntegrationSchemaSpecValueV2.items)
        && Objects.equals(this.maxLength, fleetIntegrationSchemaSpecValueV2.maxLength)
        && Objects.equals(this.maximum, fleetIntegrationSchemaSpecValueV2.maximum)
        && Objects.equals(this.minLength, fleetIntegrationSchemaSpecValueV2.minLength)
        && Objects.equals(this.minimum, fleetIntegrationSchemaSpecValueV2.minimum)
        && Objects.equals(this.pattern, fleetIntegrationSchemaSpecValueV2.pattern)
        && Objects.equals(this.properties, fleetIntegrationSchemaSpecValueV2.properties)
        && Objects.equals(this.secret, fleetIntegrationSchemaSpecValueV2.secret)
        && Objects.equals(this.type, fleetIntegrationSchemaSpecValueV2.type)
        && Objects.equals(
            this.additionalProperties, fleetIntegrationSchemaSpecValueV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        additionalProperties,
        anyOf,
        _default,
        description,
        displayDefault,
        example,
        exclusiveMaximum,
        exclusiveMinimum,
        items,
        maxLength,
        maximum,
        minLength,
        minimum,
        pattern,
        properties,
        secret,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetIntegrationSchemaSpecValueV2 {\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("    anyOf: ").append(toIndentedString(anyOf)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayDefault: ").append(toIndentedString(displayDefault)).append("\n");
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
    sb.append("    exclusiveMaximum: ").append(toIndentedString(exclusiveMaximum)).append("\n");
    sb.append("    exclusiveMinimum: ").append(toIndentedString(exclusiveMinimum)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

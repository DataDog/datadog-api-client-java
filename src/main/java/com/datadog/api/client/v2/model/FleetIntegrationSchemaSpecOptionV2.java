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

/** A single configuration option within an integration's configuration file. */
@JsonPropertyOrder({
  FleetIntegrationSchemaSpecOptionV2.JSON_PROPERTY_DEPRECATION,
  FleetIntegrationSchemaSpecOptionV2.JSON_PROPERTY_DESCRIPTION,
  FleetIntegrationSchemaSpecOptionV2.JSON_PROPERTY_DISPLAY_PRIORITY,
  FleetIntegrationSchemaSpecOptionV2.JSON_PROPERTY_ENABLED,
  FleetIntegrationSchemaSpecOptionV2.JSON_PROPERTY_EXAMPLE,
  FleetIntegrationSchemaSpecOptionV2.JSON_PROPERTY_HIDDEN,
  FleetIntegrationSchemaSpecOptionV2.JSON_PROPERTY_METADATA_TAGS,
  FleetIntegrationSchemaSpecOptionV2.JSON_PROPERTY_MULTIPLE,
  FleetIntegrationSchemaSpecOptionV2.JSON_PROPERTY_MULTIPLE_INSTANCES_DEFINED,
  FleetIntegrationSchemaSpecOptionV2.JSON_PROPERTY_NAME,
  FleetIntegrationSchemaSpecOptionV2.JSON_PROPERTY_OPTIONS,
  FleetIntegrationSchemaSpecOptionV2.JSON_PROPERTY_PREFILL,
  FleetIntegrationSchemaSpecOptionV2.JSON_PROPERTY_REQUIRED,
  FleetIntegrationSchemaSpecOptionV2.JSON_PROPERTY_SECRET,
  FleetIntegrationSchemaSpecOptionV2.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetIntegrationSchemaSpecOptionV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEPRECATION = "deprecation";
  private Map<String, Object> deprecation = new HashMap<String, Object>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_PRIORITY = "display_priority";
  private Long displayPriority;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_EXAMPLE = "example";
  private Object example = null;

  public static final String JSON_PROPERTY_HIDDEN = "hidden";
  private Boolean hidden;

  public static final String JSON_PROPERTY_METADATA_TAGS = "metadata_tags";
  private List<String> metadataTags = new ArrayList<>();

  public static final String JSON_PROPERTY_MULTIPLE = "multiple";
  private Boolean multiple;

  public static final String JSON_PROPERTY_MULTIPLE_INSTANCES_DEFINED =
      "multiple_instances_defined";
  private Boolean multipleInstancesDefined;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private List<FleetIntegrationSchemaSpecOptionV2> options = null;

  public static final String JSON_PROPERTY_PREFILL = "prefill";
  private Object prefill = null;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private Boolean required;

  public static final String JSON_PROPERTY_SECRET = "secret";
  private Boolean secret;

  public static final String JSON_PROPERTY_VALUE = "value";
  private FleetIntegrationSchemaSpecValueV2 value;

  public FleetIntegrationSchemaSpecOptionV2() {}

  @JsonCreator
  public FleetIntegrationSchemaSpecOptionV2(
      @JsonProperty(required = true, value = JSON_PROPERTY_DEPRECATION)
          Map<String, Object> deprecation,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_DISPLAY_PRIORITY) Long displayPriority,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_HIDDEN) Boolean hidden,
      @JsonProperty(required = true, value = JSON_PROPERTY_METADATA_TAGS) List<String> metadataTags,
      @JsonProperty(required = true, value = JSON_PROPERTY_MULTIPLE) Boolean multiple,
      @JsonProperty(required = true, value = JSON_PROPERTY_MULTIPLE_INSTANCES_DEFINED)
          Boolean multipleInstancesDefined,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUIRED) Boolean required) {
    this.deprecation = deprecation;
    if (deprecation != null) {}
    this.description = description;
    this.displayPriority = displayPriority;
    this.enabled = enabled;
    this.hidden = hidden;
    this.metadataTags = metadataTags;
    this.multiple = multiple;
    this.multipleInstancesDefined = multipleInstancesDefined;
    this.name = name;
    this.required = required;
  }

  public FleetIntegrationSchemaSpecOptionV2 deprecation(Map<String, Object> deprecation) {
    this.deprecation = deprecation;
    if (deprecation != null) {}
    return this;
  }

  public FleetIntegrationSchemaSpecOptionV2 putDeprecationItem(String key, Object deprecationItem) {
    this.deprecation.put(key, deprecationItem);
    return this;
  }

  /**
   * Deprecation information for a configuration option. Currently carries no fields and is always
   * emitted as an empty object or <code>null</code>.
   *
   * @return deprecation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPRECATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getDeprecation() {
    return deprecation;
  }

  public void setDeprecation(Map<String, Object> deprecation) {
    this.deprecation = deprecation;
  }

  public FleetIntegrationSchemaSpecOptionV2 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human-readable description of the option.
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

  public FleetIntegrationSchemaSpecOptionV2 displayPriority(Long displayPriority) {
    this.displayPriority = displayPriority;
    return this;
  }

  /**
   * The display order priority of the option relative to other options.
   *
   * @return displayPriority
   */
  @JsonProperty(JSON_PROPERTY_DISPLAY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getDisplayPriority() {
    return displayPriority;
  }

  public void setDisplayPriority(Long displayPriority) {
    this.displayPriority = displayPriority;
  }

  public FleetIntegrationSchemaSpecOptionV2 enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the option is enabled by default.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public FleetIntegrationSchemaSpecOptionV2 example(Object example) {
    this.example = example;
    return this;
  }

  /**
   * An example value for the option. Can be any JSON type. Absent from the response when not set.
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

  public FleetIntegrationSchemaSpecOptionV2 hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  /**
   * Whether the option is hidden from the default configuration UI.
   *
   * @return hidden
   */
  @JsonProperty(JSON_PROPERTY_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public FleetIntegrationSchemaSpecOptionV2 metadataTags(List<String> metadataTags) {
    this.metadataTags = metadataTags;
    return this;
  }

  public FleetIntegrationSchemaSpecOptionV2 addMetadataTagsItem(String metadataTagsItem) {
    this.metadataTags.add(metadataTagsItem);
    return this;
  }

  /**
   * Metadata tags associated with the option. Returned as an empty array when the option has no
   * tags.
   *
   * @return metadataTags
   */
  @JsonProperty(JSON_PROPERTY_METADATA_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getMetadataTags() {
    return metadataTags;
  }

  public void setMetadataTags(List<String> metadataTags) {
    this.metadataTags = metadataTags;
  }

  public FleetIntegrationSchemaSpecOptionV2 multiple(Boolean multiple) {
    this.multiple = multiple;
    return this;
  }

  /**
   * Whether the option accepts multiple values.
   *
   * @return multiple
   */
  @JsonProperty(JSON_PROPERTY_MULTIPLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getMultiple() {
    return multiple;
  }

  public void setMultiple(Boolean multiple) {
    this.multiple = multiple;
  }

  public FleetIntegrationSchemaSpecOptionV2 multipleInstancesDefined(
      Boolean multipleInstancesDefined) {
    this.multipleInstancesDefined = multipleInstancesDefined;
    return this;
  }

  /**
   * Whether multiple instances of this option are defined in the configuration file.
   *
   * @return multipleInstancesDefined
   */
  @JsonProperty(JSON_PROPERTY_MULTIPLE_INSTANCES_DEFINED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getMultipleInstancesDefined() {
    return multipleInstancesDefined;
  }

  public void setMultipleInstancesDefined(Boolean multipleInstancesDefined) {
    this.multipleInstancesDefined = multipleInstancesDefined;
  }

  public FleetIntegrationSchemaSpecOptionV2 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The option name.
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

  public FleetIntegrationSchemaSpecOptionV2 options(
      List<FleetIntegrationSchemaSpecOptionV2> options) {
    this.options = options;
    if (options != null) {
      for (FleetIntegrationSchemaSpecOptionV2 item : options) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FleetIntegrationSchemaSpecOptionV2 addOptionsItem(
      FleetIntegrationSchemaSpecOptionV2 optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    this.unparsed |= optionsItem.unparsed;
    return this;
  }

  /**
   * Nested options. Absent from the response when the option has no nested options.
   *
   * @return options
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FleetIntegrationSchemaSpecOptionV2> getOptions() {
    return options;
  }

  public void setOptions(List<FleetIntegrationSchemaSpecOptionV2> options) {
    this.options = options;
    if (options != null) {
      for (FleetIntegrationSchemaSpecOptionV2 item : options) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FleetIntegrationSchemaSpecOptionV2 prefill(Object prefill) {
    this.prefill = prefill;
    return this;
  }

  /**
   * A prefill value for the option. Can be any JSON type. Absent from the response when not set.
   *
   * @return prefill
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFILL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getPrefill() {
    return prefill;
  }

  public void setPrefill(Object prefill) {
    this.prefill = prefill;
  }

  public FleetIntegrationSchemaSpecOptionV2 required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Whether the option is required.
   *
   * @return required
   */
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public FleetIntegrationSchemaSpecOptionV2 secret(Boolean secret) {
    this.secret = secret;
    return this;
  }

  /**
   * Whether the option is a secret that should be masked. Absent from the response when not set,
   * distinct from being explicitly set to <code>false</code>.
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

  public FleetIntegrationSchemaSpecOptionV2 value(FleetIntegrationSchemaSpecValueV2 value) {
    this.value = value;
    this.unparsed |= value.unparsed;
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
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FleetIntegrationSchemaSpecValueV2 getValue() {
    return value;
  }

  public void setValue(FleetIntegrationSchemaSpecValueV2 value) {
    this.value = value;
    if (value != null) {
      this.unparsed |= value.unparsed;
    }
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
   * @return FleetIntegrationSchemaSpecOptionV2
   */
  @JsonAnySetter
  public FleetIntegrationSchemaSpecOptionV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetIntegrationSchemaSpecOptionV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetIntegrationSchemaSpecOptionV2 fleetIntegrationSchemaSpecOptionV2 =
        (FleetIntegrationSchemaSpecOptionV2) o;
    return Objects.equals(this.deprecation, fleetIntegrationSchemaSpecOptionV2.deprecation)
        && Objects.equals(this.description, fleetIntegrationSchemaSpecOptionV2.description)
        && Objects.equals(this.displayPriority, fleetIntegrationSchemaSpecOptionV2.displayPriority)
        && Objects.equals(this.enabled, fleetIntegrationSchemaSpecOptionV2.enabled)
        && Objects.equals(this.example, fleetIntegrationSchemaSpecOptionV2.example)
        && Objects.equals(this.hidden, fleetIntegrationSchemaSpecOptionV2.hidden)
        && Objects.equals(this.metadataTags, fleetIntegrationSchemaSpecOptionV2.metadataTags)
        && Objects.equals(this.multiple, fleetIntegrationSchemaSpecOptionV2.multiple)
        && Objects.equals(
            this.multipleInstancesDefined,
            fleetIntegrationSchemaSpecOptionV2.multipleInstancesDefined)
        && Objects.equals(this.name, fleetIntegrationSchemaSpecOptionV2.name)
        && Objects.equals(this.options, fleetIntegrationSchemaSpecOptionV2.options)
        && Objects.equals(this.prefill, fleetIntegrationSchemaSpecOptionV2.prefill)
        && Objects.equals(this.required, fleetIntegrationSchemaSpecOptionV2.required)
        && Objects.equals(this.secret, fleetIntegrationSchemaSpecOptionV2.secret)
        && Objects.equals(this.value, fleetIntegrationSchemaSpecOptionV2.value)
        && Objects.equals(
            this.additionalProperties, fleetIntegrationSchemaSpecOptionV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        deprecation,
        description,
        displayPriority,
        enabled,
        example,
        hidden,
        metadataTags,
        multiple,
        multipleInstancesDefined,
        name,
        options,
        prefill,
        required,
        secret,
        value,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetIntegrationSchemaSpecOptionV2 {\n");
    sb.append("    deprecation: ").append(toIndentedString(deprecation)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayPriority: ").append(toIndentedString(displayPriority)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    metadataTags: ").append(toIndentedString(metadataTags)).append("\n");
    sb.append("    multiple: ").append(toIndentedString(multiple)).append("\n");
    sb.append("    multipleInstancesDefined: ")
        .append(toIndentedString(multipleInstancesDefined))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    prefill: ").append(toIndentedString(prefill)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

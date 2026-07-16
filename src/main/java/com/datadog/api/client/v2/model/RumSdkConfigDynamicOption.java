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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A dynamic configuration option that extracts a value at runtime using a specified strategy. */
@JsonPropertyOrder({
  RumSdkConfigDynamicOption.JSON_PROPERTY_ATTRIBUTE,
  RumSdkConfigDynamicOption.JSON_PROPERTY_EXTRACTOR,
  RumSdkConfigDynamicOption.JSON_PROPERTY_KEY,
  RumSdkConfigDynamicOption.JSON_PROPERTY_NAME,
  RumSdkConfigDynamicOption.JSON_PROPERTY_PATH,
  RumSdkConfigDynamicOption.JSON_PROPERTY_RC_SERIALIZED_TYPE,
  RumSdkConfigDynamicOption.JSON_PROPERTY_SELECTOR,
  RumSdkConfigDynamicOption.JSON_PROPERTY_STRATEGY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumSdkConfigDynamicOption {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTE = "attribute";
  private String attribute;

  public static final String JSON_PROPERTY_EXTRACTOR = "extractor";
  private RumSdkConfigSerializedRegex extractor;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_RC_SERIALIZED_TYPE = "rc_serialized_type";
  private RumSdkConfigDynamicOptionSerializedType rcSerializedType;

  public static final String JSON_PROPERTY_SELECTOR = "selector";
  private String selector;

  public static final String JSON_PROPERTY_STRATEGY = "strategy";
  private RumSdkConfigDynamicOptionStrategy strategy;

  public RumSdkConfigDynamicOption() {}

  @JsonCreator
  public RumSdkConfigDynamicOption(
      @JsonProperty(required = true, value = JSON_PROPERTY_RC_SERIALIZED_TYPE)
          RumSdkConfigDynamicOptionSerializedType rcSerializedType,
      @JsonProperty(required = true, value = JSON_PROPERTY_STRATEGY)
          RumSdkConfigDynamicOptionStrategy strategy) {
    this.rcSerializedType = rcSerializedType;
    this.unparsed |= !rcSerializedType.isValid();
    this.strategy = strategy;
    this.unparsed |= !strategy.isValid();
  }

  public RumSdkConfigDynamicOption attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * The element attribute to read. Used when <code>strategy</code> is <code>dom</code>.
   *
   * @return attribute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public RumSdkConfigDynamicOption extractor(RumSdkConfigSerializedRegex extractor) {
    this.extractor = extractor;
    this.unparsed |= extractor.unparsed;
    return this;
  }

  /**
   * A serialized regex used as an extractor in dynamic options.
   *
   * @return extractor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTRACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RumSdkConfigSerializedRegex getExtractor() {
    return extractor;
  }

  public void setExtractor(RumSdkConfigSerializedRegex extractor) {
    this.extractor = extractor;
    if (extractor != null) {
      this.unparsed |= extractor.unparsed;
    }
  }

  public RumSdkConfigDynamicOption key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The <code>localStorage</code> key to read. Required when <code>strategy</code> is <code>
   * localStorage</code>.
   *
   * @return key
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public RumSdkConfigDynamicOption name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The cookie name to read. Required when <code>strategy</code> is <code>cookie</code>.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RumSdkConfigDynamicOption path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The JavaScript path used to extract the value. Required when <code>strategy</code> is <code>js
   * </code>.
   *
   * @return path
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public RumSdkConfigDynamicOption rcSerializedType(
      RumSdkConfigDynamicOptionSerializedType rcSerializedType) {
    this.rcSerializedType = rcSerializedType;
    this.unparsed |= !rcSerializedType.isValid();
    return this;
  }

  /**
   * The type identifier for a dynamic option. Always <code>dynamic</code>.
   *
   * @return rcSerializedType
   */
  @JsonProperty(JSON_PROPERTY_RC_SERIALIZED_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumSdkConfigDynamicOptionSerializedType getRcSerializedType() {
    return rcSerializedType;
  }

  public void setRcSerializedType(RumSdkConfigDynamicOptionSerializedType rcSerializedType) {
    if (!rcSerializedType.isValid()) {
      this.unparsed = true;
    }
    this.rcSerializedType = rcSerializedType;
  }

  public RumSdkConfigDynamicOption selector(String selector) {
    this.selector = selector;
    return this;
  }

  /**
   * The CSS selector to read from the page. Required when <code>strategy</code> is <code>dom</code>
   * .
   *
   * @return selector
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSelector() {
    return selector;
  }

  public void setSelector(String selector) {
    this.selector = selector;
  }

  public RumSdkConfigDynamicOption strategy(RumSdkConfigDynamicOptionStrategy strategy) {
    this.strategy = strategy;
    this.unparsed |= !strategy.isValid();
    return this;
  }

  /**
   * The strategy used to extract the dynamic value.
   *
   * @return strategy
   */
  @JsonProperty(JSON_PROPERTY_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumSdkConfigDynamicOptionStrategy getStrategy() {
    return strategy;
  }

  public void setStrategy(RumSdkConfigDynamicOptionStrategy strategy) {
    if (!strategy.isValid()) {
      this.unparsed = true;
    }
    this.strategy = strategy;
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
   * @return RumSdkConfigDynamicOption
   */
  @JsonAnySetter
  public RumSdkConfigDynamicOption putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumSdkConfigDynamicOption object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumSdkConfigDynamicOption rumSdkConfigDynamicOption = (RumSdkConfigDynamicOption) o;
    return Objects.equals(this.attribute, rumSdkConfigDynamicOption.attribute)
        && Objects.equals(this.extractor, rumSdkConfigDynamicOption.extractor)
        && Objects.equals(this.key, rumSdkConfigDynamicOption.key)
        && Objects.equals(this.name, rumSdkConfigDynamicOption.name)
        && Objects.equals(this.path, rumSdkConfigDynamicOption.path)
        && Objects.equals(this.rcSerializedType, rumSdkConfigDynamicOption.rcSerializedType)
        && Objects.equals(this.selector, rumSdkConfigDynamicOption.selector)
        && Objects.equals(this.strategy, rumSdkConfigDynamicOption.strategy)
        && Objects.equals(
            this.additionalProperties, rumSdkConfigDynamicOption.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attribute,
        extractor,
        key,
        name,
        path,
        rcSerializedType,
        selector,
        strategy,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumSdkConfigDynamicOption {\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    extractor: ").append(toIndentedString(extractor)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    rcSerializedType: ").append(toIndentedString(rcSerializedType)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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

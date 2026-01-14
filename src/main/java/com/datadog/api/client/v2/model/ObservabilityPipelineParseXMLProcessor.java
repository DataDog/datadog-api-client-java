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

/**
 * The <code>parse_xml</code> processor parses XML from a specified field and extracts it into the
 * event.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineParseXMLProcessor.JSON_PROPERTY_ALWAYS_USE_TEXT_KEY,
  ObservabilityPipelineParseXMLProcessor.JSON_PROPERTY_ATTR_PREFIX,
  ObservabilityPipelineParseXMLProcessor.JSON_PROPERTY_DISPLAY_NAME,
  ObservabilityPipelineParseXMLProcessor.JSON_PROPERTY_ENABLED,
  ObservabilityPipelineParseXMLProcessor.JSON_PROPERTY_FIELD,
  ObservabilityPipelineParseXMLProcessor.JSON_PROPERTY_ID,
  ObservabilityPipelineParseXMLProcessor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineParseXMLProcessor.JSON_PROPERTY_INCLUDE_ATTR,
  ObservabilityPipelineParseXMLProcessor.JSON_PROPERTY_PARSE_BOOL,
  ObservabilityPipelineParseXMLProcessor.JSON_PROPERTY_PARSE_NULL,
  ObservabilityPipelineParseXMLProcessor.JSON_PROPERTY_PARSE_NUMBER,
  ObservabilityPipelineParseXMLProcessor.JSON_PROPERTY_TEXT_KEY,
  ObservabilityPipelineParseXMLProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineParseXMLProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALWAYS_USE_TEXT_KEY = "always_use_text_key";
  private Boolean alwaysUseTextKey;

  public static final String JSON_PROPERTY_ATTR_PREFIX = "attr_prefix";
  private String attrPrefix;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_INCLUDE_ATTR = "include_attr";
  private Boolean includeAttr;

  public static final String JSON_PROPERTY_PARSE_BOOL = "parse_bool";
  private Boolean parseBool;

  public static final String JSON_PROPERTY_PARSE_NULL = "parse_null";
  private Boolean parseNull;

  public static final String JSON_PROPERTY_PARSE_NUMBER = "parse_number";
  private Boolean parseNumber;

  public static final String JSON_PROPERTY_TEXT_KEY = "text_key";
  private String textKey;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineParseXMLProcessorType type =
      ObservabilityPipelineParseXMLProcessorType.PARSE_XML;

  public ObservabilityPipelineParseXMLProcessor() {}

  @JsonCreator
  public ObservabilityPipelineParseXMLProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_FIELD) String field,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) String include,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineParseXMLProcessorType type) {
    this.enabled = enabled;
    this.field = field;
    this.id = id;
    this.include = include;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineParseXMLProcessor alwaysUseTextKey(Boolean alwaysUseTextKey) {
    this.alwaysUseTextKey = alwaysUseTextKey;
    return this;
  }

  /**
   * Whether to always use a text key for element content.
   *
   * @return alwaysUseTextKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALWAYS_USE_TEXT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAlwaysUseTextKey() {
    return alwaysUseTextKey;
  }

  public void setAlwaysUseTextKey(Boolean alwaysUseTextKey) {
    this.alwaysUseTextKey = alwaysUseTextKey;
  }

  public ObservabilityPipelineParseXMLProcessor attrPrefix(String attrPrefix) {
    this.attrPrefix = attrPrefix;
    return this;
  }

  /**
   * The prefix to use for XML attributes in the parsed output.
   *
   * @return attrPrefix
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTR_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAttrPrefix() {
    return attrPrefix;
  }

  public void setAttrPrefix(String attrPrefix) {
    this.attrPrefix = attrPrefix;
  }

  public ObservabilityPipelineParseXMLProcessor displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name for a component.
   *
   * @return displayName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ObservabilityPipelineParseXMLProcessor enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicates whether the processor is enabled.
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

  public ObservabilityPipelineParseXMLProcessor field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The name of the log field that contains an XML string.
   *
   * @return field
   */
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ObservabilityPipelineParseXMLProcessor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this component. Used in other parts of the pipeline to reference this
   * component (for example, as the <code>input</code> to downstream components).
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ObservabilityPipelineParseXMLProcessor include(String include) {
    this.include = include;
    return this;
  }

  /**
   * A Datadog search query used to determine which logs this processor targets.
   *
   * @return include
   */
  @JsonProperty(JSON_PROPERTY_INCLUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInclude() {
    return include;
  }

  public void setInclude(String include) {
    this.include = include;
  }

  public ObservabilityPipelineParseXMLProcessor includeAttr(Boolean includeAttr) {
    this.includeAttr = includeAttr;
    return this;
  }

  /**
   * Whether to include XML attributes in the parsed output.
   *
   * @return includeAttr
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_ATTR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncludeAttr() {
    return includeAttr;
  }

  public void setIncludeAttr(Boolean includeAttr) {
    this.includeAttr = includeAttr;
  }

  public ObservabilityPipelineParseXMLProcessor parseBool(Boolean parseBool) {
    this.parseBool = parseBool;
    return this;
  }

  /**
   * Whether to parse boolean values from strings.
   *
   * @return parseBool
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARSE_BOOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getParseBool() {
    return parseBool;
  }

  public void setParseBool(Boolean parseBool) {
    this.parseBool = parseBool;
  }

  public ObservabilityPipelineParseXMLProcessor parseNull(Boolean parseNull) {
    this.parseNull = parseNull;
    return this;
  }

  /**
   * Whether to parse null values.
   *
   * @return parseNull
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARSE_NULL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getParseNull() {
    return parseNull;
  }

  public void setParseNull(Boolean parseNull) {
    this.parseNull = parseNull;
  }

  public ObservabilityPipelineParseXMLProcessor parseNumber(Boolean parseNumber) {
    this.parseNumber = parseNumber;
    return this;
  }

  /**
   * Whether to parse numeric values from strings.
   *
   * @return parseNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARSE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getParseNumber() {
    return parseNumber;
  }

  public void setParseNumber(Boolean parseNumber) {
    this.parseNumber = parseNumber;
  }

  public ObservabilityPipelineParseXMLProcessor textKey(String textKey) {
    this.textKey = textKey;
    return this;
  }

  /**
   * The key name to use for text content within XML elements. Must be at least 1 character if
   * specified.
   *
   * @return textKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTextKey() {
    return textKey;
  }

  public void setTextKey(String textKey) {
    this.textKey = textKey;
  }

  public ObservabilityPipelineParseXMLProcessor type(
      ObservabilityPipelineParseXMLProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The processor type. The value should always be <code>parse_xml</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineParseXMLProcessorType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineParseXMLProcessorType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
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
   * @return ObservabilityPipelineParseXMLProcessor
   */
  @JsonAnySetter
  public ObservabilityPipelineParseXMLProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineParseXMLProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineParseXMLProcessor observabilityPipelineParseXmlProcessor =
        (ObservabilityPipelineParseXMLProcessor) o;
    return Objects.equals(
            this.alwaysUseTextKey, observabilityPipelineParseXmlProcessor.alwaysUseTextKey)
        && Objects.equals(this.attrPrefix, observabilityPipelineParseXmlProcessor.attrPrefix)
        && Objects.equals(this.displayName, observabilityPipelineParseXmlProcessor.displayName)
        && Objects.equals(this.enabled, observabilityPipelineParseXmlProcessor.enabled)
        && Objects.equals(this.field, observabilityPipelineParseXmlProcessor.field)
        && Objects.equals(this.id, observabilityPipelineParseXmlProcessor.id)
        && Objects.equals(this.include, observabilityPipelineParseXmlProcessor.include)
        && Objects.equals(this.includeAttr, observabilityPipelineParseXmlProcessor.includeAttr)
        && Objects.equals(this.parseBool, observabilityPipelineParseXmlProcessor.parseBool)
        && Objects.equals(this.parseNull, observabilityPipelineParseXmlProcessor.parseNull)
        && Objects.equals(this.parseNumber, observabilityPipelineParseXmlProcessor.parseNumber)
        && Objects.equals(this.textKey, observabilityPipelineParseXmlProcessor.textKey)
        && Objects.equals(this.type, observabilityPipelineParseXmlProcessor.type)
        && Objects.equals(
            this.additionalProperties, observabilityPipelineParseXmlProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        alwaysUseTextKey,
        attrPrefix,
        displayName,
        enabled,
        field,
        id,
        include,
        includeAttr,
        parseBool,
        parseNull,
        parseNumber,
        textKey,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineParseXMLProcessor {\n");
    sb.append("    alwaysUseTextKey: ").append(toIndentedString(alwaysUseTextKey)).append("\n");
    sb.append("    attrPrefix: ").append(toIndentedString(attrPrefix)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    includeAttr: ").append(toIndentedString(includeAttr)).append("\n");
    sb.append("    parseBool: ").append(toIndentedString(parseBool)).append("\n");
    sb.append("    parseNull: ").append(toIndentedString(parseNull)).append("\n");
    sb.append("    parseNumber: ").append(toIndentedString(parseNumber)).append("\n");
    sb.append("    textKey: ").append(toIndentedString(textKey)).append("\n");
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

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * An attribute remapper sub-processor for use inside an array-map processor. Unlike the top-level
 * attribute remapper, <code>is_enabled</code>, <code>source_type</code>, and <code>target_type
 * </code> are not supported.
 */
@JsonPropertyOrder({
  LogsArrayMapAttributeRemapper.JSON_PROPERTY_NAME,
  LogsArrayMapAttributeRemapper.JSON_PROPERTY_OVERRIDE_ON_CONFLICT,
  LogsArrayMapAttributeRemapper.JSON_PROPERTY_PRESERVE_SOURCE,
  LogsArrayMapAttributeRemapper.JSON_PROPERTY_SOURCES,
  LogsArrayMapAttributeRemapper.JSON_PROPERTY_TARGET,
  LogsArrayMapAttributeRemapper.JSON_PROPERTY_TARGET_FORMAT,
  LogsArrayMapAttributeRemapper.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArrayMapAttributeRemapper {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OVERRIDE_ON_CONFLICT = "override_on_conflict";
  private Boolean overrideOnConflict = false;

  public static final String JSON_PROPERTY_PRESERVE_SOURCE = "preserve_source";
  private Boolean preserveSource = false;

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<String> sources = new ArrayList<>();

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TARGET_FORMAT = "target_format";
  private TargetFormatType targetFormat;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsAttributeRemapperType type = LogsAttributeRemapperType.ATTRIBUTE_REMAPPER;

  public LogsArrayMapAttributeRemapper() {}

  @JsonCreator
  public LogsArrayMapAttributeRemapper(
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCES) List<String> sources,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET) String target,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LogsAttributeRemapperType type) {
    this.sources = sources;
    this.target = target;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogsArrayMapAttributeRemapper name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the sub-processor.
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

  public LogsArrayMapAttributeRemapper overrideOnConflict(Boolean overrideOnConflict) {
    this.overrideOnConflict = overrideOnConflict;
    return this;
  }

  /**
   * Override the target element if already set.
   *
   * @return overrideOnConflict
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERRIDE_ON_CONFLICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOverrideOnConflict() {
    return overrideOnConflict;
  }

  public void setOverrideOnConflict(Boolean overrideOnConflict) {
    this.overrideOnConflict = overrideOnConflict;
  }

  public LogsArrayMapAttributeRemapper preserveSource(Boolean preserveSource) {
    this.preserveSource = preserveSource;
    return this;
  }

  /**
   * Remove or preserve the remapped source element.
   *
   * @return preserveSource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRESERVE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPreserveSource() {
    return preserveSource;
  }

  public void setPreserveSource(Boolean preserveSource) {
    this.preserveSource = preserveSource;
  }

  public LogsArrayMapAttributeRemapper sources(List<String> sources) {
    this.sources = sources;
    return this;
  }

  public LogsArrayMapAttributeRemapper addSourcesItem(String sourcesItem) {
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * Array of source attribute paths.
   *
   * @return sources
   */
  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getSources() {
    return sources;
  }

  public void setSources(List<String> sources) {
    this.sources = sources;
  }

  public LogsArrayMapAttributeRemapper target(String target) {
    this.target = target;
    return this;
  }

  /**
   * Target attribute path.
   *
   * @return target
   */
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public LogsArrayMapAttributeRemapper targetFormat(TargetFormatType targetFormat) {
    this.targetFormat = targetFormat;
    this.unparsed |= !targetFormat.isValid();
    return this;
  }

  /**
   * If the <code>target_type</code> of the remapper is <code>attribute</code>, try to cast the
   * value to a new specific type. If the cast is not possible, the original type is kept. <code>
   * string</code>, <code>integer</code>, or <code>double</code> are the possible types. If the
   * <code>target_type</code> is <code>tag</code>, this parameter may not be specified.
   *
   * @return targetFormat
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TargetFormatType getTargetFormat() {
    return targetFormat;
  }

  public void setTargetFormat(TargetFormatType targetFormat) {
    if (!targetFormat.isValid()) {
      this.unparsed = true;
    }
    this.targetFormat = targetFormat;
  }

  public LogsArrayMapAttributeRemapper type(LogsAttributeRemapperType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of logs attribute remapper.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsAttributeRemapperType getType() {
    return type;
  }

  public void setType(LogsAttributeRemapperType type) {
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
   * @return LogsArrayMapAttributeRemapper
   */
  @JsonAnySetter
  public LogsArrayMapAttributeRemapper putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsArrayMapAttributeRemapper object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArrayMapAttributeRemapper logsArrayMapAttributeRemapper = (LogsArrayMapAttributeRemapper) o;
    return Objects.equals(this.name, logsArrayMapAttributeRemapper.name)
        && Objects.equals(this.overrideOnConflict, logsArrayMapAttributeRemapper.overrideOnConflict)
        && Objects.equals(this.preserveSource, logsArrayMapAttributeRemapper.preserveSource)
        && Objects.equals(this.sources, logsArrayMapAttributeRemapper.sources)
        && Objects.equals(this.target, logsArrayMapAttributeRemapper.target)
        && Objects.equals(this.targetFormat, logsArrayMapAttributeRemapper.targetFormat)
        && Objects.equals(this.type, logsArrayMapAttributeRemapper.type)
        && Objects.equals(
            this.additionalProperties, logsArrayMapAttributeRemapper.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        name,
        overrideOnConflict,
        preserveSource,
        sources,
        target,
        targetFormat,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArrayMapAttributeRemapper {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overrideOnConflict: ").append(toIndentedString(overrideOnConflict)).append("\n");
    sb.append("    preserveSource: ").append(toIndentedString(preserveSource)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    targetFormat: ").append(toIndentedString(targetFormat)).append("\n");
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

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
   * <p>The remapper processor remaps any source attribute(s) or tag to another target attribute or tag.
   * Constraints on the tag/attribute name are explained in the <a href="https://docs.datadoghq.com/logs/guide/log-parsing-best-practice">Tag Best Practice documentation</a>.
   * Some additional constraints are applied as <code>:</code> or <code>,</code> are not allowed in the target tag/attribute name.</p>
 */
@JsonPropertyOrder({
  LogsAttributeRemapper.JSON_PROPERTY_IS_ENABLED,
  LogsAttributeRemapper.JSON_PROPERTY_NAME,
  LogsAttributeRemapper.JSON_PROPERTY_OVERRIDE_ON_CONFLICT,
  LogsAttributeRemapper.JSON_PROPERTY_PRESERVE_SOURCE,
  LogsAttributeRemapper.JSON_PROPERTY_SOURCE_TYPE,
  LogsAttributeRemapper.JSON_PROPERTY_SOURCES,
  LogsAttributeRemapper.JSON_PROPERTY_TARGET,
  LogsAttributeRemapper.JSON_PROPERTY_TARGET_FORMAT,
  LogsAttributeRemapper.JSON_PROPERTY_TARGET_TYPE,
  LogsAttributeRemapper.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsAttributeRemapper {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OVERRIDE_ON_CONFLICT = "override_on_conflict";
  private Boolean overrideOnConflict = false;

  public static final String JSON_PROPERTY_PRESERVE_SOURCE = "preserve_source";
  private Boolean preserveSource = false;

  public static final String JSON_PROPERTY_SOURCE_TYPE = "source_type";
  private String sourceType = "attribute";

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<String> sources = new ArrayList<>();

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TARGET_FORMAT = "target_format";
  private TargetFormatType targetFormat;

  public static final String JSON_PROPERTY_TARGET_TYPE = "target_type";
  private String targetType = "attribute";

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsAttributeRemapperType type = LogsAttributeRemapperType.ATTRIBUTE_REMAPPER;

  public LogsAttributeRemapper() {}

  @JsonCreator
  public LogsAttributeRemapper(
            @JsonProperty(required=true, value=JSON_PROPERTY_SOURCES)List<String> sources,
            @JsonProperty(required=true, value=JSON_PROPERTY_TARGET)String target,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)LogsAttributeRemapperType type) {
        this.sources = sources;
        this.target = target;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public LogsAttributeRemapper isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * <p>Whether or not the processor is enabled.</p>
   * @return isEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsEnabled() {
        return isEnabled;
      }
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }
  public LogsAttributeRemapper name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the processor.</p>
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
  public LogsAttributeRemapper overrideOnConflict(Boolean overrideOnConflict) {
    this.overrideOnConflict = overrideOnConflict;
    return this;
  }

  /**
   * <p>Override or not the target element if already set,</p>
   * @return overrideOnConflict
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OVERRIDE_ON_CONFLICT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getOverrideOnConflict() {
        return overrideOnConflict;
      }
  public void setOverrideOnConflict(Boolean overrideOnConflict) {
    this.overrideOnConflict = overrideOnConflict;
  }
  public LogsAttributeRemapper preserveSource(Boolean preserveSource) {
    this.preserveSource = preserveSource;
    return this;
  }

  /**
   * <p>Remove or preserve the remapped source element.</p>
   * @return preserveSource
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRESERVE_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getPreserveSource() {
        return preserveSource;
      }
  public void setPreserveSource(Boolean preserveSource) {
    this.preserveSource = preserveSource;
  }
  public LogsAttributeRemapper sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * <p>Defines if the sources are from log <code>attribute</code> or <code>tag</code>.</p>
   * @return sourceType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSourceType() {
        return sourceType;
      }
  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }
  public LogsAttributeRemapper sources(List<String> sources) {
    this.sources = sources;
    return this;
  }
  public LogsAttributeRemapper addSourcesItem(String sourcesItem) {
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * <p>Array of source attributes.</p>
   * @return sources
  **/
      @JsonProperty(JSON_PROPERTY_SOURCES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getSources() {
        return sources;
      }
  public void setSources(List<String> sources) {
    this.sources = sources;
  }
  public LogsAttributeRemapper target(String target) {
    this.target = target;
    return this;
  }

  /**
   * <p>Final attribute or tag name to remap the sources to.</p>
   * @return target
  **/
      @JsonProperty(JSON_PROPERTY_TARGET)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTarget() {
        return target;
      }
  public void setTarget(String target) {
    this.target = target;
  }
  public LogsAttributeRemapper targetFormat(TargetFormatType targetFormat) {
    this.targetFormat = targetFormat;
    this.unparsed |= !targetFormat.isValid();
    return this;
  }

  /**
   * <p>If the <code>target_type</code> of the remapper is <code>attribute</code>, try to cast the value to a new specific type.
   * If the cast is not possible, the original type is kept. <code>string</code>, <code>integer</code>, or <code>double</code> are the possible types.
   * If the <code>target_type</code> is <code>tag</code>, this parameter may not be specified.</p>
   * @return targetFormat
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TARGET_FORMAT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TargetFormatType getTargetFormat() {
        return targetFormat;
      }
  public void setTargetFormat(TargetFormatType targetFormat) {
    if (!targetFormat.isValid()) {
        this.unparsed = true;
    }
    this.targetFormat = targetFormat;
  }
  public LogsAttributeRemapper targetType(String targetType) {
    this.targetType = targetType;
    return this;
  }

  /**
   * <p>Defines if the final attribute or tag name is from log <code>attribute</code> or <code>tag</code>.</p>
   * @return targetType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TARGET_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTargetType() {
        return targetType;
      }
  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }
  public LogsAttributeRemapper type(LogsAttributeRemapperType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of logs attribute remapper.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * @return LogsAttributeRemapper
   */
  @JsonAnySetter
  public LogsAttributeRemapper putAdditionalProperty(String key, Object value) {
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
   * Return true if this LogsAttributeRemapper object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsAttributeRemapper logsAttributeRemapper = (LogsAttributeRemapper) o;
    return Objects.equals(this.isEnabled, logsAttributeRemapper.isEnabled) && Objects.equals(this.name, logsAttributeRemapper.name) && Objects.equals(this.overrideOnConflict, logsAttributeRemapper.overrideOnConflict) && Objects.equals(this.preserveSource, logsAttributeRemapper.preserveSource) && Objects.equals(this.sourceType, logsAttributeRemapper.sourceType) && Objects.equals(this.sources, logsAttributeRemapper.sources) && Objects.equals(this.target, logsAttributeRemapper.target) && Objects.equals(this.targetFormat, logsAttributeRemapper.targetFormat) && Objects.equals(this.targetType, logsAttributeRemapper.targetType) && Objects.equals(this.type, logsAttributeRemapper.type) && Objects.equals(this.additionalProperties, logsAttributeRemapper.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(isEnabled,name,overrideOnConflict,preserveSource,sourceType,sources,target,targetFormat,targetType,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsAttributeRemapper {\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overrideOnConflict: ").append(toIndentedString(overrideOnConflict)).append("\n");
    sb.append("    preserveSource: ").append(toIndentedString(preserveSource)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    targetFormat: ").append(toIndentedString(targetFormat)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

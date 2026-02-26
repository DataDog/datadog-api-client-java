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
   * <p>Defines a single field mapping rule for transforming a source field to an OCSF destination field.</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineOcsfMappingCustomFieldMapping.JSON_PROPERTY_DEFAULT,
  ObservabilityPipelineOcsfMappingCustomFieldMapping.JSON_PROPERTY_DEST,
  ObservabilityPipelineOcsfMappingCustomFieldMapping.JSON_PROPERTY_LOOKUP,
  ObservabilityPipelineOcsfMappingCustomFieldMapping.JSON_PROPERTY_SOURCE,
  ObservabilityPipelineOcsfMappingCustomFieldMapping.JSON_PROPERTY_SOURCES,
  ObservabilityPipelineOcsfMappingCustomFieldMapping.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineOcsfMappingCustomFieldMapping {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFAULT = "default";
  private Object _default = null;

  public static final String JSON_PROPERTY_DEST = "dest";
  private String dest;

  public static final String JSON_PROPERTY_LOOKUP = "lookup";
  private ObservabilityPipelineOcsfMappingCustomLookup lookup;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private Object source = null;

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private Object sources = null;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Object value = null;

  public ObservabilityPipelineOcsfMappingCustomFieldMapping() {}

  @JsonCreator
  public ObservabilityPipelineOcsfMappingCustomFieldMapping(
            @JsonProperty(required=true, value=JSON_PROPERTY_DEST)String dest) {
        this.dest = dest;
  }
  public ObservabilityPipelineOcsfMappingCustomFieldMapping _default(Object _default) {
    this._default = _default;
    return this;
  }

  /**
   * <p>The default value to use if the source field is missing or empty.</p>
   * @return _default
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DEFAULT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Object getDefault() {
        return _default;
      }
  public void setDefault(Object _default) {
    this._default = _default;
  }
  public ObservabilityPipelineOcsfMappingCustomFieldMapping dest(String dest) {
    this.dest = dest;
    return this;
  }

  /**
   * <p>The destination OCSF field path.</p>
   * @return dest
  **/
      @JsonProperty(JSON_PROPERTY_DEST)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getDest() {
        return dest;
      }
  public void setDest(String dest) {
    this.dest = dest;
  }
  public ObservabilityPipelineOcsfMappingCustomFieldMapping lookup(ObservabilityPipelineOcsfMappingCustomLookup lookup) {
    this.lookup = lookup;
    this.unparsed |= lookup.unparsed;
    return this;
  }

  /**
   * <p>Lookup table configuration for mapping source values to destination values.</p>
   * @return lookup
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOOKUP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ObservabilityPipelineOcsfMappingCustomLookup getLookup() {
        return lookup;
      }
  public void setLookup(ObservabilityPipelineOcsfMappingCustomLookup lookup) {
    this.lookup = lookup;
  }
  public ObservabilityPipelineOcsfMappingCustomFieldMapping source(Object source) {
    this.source = source;
    return this;
  }

  /**
   * <p>The source field path from the log event.</p>
   * @return source
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Object getSource() {
        return source;
      }
  public void setSource(Object source) {
    this.source = source;
  }
  public ObservabilityPipelineOcsfMappingCustomFieldMapping sources(Object sources) {
    this.sources = sources;
    return this;
  }

  /**
   * <p>Multiple source field paths for combined mapping.</p>
   * @return sources
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SOURCES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Object getSources() {
        return sources;
      }
  public void setSources(Object sources) {
    this.sources = sources;
  }
  public ObservabilityPipelineOcsfMappingCustomFieldMapping value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * <p>A static value to use for the destination field.</p>
   * @return value
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Object getValue() {
        return value;
      }
  public void setValue(Object value) {
    this.value = value;
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
   * @return ObservabilityPipelineOcsfMappingCustomFieldMapping
   */
  @JsonAnySetter
  public ObservabilityPipelineOcsfMappingCustomFieldMapping putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineOcsfMappingCustomFieldMapping object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineOcsfMappingCustomFieldMapping observabilityPipelineOcsfMappingCustomFieldMapping = (ObservabilityPipelineOcsfMappingCustomFieldMapping) o;
    return Objects.equals(this._default, observabilityPipelineOcsfMappingCustomFieldMapping._default) && Objects.equals(this.dest, observabilityPipelineOcsfMappingCustomFieldMapping.dest) && Objects.equals(this.lookup, observabilityPipelineOcsfMappingCustomFieldMapping.lookup) && Objects.equals(this.source, observabilityPipelineOcsfMappingCustomFieldMapping.source) && Objects.equals(this.sources, observabilityPipelineOcsfMappingCustomFieldMapping.sources) && Objects.equals(this.value, observabilityPipelineOcsfMappingCustomFieldMapping.value) && Objects.equals(this.additionalProperties, observabilityPipelineOcsfMappingCustomFieldMapping.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(_default,dest,lookup,source,sources,value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineOcsfMappingCustomFieldMapping {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    dest: ").append(toIndentedString(dest)).append("\n");
    sb.append("    lookup: ").append(toIndentedString(lookup)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

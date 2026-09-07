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
   * <p>Use the Lookup Processor to define a mapping between a log attribute
   * and a human readable value saved in the processors mapping table.
   * For example, you can use the Lookup Processor to map an internal service ID
   * into a human readable service name. Alternatively, you could also use it to check
   * if the MAC address that just attempted to connect to the production
   * environment belongs to your list of stolen machines.</p>
 */
@JsonPropertyOrder({
  LogsLookupProcessor.JSON_PROPERTY_DEFAULT_LOOKUP,
  LogsLookupProcessor.JSON_PROPERTY_IS_ENABLED,
  LogsLookupProcessor.JSON_PROPERTY_LOOKUP_TABLE,
  LogsLookupProcessor.JSON_PROPERTY_NAME,
  LogsLookupProcessor.JSON_PROPERTY_SOURCE,
  LogsLookupProcessor.JSON_PROPERTY_TARGET,
  LogsLookupProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsLookupProcessor {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFAULT_LOOKUP = "default_lookup";
  private String defaultLookup;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_LOOKUP_TABLE = "lookup_table";
  private List<String> lookupTable = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsLookupProcessorType type = LogsLookupProcessorType.LOOKUP_PROCESSOR;

  public LogsLookupProcessor() {}

  @JsonCreator
  public LogsLookupProcessor(
            @JsonProperty(required=true, value=JSON_PROPERTY_LOOKUP_TABLE)List<String> lookupTable,
            @JsonProperty(required=true, value=JSON_PROPERTY_SOURCE)String source,
            @JsonProperty(required=true, value=JSON_PROPERTY_TARGET)String target,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)LogsLookupProcessorType type) {
        this.lookupTable = lookupTable;
        this.source = source;
        this.target = target;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public LogsLookupProcessor defaultLookup(String defaultLookup) {
    this.defaultLookup = defaultLookup;
    return this;
  }

  /**
   * <p>Value to set the target attribute if the source value is not found in the list.</p>
   * @return defaultLookup
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DEFAULT_LOOKUP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDefaultLookup() {
        return defaultLookup;
      }
  public void setDefaultLookup(String defaultLookup) {
    this.defaultLookup = defaultLookup;
  }
  public LogsLookupProcessor isEnabled(Boolean isEnabled) {
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
  public LogsLookupProcessor lookupTable(List<String> lookupTable) {
    this.lookupTable = lookupTable;
    return this;
  }
  public LogsLookupProcessor addLookupTableItem(String lookupTableItem) {
    this.lookupTable.add(lookupTableItem);
    return this;
  }

  /**
   * <p>Mapping table of values for the source attribute and their associated target attribute values,
   * formatted as <code>["source_key1,target_value1", "source_key2,target_value2"]</code></p>
   * @return lookupTable
  **/
      @JsonProperty(JSON_PROPERTY_LOOKUP_TABLE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getLookupTable() {
        return lookupTable;
      }
  public void setLookupTable(List<String> lookupTable) {
    this.lookupTable = lookupTable;
  }
  public LogsLookupProcessor name(String name) {
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
  public LogsLookupProcessor source(String source) {
    this.source = source;
    return this;
  }

  /**
   * <p>Source attribute used to perform the lookup.</p>
   * @return source
  **/
      @JsonProperty(JSON_PROPERTY_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getSource() {
        return source;
      }
  public void setSource(String source) {
    this.source = source;
  }
  public LogsLookupProcessor target(String target) {
    this.target = target;
    return this;
  }

  /**
   * <p>Name of the attribute that contains the corresponding value in the mapping list
   * or the <code>default_lookup</code> if not found in the mapping list.</p>
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
  public LogsLookupProcessor type(LogsLookupProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of logs lookup processor.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public LogsLookupProcessorType getType() {
        return type;
      }
  public void setType(LogsLookupProcessorType type) {
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
   * @return LogsLookupProcessor
   */
  @JsonAnySetter
  public LogsLookupProcessor putAdditionalProperty(String key, Object value) {
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
   * Return true if this LogsLookupProcessor object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsLookupProcessor logsLookupProcessor = (LogsLookupProcessor) o;
    return Objects.equals(this.defaultLookup, logsLookupProcessor.defaultLookup) && Objects.equals(this.isEnabled, logsLookupProcessor.isEnabled) && Objects.equals(this.lookupTable, logsLookupProcessor.lookupTable) && Objects.equals(this.name, logsLookupProcessor.name) && Objects.equals(this.source, logsLookupProcessor.source) && Objects.equals(this.target, logsLookupProcessor.target) && Objects.equals(this.type, logsLookupProcessor.type) && Objects.equals(this.additionalProperties, logsLookupProcessor.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(defaultLookup,isEnabled,lookupTable,name,source,target,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsLookupProcessor {\n");
    sb.append("    defaultLookup: ").append(toIndentedString(defaultLookup)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    lookupTable: ").append(toIndentedString(lookupTable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

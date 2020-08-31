/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.LogsLookupProcessorType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Use the Lookup Processor to define a mapping between a log attribute and a human readable value saved in the processors mapping table. For example, you can use the Lookup Processor to map an internal service ID into a human readable service name. Alternatively, you could also use it to check if the MAC address that just attempted to connect to the production environment belongs to your list of stolen machines.
 */
@ApiModel(description = "Use the Lookup Processor to define a mapping between a log attribute and a human readable value saved in the processors mapping table. For example, you can use the Lookup Processor to map an internal service ID into a human readable service name. Alternatively, you could also use it to check if the MAC address that just attempted to connect to the production environment belongs to your list of stolen machines.")
@JsonPropertyOrder({
  LogsLookupProcessor.JSON_PROPERTY_DEFAULT_LOOKUP,
  LogsLookupProcessor.JSON_PROPERTY_IS_ENABLED,
  LogsLookupProcessor.JSON_PROPERTY_LOOKUP_TABLE,
  LogsLookupProcessor.JSON_PROPERTY_NAME,
  LogsLookupProcessor.JSON_PROPERTY_SOURCE,
  LogsLookupProcessor.JSON_PROPERTY_TARGET,
  LogsLookupProcessor.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsLookupProcessor {
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


  public LogsLookupProcessor defaultLookup(String defaultLookup) {
    this.defaultLookup = defaultLookup;
    return this;
  }

   /**
   * Value to set the target attribute if the source value is not found in the list.
   * @return defaultLookup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value to set the target attribute if the source value is not found in the list.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_LOOKUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
   * Whether or not the processor is enabled.
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the processor is enabled.")
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
   * Mapping table of values for the source attribute and their associated target attribute values, formatted as &#x60;[\&quot;source_key1,target_value1\&quot;, \&quot;source_key2,target_value2\&quot;]&#x60;
   * @return lookupTable
  **/
  @ApiModelProperty(example = "[]", required = true, value = "Mapping table of values for the source attribute and their associated target attribute values, formatted as `[\"source_key1,target_value1\", \"source_key2,target_value2\"]`")
  @JsonProperty(JSON_PROPERTY_LOOKUP_TABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

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
   * Name of the processor.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the processor.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
   * Source attribute used to perform the lookup.
   * @return source
  **/
  @ApiModelProperty(required = true, value = "Source attribute used to perform the lookup.")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

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
   * Name of the attribute that contains the corresponding value in the mapping list or the &#x60;default_lookup&#x60; if not found in the mapping list.
   * @return target
  **/
  @ApiModelProperty(required = true, value = "Name of the attribute that contains the corresponding value in the mapping list or the `default_lookup` if not found in the mapping list.")
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public LogsLookupProcessor type(LogsLookupProcessorType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LogsLookupProcessorType getType() {
    return type;
  }


  public void setType(LogsLookupProcessorType type) {
    this.type = type;
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
    return Objects.equals(this.defaultLookup, logsLookupProcessor.defaultLookup) &&
        Objects.equals(this.isEnabled, logsLookupProcessor.isEnabled) &&
        Objects.equals(this.lookupTable, logsLookupProcessor.lookupTable) &&
        Objects.equals(this.name, logsLookupProcessor.name) &&
        Objects.equals(this.source, logsLookupProcessor.source) &&
        Objects.equals(this.target, logsLookupProcessor.target) &&
        Objects.equals(this.type, logsLookupProcessor.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultLookup, isEnabled, lookupTable, name, source, target, type);
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
    sb.append("}");
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


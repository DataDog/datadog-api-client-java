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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <strong>Note</strong>: Reference Tables are in public beta. Use the Lookup Processor to define a
 * mapping between a log attribute and a human readable value saved in a Reference Table. For
 * example, you can use the Lookup Processor to map an internal service ID into a human readable
 * service name. Alternatively, you could also use it to check if the MAC address that just
 * attempted to connect to the production environment belongs to your list of stolen machines.
 */
@JsonPropertyOrder({
  ReferenceTableLogsLookupProcessor.JSON_PROPERTY_IS_ENABLED,
  ReferenceTableLogsLookupProcessor.JSON_PROPERTY_LOOKUP_ENRICHMENT_TABLE,
  ReferenceTableLogsLookupProcessor.JSON_PROPERTY_NAME,
  ReferenceTableLogsLookupProcessor.JSON_PROPERTY_SOURCE,
  ReferenceTableLogsLookupProcessor.JSON_PROPERTY_TARGET,
  ReferenceTableLogsLookupProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ReferenceTableLogsLookupProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_LOOKUP_ENRICHMENT_TABLE = "lookup_enrichment_table";
  private String lookupEnrichmentTable;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsLookupProcessorType type = LogsLookupProcessorType.LOOKUP_PROCESSOR;

  public ReferenceTableLogsLookupProcessor() {}

  @JsonCreator
  public ReferenceTableLogsLookupProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_LOOKUP_ENRICHMENT_TABLE)
          String lookupEnrichmentTable,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) String source,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET) String target,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LogsLookupProcessorType type) {
    this.lookupEnrichmentTable = lookupEnrichmentTable;
    this.source = source;
    this.target = target;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ReferenceTableLogsLookupProcessor isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether or not the processor is enabled.
   *
   * @return isEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public ReferenceTableLogsLookupProcessor lookupEnrichmentTable(String lookupEnrichmentTable) {
    this.lookupEnrichmentTable = lookupEnrichmentTable;
    return this;
  }

  /**
   * Name of the Reference Table for the source attribute and their associated target attribute
   * values.
   *
   * @return lookupEnrichmentTable
   */
  @JsonProperty(JSON_PROPERTY_LOOKUP_ENRICHMENT_TABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLookupEnrichmentTable() {
    return lookupEnrichmentTable;
  }

  public void setLookupEnrichmentTable(String lookupEnrichmentTable) {
    this.lookupEnrichmentTable = lookupEnrichmentTable;
  }

  public ReferenceTableLogsLookupProcessor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the processor.
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

  public ReferenceTableLogsLookupProcessor source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Source attribute used to perform the lookup.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ReferenceTableLogsLookupProcessor target(String target) {
    this.target = target;
    return this;
  }

  /**
   * Name of the attribute that contains the corresponding value in the mapping list.
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

  public ReferenceTableLogsLookupProcessor type(LogsLookupProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of logs lookup processor.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return ReferenceTableLogsLookupProcessor
   */
  @JsonAnySetter
  public ReferenceTableLogsLookupProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ReferenceTableLogsLookupProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferenceTableLogsLookupProcessor referenceTableLogsLookupProcessor =
        (ReferenceTableLogsLookupProcessor) o;
    return Objects.equals(this.isEnabled, referenceTableLogsLookupProcessor.isEnabled)
        && Objects.equals(
            this.lookupEnrichmentTable, referenceTableLogsLookupProcessor.lookupEnrichmentTable)
        && Objects.equals(this.name, referenceTableLogsLookupProcessor.name)
        && Objects.equals(this.source, referenceTableLogsLookupProcessor.source)
        && Objects.equals(this.target, referenceTableLogsLookupProcessor.target)
        && Objects.equals(this.type, referenceTableLogsLookupProcessor.type)
        && Objects.equals(
            this.additionalProperties, referenceTableLogsLookupProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        isEnabled, lookupEnrichmentTable, name, source, target, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceTableLogsLookupProcessor {\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    lookupEnrichmentTable: ")
        .append(toIndentedString(lookupEnrichmentTable))
        .append("\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

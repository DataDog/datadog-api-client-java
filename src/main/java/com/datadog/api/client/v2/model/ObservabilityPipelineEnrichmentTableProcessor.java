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
 * The <code>enrichment_table</code> processor enriches logs using a static CSV file or GeoIP
 * database.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineEnrichmentTableProcessor.JSON_PROPERTY_DISPLAY_NAME,
  ObservabilityPipelineEnrichmentTableProcessor.JSON_PROPERTY_ENABLED,
  ObservabilityPipelineEnrichmentTableProcessor.JSON_PROPERTY_FILE,
  ObservabilityPipelineEnrichmentTableProcessor.JSON_PROPERTY_GEOIP,
  ObservabilityPipelineEnrichmentTableProcessor.JSON_PROPERTY_ID,
  ObservabilityPipelineEnrichmentTableProcessor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineEnrichmentTableProcessor.JSON_PROPERTY_TARGET,
  ObservabilityPipelineEnrichmentTableProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineEnrichmentTableProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_FILE = "file";
  private ObservabilityPipelineEnrichmentTableFile file;

  public static final String JSON_PROPERTY_GEOIP = "geoip";
  private ObservabilityPipelineEnrichmentTableGeoIp geoip;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineEnrichmentTableProcessorType type =
      ObservabilityPipelineEnrichmentTableProcessorType.ENRICHMENT_TABLE;

  public ObservabilityPipelineEnrichmentTableProcessor() {}

  @JsonCreator
  public ObservabilityPipelineEnrichmentTableProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) String include,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET) String target,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineEnrichmentTableProcessorType type) {
    this.enabled = enabled;
    this.id = id;
    this.include = include;
    this.target = target;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineEnrichmentTableProcessor displayName(String displayName) {
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

  public ObservabilityPipelineEnrichmentTableProcessor enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether this processor is enabled.
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

  public ObservabilityPipelineEnrichmentTableProcessor file(
      ObservabilityPipelineEnrichmentTableFile file) {
    this.file = file;
    this.unparsed |= file.unparsed;
    return this;
  }

  /**
   * Defines a static enrichment table loaded from a CSV file.
   *
   * @return file
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineEnrichmentTableFile getFile() {
    return file;
  }

  public void setFile(ObservabilityPipelineEnrichmentTableFile file) {
    this.file = file;
  }

  public ObservabilityPipelineEnrichmentTableProcessor geoip(
      ObservabilityPipelineEnrichmentTableGeoIp geoip) {
    this.geoip = geoip;
    this.unparsed |= geoip.unparsed;
    return this;
  }

  /**
   * Uses a GeoIP database to enrich logs based on an IP field.
   *
   * @return geoip
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEOIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineEnrichmentTableGeoIp getGeoip() {
    return geoip;
  }

  public void setGeoip(ObservabilityPipelineEnrichmentTableGeoIp geoip) {
    this.geoip = geoip;
  }

  public ObservabilityPipelineEnrichmentTableProcessor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this processor.
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

  public ObservabilityPipelineEnrichmentTableProcessor include(String include) {
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

  public ObservabilityPipelineEnrichmentTableProcessor target(String target) {
    this.target = target;
    return this;
  }

  /**
   * Path where enrichment results should be stored in the log.
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

  public ObservabilityPipelineEnrichmentTableProcessor type(
      ObservabilityPipelineEnrichmentTableProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The processor type. The value should always be <code>enrichment_table</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineEnrichmentTableProcessorType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineEnrichmentTableProcessorType type) {
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
   * @return ObservabilityPipelineEnrichmentTableProcessor
   */
  @JsonAnySetter
  public ObservabilityPipelineEnrichmentTableProcessor putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this ObservabilityPipelineEnrichmentTableProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineEnrichmentTableProcessor observabilityPipelineEnrichmentTableProcessor =
        (ObservabilityPipelineEnrichmentTableProcessor) o;
    return Objects.equals(
            this.displayName, observabilityPipelineEnrichmentTableProcessor.displayName)
        && Objects.equals(this.enabled, observabilityPipelineEnrichmentTableProcessor.enabled)
        && Objects.equals(this.file, observabilityPipelineEnrichmentTableProcessor.file)
        && Objects.equals(this.geoip, observabilityPipelineEnrichmentTableProcessor.geoip)
        && Objects.equals(this.id, observabilityPipelineEnrichmentTableProcessor.id)
        && Objects.equals(this.include, observabilityPipelineEnrichmentTableProcessor.include)
        && Objects.equals(this.target, observabilityPipelineEnrichmentTableProcessor.target)
        && Objects.equals(this.type, observabilityPipelineEnrichmentTableProcessor.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineEnrichmentTableProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        displayName, enabled, file, geoip, id, include, target, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineEnrichmentTableProcessor {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    geoip: ").append(toIndentedString(geoip)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
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

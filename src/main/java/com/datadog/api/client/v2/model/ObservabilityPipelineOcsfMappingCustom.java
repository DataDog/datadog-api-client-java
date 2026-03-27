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
   * <p>Custom OCSF mapping configuration for transforming logs.</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineOcsfMappingCustom.JSON_PROPERTY_MAPPING,
  ObservabilityPipelineOcsfMappingCustom.JSON_PROPERTY_METADATA,
  ObservabilityPipelineOcsfMappingCustom.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineOcsfMappingCustom {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_MAPPING = "mapping";
  private List<ObservabilityPipelineOcsfMappingCustomFieldMapping> mapping = new ArrayList<>();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private ObservabilityPipelineOcsfMappingCustomMetadata metadata;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public ObservabilityPipelineOcsfMappingCustom() {}

  @JsonCreator
  public ObservabilityPipelineOcsfMappingCustom(
            @JsonProperty(required=true, value=JSON_PROPERTY_MAPPING)List<ObservabilityPipelineOcsfMappingCustomFieldMapping> mapping,
            @JsonProperty(required=true, value=JSON_PROPERTY_METADATA)ObservabilityPipelineOcsfMappingCustomMetadata metadata,
            @JsonProperty(required=true, value=JSON_PROPERTY_VERSION)Long version) {
        this.mapping = mapping;
        this.metadata = metadata;
        this.unparsed |= metadata.unparsed;
        this.version = version;
  }
  public ObservabilityPipelineOcsfMappingCustom mapping(List<ObservabilityPipelineOcsfMappingCustomFieldMapping> mapping) {
    this.mapping = mapping;
    for (ObservabilityPipelineOcsfMappingCustomFieldMapping item : mapping) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ObservabilityPipelineOcsfMappingCustom addMappingItem(ObservabilityPipelineOcsfMappingCustomFieldMapping mappingItem) {
    this.mapping.add(mappingItem);
    this.unparsed |= mappingItem.unparsed;
    return this;
  }

  /**
   * <p>A list of field mapping rules for transforming log fields to OCSF schema fields.</p>
   * @return mapping
  **/
      @JsonProperty(JSON_PROPERTY_MAPPING)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<ObservabilityPipelineOcsfMappingCustomFieldMapping> getMapping() {
        return mapping;
      }
  public void setMapping(List<ObservabilityPipelineOcsfMappingCustomFieldMapping> mapping) {
    this.mapping = mapping;
  }
  public ObservabilityPipelineOcsfMappingCustom metadata(ObservabilityPipelineOcsfMappingCustomMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * <p>Metadata for the custom OCSF mapping.</p>
   * @return metadata
  **/
      @JsonProperty(JSON_PROPERTY_METADATA)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineOcsfMappingCustomMetadata getMetadata() {
        return metadata;
      }
  public void setMetadata(ObservabilityPipelineOcsfMappingCustomMetadata metadata) {
    this.metadata = metadata;
  }
  public ObservabilityPipelineOcsfMappingCustom version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * <p>The version of the custom mapping configuration.</p>
   * @return version
  **/
      @JsonProperty(JSON_PROPERTY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getVersion() {
        return version;
      }
  public void setVersion(Long version) {
    this.version = version;
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
   * @return ObservabilityPipelineOcsfMappingCustom
   */
  @JsonAnySetter
  public ObservabilityPipelineOcsfMappingCustom putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineOcsfMappingCustom object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineOcsfMappingCustom observabilityPipelineOcsfMappingCustom = (ObservabilityPipelineOcsfMappingCustom) o;
    return Objects.equals(this.mapping, observabilityPipelineOcsfMappingCustom.mapping) && Objects.equals(this.metadata, observabilityPipelineOcsfMappingCustom.metadata) && Objects.equals(this.version, observabilityPipelineOcsfMappingCustom.version) && Objects.equals(this.additionalProperties, observabilityPipelineOcsfMappingCustom.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(mapping,metadata,version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineOcsfMappingCustom {\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

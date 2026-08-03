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
   * <p>Options for selecting a predefined library pattern and enabling keyword support.</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineSensitiveDataScannerProcessorLibraryPatternOptions.JSON_PROPERTY_DESCRIPTION,
  ObservabilityPipelineSensitiveDataScannerProcessorLibraryPatternOptions.JSON_PROPERTY_ID,
  ObservabilityPipelineSensitiveDataScannerProcessorLibraryPatternOptions.JSON_PROPERTY_USE_RECOMMENDED_KEYWORDS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSensitiveDataScannerProcessorLibraryPatternOptions {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_USE_RECOMMENDED_KEYWORDS = "use_recommended_keywords";
  private Boolean useRecommendedKeywords;

  public ObservabilityPipelineSensitiveDataScannerProcessorLibraryPatternOptions() {}

  @JsonCreator
  public ObservabilityPipelineSensitiveDataScannerProcessorLibraryPatternOptions(
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id) {
        this.id = id;
  }
  public ObservabilityPipelineSensitiveDataScannerProcessorLibraryPatternOptions description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Human-readable description providing context about a sensitive data scanner rule</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public ObservabilityPipelineSensitiveDataScannerProcessorLibraryPatternOptions id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Identifier for a predefined pattern from the sensitive data scanner pattern library.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public ObservabilityPipelineSensitiveDataScannerProcessorLibraryPatternOptions useRecommendedKeywords(Boolean useRecommendedKeywords) {
    this.useRecommendedKeywords = useRecommendedKeywords;
    return this;
  }

  /**
   * <p>Whether to augment the pattern with recommended keywords (optional).</p>
   * @return useRecommendedKeywords
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_USE_RECOMMENDED_KEYWORDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getUseRecommendedKeywords() {
        return useRecommendedKeywords;
      }
  public void setUseRecommendedKeywords(Boolean useRecommendedKeywords) {
    this.useRecommendedKeywords = useRecommendedKeywords;
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
   * @return ObservabilityPipelineSensitiveDataScannerProcessorLibraryPatternOptions
   */
  @JsonAnySetter
  public ObservabilityPipelineSensitiveDataScannerProcessorLibraryPatternOptions putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineSensitiveDataScannerProcessorLibraryPatternOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineSensitiveDataScannerProcessorLibraryPatternOptions observabilityPipelineSensitiveDataScannerProcessorLibraryPatternOptions = (ObservabilityPipelineSensitiveDataScannerProcessorLibraryPatternOptions) o;
    return Objects.equals(this.description, observabilityPipelineSensitiveDataScannerProcessorLibraryPatternOptions.description) && Objects.equals(this.id, observabilityPipelineSensitiveDataScannerProcessorLibraryPatternOptions.id) && Objects.equals(this.useRecommendedKeywords, observabilityPipelineSensitiveDataScannerProcessorLibraryPatternOptions.useRecommendedKeywords) && Objects.equals(this.additionalProperties, observabilityPipelineSensitiveDataScannerProcessorLibraryPatternOptions.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(description,id,useRecommendedKeywords, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineSensitiveDataScannerProcessorLibraryPatternOptions {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    useRecommendedKeywords: ").append(toIndentedString(useRecommendedKeywords)).append("\n");
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

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
   * <p>Object defining a set of keywords and a number of characters that help reduce noise.
   * You can provide a list of keywords you would like to check within a defined proximity of the matching pattern.
   * If any of the keywords are found within the proximity check, the match is kept.
   * If none are found, the match is discarded.</p>
 */
@JsonPropertyOrder({
  SensitiveDataScannerIncludedKeywordConfiguration.JSON_PROPERTY_CHARACTER_COUNT,
  SensitiveDataScannerIncludedKeywordConfiguration.JSON_PROPERTY_KEYWORDS,
  SensitiveDataScannerIncludedKeywordConfiguration.JSON_PROPERTY_USE_RECOMMENDED_KEYWORDS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerIncludedKeywordConfiguration {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHARACTER_COUNT = "character_count";
  private Long characterCount;

  public static final String JSON_PROPERTY_KEYWORDS = "keywords";
  private List<String> keywords = new ArrayList<>();

  public static final String JSON_PROPERTY_USE_RECOMMENDED_KEYWORDS = "use_recommended_keywords";
  private Boolean useRecommendedKeywords;

  public SensitiveDataScannerIncludedKeywordConfiguration() {}

  @JsonCreator
  public SensitiveDataScannerIncludedKeywordConfiguration(
            @JsonProperty(required=true, value=JSON_PROPERTY_CHARACTER_COUNT)Long characterCount,
            @JsonProperty(required=true, value=JSON_PROPERTY_KEYWORDS)List<String> keywords) {
        this.characterCount = characterCount;
        this.keywords = keywords;
  }
  public SensitiveDataScannerIncludedKeywordConfiguration characterCount(Long characterCount) {
    this.characterCount = characterCount;
    return this;
  }

  /**
   * <p>The number of characters behind a match detected by Sensitive Data Scanner to look for the keywords defined.
   * <code>character_count</code> should be greater than the maximum length of a keyword defined for a rule.</p>
   * minimum: 1
   * maximum: 50
   * @return characterCount
  **/
      @JsonProperty(JSON_PROPERTY_CHARACTER_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getCharacterCount() {
        return characterCount;
      }
  public void setCharacterCount(Long characterCount) {
    this.characterCount = characterCount;
  }
  public SensitiveDataScannerIncludedKeywordConfiguration keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }
  public SensitiveDataScannerIncludedKeywordConfiguration addKeywordsItem(String keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

  /**
   * <p>Keyword list that will be checked during scanning in order to validate a match.
   * The number of keywords in the list must be less than or equal to 30.</p>
   * @return keywords
  **/
      @JsonProperty(JSON_PROPERTY_KEYWORDS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getKeywords() {
        return keywords;
      }
  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }
  public SensitiveDataScannerIncludedKeywordConfiguration useRecommendedKeywords(Boolean useRecommendedKeywords) {
    this.useRecommendedKeywords = useRecommendedKeywords;
    return this;
  }

  /**
   * <p>Should the rule use the underlying standard pattern keyword configuration. If set to <code>true</code>, the rule must be tied
   * to a standard pattern. If set to <code>false</code>, the specified keywords and <code>character_count</code> are applied.</p>
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
   * @return SensitiveDataScannerIncludedKeywordConfiguration
   */
  @JsonAnySetter
  public SensitiveDataScannerIncludedKeywordConfiguration putAdditionalProperty(String key, Object value) {
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
   * Return true if this SensitiveDataScannerIncludedKeywordConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerIncludedKeywordConfiguration sensitiveDataScannerIncludedKeywordConfiguration = (SensitiveDataScannerIncludedKeywordConfiguration) o;
    return Objects.equals(this.characterCount, sensitiveDataScannerIncludedKeywordConfiguration.characterCount) && Objects.equals(this.keywords, sensitiveDataScannerIncludedKeywordConfiguration.keywords) && Objects.equals(this.useRecommendedKeywords, sensitiveDataScannerIncludedKeywordConfiguration.useRecommendedKeywords) && Objects.equals(this.additionalProperties, sensitiveDataScannerIncludedKeywordConfiguration.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(characterCount,keywords,useRecommendedKeywords, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerIncludedKeywordConfiguration {\n");
    sb.append("    characterCount: ").append(toIndentedString(characterCount)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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

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
   * <p>Attributes of the Sensitive Data Scanner standard pattern.</p>
 */
@JsonPropertyOrder({
  SensitiveDataScannerStandardPatternAttributes.JSON_PROPERTY_NAME,
  SensitiveDataScannerStandardPatternAttributes.JSON_PROPERTY_PATTERN,
  SensitiveDataScannerStandardPatternAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerStandardPatternAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PATTERN = "pattern";
  private String pattern;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public SensitiveDataScannerStandardPatternAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the standard pattern.</p>
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
  public SensitiveDataScannerStandardPatternAttributes pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * <p>Regex to match.</p>
   * @return pattern
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PATTERN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPattern() {
        return pattern;
      }
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }
  public SensitiveDataScannerStandardPatternAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public SensitiveDataScannerStandardPatternAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>List of tags.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * Return true if this SensitiveDataScannerStandardPatternAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerStandardPatternAttributes sensitiveDataScannerStandardPatternAttributes = (SensitiveDataScannerStandardPatternAttributes) o;
    return Objects.equals(this.name, sensitiveDataScannerStandardPatternAttributes.name) && Objects.equals(this.pattern, sensitiveDataScannerStandardPatternAttributes.pattern) && Objects.equals(this.tags, sensitiveDataScannerStandardPatternAttributes.tags);
  }


  @Override
  public int hashCode() {
    return Objects.hash(name,pattern,tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerStandardPatternAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

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
   * <p>Object containing the definition of a metric's indexed and ingested tags.</p>
 */
@JsonPropertyOrder({
  MetricAllTagsAttributes.JSON_PROPERTY_INGESTED_TAGS,
  MetricAllTagsAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricAllTagsAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_INGESTED_TAGS = "ingested_tags";
  private List<String> ingestedTags = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public MetricAllTagsAttributes ingestedTags(List<String> ingestedTags) {
    this.ingestedTags = ingestedTags;
    return this;
  }
  public MetricAllTagsAttributes addIngestedTagsItem(String ingestedTagsItem) {
    if (this.ingestedTags == null) {
      this.ingestedTags = new ArrayList<>();
    }
    this.ingestedTags.add(ingestedTagsItem);
    return this;
  }

  /**
   * <p>List of ingested tags that are not indexed.</p>
   * @return ingestedTags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INGESTED_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getIngestedTags() {
        return ingestedTags;
      }
  public void setIngestedTags(List<String> ingestedTags) {
    this.ingestedTags = ingestedTags;
  }
  public MetricAllTagsAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public MetricAllTagsAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>List of indexed tags.</p>
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
   * @return MetricAllTagsAttributes
   */
  @JsonAnySetter
  public MetricAllTagsAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this MetricAllTagsAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricAllTagsAttributes metricAllTagsAttributes = (MetricAllTagsAttributes) o;
    return Objects.equals(this.ingestedTags, metricAllTagsAttributes.ingestedTags) && Objects.equals(this.tags, metricAllTagsAttributes.tags) && Objects.equals(this.additionalProperties, metricAllTagsAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(ingestedTags,tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricAllTagsAttributes {\n");
    sb.append("    ingestedTags: ").append(toIndentedString(ingestedTags)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

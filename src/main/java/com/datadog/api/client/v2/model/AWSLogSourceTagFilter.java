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
   * <p>AWS log source tag filter list. Defaults to <code>[]</code>.
   * Array of log source to AWS resource tag mappings. Each mapping contains a log source and its
   * associated AWS resource tags (in <code>key:value</code> format) used to filter logs submitted to Datadog.
   * Tag filters are applied for tags on the AWS resource emitting logs; tags associated with the
   * log storage entity (such as a CloudWatch Log Group or S3 Bucket) are not considered.
   * For more information on resource tag filter syntax,
   * <a href="https://docs.datadoghq.com/account_management/billing/aws/#aws-resource-exclusion">see AWS resource exclusion</a>
   * in the AWS integration billing page.</p>
 */
@JsonPropertyOrder({
  AWSLogSourceTagFilter.JSON_PROPERTY_SOURCE,
  AWSLogSourceTagFilter.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSLogSourceTagFilter {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public AWSLogSourceTagFilter source(String source) {
    this.source = source;
    return this;
  }

  /**
   * <p>The AWS log source to which the tag filters defined in <code>tags</code> are applied.</p>
   * @return source
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSource() {
        return source;
      }
  public void setSource(String source) {
    this.source = source;
  }
  public AWSLogSourceTagFilter tags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    return this;
  }
  public AWSLogSourceTagFilter addTagsItem(String tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.tags.get().add(tagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * <p>The AWS resource tags to filter on for the log source specified by <code>source</code>.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<String> getTags() {
        return tags.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getTags_JsonNullable() {
    return tags;
  }
  @JsonProperty(JSON_PROPERTY_TAGS)public void setTags_JsonNullable(JsonNullable<List<String>> tags) {
    this.tags = tags;
  }
  public void setTags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
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
   * @return AWSLogSourceTagFilter
   */
  @JsonAnySetter
  public AWSLogSourceTagFilter putAdditionalProperty(String key, Object value) {
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
   * Return true if this AWSLogSourceTagFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSLogSourceTagFilter awsLogSourceTagFilter = (AWSLogSourceTagFilter) o;
    return Objects.equals(this.source, awsLogSourceTagFilter.source) && Objects.equals(this.tags, awsLogSourceTagFilter.tags) && Objects.equals(this.additionalProperties, awsLogSourceTagFilter.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(source,tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSLogSourceTagFilter {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

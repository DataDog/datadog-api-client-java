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
   * <p>Model representation of a Confluent Cloud resource.</p>
 */
@JsonPropertyOrder({
  ConfluentResourceResponseAttributes.JSON_PROPERTY_RESOURCE_TYPE,
  ConfluentResourceResponseAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ConfluentResourceResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private String resourceType;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public ConfluentResourceResponseAttributes() {}

  @JsonCreator
  public ConfluentResourceResponseAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_RESOURCE_TYPE)String resourceType) {
        this.resourceType = resourceType;
  }
  public ConfluentResourceResponseAttributes resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * <p>The resource type of the Resource. Can be <code>kafka</code>, <code>connector</code>, <code>ksql</code>, or <code>schema_registry</code>.</p>
   * @return resourceType
  **/
      @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getResourceType() {
        return resourceType;
      }
  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }
  public ConfluentResourceResponseAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public ConfluentResourceResponseAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>A list of strings representing tags. Can be a single key, or key-value pairs separated by a colon.</p>
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
   * Return true if this ConfluentResourceResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfluentResourceResponseAttributes confluentResourceResponseAttributes = (ConfluentResourceResponseAttributes) o;
    return Objects.equals(this.resourceType, confluentResourceResponseAttributes.resourceType) && Objects.equals(this.tags, confluentResourceResponseAttributes.tags);
  }


  @Override
  public int hashCode() {
    return Objects.hash(resourceType,tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfluentResourceResponseAttributes {\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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

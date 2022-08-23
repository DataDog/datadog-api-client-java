/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>A tag filter.</p>
 */
@JsonPropertyOrder({
  AWSTagFilter.JSON_PROPERTY_NAMESPACE,
  AWSTagFilter.JSON_PROPERTY_TAG_FILTER_STR
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSTagFilter {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAMESPACE = "namespace";
  private AWSNamespace namespace;

  public static final String JSON_PROPERTY_TAG_FILTER_STR = "tag_filter_str";
  private String tagFilterStr;

  public AWSTagFilter namespace(AWSNamespace namespace) {
    this.namespace = namespace;
    this.unparsed |= !namespace.isValid();
    return this;
  }

  /**
   * <p>The namespace associated with the tag filter entry.</p>
   * @return namespace
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAMESPACE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AWSNamespace getNamespace() {
        return namespace;
      }
  public void setNamespace(AWSNamespace namespace) {
    if (!namespace.isValid()) {
        this.unparsed = true;
    }
    this.namespace = namespace;
  }
  public AWSTagFilter tagFilterStr(String tagFilterStr) {
    this.tagFilterStr = tagFilterStr;
    return this;
  }

  /**
   * <p>The tag filter string.</p>
   * @return tagFilterStr
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAG_FILTER_STR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTagFilterStr() {
        return tagFilterStr;
      }
  public void setTagFilterStr(String tagFilterStr) {
    this.tagFilterStr = tagFilterStr;
  }

  /**
   * Return true if this AWSTagFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSTagFilter awsTagFilter = (AWSTagFilter) o;
    return Objects.equals(this.namespace, awsTagFilter.namespace) && Objects.equals(this.tagFilterStr, awsTagFilter.tagFilterStr);
  }


  @Override
  public int hashCode() {
    return Objects.hash(namespace,tagFilterStr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSTagFilter {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    tagFilterStr: ").append(toIndentedString(tagFilterStr)).append("\n");
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

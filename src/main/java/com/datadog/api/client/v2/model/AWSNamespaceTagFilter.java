/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * AWS Metrics Collection tag filters list. Defaults to <code>[]</code>. The array of custom AWS
 * resource tags (in the form <code>key:value</code>) defines a filter that Datadog uses when
 * collecting metrics from a specified service. Wildcards, such as <code>?</code> (match a single
 * character) and <code>*</code> (match multiple characters), and exclusion using <code>!</code>
 * before the tag are supported. For EC2, only hosts that match one of the defined tags are imported
 * into Datadog. The rest are ignored. For example, <code>
 * env:production,instance-type:c?.*,!region:us-east-1</code>.
 */
@JsonPropertyOrder({
  AWSNamespaceTagFilter.JSON_PROPERTY_NAMESPACE,
  AWSNamespaceTagFilter.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSNamespaceTagFilter {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAMESPACE = "namespace";
  private String namespace;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public AWSNamespaceTagFilter namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * The AWS service for which the tag filters defined in <code>tags</code> will be applied.
   *
   * @return namespace
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public AWSNamespaceTagFilter tags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    return this;
  }

  public AWSNamespaceTagFilter addTagsItem(String tagsItem) {
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
   * The AWS resource tags to filter on for the service specified by <code>namespace</code>.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getTags() {
    return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getTags_JsonNullable() {
    return tags;
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<List<String>> tags) {
    this.tags = tags;
  }

  public void setTags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
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
   * @return AWSNamespaceTagFilter
   */
  @JsonAnySetter
  public AWSNamespaceTagFilter putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AWSNamespaceTagFilter object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSNamespaceTagFilter awsNamespaceTagFilter = (AWSNamespaceTagFilter) o;
    return Objects.equals(this.namespace, awsNamespaceTagFilter.namespace)
        && Objects.equals(this.tags, awsNamespaceTagFilter.tags)
        && Objects.equals(this.additionalProperties, awsNamespaceTagFilter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSNamespaceTagFilter {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

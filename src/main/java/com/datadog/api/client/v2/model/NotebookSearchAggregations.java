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

/** Aggregations of notebook search results. */
@JsonPropertyOrder({
  NotebookSearchAggregations.JSON_PROPERTY_AUTHOR,
  NotebookSearchAggregations.JSON_PROPERTY_TAGS,
  NotebookSearchAggregations.JSON_PROPERTY_TEMPLATE_VARIABLES_NAME,
  NotebookSearchAggregations.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookSearchAggregations {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private List<NotebookSearchAggregationBucketMultiKey> author = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<NotebookSearchAggregationBucketKey> tags = null;

  public static final String JSON_PROPERTY_TEMPLATE_VARIABLES_NAME = "template_variables.name";
  private List<NotebookSearchAggregationBucketKey> templateVariablesName = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private List<NotebookSearchAggregationBucketKey> type = null;

  public NotebookSearchAggregations author(List<NotebookSearchAggregationBucketMultiKey> author) {
    this.author = author;
    for (NotebookSearchAggregationBucketMultiKey item : author) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public NotebookSearchAggregations addAuthorItem(
      NotebookSearchAggregationBucketMultiKey authorItem) {
    if (this.author == null) {
      this.author = new ArrayList<>();
    }
    this.author.add(authorItem);
    this.unparsed |= authorItem.unparsed;
    return this;
  }

  /**
   * Aggregation by author.
   *
   * @return author
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<NotebookSearchAggregationBucketMultiKey> getAuthor() {
    return author;
  }

  public void setAuthor(List<NotebookSearchAggregationBucketMultiKey> author) {
    this.author = author;
  }

  public NotebookSearchAggregations tags(List<NotebookSearchAggregationBucketKey> tags) {
    this.tags = tags;
    for (NotebookSearchAggregationBucketKey item : tags) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public NotebookSearchAggregations addTagsItem(NotebookSearchAggregationBucketKey tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    this.unparsed |= tagsItem.unparsed;
    return this;
  }

  /**
   * Aggregation by tags.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<NotebookSearchAggregationBucketKey> getTags() {
    return tags;
  }

  public void setTags(List<NotebookSearchAggregationBucketKey> tags) {
    this.tags = tags;
  }

  public NotebookSearchAggregations templateVariablesName(
      List<NotebookSearchAggregationBucketKey> templateVariablesName) {
    this.templateVariablesName = templateVariablesName;
    for (NotebookSearchAggregationBucketKey item : templateVariablesName) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public NotebookSearchAggregations addTemplateVariablesNameItem(
      NotebookSearchAggregationBucketKey templateVariablesNameItem) {
    if (this.templateVariablesName == null) {
      this.templateVariablesName = new ArrayList<>();
    }
    this.templateVariablesName.add(templateVariablesNameItem);
    this.unparsed |= templateVariablesNameItem.unparsed;
    return this;
  }

  /**
   * Aggregation by template variable names.
   *
   * @return templateVariablesName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLES_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<NotebookSearchAggregationBucketKey> getTemplateVariablesName() {
    return templateVariablesName;
  }

  public void setTemplateVariablesName(
      List<NotebookSearchAggregationBucketKey> templateVariablesName) {
    this.templateVariablesName = templateVariablesName;
  }

  public NotebookSearchAggregations type(List<NotebookSearchAggregationBucketKey> type) {
    this.type = type;
    for (NotebookSearchAggregationBucketKey item : type) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public NotebookSearchAggregations addTypeItem(NotebookSearchAggregationBucketKey typeItem) {
    if (this.type == null) {
      this.type = new ArrayList<>();
    }
    this.type.add(typeItem);
    this.unparsed |= typeItem.unparsed;
    return this;
  }

  /**
   * Aggregation by notebook type.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<NotebookSearchAggregationBucketKey> getType() {
    return type;
  }

  public void setType(List<NotebookSearchAggregationBucketKey> type) {
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
   * @return NotebookSearchAggregations
   */
  @JsonAnySetter
  public NotebookSearchAggregations putAdditionalProperty(String key, Object value) {
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

  /** Return true if this NotebookSearchAggregations object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookSearchAggregations notebookSearchAggregations = (NotebookSearchAggregations) o;
    return Objects.equals(this.author, notebookSearchAggregations.author)
        && Objects.equals(this.tags, notebookSearchAggregations.tags)
        && Objects.equals(
            this.templateVariablesName, notebookSearchAggregations.templateVariablesName)
        && Objects.equals(this.type, notebookSearchAggregations.type)
        && Objects.equals(
            this.additionalProperties, notebookSearchAggregations.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, tags, templateVariablesName, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookSearchAggregations {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    templateVariablesName: ")
        .append(toIndentedString(templateVariablesName))
        .append("\n");
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

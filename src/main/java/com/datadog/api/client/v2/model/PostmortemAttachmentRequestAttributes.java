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
   * <p>Postmortem attachment attributes</p>
 */
@JsonPropertyOrder({
  PostmortemAttachmentRequestAttributes.JSON_PROPERTY_CELLS,
  PostmortemAttachmentRequestAttributes.JSON_PROPERTY_CONTENT,
  PostmortemAttachmentRequestAttributes.JSON_PROPERTY_POSTMORTEM_TEMPLATE_ID,
  PostmortemAttachmentRequestAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PostmortemAttachmentRequestAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CELLS = "cells";
  private List<PostmortemCell> cells = null;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_POSTMORTEM_TEMPLATE_ID = "postmortem_template_id";
  private String postmortemTemplateId;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public PostmortemAttachmentRequestAttributes cells(List<PostmortemCell> cells) {
    this.cells = cells;
    for (PostmortemCell item : cells) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public PostmortemAttachmentRequestAttributes addCellsItem(PostmortemCell cellsItem) {
    if (this.cells == null) {
      this.cells = new ArrayList<>();
    }
    this.cells.add(cellsItem);
    this.unparsed |= cellsItem.unparsed;
    return this;
  }

  /**
   * <p>The cells of the postmortem</p>
   * @return cells
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CELLS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<PostmortemCell> getCells() {
        return cells;
      }
  public void setCells(List<PostmortemCell> cells) {
    this.cells = cells;
  }
  public PostmortemAttachmentRequestAttributes content(String content) {
    this.content = content;
    return this;
  }

  /**
   * <p>The content of the postmortem</p>
   * @return content
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONTENT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getContent() {
        return content;
      }
  public void setContent(String content) {
    this.content = content;
  }
  public PostmortemAttachmentRequestAttributes postmortemTemplateId(String postmortemTemplateId) {
    this.postmortemTemplateId = postmortemTemplateId;
    return this;
  }

  /**
   * <p>The ID of the postmortem template</p>
   * @return postmortemTemplateId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_POSTMORTEM_TEMPLATE_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPostmortemTemplateId() {
        return postmortemTemplateId;
      }
  public void setPostmortemTemplateId(String postmortemTemplateId) {
    this.postmortemTemplateId = postmortemTemplateId;
  }
  public PostmortemAttachmentRequestAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>The title of the postmortem</p>
   * @return title
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTitle() {
        return title;
      }
  public void setTitle(String title) {
    this.title = title;
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
   * @return PostmortemAttachmentRequestAttributes
   */
  @JsonAnySetter
  public PostmortemAttachmentRequestAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this PostmortemAttachmentRequestAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostmortemAttachmentRequestAttributes postmortemAttachmentRequestAttributes = (PostmortemAttachmentRequestAttributes) o;
    return Objects.equals(this.cells, postmortemAttachmentRequestAttributes.cells) && Objects.equals(this.content, postmortemAttachmentRequestAttributes.content) && Objects.equals(this.postmortemTemplateId, postmortemAttachmentRequestAttributes.postmortemTemplateId) && Objects.equals(this.title, postmortemAttachmentRequestAttributes.title) && Objects.equals(this.additionalProperties, postmortemAttachmentRequestAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(cells,content,postmortemTemplateId,title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostmortemAttachmentRequestAttributes {\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    postmortemTemplateId: ").append(toIndentedString(postmortemTemplateId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

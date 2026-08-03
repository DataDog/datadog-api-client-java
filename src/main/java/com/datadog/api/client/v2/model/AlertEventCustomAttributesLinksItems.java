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
   * <p>A link.</p>
 */
@JsonPropertyOrder({
  AlertEventCustomAttributesLinksItems.JSON_PROPERTY_CATEGORY,
  AlertEventCustomAttributesLinksItems.JSON_PROPERTY_TITLE,
  AlertEventCustomAttributesLinksItems.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AlertEventCustomAttributesLinksItems {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private AlertEventCustomAttributesLinksItemsCategory category;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public AlertEventCustomAttributesLinksItems() {}

  @JsonCreator
  public AlertEventCustomAttributesLinksItems(
            @JsonProperty(required=true, value=JSON_PROPERTY_CATEGORY)AlertEventCustomAttributesLinksItemsCategory category,
            @JsonProperty(required=true, value=JSON_PROPERTY_URL)String url) {
        this.category = category;
        this.unparsed |= !category.isValid();
        this.url = url;
  }
  public AlertEventCustomAttributesLinksItems category(AlertEventCustomAttributesLinksItemsCategory category) {
    this.category = category;
    this.unparsed |= !category.isValid();
    return this;
  }

  /**
   * <p>The category of the link.</p>
   * @return category
  **/
      @JsonProperty(JSON_PROPERTY_CATEGORY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public AlertEventCustomAttributesLinksItemsCategory getCategory() {
        return category;
      }
  public void setCategory(AlertEventCustomAttributesLinksItemsCategory category) {
    if (!category.isValid()) {
        this.unparsed = true;
    }
    this.category = category;
  }
  public AlertEventCustomAttributesLinksItems title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>The display text of the link. Limited to 300 characters.</p>
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
  public AlertEventCustomAttributesLinksItems url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <p>The URL of the link. Limited to 2048 characters.</p>
   * @return url
  **/
      @JsonProperty(JSON_PROPERTY_URL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getUrl() {
        return url;
      }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Return true if this AlertEventCustomAttributesLinksItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertEventCustomAttributesLinksItems alertEventCustomAttributesLinksItems = (AlertEventCustomAttributesLinksItems) o;
    return Objects.equals(this.category, alertEventCustomAttributesLinksItems.category) && Objects.equals(this.title, alertEventCustomAttributesLinksItems.title) && Objects.equals(this.url, alertEventCustomAttributesLinksItems.url);
  }


  @Override
  public int hashCode() {
    return Objects.hash(category,title,url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertEventCustomAttributesLinksItems {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A link. */
@JsonPropertyOrder({
  AlertEventAttributesLinksItem.JSON_PROPERTY_CATEGORY,
  AlertEventAttributesLinksItem.JSON_PROPERTY_TITLE,
  AlertEventAttributesLinksItem.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AlertEventAttributesLinksItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private AlertEventAttributesLinksItemCategory category;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public AlertEventAttributesLinksItem category(AlertEventAttributesLinksItemCategory category) {
    this.category = category;
    this.unparsed |= !category.isValid();
    return this;
  }

  /**
   * The category of the link.
   *
   * @return category
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AlertEventAttributesLinksItemCategory getCategory() {
    return category;
  }

  public void setCategory(AlertEventAttributesLinksItemCategory category) {
    if (!category.isValid()) {
      this.unparsed = true;
    }
    this.category = category;
  }

  public AlertEventAttributesLinksItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The display text of the link.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AlertEventAttributesLinksItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL of the link.
   *
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
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
   * @return AlertEventAttributesLinksItem
   */
  @JsonAnySetter
  public AlertEventAttributesLinksItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AlertEventAttributesLinksItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertEventAttributesLinksItem alertEventAttributesLinksItem = (AlertEventAttributesLinksItem) o;
    return Objects.equals(this.category, alertEventAttributesLinksItem.category)
        && Objects.equals(this.title, alertEventAttributesLinksItem.title)
        && Objects.equals(this.url, alertEventAttributesLinksItem.url)
        && Objects.equals(
            this.additionalProperties, alertEventAttributesLinksItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, title, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertEventAttributesLinksItem {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

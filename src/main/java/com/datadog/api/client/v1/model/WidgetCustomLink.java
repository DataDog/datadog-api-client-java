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
   * <p>Custom links help you connect a data value to a URL, like a Datadog page or your AWS console.</p>
 */
@JsonPropertyOrder({
  WidgetCustomLink.JSON_PROPERTY_IS_HIDDEN,
  WidgetCustomLink.JSON_PROPERTY_LABEL,
  WidgetCustomLink.JSON_PROPERTY_LINK,
  WidgetCustomLink.JSON_PROPERTY_OVERRIDE_LABEL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetCustomLink {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_HIDDEN = "is_hidden";
  private Boolean isHidden;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_LINK = "link";
  private String link;

  public static final String JSON_PROPERTY_OVERRIDE_LABEL = "override_label";
  private String overrideLabel;

  public WidgetCustomLink isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  /**
   * <p>The flag for toggling context menu link visibility.</p>
   * @return isHidden
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_HIDDEN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsHidden() {
        return isHidden;
      }
  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }
  public WidgetCustomLink label(String label) {
    this.label = label;
    return this;
  }

  /**
   * <p>The label for the custom link URL. Keep the label short and descriptive. Use metrics and tags as variables.</p>
   * @return label
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LABEL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getLabel() {
        return label;
      }
  public void setLabel(String label) {
    this.label = label;
  }
  public WidgetCustomLink link(String link) {
    this.link = link;
    return this;
  }

  /**
   * <p>The URL of the custom link. URL must include <code>http</code> or <code>https</code>. A relative URL must start with <code>/</code>.</p>
   * @return link
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LINK)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getLink() {
        return link;
      }
  public void setLink(String link) {
    this.link = link;
  }
  public WidgetCustomLink overrideLabel(String overrideLabel) {
    this.overrideLabel = overrideLabel;
    return this;
  }

  /**
   * <p>The label ID that refers to a context menu link. Can be <code>logs</code>, <code>hosts</code>, <code>traces</code>, <code>profiles</code>, <code>processes</code>, <code>containers</code>, or <code>rum</code>.</p>
   * @return overrideLabel
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OVERRIDE_LABEL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOverrideLabel() {
        return overrideLabel;
      }
  public void setOverrideLabel(String overrideLabel) {
    this.overrideLabel = overrideLabel;
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
   * @return WidgetCustomLink
   */
  @JsonAnySetter
  public WidgetCustomLink putAdditionalProperty(String key, Object value) {
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
   * Return true if this WidgetCustomLink object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetCustomLink widgetCustomLink = (WidgetCustomLink) o;
    return Objects.equals(this.isHidden, widgetCustomLink.isHidden) && Objects.equals(this.label, widgetCustomLink.label) && Objects.equals(this.link, widgetCustomLink.link) && Objects.equals(this.overrideLabel, widgetCustomLink.overrideLabel) && Objects.equals(this.additionalProperties, widgetCustomLink.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(isHidden,label,link,overrideLabel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetCustomLink {\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    overrideLabel: ").append(toIndentedString(overrideLabel)).append("\n");
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

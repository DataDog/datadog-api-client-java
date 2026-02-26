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
   * <p>The top list visualization enables you to display a list of Tag value like hostname or service with the most or least of any metric value, such as highest consumers of CPU, hosts with the least disk space, etc.</p>
 */
@JsonPropertyOrder({
  ToplistWidgetDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  ToplistWidgetDefinition.JSON_PROPERTY_REQUESTS,
  ToplistWidgetDefinition.JSON_PROPERTY_STYLE,
  ToplistWidgetDefinition.JSON_PROPERTY_TIME,
  ToplistWidgetDefinition.JSON_PROPERTY_TITLE,
  ToplistWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  ToplistWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  ToplistWidgetDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ToplistWidgetDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<ToplistWidgetRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_STYLE = "style";
  private ToplistWidgetStyle style;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ToplistWidgetDefinitionType type = ToplistWidgetDefinitionType.TOPLIST;

  public ToplistWidgetDefinition() {}

  @JsonCreator
  public ToplistWidgetDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_REQUESTS)List<ToplistWidgetRequest> requests,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ToplistWidgetDefinitionType type) {
        this.requests = requests;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ToplistWidgetDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    for (WidgetCustomLink item : customLinks) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ToplistWidgetDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
    if (this.customLinks == null) {
      this.customLinks = new ArrayList<>();
    }
    this.customLinks.add(customLinksItem);
    this.unparsed |= customLinksItem.unparsed;
    return this;
  }

  /**
   * <p>List of custom links.</p>
   * @return customLinks
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOM_LINKS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<WidgetCustomLink> getCustomLinks() {
        return customLinks;
      }
  public void setCustomLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
  }
  public ToplistWidgetDefinition requests(List<ToplistWidgetRequest> requests) {
    this.requests = requests;
    for (ToplistWidgetRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ToplistWidgetDefinition addRequestsItem(ToplistWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * <p>List of top list widget requests.</p>
   * @return requests
  **/
      @JsonProperty(JSON_PROPERTY_REQUESTS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<ToplistWidgetRequest> getRequests() {
        return requests;
      }
  public void setRequests(List<ToplistWidgetRequest> requests) {
    this.requests = requests;
  }
  public ToplistWidgetDefinition style(ToplistWidgetStyle style) {
    this.style = style;
    this.unparsed |= style.unparsed;
    return this;
  }

  /**
   * <p>Style customization for a top list widget.</p>
   * @return style
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STYLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ToplistWidgetStyle getStyle() {
        return style;
      }
  public void setStyle(ToplistWidgetStyle style) {
    this.style = style;
  }
  public ToplistWidgetDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * <p>Time setting for the widget.</p>
   * @return time
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetTime getTime() {
        return time;
      }
  public void setTime(WidgetTime time) {
    this.time = time;
  }
  public ToplistWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>Title of your widget.</p>
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
  public ToplistWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * <p>How to align the text on the widget.</p>
   * @return titleAlign
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetTextAlign getTitleAlign() {
        return titleAlign;
      }
  public void setTitleAlign(WidgetTextAlign titleAlign) {
    if (!titleAlign.isValid()) {
        this.unparsed = true;
    }
    this.titleAlign = titleAlign;
  }
  public ToplistWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * <p>Size of the title.</p>
   * @return titleSize
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTitleSize() {
        return titleSize;
      }
  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }
  public ToplistWidgetDefinition type(ToplistWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the top list widget.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ToplistWidgetDefinitionType getType() {
        return type;
      }
  public void setType(ToplistWidgetDefinitionType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
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
   * @return ToplistWidgetDefinition
   */
  @JsonAnySetter
  public ToplistWidgetDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this ToplistWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToplistWidgetDefinition toplistWidgetDefinition = (ToplistWidgetDefinition) o;
    return Objects.equals(this.customLinks, toplistWidgetDefinition.customLinks) && Objects.equals(this.requests, toplistWidgetDefinition.requests) && Objects.equals(this.style, toplistWidgetDefinition.style) && Objects.equals(this.time, toplistWidgetDefinition.time) && Objects.equals(this.title, toplistWidgetDefinition.title) && Objects.equals(this.titleAlign, toplistWidgetDefinition.titleAlign) && Objects.equals(this.titleSize, toplistWidgetDefinition.titleSize) && Objects.equals(this.type, toplistWidgetDefinition.type) && Objects.equals(this.additionalProperties, toplistWidgetDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(customLinks,requests,style,time,title,titleAlign,titleSize,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToplistWidgetDefinition {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

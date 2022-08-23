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
   * <p>The Change graph shows you the change in a value over the time period chosen.</p>
 */
@JsonPropertyOrder({
  ChangeWidgetDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  ChangeWidgetDefinition.JSON_PROPERTY_REQUESTS,
  ChangeWidgetDefinition.JSON_PROPERTY_TIME,
  ChangeWidgetDefinition.JSON_PROPERTY_TITLE,
  ChangeWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  ChangeWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  ChangeWidgetDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChangeWidgetDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<ChangeWidgetRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ChangeWidgetDefinitionType type = ChangeWidgetDefinitionType.CHANGE;

  public ChangeWidgetDefinition() {}

  @JsonCreator
  public ChangeWidgetDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_REQUESTS)List<ChangeWidgetRequest> requests,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ChangeWidgetDefinitionType type) {
        this.requests = requests;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ChangeWidgetDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    for (WidgetCustomLink item : customLinks) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ChangeWidgetDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
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
  public ChangeWidgetDefinition requests(List<ChangeWidgetRequest> requests) {
    this.requests = requests;
    for (ChangeWidgetRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ChangeWidgetDefinition addRequestsItem(ChangeWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * <p>Array of one request object to display in the widget.</p>
   * <p>See the dedicated <a href="https://docs.datadoghq.com/dashboards/graphing_json/request_json">Request JSON schema documentation</a>
   *  to learn how to build the <code>REQUEST_SCHEMA</code>.</p>
   * @return requests
  **/
      @JsonProperty(JSON_PROPERTY_REQUESTS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<ChangeWidgetRequest> getRequests() {
        return requests;
      }
  public void setRequests(List<ChangeWidgetRequest> requests) {
    this.requests = requests;
  }
  public ChangeWidgetDefinition time(WidgetTime time) {
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
  public ChangeWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>Title of the widget.</p>
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
  public ChangeWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
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
  public ChangeWidgetDefinition titleSize(String titleSize) {
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
  public ChangeWidgetDefinition type(ChangeWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the change widget.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ChangeWidgetDefinitionType getType() {
        return type;
      }
  public void setType(ChangeWidgetDefinitionType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this ChangeWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeWidgetDefinition changeWidgetDefinition = (ChangeWidgetDefinition) o;
    return Objects.equals(this.customLinks, changeWidgetDefinition.customLinks) && Objects.equals(this.requests, changeWidgetDefinition.requests) && Objects.equals(this.time, changeWidgetDefinition.time) && Objects.equals(this.title, changeWidgetDefinition.title) && Objects.equals(this.titleAlign, changeWidgetDefinition.titleAlign) && Objects.equals(this.titleSize, changeWidgetDefinition.titleSize) && Objects.equals(this.type, changeWidgetDefinition.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(customLinks,requests,time,title,titleAlign,titleSize,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeWidgetDefinition {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

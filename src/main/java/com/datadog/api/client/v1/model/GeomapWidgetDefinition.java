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
   * <p>This visualization displays a series of values by country on a world map.</p>
 */
@JsonPropertyOrder({
  GeomapWidgetDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  GeomapWidgetDefinition.JSON_PROPERTY_REQUESTS,
  GeomapWidgetDefinition.JSON_PROPERTY_STYLE,
  GeomapWidgetDefinition.JSON_PROPERTY_TIME,
  GeomapWidgetDefinition.JSON_PROPERTY_TITLE,
  GeomapWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  GeomapWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  GeomapWidgetDefinition.JSON_PROPERTY_TYPE,
  GeomapWidgetDefinition.JSON_PROPERTY_VIEW
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeomapWidgetDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<GeomapWidgetRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_STYLE = "style";
  private GeomapWidgetDefinitionStyle style;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private GeomapWidgetDefinitionType type = GeomapWidgetDefinitionType.GEOMAP;

  public static final String JSON_PROPERTY_VIEW = "view";
  private GeomapWidgetDefinitionView view;

  public GeomapWidgetDefinition() {}

  @JsonCreator
  public GeomapWidgetDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_REQUESTS)List<GeomapWidgetRequest> requests,
            @JsonProperty(required=true, value=JSON_PROPERTY_STYLE)GeomapWidgetDefinitionStyle style,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)GeomapWidgetDefinitionType type,
            @JsonProperty(required=true, value=JSON_PROPERTY_VIEW)GeomapWidgetDefinitionView view) {
        this.requests = requests;
        this.style = style;
        this.unparsed |= style.unparsed;
        this.type = type;
        this.unparsed |= !type.isValid();
        this.view = view;
        this.unparsed |= view.unparsed;
  }
  public GeomapWidgetDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    for (WidgetCustomLink item : customLinks) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public GeomapWidgetDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
    if (this.customLinks == null) {
      this.customLinks = new ArrayList<>();
    }
    this.customLinks.add(customLinksItem);
    this.unparsed |= customLinksItem.unparsed;
    return this;
  }

  /**
   * <p>A list of custom links.</p>
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
  public GeomapWidgetDefinition requests(List<GeomapWidgetRequest> requests) {
    this.requests = requests;
    for (GeomapWidgetRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public GeomapWidgetDefinition addRequestsItem(GeomapWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * <p>Array of request objects to display in the widget. May include an optional request for the region layer and/or an optional request for the points layer. Region layer requests must contain a <code>group-by</code> tag whose value is a country ISO code.
   * See the <a href="https://docs.datadoghq.com/dashboards/graphing_json/request_json">Request JSON schema documentation</a>
   * for information about building the <code>REQUEST_SCHEMA</code>.</p>
   * @return requests
  **/
      @JsonProperty(JSON_PROPERTY_REQUESTS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<GeomapWidgetRequest> getRequests() {
        return requests;
      }
  public void setRequests(List<GeomapWidgetRequest> requests) {
    this.requests = requests;
  }
  public GeomapWidgetDefinition style(GeomapWidgetDefinitionStyle style) {
    this.style = style;
    this.unparsed |= style.unparsed;
    return this;
  }

  /**
   * <p>The style to apply to the widget.</p>
   * @return style
  **/
      @JsonProperty(JSON_PROPERTY_STYLE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public GeomapWidgetDefinitionStyle getStyle() {
        return style;
      }
  public void setStyle(GeomapWidgetDefinitionStyle style) {
    this.style = style;
  }
  public GeomapWidgetDefinition time(WidgetTime time) {
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
  public GeomapWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>The title of your widget.</p>
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
  public GeomapWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
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
  public GeomapWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * <p>The size of the title.</p>
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
  public GeomapWidgetDefinition type(GeomapWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the geomap widget.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public GeomapWidgetDefinitionType getType() {
        return type;
      }
  public void setType(GeomapWidgetDefinitionType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }
  public GeomapWidgetDefinition view(GeomapWidgetDefinitionView view) {
    this.view = view;
    this.unparsed |= view.unparsed;
    return this;
  }

  /**
   * <p>The view of the world that the map should render.</p>
   * @return view
  **/
      @JsonProperty(JSON_PROPERTY_VIEW)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public GeomapWidgetDefinitionView getView() {
        return view;
      }
  public void setView(GeomapWidgetDefinitionView view) {
    this.view = view;
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
   * @return GeomapWidgetDefinition
   */
  @JsonAnySetter
  public GeomapWidgetDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this GeomapWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapWidgetDefinition geomapWidgetDefinition = (GeomapWidgetDefinition) o;
    return Objects.equals(this.customLinks, geomapWidgetDefinition.customLinks) && Objects.equals(this.requests, geomapWidgetDefinition.requests) && Objects.equals(this.style, geomapWidgetDefinition.style) && Objects.equals(this.time, geomapWidgetDefinition.time) && Objects.equals(this.title, geomapWidgetDefinition.title) && Objects.equals(this.titleAlign, geomapWidgetDefinition.titleAlign) && Objects.equals(this.titleSize, geomapWidgetDefinition.titleSize) && Objects.equals(this.type, geomapWidgetDefinition.type) && Objects.equals(this.view, geomapWidgetDefinition.view) && Objects.equals(this.additionalProperties, geomapWidgetDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(customLinks,requests,style,time,title,titleAlign,titleSize,type,view, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapWidgetDefinition {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
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

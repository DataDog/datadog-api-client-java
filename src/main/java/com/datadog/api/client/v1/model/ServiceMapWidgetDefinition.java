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
   * <p>This widget displays a map of a service to all of the services that call it, and all of the services that it calls.</p>
 */
@JsonPropertyOrder({
  ServiceMapWidgetDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  ServiceMapWidgetDefinition.JSON_PROPERTY_FILTERS,
  ServiceMapWidgetDefinition.JSON_PROPERTY_SERVICE,
  ServiceMapWidgetDefinition.JSON_PROPERTY_TITLE,
  ServiceMapWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  ServiceMapWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  ServiceMapWidgetDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceMapWidgetDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<String> filters = new ArrayList<>();

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ServiceMapWidgetDefinitionType type = ServiceMapWidgetDefinitionType.SERVICEMAP;

  public ServiceMapWidgetDefinition() {}

  @JsonCreator
  public ServiceMapWidgetDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_FILTERS)List<String> filters,
            @JsonProperty(required=true, value=JSON_PROPERTY_SERVICE)String service,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ServiceMapWidgetDefinitionType type) {
        this.filters = filters;
        this.service = service;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ServiceMapWidgetDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    for (WidgetCustomLink item : customLinks) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ServiceMapWidgetDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
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
  public ServiceMapWidgetDefinition filters(List<String> filters) {
    this.filters = filters;
    return this;
  }
  public ServiceMapWidgetDefinition addFiltersItem(String filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * <p>Your environment and primary tag (or * if enabled for your account).</p>
   * @return filters
  **/
      @JsonProperty(JSON_PROPERTY_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getFilters() {
        return filters;
      }
  public void setFilters(List<String> filters) {
    this.filters = filters;
  }
  public ServiceMapWidgetDefinition service(String service) {
    this.service = service;
    return this;
  }

  /**
   * <p>The ID of the service you want to map.</p>
   * @return service
  **/
      @JsonProperty(JSON_PROPERTY_SERVICE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getService() {
        return service;
      }
  public void setService(String service) {
    this.service = service;
  }
  public ServiceMapWidgetDefinition title(String title) {
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
  public ServiceMapWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
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
  public ServiceMapWidgetDefinition titleSize(String titleSize) {
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
  public ServiceMapWidgetDefinition type(ServiceMapWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the service map widget.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ServiceMapWidgetDefinitionType getType() {
        return type;
      }
  public void setType(ServiceMapWidgetDefinitionType type) {
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
   * @return ServiceMapWidgetDefinition
   */
  @JsonAnySetter
  public ServiceMapWidgetDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this ServiceMapWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceMapWidgetDefinition serviceMapWidgetDefinition = (ServiceMapWidgetDefinition) o;
    return Objects.equals(this.customLinks, serviceMapWidgetDefinition.customLinks) && Objects.equals(this.filters, serviceMapWidgetDefinition.filters) && Objects.equals(this.service, serviceMapWidgetDefinition.service) && Objects.equals(this.title, serviceMapWidgetDefinition.title) && Objects.equals(this.titleAlign, serviceMapWidgetDefinition.titleAlign) && Objects.equals(this.titleSize, serviceMapWidgetDefinition.titleSize) && Objects.equals(this.type, serviceMapWidgetDefinition.type) && Objects.equals(this.additionalProperties, serviceMapWidgetDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(customLinks,filters,service,title,titleAlign,titleSize,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceMapWidgetDefinition {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

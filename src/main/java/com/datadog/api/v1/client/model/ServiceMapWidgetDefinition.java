/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This widget displays a map of a service to all of the services that call it, and all of the
 * services that it calls.
 */
@ApiModel(
    description =
        "This widget displays a map of a service to all of the services that call it, and all of"
            + " the services that it calls.")
@JsonPropertyOrder({
  ServiceMapWidgetDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  ServiceMapWidgetDefinition.JSON_PROPERTY_FILTERS,
  ServiceMapWidgetDefinition.JSON_PROPERTY_SERVICE,
  ServiceMapWidgetDefinition.JSON_PROPERTY_TITLE,
  ServiceMapWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  ServiceMapWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  ServiceMapWidgetDefinition.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceMapWidgetDefinition {
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
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTERS) List<String> filters,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE) String service,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ServiceMapWidgetDefinitionType type) {
    this.filters = filters;
    this.service = service;
    this.type = type;
  }

  public ServiceMapWidgetDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    return this;
  }

  public ServiceMapWidgetDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
    if (this.customLinks == null) {
      this.customLinks = new ArrayList<>();
    }
    this.customLinks.add(customLinksItem);
    return this;
  }

  /**
   * List of custom links.
   *
   * @return customLinks
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of custom links.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * Your environment and primary tag (or * if enabled for your account).
   *
   * @return filters
   */
  @ApiModelProperty(
      example = "[\"*\"]",
      required = true,
      value = "Your environment and primary tag (or * if enabled for your account).")
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * The ID of the service you want to map.
   *
   * @return service
   */
  @ApiModelProperty(example = "", required = true, value = "The ID of the service you want to map.")
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * The title of your widget.
   *
   * @return title
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of your widget.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ServiceMapWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    return this;
  }

  /**
   * Get titleAlign
   *
   * @return titleAlign
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTextAlign getTitleAlign() {
    return titleAlign;
  }

  public void setTitleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
  }

  public ServiceMapWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * Size of the title.
   *
   * @return titleSize
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of the title.")
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitleSize() {
    return titleSize;
  }

  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }

  public ServiceMapWidgetDefinition type(ServiceMapWidgetDefinitionType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ServiceMapWidgetDefinitionType getType() {
    return type;
  }

  public void setType(ServiceMapWidgetDefinitionType type) {
    this.type = type;
  }

  /** Return true if this ServiceMapWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceMapWidgetDefinition serviceMapWidgetDefinition = (ServiceMapWidgetDefinition) o;
    return Objects.equals(this.customLinks, serviceMapWidgetDefinition.customLinks)
        && Objects.equals(this.filters, serviceMapWidgetDefinition.filters)
        && Objects.equals(this.service, serviceMapWidgetDefinition.service)
        && Objects.equals(this.title, serviceMapWidgetDefinition.title)
        && Objects.equals(this.titleAlign, serviceMapWidgetDefinition.titleAlign)
        && Objects.equals(this.titleSize, serviceMapWidgetDefinition.titleSize)
        && Objects.equals(this.type, serviceMapWidgetDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customLinks, filters, service, title, titleAlign, titleSize, type);
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
    sb.append("}");
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

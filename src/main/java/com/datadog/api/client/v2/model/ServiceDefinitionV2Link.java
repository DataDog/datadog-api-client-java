/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Service's external links. */
@JsonPropertyOrder({
  ServiceDefinitionV2Link.JSON_PROPERTY_NAME,
  ServiceDefinitionV2Link.JSON_PROPERTY_TYPE,
  ServiceDefinitionV2Link.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceDefinitionV2Link {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ServiceDefinitionV2LinkType type;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public ServiceDefinitionV2Link() {}

  @JsonCreator
  public ServiceDefinitionV2Link(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) ServiceDefinitionV2LinkType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_URL) String url) {
    this.name = name;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.url = url;
  }

  public ServiceDefinitionV2Link name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Link name.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServiceDefinitionV2Link type(ServiceDefinitionV2LinkType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Link type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ServiceDefinitionV2LinkType getType() {
    return type;
  }

  public void setType(ServiceDefinitionV2LinkType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public ServiceDefinitionV2Link url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Link URL.
   *
   * @return url
   */
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /** Return true if this ServiceDefinitionV2Link object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionV2Link serviceDefinitionV2Link = (ServiceDefinitionV2Link) o;
    return Objects.equals(this.name, serviceDefinitionV2Link.name)
        && Objects.equals(this.type, serviceDefinitionV2Link.type)
        && Objects.equals(this.url, serviceDefinitionV2Link.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionV2Link {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

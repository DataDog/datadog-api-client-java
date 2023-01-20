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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Attributes object of a Fastly account. */
@JsonPropertyOrder({
  FastlyAccounResponseAttributes.JSON_PROPERTY_NAME,
  FastlyAccounResponseAttributes.JSON_PROPERTY_SERVICES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FastlyAccounResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private List<FastlyService> services = null;

  public FastlyAccounResponseAttributes() {}

  @JsonCreator
  public FastlyAccounResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public FastlyAccounResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the Fastly account.
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

  public FastlyAccounResponseAttributes services(List<FastlyService> services) {
    this.services = services;
    for (FastlyService item : services) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FastlyAccounResponseAttributes addServicesItem(FastlyService servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    this.unparsed |= servicesItem.unparsed;
    return this;
  }

  /**
   * A list of services belonging to the parent account.
   *
   * @return services
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FastlyService> getServices() {
    return services;
  }

  public void setServices(List<FastlyService> services) {
    this.services = services;
  }

  /** Return true if this FastlyAccounResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FastlyAccounResponseAttributes fastlyAccounResponseAttributes =
        (FastlyAccounResponseAttributes) o;
    return Objects.equals(this.name, fastlyAccounResponseAttributes.name)
        && Objects.equals(this.services, fastlyAccounResponseAttributes.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FastlyAccounResponseAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

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

/** Attributes object for creating a Fastly account. */
@JsonPropertyOrder({
  FastlyAccountCreateRequestAttributes.JSON_PROPERTY_API_KEY,
  FastlyAccountCreateRequestAttributes.JSON_PROPERTY_NAME,
  FastlyAccountCreateRequestAttributes.JSON_PROPERTY_SERVICES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FastlyAccountCreateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_KEY = "api_key";
  private String apiKey;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private List<FastlyService> services = null;

  public FastlyAccountCreateRequestAttributes() {}

  @JsonCreator
  public FastlyAccountCreateRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_API_KEY) String apiKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.apiKey = apiKey;
    this.name = name;
  }

  public FastlyAccountCreateRequestAttributes apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * The API key for the Fastly account.
   *
   * @return apiKey
   */
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public FastlyAccountCreateRequestAttributes name(String name) {
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

  public FastlyAccountCreateRequestAttributes services(List<FastlyService> services) {
    this.services = services;
    for (FastlyService item : services) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FastlyAccountCreateRequestAttributes addServicesItem(FastlyService servicesItem) {
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

  /** Return true if this FastlyAccountCreateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FastlyAccountCreateRequestAttributes fastlyAccountCreateRequestAttributes =
        (FastlyAccountCreateRequestAttributes) o;
    return Objects.equals(this.apiKey, fastlyAccountCreateRequestAttributes.apiKey)
        && Objects.equals(this.name, fastlyAccountCreateRequestAttributes.name)
        && Objects.equals(this.services, fastlyAccountCreateRequestAttributes.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, name, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FastlyAccountCreateRequestAttributes {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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

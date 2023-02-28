/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Facet data for user attributes of an incident. */
@JsonPropertyOrder({
  IncidentSearchResponseUserFacetData.JSON_PROPERTY_COUNT,
  IncidentSearchResponseUserFacetData.JSON_PROPERTY_EMAIL,
  IncidentSearchResponseUserFacetData.JSON_PROPERTY_HANDLE,
  IncidentSearchResponseUserFacetData.JSON_PROPERTY_NAME,
  IncidentSearchResponseUserFacetData.JSON_PROPERTY_UUID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentSearchResponseUserFacetData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public IncidentSearchResponseUserFacetData count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Count of the facet value appearing in search results. maximum: 2147483647
   *
   * @return count
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public IncidentSearchResponseUserFacetData email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email of the user.
   *
   * @return email
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public IncidentSearchResponseUserFacetData handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * Handle of the user.
   *
   * @return handle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public IncidentSearchResponseUserFacetData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the user.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IncidentSearchResponseUserFacetData uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * ID of the user.
   *
   * @return uuid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /** Return true if this IncidentSearchResponseUserFacetData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentSearchResponseUserFacetData incidentSearchResponseUserFacetData =
        (IncidentSearchResponseUserFacetData) o;
    return Objects.equals(this.count, incidentSearchResponseUserFacetData.count)
        && Objects.equals(this.email, incidentSearchResponseUserFacetData.email)
        && Objects.equals(this.handle, incidentSearchResponseUserFacetData.handle)
        && Objects.equals(this.name, incidentSearchResponseUserFacetData.name)
        && Objects.equals(this.uuid, incidentSearchResponseUserFacetData.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, email, handle, name, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentSearchResponseUserFacetData {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

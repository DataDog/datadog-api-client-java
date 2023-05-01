/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** User who shared the dashboard. */
@JsonPropertyOrder({
  SharedDashboardAuthor.JSON_PROPERTY_HANDLE,
  SharedDashboardAuthor.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SharedDashboardAuthor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  /**
   * Identifier of the user who shared the dashboard.
   *
   * @return handle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHandle() {
    return handle;
  }

  /**
   * Name of the user who shared the dashboard.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getName() {

    if (name == null) {
      name = JsonNullable.<String>undefined();
    }
    return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  private void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  /** Return true if this SharedDashboardAuthor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedDashboardAuthor sharedDashboardAuthor = (SharedDashboardAuthor) o;
    return Objects.equals(this.handle, sharedDashboardAuthor.handle)
        && Objects.equals(this.name, sharedDashboardAuthor.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedDashboardAuthor {\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

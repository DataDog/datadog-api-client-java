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

/** A notification triggered by the monitor. */
@JsonPropertyOrder({
  MonitorSearchResultNotification.JSON_PROPERTY_HANDLE,
  MonitorSearchResultNotification.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorSearchResultNotification {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * The email address that received the notification.
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
   * The username receiving the notification
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  /** Return true if this MonitorSearchResultNotification object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorSearchResultNotification monitorSearchResultNotification =
        (MonitorSearchResultNotification) o;
    return Objects.equals(this.handle, monitorSearchResultNotification.handle)
        && Objects.equals(this.name, monitorSearchResultNotification.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorSearchResultNotification {\n");
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

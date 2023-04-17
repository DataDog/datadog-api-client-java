/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Object containing the information for an invitation to a shared dashboard. */
@JsonPropertyOrder({
  SharedDashboardInvitesDataObject.JSON_PROPERTY_ATTRIBUTES,
  SharedDashboardInvitesDataObject.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SharedDashboardInvitesDataObject {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private SharedDashboardInvitesDataObjectAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private DashboardInviteType type;

  public SharedDashboardInvitesDataObject() {}

  @JsonCreator
  public SharedDashboardInvitesDataObject(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          SharedDashboardInvitesDataObjectAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) DashboardInviteType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SharedDashboardInvitesDataObject attributes(
      SharedDashboardInvitesDataObjectAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes of the shared dashboard invitation
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SharedDashboardInvitesDataObjectAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(SharedDashboardInvitesDataObjectAttributes attributes) {
    this.attributes = attributes;
  }

  public SharedDashboardInvitesDataObject type(DashboardInviteType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type for shared dashboard invitation request body.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DashboardInviteType getType() {
    return type;
  }

  public void setType(DashboardInviteType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SharedDashboardInvitesDataObject object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedDashboardInvitesDataObject sharedDashboardInvitesDataObject =
        (SharedDashboardInvitesDataObject) o;
    return Objects.equals(this.attributes, sharedDashboardInvitesDataObject.attributes)
        && Objects.equals(this.type, sharedDashboardInvitesDataObject.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedDashboardInvitesDataObject {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

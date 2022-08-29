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

/** Object to create a user invitation. */
@JsonPropertyOrder({
  UserInvitationData.JSON_PROPERTY_RELATIONSHIPS,
  UserInvitationData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserInvitationData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private UserInvitationRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private UserInvitationsType type = UserInvitationsType.USER_INVITATIONS;

  public UserInvitationData() {}

  @JsonCreator
  public UserInvitationData(
      @JsonProperty(required = true, value = JSON_PROPERTY_RELATIONSHIPS)
          UserInvitationRelationships relationships,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) UserInvitationsType type) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public UserInvitationData relationships(UserInvitationRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Relationships data for user invitation.
   *
   * @return relationships
   */
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UserInvitationRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(UserInvitationRelationships relationships) {
    this.relationships = relationships;
  }

  public UserInvitationData type(UserInvitationsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * User invitations type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UserInvitationsType getType() {
    return type;
  }

  public void setType(UserInvitationsType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this UserInvitationData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInvitationData userInvitationData = (UserInvitationData) o;
    return Objects.equals(this.relationships, userInvitationData.relationships)
        && Objects.equals(this.type, userInvitationData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationships, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInvitationData {\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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

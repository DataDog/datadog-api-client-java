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

/** Relationships data for user invitation. */
@JsonPropertyOrder({UserInvitationRelationships.JSON_PROPERTY_USER})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserInvitationRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_USER = "user";
  private RelationshipToUser user;

  public UserInvitationRelationships() {}

  @JsonCreator
  public UserInvitationRelationships(
      @JsonProperty(required = true, value = JSON_PROPERTY_USER) RelationshipToUser user) {
    this.user = user;
    this.unparsed |= user.unparsed;
  }

  public UserInvitationRelationships user(RelationshipToUser user) {
    this.user = user;
    this.unparsed |= user.unparsed;
    return this;
  }

  /**
   * Relationship to user.
   *
   * @return user
   */
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RelationshipToUser getUser() {
    return user;
  }

  public void setUser(RelationshipToUser user) {
    this.user = user;
  }

  /** Return true if this UserInvitationRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInvitationRelationships userInvitationRelationships = (UserInvitationRelationships) o;
    return Objects.equals(this.user, userInvitationRelationships.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInvitationRelationships {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

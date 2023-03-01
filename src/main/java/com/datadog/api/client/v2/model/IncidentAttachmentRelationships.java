/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The incident attachment's relationships.</p>
 */
@JsonPropertyOrder({
  IncidentAttachmentRelationships.JSON_PROPERTY_LAST_MODIFIED_BY_USER
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentAttachmentRelationships {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_LAST_MODIFIED_BY_USER = "last_modified_by_user";
  private RelationshipToUser lastModifiedByUser;

  public IncidentAttachmentRelationships lastModifiedByUser(RelationshipToUser lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
    this.unparsed |= lastModifiedByUser.unparsed;
    return this;
  }

  /**
   * <p>Relationship to user.</p>
   * @return lastModifiedByUser
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY_USER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RelationshipToUser getLastModifiedByUser() {
        return lastModifiedByUser;
      }
  public void setLastModifiedByUser(RelationshipToUser lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
  }

  /**
   * Return true if this IncidentAttachmentRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentAttachmentRelationships incidentAttachmentRelationships = (IncidentAttachmentRelationships) o;
    return Objects.equals(this.lastModifiedByUser, incidentAttachmentRelationships.lastModifiedByUser);
  }


  @Override
  public int hashCode() {
    return Objects.hash(lastModifiedByUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentAttachmentRelationships {\n");
    sb.append("    lastModifiedByUser: ").append(toIndentedString(lastModifiedByUser)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

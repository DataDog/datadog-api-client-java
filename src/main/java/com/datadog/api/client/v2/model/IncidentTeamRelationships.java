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
   * <p>The incident team's relationships.</p>
 */
@JsonPropertyOrder({
  IncidentTeamRelationships.JSON_PROPERTY_CREATED_BY,
  IncidentTeamRelationships.JSON_PROPERTY_LAST_MODIFIED_BY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentTeamRelationships {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private RelationshipToUser createdBy;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY = "last_modified_by";
  private RelationshipToUser lastModifiedBy;

  public IncidentTeamRelationships createdBy(RelationshipToUser createdBy) {
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    return this;
  }

  /**
   * <p>Relationship to user.</p>
   * @return createdBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RelationshipToUser getCreatedBy() {
        return createdBy;
      }
  public void setCreatedBy(RelationshipToUser createdBy) {
    this.createdBy = createdBy;
  }
  public IncidentTeamRelationships lastModifiedBy(RelationshipToUser lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    this.unparsed |= lastModifiedBy.unparsed;
    return this;
  }

  /**
   * <p>Relationship to user.</p>
   * @return lastModifiedBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RelationshipToUser getLastModifiedBy() {
        return lastModifiedBy;
      }
  public void setLastModifiedBy(RelationshipToUser lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  /**
   * Return true if this IncidentTeamRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentTeamRelationships incidentTeamRelationships = (IncidentTeamRelationships) o;
    return Objects.equals(this.createdBy, incidentTeamRelationships.createdBy) && Objects.equals(this.lastModifiedBy, incidentTeamRelationships.lastModifiedBy);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdBy,lastModifiedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentTeamRelationships {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
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

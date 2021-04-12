/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** The incident service&#39;s relationships. */
@ApiModel(description = "The incident service's relationships.")
@JsonPropertyOrder({
  IncidentServiceRelationships.JSON_PROPERTY_CREATED_BY,
  IncidentServiceRelationships.JSON_PROPERTY_LAST_MODIFIED_BY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IncidentServiceRelationships {
  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private RelationshipToUser createdBy;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY = "last_modified_by";
  private RelationshipToUser lastModifiedBy;

  public IncidentServiceRelationships createdBy(RelationshipToUser createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   *
   * @return createdBy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToUser getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(RelationshipToUser createdBy) {
    this.createdBy = createdBy;
  }

  public IncidentServiceRelationships lastModifiedBy(RelationshipToUser lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * Get lastModifiedBy
   *
   * @return lastModifiedBy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToUser getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(RelationshipToUser lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  /** Return true if this IncidentServiceRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentServiceRelationships incidentServiceRelationships = (IncidentServiceRelationships) o;
    return Objects.equals(this.createdBy, incidentServiceRelationships.createdBy)
        && Objects.equals(this.lastModifiedBy, incidentServiceRelationships.lastModifiedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, lastModifiedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentServiceRelationships {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
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

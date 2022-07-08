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

/** Resources related to the application key. */
@JsonPropertyOrder({ApplicationKeyRelationships.JSON_PROPERTY_OWNED_BY})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationKeyRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OWNED_BY = "owned_by";
  private RelationshipToUser ownedBy;

  public ApplicationKeyRelationships ownedBy(RelationshipToUser ownedBy) {
    this.ownedBy = ownedBy;
    this.unparsed |= ownedBy.unparsed;
    return this;
  }

  /**
   * Relationship to user.
   *
   * @return ownedBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToUser getOwnedBy() {
    return ownedBy;
  }

  public void setOwnedBy(RelationshipToUser ownedBy) {
    this.ownedBy = ownedBy;
  }

  /** Return true if this ApplicationKeyRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationKeyRelationships applicationKeyRelationships = (ApplicationKeyRelationships) o;
    return Objects.equals(this.ownedBy, applicationKeyRelationships.ownedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationKeyRelationships {\n");
    sb.append("    ownedBy: ").append(toIndentedString(ownedBy)).append("\n");
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

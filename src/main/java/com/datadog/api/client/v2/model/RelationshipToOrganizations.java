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
   * <p>Relationship to organizations.</p>
 */
@JsonPropertyOrder({
  RelationshipToOrganizations.JSON_PROPERTY_DATA
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RelationshipToOrganizations {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<RelationshipToOrganizationData> data = new ArrayList<>();

  public RelationshipToOrganizations() {}

  @JsonCreator
  public RelationshipToOrganizations(
            @JsonProperty(required=true, value=JSON_PROPERTY_DATA)List<RelationshipToOrganizationData> data) {
        this.data = data;
  }
  public RelationshipToOrganizations data(List<RelationshipToOrganizationData> data) {
    this.data = data;
    for (RelationshipToOrganizationData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public RelationshipToOrganizations addDataItem(RelationshipToOrganizationData dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * <p>Relationships to organization objects.</p>
   * @return data
  **/
      @JsonProperty(JSON_PROPERTY_DATA)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<RelationshipToOrganizationData> getData() {
        return data;
      }
  public void setData(List<RelationshipToOrganizationData> data) {
    this.data = data;
  }

  /**
   * Return true if this RelationshipToOrganizations object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationshipToOrganizations relationshipToOrganizations = (RelationshipToOrganizations) o;
    return Objects.equals(this.data, relationshipToOrganizations.data);
  }


  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipToOrganizations {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

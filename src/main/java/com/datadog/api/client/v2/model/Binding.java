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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Specifies which principals are associated with a relation. */
@JsonPropertyOrder({Binding.JSON_PROPERTY_PRINCIPALS, Binding.JSON_PROPERTY_RELATION})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Binding {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PRINCIPALS = "principals";
  private List<String> principals = new ArrayList<>();

  public static final String JSON_PROPERTY_RELATION = "relation";
  private String relation;

  public Binding() {}

  @JsonCreator
  public Binding(
      @JsonProperty(required = true, value = JSON_PROPERTY_PRINCIPALS) List<String> principals,
      @JsonProperty(required = true, value = JSON_PROPERTY_RELATION) String relation) {
    this.principals = principals;
    this.relation = relation;
  }

  public Binding principals(List<String> principals) {
    this.principals = principals;
    return this;
  }

  public Binding addPrincipalsItem(String principalsItem) {
    this.principals.add(principalsItem);
    return this;
  }

  /**
   * An array of principals.
   *
   * @return principals
   */
  @JsonProperty(JSON_PROPERTY_PRINCIPALS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getPrincipals() {
    return principals;
  }

  public void setPrincipals(List<String> principals) {
    this.principals = principals;
  }

  public Binding relation(String relation) {
    this.relation = relation;
    return this;
  }

  /**
   * The role/level of access.
   *
   * @return relation
   */
  @JsonProperty(JSON_PROPERTY_RELATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRelation() {
    return relation;
  }

  public void setRelation(String relation) {
    this.relation = relation;
  }

  /** Return true if this Binding object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Binding binding = (Binding) o;
    return Objects.equals(this.principals, binding.principals)
        && Objects.equals(this.relation, binding.relation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principals, relation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Binding {\n");
    sb.append("    principals: ").append(toIndentedString(principals)).append("\n");
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
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

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
import java.util.UUID;
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
   * <p>Specifies which principals are associated with a relation.</p>
 */
@JsonPropertyOrder({
  RestrictionPolicyBinding.JSON_PROPERTY_PRINCIPALS,
  RestrictionPolicyBinding.JSON_PROPERTY_RELATION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RestrictionPolicyBinding {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_PRINCIPALS = "principals";
  private List<String> principals = new ArrayList<>();

  public static final String JSON_PROPERTY_RELATION = "relation";
  private String relation;

  public RestrictionPolicyBinding() {}

  @JsonCreator
  public RestrictionPolicyBinding(
            @JsonProperty(required=true, value=JSON_PROPERTY_PRINCIPALS)List<String> principals,
            @JsonProperty(required=true, value=JSON_PROPERTY_RELATION)String relation) {
        this.principals = principals;
        this.relation = relation;
  }
  public RestrictionPolicyBinding principals(List<String> principals) {
    this.principals = principals;
    return this;
  }
  public RestrictionPolicyBinding addPrincipalsItem(String principalsItem) {
    this.principals.add(principalsItem);
    return this;
  }

  /**
   * <p>An array of principals. A principal is a subject or group of subjects.
   * Each principal is formatted as <code>type:id</code>. Supported types: <code>role</code>, <code>team</code>, <code>user</code>, and <code>org</code>.
   * The org ID can be obtained through the api/v2/current_user API.
   * The user principal type accepts service account IDs.</p>
   * @return principals
  **/
      @JsonProperty(JSON_PROPERTY_PRINCIPALS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getPrincipals() {
        return principals;
      }
  public void setPrincipals(List<String> principals) {
    this.principals = principals;
  }
  public RestrictionPolicyBinding relation(String relation) {
    this.relation = relation;
    return this;
  }

  /**
   * <p>The role/level of access.</p>
   * @return relation
  **/
      @JsonProperty(JSON_PROPERTY_RELATION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getRelation() {
        return relation;
      }
  public void setRelation(String relation) {
    this.relation = relation;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return RestrictionPolicyBinding
   */
  @JsonAnySetter
  public RestrictionPolicyBinding putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this RestrictionPolicyBinding object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestrictionPolicyBinding restrictionPolicyBinding = (RestrictionPolicyBinding) o;
    return Objects.equals(this.principals, restrictionPolicyBinding.principals) && Objects.equals(this.relation, restrictionPolicyBinding.relation) && Objects.equals(this.additionalProperties, restrictionPolicyBinding.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(principals,relation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestrictionPolicyBinding {\n");
    sb.append("    principals: ").append(toIndentedString(principals)).append("\n");
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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

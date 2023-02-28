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
   * <p>Restriction policy attributes.</p>
 */
@JsonPropertyOrder({
  RestrictionPolicyAttributes.JSON_PROPERTY_BINDINGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RestrictionPolicyAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BINDINGS = "bindings";
  private List<RestrictionPolicyBinding> bindings = new ArrayList<>();

  public RestrictionPolicyAttributes() {}

  @JsonCreator
  public RestrictionPolicyAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_BINDINGS)List<RestrictionPolicyBinding> bindings) {
        this.bindings = bindings;
  }
  public RestrictionPolicyAttributes bindings(List<RestrictionPolicyBinding> bindings) {
    this.bindings = bindings;
    for (RestrictionPolicyBinding item : bindings) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public RestrictionPolicyAttributes addBindingsItem(RestrictionPolicyBinding bindingsItem) {
    this.bindings.add(bindingsItem);
    this.unparsed |= bindingsItem.unparsed;
    return this;
  }

  /**
   * <p>An array of bindings.</p>
   * @return bindings
  **/
      @JsonProperty(JSON_PROPERTY_BINDINGS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<RestrictionPolicyBinding> getBindings() {
        return bindings;
      }
  public void setBindings(List<RestrictionPolicyBinding> bindings) {
    this.bindings = bindings;
  }

  /**
   * Return true if this RestrictionPolicyAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestrictionPolicyAttributes restrictionPolicyAttributes = (RestrictionPolicyAttributes) o;
    return Objects.equals(this.bindings, restrictionPolicyAttributes.bindings);
  }


  @Override
  public int hashCode() {
    return Objects.hash(bindings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestrictionPolicyAttributes {\n");
    sb.append("    bindings: ").append(toIndentedString(bindings)).append("\n");
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

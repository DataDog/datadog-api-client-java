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
   * <p>Filters monitor notifications using a scope expression over key:value pairs with boolean logic (AND, OR, NOT).</p>
 */
@JsonPropertyOrder({
  MonitorNotificationRuleFilterScope.JSON_PROPERTY_SCOPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorNotificationRuleFilterScope {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public MonitorNotificationRuleFilterScope() {}

  @JsonCreator
  public MonitorNotificationRuleFilterScope(
            @JsonProperty(required=true, value=JSON_PROPERTY_SCOPE)String scope) {
        this.scope = scope;
  }
  public MonitorNotificationRuleFilterScope scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * <p>A scope expression composed by key:value pairs (e.g. <code>service:foo</code>) with boolean operators (AND, OR, NOT) and parentheses for grouping.</p>
   * @return scope
  **/
      @JsonProperty(JSON_PROPERTY_SCOPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getScope() {
        return scope;
      }
  public void setScope(String scope) {
    this.scope = scope;
  }

  /**
   * Return true if this MonitorNotificationRuleFilterScope object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorNotificationRuleFilterScope monitorNotificationRuleFilterScope = (MonitorNotificationRuleFilterScope) o;
    return Objects.equals(this.scope, monitorNotificationRuleFilterScope.scope);
  }


  @Override
  public int hashCode() {
    return Objects.hash(scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorNotificationRuleFilterScope {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

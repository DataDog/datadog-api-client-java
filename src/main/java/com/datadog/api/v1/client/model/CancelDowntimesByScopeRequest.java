/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Cancel downtimes according to scope.
 */
@ApiModel(description = "Cancel downtimes according to scope.")
@JsonPropertyOrder({
  CancelDowntimesByScopeRequest.JSON_PROPERTY_SCOPE
})

public class CancelDowntimesByScopeRequest {
  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;


  public CancelDowntimesByScopeRequest scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * The scope(s) to which the downtime applies. For example, &#x60;host:app2&#x60;. Provide multiple scopes as a comma-separated list like &#x60;env:dev,env:prod&#x60;. The resulting downtime applies to sources that matches ALL provided scopes (&#x60;env:dev&#x60; **AND** &#x60;env:prod&#x60;).
   * @return scope
  **/
  @ApiModelProperty(example = "host:myserver", required = true, value = "The scope(s) to which the downtime applies. For example, `host:app2`. Provide multiple scopes as a comma-separated list like `env:dev,env:prod`. The resulting downtime applies to sources that matches ALL provided scopes (`env:dev` **AND** `env:prod`).")
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelDowntimesByScopeRequest cancelDowntimesByScopeRequest = (CancelDowntimesByScopeRequest) o;
    return Objects.equals(this.scope, cancelDowntimesByScopeRequest.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelDowntimesByScopeRequest {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


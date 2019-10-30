/*
 * (C) Datadog, Inc. 2019
 * All rights reserved
 * Licensed under a 3-clause BSD style license (see LICENSE)
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.client.v1.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * An array of service level objective objects.
 */
@ApiModel(description = "An array of service level objective objects.")
@JsonPropertyOrder({
  CheckCanDeleteServiceLevelObjectiveResponseData.JSON_PROPERTY_OK
})

public class CheckCanDeleteServiceLevelObjectiveResponseData {
  public static final String JSON_PROPERTY_OK = "ok";
  private List<String> ok = null;


  public CheckCanDeleteServiceLevelObjectiveResponseData ok(List<String> ok) {
    
    this.ok = ok;
    return this;
  }

  public CheckCanDeleteServiceLevelObjectiveResponseData addOkItem(String okItem) {
    if (this.ok == null) {
      this.ok = new ArrayList<String>();
    }
    this.ok.add(okItem);
    return this;
  }

   /**
   * An array of of SLO IDs that can be safely deleted.
   * @return ok
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of of SLO IDs that can be safely deleted.")
  @JsonProperty(JSON_PROPERTY_OK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getOk() {
    return ok;
  }



  public void setOk(List<String> ok) {
    this.ok = ok;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckCanDeleteServiceLevelObjectiveResponseData checkCanDeleteServiceLevelObjectiveResponseData = (CheckCanDeleteServiceLevelObjectiveResponseData) o;
    return Objects.equals(this.ok, checkCanDeleteServiceLevelObjectiveResponseData.ok);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ok);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckCanDeleteServiceLevelObjectiveResponseData {\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
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


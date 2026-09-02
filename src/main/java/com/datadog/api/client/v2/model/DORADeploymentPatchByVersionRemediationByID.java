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
   * <p>Remediation details identified by the ID of the remediation deployment.</p>
 */
@JsonPropertyOrder({
  DORADeploymentPatchByVersionRemediationByID.JSON_PROPERTY_ID,
  DORADeploymentPatchByVersionRemediationByID.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DORADeploymentPatchByVersionRemediationByID {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private DORADeploymentPatchRemediationType type;

  public DORADeploymentPatchByVersionRemediationByID() {}

  @JsonCreator
  public DORADeploymentPatchByVersionRemediationByID(
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)DORADeploymentPatchRemediationType type) {
        this.id = id;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public DORADeploymentPatchByVersionRemediationByID id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The ID of the remediation deployment.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public DORADeploymentPatchByVersionRemediationByID type(DORADeploymentPatchRemediationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The type of remediation action taken. Required when the failed deployment must be linked to a remediation deployment.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public DORADeploymentPatchRemediationType getType() {
        return type;
      }
  public void setType(DORADeploymentPatchRemediationType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this DORADeploymentPatchByVersionRemediationByID object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DORADeploymentPatchByVersionRemediationByID doraDeploymentPatchByVersionRemediationById = (DORADeploymentPatchByVersionRemediationByID) o;
    return Objects.equals(this.id, doraDeploymentPatchByVersionRemediationById.id) && Objects.equals(this.type, doraDeploymentPatchByVersionRemediationById.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(id,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DORADeploymentPatchByVersionRemediationByID {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

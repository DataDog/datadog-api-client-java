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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v2.client.model.RelationshipToUser;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.datadog.api.v2.client.JSON;


/**
 * The relationships the incident will have with other resources once created.
 */
@ApiModel(description = "The relationships the incident will have with other resources once created.")
@JsonPropertyOrder({
  IncidentCreateRelationships.JSON_PROPERTY_COMMANDER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class IncidentCreateRelationships {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMMANDER = "commander";
  private RelationshipToUser commander;

  public IncidentCreateRelationships() {}

  @JsonCreator
  public IncidentCreateRelationships(
            @JsonProperty(required=true, value=JSON_PROPERTY_COMMANDER) RelationshipToUser commander
            ) {
        this.commander = commander;
        this.unparsed |= commander.unparsed;
  }

  public IncidentCreateRelationships commander(RelationshipToUser commander) {
    this.commander = commander;
    this.unparsed |= commander.unparsed;
    return this;
  }

   /**
   * Get commander
   * @return commander
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COMMANDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RelationshipToUser getCommander() {
    return commander;
  }


  public void setCommander(RelationshipToUser commander) {
    this.commander = commander;
  }


  /**
   * Return true if this IncidentCreateRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentCreateRelationships incidentCreateRelationships = (IncidentCreateRelationships) o;
    return Objects.equals(this.commander, incidentCreateRelationships.commander);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commander);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentCreateRelationships {\n");
    sb.append("    commander: ").append(toIndentedString(commander)).append("\n");
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


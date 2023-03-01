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
   * <p>Org related information about the service.</p>
 */
@JsonPropertyOrder({
  ServiceDefinitionV1Org.JSON_PROPERTY_APPLICATION,
  ServiceDefinitionV1Org.JSON_PROPERTY_TEAM
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceDefinitionV1Org {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION = "application";
  private String application;

  public static final String JSON_PROPERTY_TEAM = "team";
  private String team;

  public ServiceDefinitionV1Org application(String application) {
    this.application = application;
    return this;
  }

  /**
   * <p>App feature this service supports.</p>
   * @return application
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_APPLICATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getApplication() {
        return application;
      }
  public void setApplication(String application) {
    this.application = application;
  }
  public ServiceDefinitionV1Org team(String team) {
    this.team = team;
    return this;
  }

  /**
   * <p>Team that owns the service.</p>
   * @return team
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEAM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTeam() {
        return team;
      }
  public void setTeam(String team) {
    this.team = team;
  }

  /**
   * Return true if this ServiceDefinitionV1Org object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionV1Org serviceDefinitionV1Org = (ServiceDefinitionV1Org) o;
    return Objects.equals(this.application, serviceDefinitionV1Org.application) && Objects.equals(this.team, serviceDefinitionV1Org.team);
  }


  @Override
  public int hashCode() {
    return Objects.hash(application,team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionV1Org {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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

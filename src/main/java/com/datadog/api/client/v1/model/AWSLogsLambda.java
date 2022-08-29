/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Description of the Lambdas.</p>
 */
@JsonPropertyOrder({
  AWSLogsLambda.JSON_PROPERTY_ARN
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSLogsLambda {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARN = "arn";
  private String arn;

  public AWSLogsLambda arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * <p>Available ARN IDs.</p>
   * @return arn
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ARN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getArn() {
        return arn;
      }
  public void setArn(String arn) {
    this.arn = arn;
  }

  /**
   * Return true if this AWSLogsLambda object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSLogsLambda awsLogsLambda = (AWSLogsLambda) o;
    return Objects.equals(this.arn, awsLogsLambda.arn);
  }


  @Override
  public int hashCode() {
    return Objects.hash(arn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSLogsLambda {\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
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

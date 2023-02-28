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
   * <p>The Response returned by the AWS Create Account call.</p>
 */
@JsonPropertyOrder({
  AWSAccountCreateResponse.JSON_PROPERTY_EXTERNAL_ID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSAccountCreateResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXTERNAL_ID = "external_id";
  private String externalId;

  public AWSAccountCreateResponse externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * <p>AWS external_id.</p>
   * @return externalId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getExternalId() {
        return externalId;
      }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   * Return true if this AWSAccountCreateResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSAccountCreateResponse awsAccountCreateResponse = (AWSAccountCreateResponse) o;
    return Objects.equals(this.externalId, awsAccountCreateResponse.externalId);
  }


  @Override
  public int hashCode() {
    return Objects.hash(externalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSAccountCreateResponse {\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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

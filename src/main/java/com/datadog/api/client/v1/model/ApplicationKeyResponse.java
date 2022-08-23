/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** An application key response. */
@JsonPropertyOrder({ApplicationKeyResponse.JSON_PROPERTY_APPLICATION_KEY})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationKeyResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_KEY = "application_key";
  private ApplicationKey applicationKey;

  public ApplicationKeyResponse applicationKey(ApplicationKey applicationKey) {
    this.applicationKey = applicationKey;
    this.unparsed |= applicationKey.unparsed;
    return this;
  }

  /**
   * An application key with its associated metadata.
   *
   * @return applicationKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ApplicationKey getApplicationKey() {
    return applicationKey;
  }

  public void setApplicationKey(ApplicationKey applicationKey) {
    this.applicationKey = applicationKey;
  }

  /** Return true if this ApplicationKeyResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationKeyResponse applicationKeyResponse = (ApplicationKeyResponse) o;
    return Objects.equals(this.applicationKey, applicationKeyResponse.applicationKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationKeyResponse {\n");
    sb.append("    applicationKey: ").append(toIndentedString(applicationKey)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

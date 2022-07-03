/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Authentication part of the secrets. */
@JsonPropertyOrder({
  SyntheticsPrivateLocationSecretsAuthentication.JSON_PROPERTY_ID,
  SyntheticsPrivateLocationSecretsAuthentication.JSON_PROPERTY_KEY
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsPrivateLocationSecretsAuthentication {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  /**
   * Access key for the private location.
   *
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  /**
   * Secret access key for the private location.
   *
   * @return key
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKey() {
    return key;
  }

  /** Return true if this SyntheticsPrivateLocationSecretsAuthentication object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsPrivateLocationSecretsAuthentication syntheticsPrivateLocationSecretsAuthentication =
        (SyntheticsPrivateLocationSecretsAuthentication) o;
    return Objects.equals(this.id, syntheticsPrivateLocationSecretsAuthentication.id)
        && Objects.equals(this.key, syntheticsPrivateLocationSecretsAuthentication.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsPrivateLocationSecretsAuthentication {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

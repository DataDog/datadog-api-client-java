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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** An application key response. */
@JsonPropertyOrder({ApplicationKeyListResponse.JSON_PROPERTY_APPLICATION_KEYS})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationKeyListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_KEYS = "application_keys";
  private List<ApplicationKey> applicationKeys = null;

  public ApplicationKeyListResponse applicationKeys(List<ApplicationKey> applicationKeys) {
    this.applicationKeys = applicationKeys;
    for (ApplicationKey item : applicationKeys) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ApplicationKeyListResponse addApplicationKeysItem(ApplicationKey applicationKeysItem) {
    if (this.applicationKeys == null) {
      this.applicationKeys = new ArrayList<>();
    }
    this.applicationKeys.add(applicationKeysItem);
    this.unparsed |= applicationKeysItem.unparsed;
    return this;
  }

  /**
   * Array of application keys.
   *
   * @return applicationKeys
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ApplicationKey> getApplicationKeys() {
    return applicationKeys;
  }

  public void setApplicationKeys(List<ApplicationKey> applicationKeys) {
    this.applicationKeys = applicationKeys;
  }

  /** Return true if this ApplicationKeyListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationKeyListResponse applicationKeyListResponse = (ApplicationKeyListResponse) o;
    return Objects.equals(this.applicationKeys, applicationKeyListResponse.applicationKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationKeyListResponse {\n");
    sb.append("    applicationKeys: ").append(toIndentedString(applicationKeys)).append("\n");
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

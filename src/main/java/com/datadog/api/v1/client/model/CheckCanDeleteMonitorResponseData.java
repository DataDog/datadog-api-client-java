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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Wrapper object with the list of monitor IDs. */
@JsonPropertyOrder({CheckCanDeleteMonitorResponseData.JSON_PROPERTY_OK})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CheckCanDeleteMonitorResponseData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OK = "ok";
  private List<Long> ok = null;

  public CheckCanDeleteMonitorResponseData ok(List<Long> ok) {
    this.ok = ok;
    return this;
  }

  public CheckCanDeleteMonitorResponseData addOkItem(Long okItem) {
    if (this.ok == null) {
      this.ok = new ArrayList<>();
    }
    this.ok.add(okItem);
    return this;
  }

  /**
   * An array of of Monitor IDs that can be safely deleted.
   *
   * @return ok
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Long> getOk() {
    return ok;
  }

  public void setOk(List<Long> ok) {
    this.ok = ok;
  }

  /** Return true if this CheckCanDeleteMonitorResponseData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckCanDeleteMonitorResponseData checkCanDeleteMonitorResponseData =
        (CheckCanDeleteMonitorResponseData) o;
    return Objects.equals(this.ok, checkCanDeleteMonitorResponseData.ok);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ok);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckCanDeleteMonitorResponseData {\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
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

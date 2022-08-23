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
   * <p>Paging attributes.</p>
 */
@JsonPropertyOrder({
  AuditLogsResponsePage.JSON_PROPERTY_AFTER
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AuditLogsResponsePage {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AFTER = "after";
  private String after;

  public AuditLogsResponsePage after(String after) {
    this.after = after;
    return this;
  }

  /**
   * <p>The cursor to use to get the next results, if any. To make the next request, use the same parameters with the addition of <code>page[cursor]</code>.</p>
   * @return after
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AFTER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAfter() {
        return after;
      }
  public void setAfter(String after) {
    this.after = after;
  }

  /**
   * Return true if this AuditLogsResponsePage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogsResponsePage auditLogsResponsePage = (AuditLogsResponsePage) o;
    return Objects.equals(this.after, auditLogsResponsePage.after);
  }


  @Override
  public int hashCode() {
    return Objects.hash(after);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogsResponsePage {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
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

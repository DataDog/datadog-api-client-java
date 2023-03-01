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
   * <p>The metadata associated with a request.</p>
 */
@JsonPropertyOrder({
  CIAppResponseMetadata.JSON_PROPERTY_ELAPSED,
  CIAppResponseMetadata.JSON_PROPERTY_REQUEST_ID,
  CIAppResponseMetadata.JSON_PROPERTY_STATUS,
  CIAppResponseMetadata.JSON_PROPERTY_WARNINGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppResponseMetadata {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ELAPSED = "elapsed";
  private Long elapsed;

  public static final String JSON_PROPERTY_REQUEST_ID = "request_id";
  private String requestId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private CIAppResponseStatus status;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<CIAppWarning> warnings = null;

  public CIAppResponseMetadata elapsed(Long elapsed) {
    this.elapsed = elapsed;
    return this;
  }

  /**
   * <p>The time elapsed in milliseconds.</p>
   * @return elapsed
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ELAPSED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getElapsed() {
        return elapsed;
      }
  public void setElapsed(Long elapsed) {
    this.elapsed = elapsed;
  }
  public CIAppResponseMetadata requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * <p>The identifier of the request.</p>
   * @return requestId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REQUEST_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRequestId() {
        return requestId;
      }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }
  public CIAppResponseMetadata status(CIAppResponseStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * <p>The status of the response.</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CIAppResponseStatus getStatus() {
        return status;
      }
  public void setStatus(CIAppResponseStatus status) {
    if (!status.isValid()) {
        this.unparsed = true;
    }
    this.status = status;
  }
  public CIAppResponseMetadata warnings(List<CIAppWarning> warnings) {
    this.warnings = warnings;
    for (CIAppWarning item : warnings) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public CIAppResponseMetadata addWarningsItem(CIAppWarning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    this.unparsed |= warningsItem.unparsed;
    return this;
  }

  /**
   * <p>A list of warnings (non-fatal errors) encountered. Partial results may return if
   * warnings are present in the response.</p>
   * @return warnings
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_WARNINGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<CIAppWarning> getWarnings() {
        return warnings;
      }
  public void setWarnings(List<CIAppWarning> warnings) {
    this.warnings = warnings;
  }

  /**
   * Return true if this CIAppResponseMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppResponseMetadata ciAppResponseMetadata = (CIAppResponseMetadata) o;
    return Objects.equals(this.elapsed, ciAppResponseMetadata.elapsed) && Objects.equals(this.requestId, ciAppResponseMetadata.requestId) && Objects.equals(this.status, ciAppResponseMetadata.status) && Objects.equals(this.warnings, ciAppResponseMetadata.warnings);
  }


  @Override
  public int hashCode() {
    return Objects.hash(elapsed,requestId,status,warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppResponseMetadata {\n");
    sb.append("    elapsed: ").append(toIndentedString(elapsed)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

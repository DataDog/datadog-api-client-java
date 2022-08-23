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
  AuditLogsResponseMetadata.JSON_PROPERTY_ELAPSED,
  AuditLogsResponseMetadata.JSON_PROPERTY_PAGE,
  AuditLogsResponseMetadata.JSON_PROPERTY_REQUEST_ID,
  AuditLogsResponseMetadata.JSON_PROPERTY_STATUS,
  AuditLogsResponseMetadata.JSON_PROPERTY_WARNINGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AuditLogsResponseMetadata {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ELAPSED = "elapsed";
  private Long elapsed;

  public static final String JSON_PROPERTY_PAGE = "page";
  private AuditLogsResponsePage page;

  public static final String JSON_PROPERTY_REQUEST_ID = "request_id";
  private String requestId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private AuditLogsResponseStatus status;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<AuditLogsWarning> warnings = null;

  public AuditLogsResponseMetadata elapsed(Long elapsed) {
    this.elapsed = elapsed;
    return this;
  }

  /**
   * <p>Time elapsed in milliseconds.</p>
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
  public AuditLogsResponseMetadata page(AuditLogsResponsePage page) {
    this.page = page;
    this.unparsed |= page.unparsed;
    return this;
  }

  /**
   * <p>Paging attributes.</p>
   * @return page
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AuditLogsResponsePage getPage() {
        return page;
      }
  public void setPage(AuditLogsResponsePage page) {
    this.page = page;
  }
  public AuditLogsResponseMetadata requestId(String requestId) {
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
  public AuditLogsResponseMetadata status(AuditLogsResponseStatus status) {
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
      public AuditLogsResponseStatus getStatus() {
        return status;
      }
  public void setStatus(AuditLogsResponseStatus status) {
    if (!status.isValid()) {
        this.unparsed = true;
    }
    this.status = status;
  }
  public AuditLogsResponseMetadata warnings(List<AuditLogsWarning> warnings) {
    this.warnings = warnings;
    for (AuditLogsWarning item : warnings) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public AuditLogsResponseMetadata addWarningsItem(AuditLogsWarning warningsItem) {
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
      public List<AuditLogsWarning> getWarnings() {
        return warnings;
      }
  public void setWarnings(List<AuditLogsWarning> warnings) {
    this.warnings = warnings;
  }

  /**
   * Return true if this AuditLogsResponseMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogsResponseMetadata auditLogsResponseMetadata = (AuditLogsResponseMetadata) o;
    return Objects.equals(this.elapsed, auditLogsResponseMetadata.elapsed) && Objects.equals(this.page, auditLogsResponseMetadata.page) && Objects.equals(this.requestId, auditLogsResponseMetadata.requestId) && Objects.equals(this.status, auditLogsResponseMetadata.status) && Objects.equals(this.warnings, auditLogsResponseMetadata.warnings);
  }


  @Override
  public int hashCode() {
    return Objects.hash(elapsed,page,requestId,status,warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogsResponseMetadata {\n");
    sb.append("    elapsed: ").append(toIndentedString(elapsed)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

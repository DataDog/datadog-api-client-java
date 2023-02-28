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
   * <p>Attributes for a process summary.</p>
 */
@JsonPropertyOrder({
  ProcessSummaryAttributes.JSON_PROPERTY_CMDLINE,
  ProcessSummaryAttributes.JSON_PROPERTY_HOST,
  ProcessSummaryAttributes.JSON_PROPERTY_PID,
  ProcessSummaryAttributes.JSON_PROPERTY_PPID,
  ProcessSummaryAttributes.JSON_PROPERTY_START,
  ProcessSummaryAttributes.JSON_PROPERTY_TAGS,
  ProcessSummaryAttributes.JSON_PROPERTY_TIMESTAMP,
  ProcessSummaryAttributes.JSON_PROPERTY_USER
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProcessSummaryAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CMDLINE = "cmdline";
  private String cmdline;

  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_PID = "pid";
  private Long pid;

  public static final String JSON_PROPERTY_PPID = "ppid";
  private Long ppid;

  public static final String JSON_PROPERTY_START = "start";
  private String start;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private String timestamp;

  public static final String JSON_PROPERTY_USER = "user";
  private String user;

  public ProcessSummaryAttributes cmdline(String cmdline) {
    this.cmdline = cmdline;
    return this;
  }

  /**
   * <p>Process command line.</p>
   * @return cmdline
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CMDLINE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCmdline() {
        return cmdline;
      }
  public void setCmdline(String cmdline) {
    this.cmdline = cmdline;
  }
  public ProcessSummaryAttributes host(String host) {
    this.host = host;
    return this;
  }

  /**
   * <p>Host running the process.</p>
   * @return host
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HOST)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHost() {
        return host;
      }
  public void setHost(String host) {
    this.host = host;
  }
  public ProcessSummaryAttributes pid(Long pid) {
    this.pid = pid;
    return this;
  }

  /**
   * <p>Process ID.</p>
   * @return pid
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getPid() {
        return pid;
      }
  public void setPid(Long pid) {
    this.pid = pid;
  }
  public ProcessSummaryAttributes ppid(Long ppid) {
    this.ppid = ppid;
    return this;
  }

  /**
   * <p>Parent process ID.</p>
   * @return ppid
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PPID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getPpid() {
        return ppid;
      }
  public void setPpid(Long ppid) {
    this.ppid = ppid;
  }
  public ProcessSummaryAttributes start(String start) {
    this.start = start;
    return this;
  }

  /**
   * <p>Time the process was started.</p>
   * @return start
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_START)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getStart() {
        return start;
      }
  public void setStart(String start) {
    this.start = start;
  }
  public ProcessSummaryAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public ProcessSummaryAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>List of tags associated with the process.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  public ProcessSummaryAttributes timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * <p>Time the process was seen.</p>
   * @return timestamp
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMESTAMP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTimestamp() {
        return timestamp;
      }
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }
  public ProcessSummaryAttributes user(String user) {
    this.user = user;
    return this;
  }

  /**
   * <p>Process owner.</p>
   * @return user
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_USER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUser() {
        return user;
      }
  public void setUser(String user) {
    this.user = user;
  }

  /**
   * Return true if this ProcessSummaryAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessSummaryAttributes processSummaryAttributes = (ProcessSummaryAttributes) o;
    return Objects.equals(this.cmdline, processSummaryAttributes.cmdline) && Objects.equals(this.host, processSummaryAttributes.host) && Objects.equals(this.pid, processSummaryAttributes.pid) && Objects.equals(this.ppid, processSummaryAttributes.ppid) && Objects.equals(this.start, processSummaryAttributes.start) && Objects.equals(this.tags, processSummaryAttributes.tags) && Objects.equals(this.timestamp, processSummaryAttributes.timestamp) && Objects.equals(this.user, processSummaryAttributes.user);
  }


  @Override
  public int hashCode() {
    return Objects.hash(cmdline,host,pid,ppid,start,tags,timestamp,user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessSummaryAttributes {\n");
    sb.append("    cmdline: ").append(toIndentedString(cmdline)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    ppid: ").append(toIndentedString(ppid)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

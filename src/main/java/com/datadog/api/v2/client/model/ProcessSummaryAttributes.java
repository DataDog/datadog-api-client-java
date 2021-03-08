/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v2.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;


/**
 * Attributes for a process summary.
 */
@ApiModel(description = "Attributes for a process summary.")
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProcessSummaryAttributes {
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
   * Process command line.
   * @return cmdline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Process command line.")
  @JsonProperty(JSON_PROPERTY_CMDLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
   * Host running the process.
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Host running the process.")
  @JsonProperty(JSON_PROPERTY_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
   * Process ID.
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Process ID.")
  @JsonProperty(JSON_PROPERTY_PID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
   * Parent process ID.
   * @return ppid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parent process ID.")
  @JsonProperty(JSON_PROPERTY_PPID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
   * Time the process was started.
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time the process was started.")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
   * List of tags associated with the process.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of tags associated with the process.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
   * Time the process was seen.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time the process was seen.")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
   * Process owner.
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Process owner.")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
    return Objects.equals(this.cmdline, processSummaryAttributes.cmdline) &&
        Objects.equals(this.host, processSummaryAttributes.host) &&
        Objects.equals(this.pid, processSummaryAttributes.pid) &&
        Objects.equals(this.ppid, processSummaryAttributes.ppid) &&
        Objects.equals(this.start, processSummaryAttributes.start) &&
        Objects.equals(this.tags, processSummaryAttributes.tags) &&
        Objects.equals(this.timestamp, processSummaryAttributes.timestamp) &&
        Objects.equals(this.user, processSummaryAttributes.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cmdline, host, pid, ppid, start, tags, timestamp, user);
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


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
import java.util.UUID;
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

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>The type of action to apply in a bulk update. Allowed values are <code>priority</code>, <code>status</code>, <code>assign</code>, <code>unassign</code>, <code>archive</code>, <code>unarchive</code>, <code>jira</code>, <code>servicenow</code>, <code>linear</code>, <code>update_project</code>.</p>
 */
@JsonSerialize(using = CaseBulkActionType.CaseBulkActionTypeSerializer.class)
public class CaseBulkActionType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("priority", "status", "assign", "unassign", "archive", "unarchive", "jira", "servicenow", "linear", "update_project"));

  public static final CaseBulkActionType PRIORITY = new CaseBulkActionType("priority");
  public static final CaseBulkActionType STATUS = new CaseBulkActionType("status");
  public static final CaseBulkActionType ASSIGN = new CaseBulkActionType("assign");
  public static final CaseBulkActionType UNASSIGN = new CaseBulkActionType("unassign");
  public static final CaseBulkActionType ARCHIVE = new CaseBulkActionType("archive");
  public static final CaseBulkActionType UNARCHIVE = new CaseBulkActionType("unarchive");
  public static final CaseBulkActionType JIRA = new CaseBulkActionType("jira");
  public static final CaseBulkActionType SERVICENOW = new CaseBulkActionType("servicenow");
  public static final CaseBulkActionType LINEAR = new CaseBulkActionType("linear");
  public static final CaseBulkActionType UPDATE_PROJECT = new CaseBulkActionType("update_project");


  CaseBulkActionType(String value) {
    super(value, allowedValues);
  }

  public static class CaseBulkActionTypeSerializer extends StdSerializer<CaseBulkActionType> {
      public CaseBulkActionTypeSerializer(Class<CaseBulkActionType> t) {
          super(t);
      }

      public CaseBulkActionTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(CaseBulkActionType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static CaseBulkActionType fromValue(String value) {
    return new CaseBulkActionType(value);
  }
}

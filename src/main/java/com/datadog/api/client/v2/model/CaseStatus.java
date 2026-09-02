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
   * <p>Deprecated way of representing the case status, which only supports OPEN, IN_PROGRESS, and CLOSED statuses. Use <code>status_name</code> instead.</p>
 */
@JsonSerialize(using = CaseStatus.CaseStatusSerializer.class)
public class CaseStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("OPEN", "IN_PROGRESS", "CLOSED"));

  public static final CaseStatus OPEN = new CaseStatus("OPEN");
  public static final CaseStatus IN_PROGRESS = new CaseStatus("IN_PROGRESS");
  public static final CaseStatus CLOSED = new CaseStatus("CLOSED");


  CaseStatus(String value) {
    super(value, allowedValues);
  }

  public static class CaseStatusSerializer extends StdSerializer<CaseStatus> {
      public CaseStatusSerializer(Class<CaseStatus> t) {
          super(t);
      }

      public CaseStatusSerializer() {
          this(null);
      }

      @Override
      public void serialize(CaseStatus value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static CaseStatus fromValue(String value) {
    return new CaseStatus(value);
  }
}

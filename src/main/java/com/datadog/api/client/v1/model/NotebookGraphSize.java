/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>The size of the graph.</p>
 */
@JsonSerialize(using = NotebookGraphSize.NotebookGraphSizeSerializer.class)
public class NotebookGraphSize extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("xs", "s", "m", "l", "xl"));

  public static final NotebookGraphSize EXTRA_SMALL = new NotebookGraphSize("xs");
  public static final NotebookGraphSize SMALL = new NotebookGraphSize("s");
  public static final NotebookGraphSize MEDIUM = new NotebookGraphSize("m");
  public static final NotebookGraphSize LARGE = new NotebookGraphSize("l");
  public static final NotebookGraphSize EXTRA_LARGE = new NotebookGraphSize("xl");


  NotebookGraphSize(String value) {
    super(value, allowedValues);
  }

  public static class NotebookGraphSizeSerializer extends StdSerializer<NotebookGraphSize> {
      public NotebookGraphSizeSerializer(Class<NotebookGraphSize> t) {
          super(t);
      }

      public NotebookGraphSizeSerializer() {
          this(null);
      }

      @Override
      public void serialize(NotebookGraphSize value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static NotebookGraphSize fromValue(String value) {
    return new NotebookGraphSize(value);
  }
}

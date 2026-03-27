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
   * <p>The interval used when querying data, which defines the size of a time slice.
   * Two values are allowed: 60 (1 minute) and 300 (5 minutes).
   * If not provided, the value defaults to 300 (5 minutes).</p>
 */
@JsonSerialize(using = SLOTimeSliceInterval.SLOTimeSliceIntervalSerializer.class)
public class SLOTimeSliceInterval extends ModelEnum<Integer> {

  private static final Set<Integer> allowedValues = new HashSet<Integer>(Arrays.asList(60, 300));

  public static final SLOTimeSliceInterval ONE_MINUTE = new SLOTimeSliceInterval(60);
  public static final SLOTimeSliceInterval FIVE_MINUTES = new SLOTimeSliceInterval(300);


  SLOTimeSliceInterval(Integer value) {
    super(value, allowedValues);
  }

  public static class SLOTimeSliceIntervalSerializer extends StdSerializer<SLOTimeSliceInterval> {
      public SLOTimeSliceIntervalSerializer(Class<SLOTimeSliceInterval> t) {
          super(t);
      }

      public SLOTimeSliceIntervalSerializer() {
          this(null);
      }

      @Override
      public void serialize(SLOTimeSliceInterval value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SLOTimeSliceInterval fromValue(Integer value) {
    return new SLOTimeSliceInterval(value);
  }
}

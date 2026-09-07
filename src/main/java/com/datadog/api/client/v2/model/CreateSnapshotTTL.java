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
   * <p>The time-to-live for the snapshot. This value corresponds to storage lifecycle policies that automatically delete the snapshot after the specified period.</p>
 */
@JsonSerialize(using = CreateSnapshotTTL.CreateSnapshotTTLSerializer.class)
public class CreateSnapshotTTL extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("30d", "60d", "90d", "1y", "2y", "inf"));

  public static final CreateSnapshotTTL THIRTY_DAYS = new CreateSnapshotTTL("30d");
  public static final CreateSnapshotTTL SIXTY_DAYS = new CreateSnapshotTTL("60d");
  public static final CreateSnapshotTTL NINETY_DAYS = new CreateSnapshotTTL("90d");
  public static final CreateSnapshotTTL ONE_YEAR = new CreateSnapshotTTL("1y");
  public static final CreateSnapshotTTL TWO_YEARS = new CreateSnapshotTTL("2y");
  public static final CreateSnapshotTTL INFINITE = new CreateSnapshotTTL("inf");


  CreateSnapshotTTL(String value) {
    super(value, allowedValues);
  }

  public static class CreateSnapshotTTLSerializer extends StdSerializer<CreateSnapshotTTL> {
      public CreateSnapshotTTLSerializer(Class<CreateSnapshotTTL> t) {
          super(t);
      }

      public CreateSnapshotTTLSerializer() {
          this(null);
      }

      @Override
      public void serialize(CreateSnapshotTTL value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static CreateSnapshotTTL fromValue(String value) {
    return new CreateSnapshotTTL(value);
  }
}

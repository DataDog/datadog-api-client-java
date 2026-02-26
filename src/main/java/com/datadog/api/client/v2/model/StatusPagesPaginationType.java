/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** */
@JsonSerialize(using = StatusPagesPaginationType.StatusPagesPaginationTypeSerializer.class)
public class StatusPagesPaginationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("offset_limit"));

  public static final StatusPagesPaginationType OFFSET_LIMIT =
      new StatusPagesPaginationType("offset_limit");

  StatusPagesPaginationType(String value) {
    super(value, allowedValues);
  }

  public static class StatusPagesPaginationTypeSerializer
      extends StdSerializer<StatusPagesPaginationType> {
    public StatusPagesPaginationTypeSerializer(Class<StatusPagesPaginationType> t) {
      super(t);
    }

    public StatusPagesPaginationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        StatusPagesPaginationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static StatusPagesPaginationType fromValue(String value) {
    return new StatusPagesPaginationType(value);
  }
}

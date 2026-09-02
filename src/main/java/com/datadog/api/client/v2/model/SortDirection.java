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

/** The direction to sort by. */
@JsonSerialize(using = SortDirection.SortDirectionSerializer.class)
public class SortDirection extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("desc", "asc"));

  public static final SortDirection DESC = new SortDirection("desc");
  public static final SortDirection ASC = new SortDirection("asc");

  SortDirection(String value) {
    super(value, allowedValues);
  }

  public static class SortDirectionSerializer extends StdSerializer<SortDirection> {
    public SortDirectionSerializer(Class<SortDirection> t) {
      super(t);
    }

    public SortDirectionSerializer() {
      this(null);
    }

    @Override
    public void serialize(SortDirection value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SortDirection fromValue(String value) {
    return new SortDirection(value);
  }
}

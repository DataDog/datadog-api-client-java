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

/** JSON:API resource type. */
@JsonSerialize(using = RumArchiveConfigType.RumArchiveConfigTypeSerializer.class)
public class RumArchiveConfigType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("rum_archive_config"));

  public static final RumArchiveConfigType RUM_ARCHIVE_CONFIG =
      new RumArchiveConfigType("rum_archive_config");

  RumArchiveConfigType(String value) {
    super(value, allowedValues);
  }

  public static class RumArchiveConfigTypeSerializer extends StdSerializer<RumArchiveConfigType> {
    public RumArchiveConfigTypeSerializer(Class<RumArchiveConfigType> t) {
      super(t);
    }

    public RumArchiveConfigTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumArchiveConfigType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumArchiveConfigType fromValue(String value) {
    return new RumArchiveConfigType(value);
  }
}

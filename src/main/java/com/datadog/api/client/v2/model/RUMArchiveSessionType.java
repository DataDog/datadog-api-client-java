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
@JsonSerialize(using = RUMArchiveSessionType.RUMArchiveSessionTypeSerializer.class)
public class RUMArchiveSessionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("rum_archive_session"));

  public static final RUMArchiveSessionType RUM_ARCHIVE_SESSION =
      new RUMArchiveSessionType("rum_archive_session");

  RUMArchiveSessionType(String value) {
    super(value, allowedValues);
  }

  public static class RUMArchiveSessionTypeSerializer extends StdSerializer<RUMArchiveSessionType> {
    public RUMArchiveSessionTypeSerializer(Class<RUMArchiveSessionType> t) {
      super(t);
    }

    public RUMArchiveSessionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMArchiveSessionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMArchiveSessionType fromValue(String value) {
    return new RUMArchiveSessionType(value);
  }
}

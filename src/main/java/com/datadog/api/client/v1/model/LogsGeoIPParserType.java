/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Type of GeoIP parser. */
@JsonSerialize(using = LogsGeoIPParserType.LogsGeoIPParserTypeSerializer.class)
public class LogsGeoIPParserType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("geo-ip-parser"));

  public static final LogsGeoIPParserType GEO_IP_PARSER = new LogsGeoIPParserType("geo-ip-parser");

  LogsGeoIPParserType(String value) {
    super(value, allowedValues);
  }

  public static class LogsGeoIPParserTypeSerializer extends StdSerializer<LogsGeoIPParserType> {
    public LogsGeoIPParserTypeSerializer(Class<LogsGeoIPParserType> t) {
      super(t);
    }

    public LogsGeoIPParserTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsGeoIPParserType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsGeoIPParserType fromValue(String value) {
    return new LogsGeoIPParserType(value);
  }
}

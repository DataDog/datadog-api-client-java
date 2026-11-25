/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(using = WildcardSpecificationType.WildcardSpecificationTypeSerializer.class)
public class WildcardSpecificationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("vega", "vega-lite"));

  public static final WildcardSpecificationType VEGA = new WildcardSpecificationType("vega");
  public static final WildcardSpecificationType VEGA_LITE =
      new WildcardSpecificationType("vega-lite");

  WildcardSpecificationType(String value) {
    super(value, allowedValues);
  }

  public static class WildcardSpecificationTypeSerializer
      extends StdSerializer<WildcardSpecificationType> {
    public WildcardSpecificationTypeSerializer(Class<WildcardSpecificationType> t) {
      super(t);
    }

    public WildcardSpecificationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        WildcardSpecificationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WildcardSpecificationType fromValue(String value) {
    return new WildcardSpecificationType(value);
  }
}

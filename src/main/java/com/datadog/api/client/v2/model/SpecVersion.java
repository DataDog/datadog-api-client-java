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

/** The version of the CycloneDX specification a BOM conforms to. */
@JsonSerialize(using = SpecVersion.SpecVersionSerializer.class)
public class SpecVersion extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("1.0", "1.1", "1.2", "1.3", "1.4", "1.5"));

  public static final SpecVersion ONE_ZERO = new SpecVersion("1.0");
  public static final SpecVersion ONE_ONE = new SpecVersion("1.1");
  public static final SpecVersion ONE_TWO = new SpecVersion("1.2");
  public static final SpecVersion ONE_THREE = new SpecVersion("1.3");
  public static final SpecVersion ONE_FOUR = new SpecVersion("1.4");
  public static final SpecVersion ONE_FIVE = new SpecVersion("1.5");

  SpecVersion(String value) {
    super(value, allowedValues);
  }

  public static class SpecVersionSerializer extends StdSerializer<SpecVersion> {
    public SpecVersionSerializer(Class<SpecVersion> t) {
      super(t);
    }

    public SpecVersionSerializer() {
      this(null);
    }

    @Override
    public void serialize(SpecVersion value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SpecVersion fromValue(String value) {
    return new SpecVersion(value);
  }
}

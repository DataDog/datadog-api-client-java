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

/** The operation to perform */
@JsonSerialize(
    using = SyntheticsPatchTestOperationName.SyntheticsPatchTestOperationNameSerializer.class)
public class SyntheticsPatchTestOperationName extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("add", "remove", "replace", "move", "copy", "test"));

  public static final SyntheticsPatchTestOperationName ADD =
      new SyntheticsPatchTestOperationName("add");
  public static final SyntheticsPatchTestOperationName REMOVE =
      new SyntheticsPatchTestOperationName("remove");
  public static final SyntheticsPatchTestOperationName REPLACE =
      new SyntheticsPatchTestOperationName("replace");
  public static final SyntheticsPatchTestOperationName MOVE =
      new SyntheticsPatchTestOperationName("move");
  public static final SyntheticsPatchTestOperationName COPY =
      new SyntheticsPatchTestOperationName("copy");
  public static final SyntheticsPatchTestOperationName TEST =
      new SyntheticsPatchTestOperationName("test");

  SyntheticsPatchTestOperationName(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsPatchTestOperationNameSerializer
      extends StdSerializer<SyntheticsPatchTestOperationName> {
    public SyntheticsPatchTestOperationNameSerializer(Class<SyntheticsPatchTestOperationName> t) {
      super(t);
    }

    public SyntheticsPatchTestOperationNameSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsPatchTestOperationName value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsPatchTestOperationName fromValue(String value) {
    return new SyntheticsPatchTestOperationName(value);
  }
}

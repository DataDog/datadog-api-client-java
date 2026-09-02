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

/** The column type. "group" for dimension columns, "number" for metric columns. */
@JsonSerialize(using = CommitmentsScalarColumnType.CommitmentsScalarColumnTypeSerializer.class)
public class CommitmentsScalarColumnType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("group", "number"));

  public static final CommitmentsScalarColumnType GROUP = new CommitmentsScalarColumnType("group");
  public static final CommitmentsScalarColumnType NUMBER =
      new CommitmentsScalarColumnType("number");

  CommitmentsScalarColumnType(String value) {
    super(value, allowedValues);
  }

  public static class CommitmentsScalarColumnTypeSerializer
      extends StdSerializer<CommitmentsScalarColumnType> {
    public CommitmentsScalarColumnTypeSerializer(Class<CommitmentsScalarColumnType> t) {
      super(t);
    }

    public CommitmentsScalarColumnTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CommitmentsScalarColumnType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CommitmentsScalarColumnType fromValue(String value) {
    return new CommitmentsScalarColumnType(value);
  }
}

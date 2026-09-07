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

/** The type of code edit to apply when fixing a violation. */
@JsonSerialize(using = AnalysisEditType.AnalysisEditTypeSerializer.class)
public class AnalysisEditType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ADD", "UPDATE", "REMOVE"));

  public static final AnalysisEditType ADD = new AnalysisEditType("ADD");
  public static final AnalysisEditType UPDATE = new AnalysisEditType("UPDATE");
  public static final AnalysisEditType REMOVE = new AnalysisEditType("REMOVE");

  AnalysisEditType(String value) {
    super(value, allowedValues);
  }

  public static class AnalysisEditTypeSerializer extends StdSerializer<AnalysisEditType> {
    public AnalysisEditTypeSerializer(Class<AnalysisEditType> t) {
      super(t);
    }

    public AnalysisEditTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(AnalysisEditType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AnalysisEditType fromValue(String value) {
    return new AnalysisEditType(value);
  }
}

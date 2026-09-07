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

/** The comparator used to compare the SLI value to the threshold. */
@JsonSerialize(using = SLOTimeSliceComparator.SLOTimeSliceComparatorSerializer.class)
public class SLOTimeSliceComparator extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList(">", ">=", "<", "<="));

  public static final SLOTimeSliceComparator GREATER = new SLOTimeSliceComparator(">");
  public static final SLOTimeSliceComparator GREATER_EQUAL = new SLOTimeSliceComparator(">=");
  public static final SLOTimeSliceComparator LESS = new SLOTimeSliceComparator("<");
  public static final SLOTimeSliceComparator LESS_EQUAL = new SLOTimeSliceComparator("<=");

  SLOTimeSliceComparator(String value) {
    super(value, allowedValues);
  }

  public static class SLOTimeSliceComparatorSerializer
      extends StdSerializer<SLOTimeSliceComparator> {
    public SLOTimeSliceComparatorSerializer(Class<SLOTimeSliceComparator> t) {
      super(t);
    }

    public SLOTimeSliceComparatorSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SLOTimeSliceComparator value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SLOTimeSliceComparator fromValue(String value) {
    return new SLOTimeSliceComparator(value);
  }
}

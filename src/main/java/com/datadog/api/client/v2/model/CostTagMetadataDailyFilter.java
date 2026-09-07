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

/**
 * Granularity for tag metadata results. <code>true</code> returns one row per day, <code>false
 * </code> (or omitted) returns the monthly roll-up.
 */
@JsonSerialize(using = CostTagMetadataDailyFilter.CostTagMetadataDailyFilterSerializer.class)
public class CostTagMetadataDailyFilter extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("true", "false"));

  public static final CostTagMetadataDailyFilter TRUE = new CostTagMetadataDailyFilter("true");
  public static final CostTagMetadataDailyFilter FALSE = new CostTagMetadataDailyFilter("false");

  CostTagMetadataDailyFilter(String value) {
    super(value, allowedValues);
  }

  public static class CostTagMetadataDailyFilterSerializer
      extends StdSerializer<CostTagMetadataDailyFilter> {
    public CostTagMetadataDailyFilterSerializer(Class<CostTagMetadataDailyFilter> t) {
      super(t);
    }

    public CostTagMetadataDailyFilterSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CostTagMetadataDailyFilter value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CostTagMetadataDailyFilter fromValue(String value) {
    return new CostTagMetadataDailyFilter(value);
  }
}

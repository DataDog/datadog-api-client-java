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

/** The level of detail for the request. */
@JsonSerialize(using = ApmStatsQueryRowType.ApmStatsQueryRowTypeSerializer.class)
public class ApmStatsQueryRowType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("service", "resource", "span"));

  public static final ApmStatsQueryRowType SERVICE = new ApmStatsQueryRowType("service");
  public static final ApmStatsQueryRowType RESOURCE = new ApmStatsQueryRowType("resource");
  public static final ApmStatsQueryRowType SPAN = new ApmStatsQueryRowType("span");

  ApmStatsQueryRowType(String value) {
    super(value, allowedValues);
  }

  public static class ApmStatsQueryRowTypeSerializer extends StdSerializer<ApmStatsQueryRowType> {
    public ApmStatsQueryRowTypeSerializer(Class<ApmStatsQueryRowType> t) {
      super(t);
    }

    public ApmStatsQueryRowTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ApmStatsQueryRowType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApmStatsQueryRowType fromValue(String value) {
    return new ApmStatsQueryRowType(value);
  }
}

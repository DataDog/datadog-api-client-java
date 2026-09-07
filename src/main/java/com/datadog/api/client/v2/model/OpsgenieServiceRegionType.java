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

/** The region for the Opsgenie service. */
@JsonSerialize(using = OpsgenieServiceRegionType.OpsgenieServiceRegionTypeSerializer.class)
public class OpsgenieServiceRegionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("us", "eu", "custom"));

  public static final OpsgenieServiceRegionType US = new OpsgenieServiceRegionType("us");
  public static final OpsgenieServiceRegionType EU = new OpsgenieServiceRegionType("eu");
  public static final OpsgenieServiceRegionType CUSTOM = new OpsgenieServiceRegionType("custom");

  OpsgenieServiceRegionType(String value) {
    super(value, allowedValues);
  }

  public static class OpsgenieServiceRegionTypeSerializer
      extends StdSerializer<OpsgenieServiceRegionType> {
    public OpsgenieServiceRegionTypeSerializer(Class<OpsgenieServiceRegionType> t) {
      super(t);
    }

    public OpsgenieServiceRegionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OpsgenieServiceRegionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OpsgenieServiceRegionType fromValue(String value) {
    return new OpsgenieServiceRegionType(value);
  }
}

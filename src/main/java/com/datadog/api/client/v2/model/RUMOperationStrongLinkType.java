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

/** The JSON:API type for RUM operation strong link resources. */
@JsonSerialize(using = RUMOperationStrongLinkType.RUMOperationStrongLinkTypeSerializer.class)
public class RUMOperationStrongLinkType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("strong_links"));

  public static final RUMOperationStrongLinkType STRONG_LINKS =
      new RUMOperationStrongLinkType("strong_links");

  RUMOperationStrongLinkType(String value) {
    super(value, allowedValues);
  }

  public static class RUMOperationStrongLinkTypeSerializer
      extends StdSerializer<RUMOperationStrongLinkType> {
    public RUMOperationStrongLinkTypeSerializer(Class<RUMOperationStrongLinkType> t) {
      super(t);
    }

    public RUMOperationStrongLinkTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMOperationStrongLinkType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMOperationStrongLinkType fromValue(String value) {
    return new RUMOperationStrongLinkType(value);
  }
}

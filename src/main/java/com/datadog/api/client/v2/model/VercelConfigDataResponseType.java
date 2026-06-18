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

/** Type identifier for a Vercel configuration resource. */
@JsonSerialize(using = VercelConfigDataResponseType.VercelConfigDataResponseTypeSerializer.class)
public class VercelConfigDataResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("vercelConfiguration"));

  public static final VercelConfigDataResponseType VERCEL_CONFIGURATION =
      new VercelConfigDataResponseType("vercelConfiguration");

  VercelConfigDataResponseType(String value) {
    super(value, allowedValues);
  }

  public static class VercelConfigDataResponseTypeSerializer
      extends StdSerializer<VercelConfigDataResponseType> {
    public VercelConfigDataResponseTypeSerializer(Class<VercelConfigDataResponseType> t) {
      super(t);
    }

    public VercelConfigDataResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        VercelConfigDataResponseType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static VercelConfigDataResponseType fromValue(String value) {
    return new VercelConfigDataResponseType(value);
  }
}

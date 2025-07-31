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

/** The definition of the <code>OktaAPIToken</code> object. */
@JsonSerialize(using = OktaAPITokenType.OktaAPITokenTypeSerializer.class)
public class OktaAPITokenType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("OktaAPIToken"));

  public static final OktaAPITokenType OKTAAPITOKEN = new OktaAPITokenType("OktaAPIToken");

  OktaAPITokenType(String value) {
    super(value, allowedValues);
  }

  public static class OktaAPITokenTypeSerializer extends StdSerializer<OktaAPITokenType> {
    public OktaAPITokenTypeSerializer(Class<OktaAPITokenType> t) {
      super(t);
    }

    public OktaAPITokenTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(OktaAPITokenType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OktaAPITokenType fromValue(String value) {
    return new OktaAPITokenType(value);
  }
}

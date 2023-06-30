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

/**
 * The subtype of the Synthetic multistep API test step, currently only supporting <code>http</code>
 * .
 */
@JsonSerialize(using = SyntheticsAPIStepSubtype.SyntheticsAPIStepSubtypeSerializer.class)
public class SyntheticsAPIStepSubtype extends ModelEnum<String> {

  public static final SyntheticsAPIStepSubtype HTTP = new SyntheticsAPIStepSubtype("http");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("http"));

  SyntheticsAPIStepSubtype(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class SyntheticsAPIStepSubtypeSerializer
      extends StdSerializer<SyntheticsAPIStepSubtype> {
    public SyntheticsAPIStepSubtypeSerializer(Class<SyntheticsAPIStepSubtype> t) {
      super(t);
    }

    public SyntheticsAPIStepSubtypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsAPIStepSubtype value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsAPIStepSubtype fromValue(String value) {
    return new SyntheticsAPIStepSubtype(value);
  }
}

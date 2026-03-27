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

/** AWS CCM Config resource type. */
@JsonSerialize(using = AWSCcmConfigType.AWSCcmConfigTypeSerializer.class)
public class AWSCcmConfigType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("ccm_config"));

  public static final AWSCcmConfigType CCM_CONFIG = new AWSCcmConfigType("ccm_config");

  AWSCcmConfigType(String value) {
    super(value, allowedValues);
  }

  public static class AWSCcmConfigTypeSerializer extends StdSerializer<AWSCcmConfigType> {
    public AWSCcmConfigTypeSerializer(Class<AWSCcmConfigType> t) {
      super(t);
    }

    public AWSCcmConfigTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(AWSCcmConfigType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AWSCcmConfigType fromValue(String value) {
    return new AWSCcmConfigType(value);
  }
}

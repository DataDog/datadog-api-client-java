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

/** Type of the resource. */
@JsonSerialize(
    using =
        SamlConfigurationsUpdateRequestDataType.SamlConfigurationsUpdateRequestDataTypeSerializer
            .class)
public class SamlConfigurationsUpdateRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("saml_preferences"));

  public static final SamlConfigurationsUpdateRequestDataType SAML_PREFERENCES =
      new SamlConfigurationsUpdateRequestDataType("saml_preferences");

  SamlConfigurationsUpdateRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class SamlConfigurationsUpdateRequestDataTypeSerializer
      extends StdSerializer<SamlConfigurationsUpdateRequestDataType> {
    public SamlConfigurationsUpdateRequestDataTypeSerializer(
        Class<SamlConfigurationsUpdateRequestDataType> t) {
      super(t);
    }

    public SamlConfigurationsUpdateRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SamlConfigurationsUpdateRequestDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SamlConfigurationsUpdateRequestDataType fromValue(String value) {
    return new SamlConfigurationsUpdateRequestDataType(value);
  }
}

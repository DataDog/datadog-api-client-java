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

/** Type of the Google Security Operations destination. */
@JsonSerialize(
    using =
        CustomDestinationForwardDestinationGoogleSecurityOperationsType
            .CustomDestinationForwardDestinationGoogleSecurityOperationsTypeSerializer.class)
public class CustomDestinationForwardDestinationGoogleSecurityOperationsType
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("google_security_operations"));

  public static final CustomDestinationForwardDestinationGoogleSecurityOperationsType
      GOOGLE_SECURITY_OPERATIONS =
          new CustomDestinationForwardDestinationGoogleSecurityOperationsType(
              "google_security_operations");

  CustomDestinationForwardDestinationGoogleSecurityOperationsType(String value) {
    super(value, allowedValues);
  }

  public static class CustomDestinationForwardDestinationGoogleSecurityOperationsTypeSerializer
      extends StdSerializer<CustomDestinationForwardDestinationGoogleSecurityOperationsType> {
    public CustomDestinationForwardDestinationGoogleSecurityOperationsTypeSerializer(
        Class<CustomDestinationForwardDestinationGoogleSecurityOperationsType> t) {
      super(t);
    }

    public CustomDestinationForwardDestinationGoogleSecurityOperationsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CustomDestinationForwardDestinationGoogleSecurityOperationsType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CustomDestinationForwardDestinationGoogleSecurityOperationsType fromValue(
      String value) {
    return new CustomDestinationForwardDestinationGoogleSecurityOperationsType(value);
  }
}

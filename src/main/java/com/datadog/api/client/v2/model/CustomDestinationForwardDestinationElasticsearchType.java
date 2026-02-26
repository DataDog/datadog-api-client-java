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

/** Type of the Elasticsearch destination. */
@JsonSerialize(
    using =
        CustomDestinationForwardDestinationElasticsearchType
            .CustomDestinationForwardDestinationElasticsearchTypeSerializer.class)
public class CustomDestinationForwardDestinationElasticsearchType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("elasticsearch"));

  public static final CustomDestinationForwardDestinationElasticsearchType ELASTICSEARCH =
      new CustomDestinationForwardDestinationElasticsearchType("elasticsearch");

  CustomDestinationForwardDestinationElasticsearchType(String value) {
    super(value, allowedValues);
  }

  public static class CustomDestinationForwardDestinationElasticsearchTypeSerializer
      extends StdSerializer<CustomDestinationForwardDestinationElasticsearchType> {
    public CustomDestinationForwardDestinationElasticsearchTypeSerializer(
        Class<CustomDestinationForwardDestinationElasticsearchType> t) {
      super(t);
    }

    public CustomDestinationForwardDestinationElasticsearchTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CustomDestinationForwardDestinationElasticsearchType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CustomDestinationForwardDestinationElasticsearchType fromValue(String value) {
    return new CustomDestinationForwardDestinationElasticsearchType(value);
  }
}

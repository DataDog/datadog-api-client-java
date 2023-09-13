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

/** The Elasticsearch destination type. */
@JsonSerialize(using = ElasticsearchDestinationType.ElasticsearchDestinationTypeSerializer.class)
public class ElasticsearchDestinationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("elasticsearch"));

  public static final ElasticsearchDestinationType ELASTICSEARCH =
      new ElasticsearchDestinationType("elasticsearch");

  ElasticsearchDestinationType(String value) {
    super(value, allowedValues);
  }

  public static class ElasticsearchDestinationTypeSerializer
      extends StdSerializer<ElasticsearchDestinationType> {
    public ElasticsearchDestinationTypeSerializer(Class<ElasticsearchDestinationType> t) {
      super(t);
    }

    public ElasticsearchDestinationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ElasticsearchDestinationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ElasticsearchDestinationType fromValue(String value) {
    return new ElasticsearchDestinationType(value);
  }
}

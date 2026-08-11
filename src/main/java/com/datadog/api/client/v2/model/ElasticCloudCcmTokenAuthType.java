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

/** Authentication method discriminator. */
@JsonSerialize(using = ElasticCloudCcmTokenAuthType.ElasticCloudCcmTokenAuthTypeSerializer.class)
public class ElasticCloudCcmTokenAuthType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("bearer_token"));

  public static final ElasticCloudCcmTokenAuthType BEARER_TOKEN =
      new ElasticCloudCcmTokenAuthType("bearer_token");

  ElasticCloudCcmTokenAuthType(String value) {
    super(value, allowedValues);
  }

  public static class ElasticCloudCcmTokenAuthTypeSerializer
      extends StdSerializer<ElasticCloudCcmTokenAuthType> {
    public ElasticCloudCcmTokenAuthTypeSerializer(Class<ElasticCloudCcmTokenAuthType> t) {
      super(t);
    }

    public ElasticCloudCcmTokenAuthTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ElasticCloudCcmTokenAuthType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ElasticCloudCcmTokenAuthType fromValue(String value) {
    return new ElasticCloudCcmTokenAuthType(value);
  }
}

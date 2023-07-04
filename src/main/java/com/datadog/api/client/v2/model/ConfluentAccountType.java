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

/** The JSON:API type for this API. Should always be <code>confluent-cloud-accounts</code>. */
@JsonSerialize(using = ConfluentAccountType.ConfluentAccountTypeSerializer.class)
public class ConfluentAccountType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("confluent-cloud-accounts"));

  public static final ConfluentAccountType CONFLUENT_CLOUD_ACCOUNTS =
      new ConfluentAccountType("confluent-cloud-accounts");

  ConfluentAccountType(String value) {
    super(value, allowedValues);
  }

  public static class ConfluentAccountTypeSerializer extends StdSerializer<ConfluentAccountType> {
    public ConfluentAccountTypeSerializer(Class<ConfluentAccountType> t) {
      super(t);
    }

    public ConfluentAccountTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ConfluentAccountType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ConfluentAccountType fromValue(String value) {
    return new ConfluentAccountType(value);
  }
}

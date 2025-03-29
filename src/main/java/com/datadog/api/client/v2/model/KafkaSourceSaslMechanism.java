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

/** The definition of <code>KafkaSourceSaslMechanism</code> object. */
@JsonSerialize(using = KafkaSourceSaslMechanism.KafkaSourceSaslMechanismSerializer.class)
public class KafkaSourceSaslMechanism extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("PLAIN", "SCRAM-SHA-256", "SCRAM-SHA-512"));

  public static final KafkaSourceSaslMechanism PLAIN = new KafkaSourceSaslMechanism("PLAIN");
  public static final KafkaSourceSaslMechanism SCRAMNOT_SHANOT_256 =
      new KafkaSourceSaslMechanism("SCRAM-SHA-256");
  public static final KafkaSourceSaslMechanism SCRAMNOT_SHANOT_512 =
      new KafkaSourceSaslMechanism("SCRAM-SHA-512");

  KafkaSourceSaslMechanism(String value) {
    super(value, allowedValues);
  }

  public static class KafkaSourceSaslMechanismSerializer
      extends StdSerializer<KafkaSourceSaslMechanism> {
    public KafkaSourceSaslMechanismSerializer(Class<KafkaSourceSaslMechanism> t) {
      super(t);
    }

    public KafkaSourceSaslMechanismSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        KafkaSourceSaslMechanism value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static KafkaSourceSaslMechanism fromValue(String value) {
    return new KafkaSourceSaslMechanism(value);
  }
}

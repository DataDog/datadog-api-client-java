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

/**
 * The effect applied when an email address matches the policy. Deny policies take precedence over
 * allow policies.
 */
@JsonSerialize(using = AccessPolicyEffect.AccessPolicyEffectSerializer.class)
public class AccessPolicyEffect extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("allow", "deny"));

  public static final AccessPolicyEffect ALLOW = new AccessPolicyEffect("allow");
  public static final AccessPolicyEffect DENY = new AccessPolicyEffect("deny");

  AccessPolicyEffect(String value) {
    super(value, allowedValues);
  }

  public static class AccessPolicyEffectSerializer extends StdSerializer<AccessPolicyEffect> {
    public AccessPolicyEffectSerializer(Class<AccessPolicyEffect> t) {
      super(t);
    }

    public AccessPolicyEffectSerializer() {
      this(null);
    }

    @Override
    public void serialize(AccessPolicyEffect value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AccessPolicyEffect fromValue(String value) {
    return new AccessPolicyEffect(value);
  }
}

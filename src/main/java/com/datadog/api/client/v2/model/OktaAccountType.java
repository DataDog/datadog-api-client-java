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

/** Account type for an Okta account. */
@JsonSerialize(using = OktaAccountType.OktaAccountTypeSerializer.class)
public class OktaAccountType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("okta-accounts"));

  public static final OktaAccountType OKTA_ACCOUNTS = new OktaAccountType("okta-accounts");

  OktaAccountType(String value) {
    super(value, allowedValues);
  }

  public static class OktaAccountTypeSerializer extends StdSerializer<OktaAccountType> {
    public OktaAccountTypeSerializer(Class<OktaAccountType> t) {
      super(t);
    }

    public OktaAccountTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(OktaAccountType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OktaAccountType fromValue(String value) {
    return new OktaAccountType(value);
  }
}

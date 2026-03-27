/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>The SBOM component license type.</p>
 */
@JsonSerialize(using = SBOMComponentLicenseType.SBOMComponentLicenseTypeSerializer.class)
public class SBOMComponentLicenseType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("network_strong_copyleft", "non_standard_copyleft", "other_non_free", "other_non_standard", "permissive", "public_domain", "strong_copyleft", "weak_copyleft"));

  public static final SBOMComponentLicenseType NETWORK_STRONG_COPYLEFT = new SBOMComponentLicenseType("network_strong_copyleft");
  public static final SBOMComponentLicenseType NON_STANDARD_COPYLEFT = new SBOMComponentLicenseType("non_standard_copyleft");
  public static final SBOMComponentLicenseType OTHER_NON_FREE = new SBOMComponentLicenseType("other_non_free");
  public static final SBOMComponentLicenseType OTHER_NON_STANDARD = new SBOMComponentLicenseType("other_non_standard");
  public static final SBOMComponentLicenseType PERMISSIVE = new SBOMComponentLicenseType("permissive");
  public static final SBOMComponentLicenseType PUBLIC_DOMAIN = new SBOMComponentLicenseType("public_domain");
  public static final SBOMComponentLicenseType STRONG_COPYLEFT = new SBOMComponentLicenseType("strong_copyleft");
  public static final SBOMComponentLicenseType WEAK_COPYLEFT = new SBOMComponentLicenseType("weak_copyleft");


  SBOMComponentLicenseType(String value) {
    super(value, allowedValues);
  }

  public static class SBOMComponentLicenseTypeSerializer extends StdSerializer<SBOMComponentLicenseType> {
      public SBOMComponentLicenseTypeSerializer(Class<SBOMComponentLicenseType> t) {
          super(t);
      }

      public SBOMComponentLicenseTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(SBOMComponentLicenseType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SBOMComponentLicenseType fromValue(String value) {
    return new SBOMComponentLicenseType(value);
  }
}

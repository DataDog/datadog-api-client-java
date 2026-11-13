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
 * Type of the RUM application, that is the platform of the RUM SDK. Defaults to <code>browser
 * </code> on create.
 */
@JsonSerialize(using = RUMApplicationPlatformType.RUMApplicationPlatformTypeSerializer.class)
public class RUMApplicationPlatformType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "browser",
              "ios",
              "android",
              "react-native",
              "flutter",
              "roku",
              "electron",
              "unity",
              "kotlin-multiplatform",
              "react",
              "nextjs",
              "angular",
              "vuejs",
              "nuxt",
              "tanstack",
              "maui",
              "salesforce-lwc",
              "shopify",
              "cpp",
              "unreal"));

  public static final RUMApplicationPlatformType BROWSER =
      new RUMApplicationPlatformType("browser");
  public static final RUMApplicationPlatformType IOS = new RUMApplicationPlatformType("ios");
  public static final RUMApplicationPlatformType ANDROID =
      new RUMApplicationPlatformType("android");
  public static final RUMApplicationPlatformType REACT_NATIVE =
      new RUMApplicationPlatformType("react-native");
  public static final RUMApplicationPlatformType FLUTTER =
      new RUMApplicationPlatformType("flutter");
  public static final RUMApplicationPlatformType ROKU = new RUMApplicationPlatformType("roku");
  public static final RUMApplicationPlatformType ELECTRON =
      new RUMApplicationPlatformType("electron");
  public static final RUMApplicationPlatformType UNITY = new RUMApplicationPlatformType("unity");
  public static final RUMApplicationPlatformType KOTLIN_MULTIPLATFORM =
      new RUMApplicationPlatformType("kotlin-multiplatform");
  public static final RUMApplicationPlatformType REACT = new RUMApplicationPlatformType("react");
  public static final RUMApplicationPlatformType NEXTJS = new RUMApplicationPlatformType("nextjs");
  public static final RUMApplicationPlatformType ANGULAR =
      new RUMApplicationPlatformType("angular");
  public static final RUMApplicationPlatformType VUEJS = new RUMApplicationPlatformType("vuejs");
  public static final RUMApplicationPlatformType NUXT = new RUMApplicationPlatformType("nuxt");
  public static final RUMApplicationPlatformType TANSTACK =
      new RUMApplicationPlatformType("tanstack");
  public static final RUMApplicationPlatformType MAUI = new RUMApplicationPlatformType("maui");
  public static final RUMApplicationPlatformType SALESFORCE_LWC =
      new RUMApplicationPlatformType("salesforce-lwc");
  public static final RUMApplicationPlatformType SHOPIFY =
      new RUMApplicationPlatformType("shopify");
  public static final RUMApplicationPlatformType CPP = new RUMApplicationPlatformType("cpp");
  public static final RUMApplicationPlatformType UNREAL = new RUMApplicationPlatformType("unreal");

  RUMApplicationPlatformType(String value) {
    super(value, allowedValues);
  }

  public static class RUMApplicationPlatformTypeSerializer
      extends StdSerializer<RUMApplicationPlatformType> {
    public RUMApplicationPlatformTypeSerializer(Class<RUMApplicationPlatformType> t) {
      super(t);
    }

    public RUMApplicationPlatformTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMApplicationPlatformType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMApplicationPlatformType fromValue(String value) {
    return new RUMApplicationPlatformType(value);
  }
}

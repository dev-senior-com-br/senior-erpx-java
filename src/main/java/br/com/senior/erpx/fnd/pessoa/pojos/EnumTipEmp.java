/*
 * Pessoa
 * Serviço de Gestão de Pessoas do ERPX
 *
 * OpenAPI spec version: 1.10.6
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.erpx.fnd.pessoa.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets enumTipEmp
 */
@JsonAdapter(EnumTipEmp.Adapter.class)
public enum EnumTipEmp {
  
  V1("V1"),
  
  V2("V2"),
  
  V3("V3"),
  
  V4("V4"),
  
  V5("V5"),
  
  V6("V6"),
  
  V7("V7"),
  
  V8("V8"),
  
  V9("V9"),
  
  V10("V10"),
  
  V11("V11"),
  
  V12("V12"),
  
  V13("V13"),
  
  V14("V14"),
  
  V99("V99");

  private String value;

  EnumTipEmp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumTipEmp fromValue(String text) {
    for (EnumTipEmp b : EnumTipEmp.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EnumTipEmp> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumTipEmp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumTipEmp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumTipEmp.fromValue(String.valueOf(value));
    }
  }
}


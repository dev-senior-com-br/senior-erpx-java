/*
 * Pessoa
 * Serviço de Gestão de Pessoas do ERPX
 *
 *
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
 * Gets or Sets enumFpgCom
 */
@JsonAdapter(EnumFpgCom.Adapter.class)
public enum EnumFpgCom {
  
  VT("VT"),
  
  VC("VC"),
  
  VO("VO");

  private String value;

  EnumFpgCom(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumFpgCom fromValue(String text) {
    for (EnumFpgCom b : EnumFpgCom.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EnumFpgCom> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumFpgCom enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumFpgCom read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumFpgCom.fromValue(String.valueOf(value));
    }
  }
}


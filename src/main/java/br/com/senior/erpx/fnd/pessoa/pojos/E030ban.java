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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * E030ban
 */




public class E030ban {
  @SerializedName("nomBan")
  private String nomBan = null;

  @SerializedName("usualt")
  private String usualt = null;

  @SerializedName("excluido")
  private Boolean excluido = null;

  @SerializedName("dthger")
  private OffsetDateTime dthger = null;

  @SerializedName("dthalt")
  private OffsetDateTime dthalt = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("codBan")
  private String codBan = null;

  @SerializedName("usuger")
  private String usuger = null;

  public E030ban nomBan(String nomBan) {
    this.nomBan = nomBan;
    return this;
  }

   /**
   * Nome do banco
   * @return nomBan
  **/
  @ApiModelProperty(value = "Nome do banco")
  public String getNomBan() {
    return nomBan;
  }

  public void setNomBan(String nomBan) {
    this.nomBan = nomBan;
  }

  public E030ban usualt(String usualt) {
    this.usualt = usualt;
    return this;
  }

   /**
   * 
   * @return usualt
  **/
  @ApiModelProperty(value = "")
  public String getUsualt() {
    return usualt;
  }

  public void setUsualt(String usualt) {
    this.usualt = usualt;
  }

  public E030ban excluido(Boolean excluido) {
    this.excluido = excluido;
    return this;
  }

   /**
   * Indica se o registro foi excluido ?
   * @return excluido
  **/
  @ApiModelProperty(value = "Indica se o registro foi excluido ?")
  public Boolean isExcluido() {
    return excluido;
  }

  public void setExcluido(Boolean excluido) {
    this.excluido = excluido;
  }

  public E030ban dthger(OffsetDateTime dthger) {
    this.dthger = dthger;
    return this;
  }

   /**
   * 
   * @return dthger
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDthger() {
    return dthger;
  }

  public void setDthger(OffsetDateTime dthger) {
    this.dthger = dthger;
  }

  public E030ban dthalt(OffsetDateTime dthalt) {
    this.dthalt = dthalt;
    return this;
  }

   /**
   * 
   * @return dthalt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDthalt() {
    return dthalt;
  }

  public void setDthalt(OffsetDateTime dthalt) {
    this.dthalt = dthalt;
  }

  public E030ban id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public E030ban codBan(String codBan) {
    this.codBan = codBan;
    return this;
  }

   /**
   * Código
   * @return codBan
  **/
  @ApiModelProperty(value = "Código")
  public String getCodBan() {
    return codBan;
  }

  public void setCodBan(String codBan) {
    this.codBan = codBan;
  }

  public E030ban usuger(String usuger) {
    this.usuger = usuger;
    return this;
  }

   /**
   * 
   * @return usuger
  **/
  @ApiModelProperty(value = "")
  public String getUsuger() {
    return usuger;
  }

  public void setUsuger(String usuger) {
    this.usuger = usuger;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    E030ban e030ban = (E030ban) o;
    return Objects.equals(this.nomBan, e030ban.nomBan) &&
        Objects.equals(this.usualt, e030ban.usualt) &&
        Objects.equals(this.excluido, e030ban.excluido) &&
        Objects.equals(this.dthger, e030ban.dthger) &&
        Objects.equals(this.dthalt, e030ban.dthalt) &&
        Objects.equals(this.id, e030ban.id) &&
        Objects.equals(this.codBan, e030ban.codBan) &&
        Objects.equals(this.usuger, e030ban.usuger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomBan, usualt, excluido, dthger, dthalt, id, codBan, usuger);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class E030ban {\n");
    
    sb.append("    nomBan: ").append(toIndentedString(nomBan)).append("\n");
    sb.append("    usualt: ").append(toIndentedString(usualt)).append("\n");
    sb.append("    excluido: ").append(toIndentedString(excluido)).append("\n");
    sb.append("    dthger: ").append(toIndentedString(dthger)).append("\n");
    sb.append("    dthalt: ").append(toIndentedString(dthalt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    codBan: ").append(toIndentedString(codBan)).append("\n");
    sb.append("    usuger: ").append(toIndentedString(usuger)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


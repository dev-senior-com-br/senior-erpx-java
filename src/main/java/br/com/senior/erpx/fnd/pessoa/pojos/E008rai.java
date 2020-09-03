/*
 * Pessoa
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.11.0
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
import br.com.senior.erpx.fnd.pessoa.pojos.E007ufs;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * E008rai
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-03T13:41:01.573Z")



public class E008rai {
  @SerializedName("usualt")
  private String usualt = null;

  @SerializedName("excluido")
  private Boolean excluido = null;

  @SerializedName("codFis")
  private Integer codFis = null;

  @SerializedName("popCid")
  private Integer popCid = null;

  @SerializedName("locGeo")
  private String locGeo = null;

  @SerializedName("dthger")
  private OffsetDateTime dthger = null;

  @SerializedName("cepMax")
  private Integer cepMax = null;

  @SerializedName("dthalt")
  private OffsetDateTime dthalt = null;

  @SerializedName("codIbg")
  private Integer codIbg = null;

  @SerializedName("e007ufs")
  private E007ufs e007ufs = null;

  @SerializedName("usuger")
  private String usuger = null;

  @SerializedName("nomCid")
  private String nomCid = null;

  @SerializedName("potAlf")
  private Double potAlf = null;

  @SerializedName("cepMin")
  private Integer cepMin = null;

  @SerializedName("codRai")
  private Integer codRai = null;

  @SerializedName("id")
  private UUID id = null;

  public E008rai usualt(String usualt) {
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

  public E008rai excluido(Boolean excluido) {
    this.excluido = excluido;
    return this;
  }

   /**
   * Indica se o registro foi excluído
   * @return excluido
  **/
  @ApiModelProperty(value = "Indica se o registro foi excluído")
  public Boolean isExcluido() {
    return excluido;
  }

  public void setExcluido(Boolean excluido) {
    this.excluido = excluido;
  }

  public E008rai codFis(Integer codFis) {
    this.codFis = codFis;
    return this;
  }

   /**
   * Código fiscal município
   * @return codFis
  **/
  @ApiModelProperty(value = "Código fiscal município")
  public Integer getCodFis() {
    return codFis;
  }

  public void setCodFis(Integer codFis) {
    this.codFis = codFis;
  }

  public E008rai popCid(Integer popCid) {
    this.popCid = popCid;
    return this;
  }

   /**
   * População
   * @return popCid
  **/
  @ApiModelProperty(value = "População")
  public Integer getPopCid() {
    return popCid;
  }

  public void setPopCid(Integer popCid) {
    this.popCid = popCid;
  }

  public E008rai locGeo(String locGeo) {
    this.locGeo = locGeo;
    return this;
  }

   /**
   * Localização geográfica
   * @return locGeo
  **/
  @ApiModelProperty(value = "Localização geográfica")
  public String getLocGeo() {
    return locGeo;
  }

  public void setLocGeo(String locGeo) {
    this.locGeo = locGeo;
  }

  public E008rai dthger(OffsetDateTime dthger) {
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

  public E008rai cepMax(Integer cepMax) {
    this.cepMax = cepMax;
    return this;
  }

   /**
   * CEP final
   * @return cepMax
  **/
  @ApiModelProperty(value = "CEP final")
  public Integer getCepMax() {
    return cepMax;
  }

  public void setCepMax(Integer cepMax) {
    this.cepMax = cepMax;
  }

  public E008rai dthalt(OffsetDateTime dthalt) {
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

  public E008rai codIbg(Integer codIbg) {
    this.codIbg = codIbg;
    return this;
  }

   /**
   * Código IBGE município
   * @return codIbg
  **/
  @ApiModelProperty(value = "Código IBGE município")
  public Integer getCodIbg() {
    return codIbg;
  }

  public void setCodIbg(Integer codIbg) {
    this.codIbg = codIbg;
  }

  public E008rai e007ufs(E007ufs e007ufs) {
    this.e007ufs = e007ufs;
    return this;
  }

   /**
   * Get e007ufs
   * @return e007ufs
  **/
  @ApiModelProperty(value = "")
  public E007ufs getE007ufs() {
    return e007ufs;
  }

  public void setE007ufs(E007ufs e007ufs) {
    this.e007ufs = e007ufs;
  }

  public E008rai usuger(String usuger) {
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

  public E008rai nomCid(String nomCid) {
    this.nomCid = nomCid;
    return this;
  }

   /**
   * Nome cidade
   * @return nomCid
  **/
  @ApiModelProperty(value = "Nome cidade")
  public String getNomCid() {
    return nomCid;
  }

  public void setNomCid(String nomCid) {
    this.nomCid = nomCid;
  }

  public E008rai potAlf(Double potAlf) {
    this.potAlf = potAlf;
    return this;
  }

   /**
   * Potencial consumo
   * @return potAlf
  **/
  @ApiModelProperty(value = "Potencial consumo")
  public Double getPotAlf() {
    return potAlf;
  }

  public void setPotAlf(Double potAlf) {
    this.potAlf = potAlf;
  }

  public E008rai cepMin(Integer cepMin) {
    this.cepMin = cepMin;
    return this;
  }

   /**
   * CEP inicial
   * @return cepMin
  **/
  @ApiModelProperty(value = "CEP inicial")
  public Integer getCepMin() {
    return cepMin;
  }

  public void setCepMin(Integer cepMin) {
    this.cepMin = cepMin;
  }

  public E008rai codRai(Integer codRai) {
    this.codRai = codRai;
    return this;
  }

   /**
   * Código cidade
   * @return codRai
  **/
  @ApiModelProperty(value = "Código cidade")
  public Integer getCodRai() {
    return codRai;
  }

  public void setCodRai(Integer codRai) {
    this.codRai = codRai;
  }

  public E008rai id(UUID id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    E008rai e008rai = (E008rai) o;
    return Objects.equals(this.usualt, e008rai.usualt) &&
        Objects.equals(this.excluido, e008rai.excluido) &&
        Objects.equals(this.codFis, e008rai.codFis) &&
        Objects.equals(this.popCid, e008rai.popCid) &&
        Objects.equals(this.locGeo, e008rai.locGeo) &&
        Objects.equals(this.dthger, e008rai.dthger) &&
        Objects.equals(this.cepMax, e008rai.cepMax) &&
        Objects.equals(this.dthalt, e008rai.dthalt) &&
        Objects.equals(this.codIbg, e008rai.codIbg) &&
        Objects.equals(this.e007ufs, e008rai.e007ufs) &&
        Objects.equals(this.usuger, e008rai.usuger) &&
        Objects.equals(this.nomCid, e008rai.nomCid) &&
        Objects.equals(this.potAlf, e008rai.potAlf) &&
        Objects.equals(this.cepMin, e008rai.cepMin) &&
        Objects.equals(this.codRai, e008rai.codRai) &&
        Objects.equals(this.id, e008rai.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usualt, excluido, codFis, popCid, locGeo, dthger, cepMax, dthalt, codIbg, e007ufs, usuger, nomCid, potAlf, cepMin, codRai, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class E008rai {\n");
    
    sb.append("    usualt: ").append(toIndentedString(usualt)).append("\n");
    sb.append("    excluido: ").append(toIndentedString(excluido)).append("\n");
    sb.append("    codFis: ").append(toIndentedString(codFis)).append("\n");
    sb.append("    popCid: ").append(toIndentedString(popCid)).append("\n");
    sb.append("    locGeo: ").append(toIndentedString(locGeo)).append("\n");
    sb.append("    dthger: ").append(toIndentedString(dthger)).append("\n");
    sb.append("    cepMax: ").append(toIndentedString(cepMax)).append("\n");
    sb.append("    dthalt: ").append(toIndentedString(dthalt)).append("\n");
    sb.append("    codIbg: ").append(toIndentedString(codIbg)).append("\n");
    sb.append("    e007ufs: ").append(toIndentedString(e007ufs)).append("\n");
    sb.append("    usuger: ").append(toIndentedString(usuger)).append("\n");
    sb.append("    nomCid: ").append(toIndentedString(nomCid)).append("\n");
    sb.append("    potAlf: ").append(toIndentedString(potAlf)).append("\n");
    sb.append("    cepMin: ").append(toIndentedString(cepMin)).append("\n");
    sb.append("    codRai: ").append(toIndentedString(codRai)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


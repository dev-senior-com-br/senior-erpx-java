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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import br.com.senior.erpx.fnd.pessoa.pojos.E001end;
import br.com.senior.erpx.fnd.pessoa.pojos.E001ine;
import br.com.senior.erpx.fnd.pessoa.pojos.E006pai;
import br.com.senior.erpx.fnd.pessoa.pojos.E007ufs;
import br.com.senior.erpx.fnd.pessoa.pojos.E008cep;
import br.com.senior.erpx.fnd.pessoa.pojos.E008rai;
import br.com.senior.erpx.fnd.pessoa.pojos.E026ram;
import br.com.senior.erpx.fnd.pessoa.pojos.E069gre;
import br.com.senior.erpx.fnd.pessoa.pojos.E073pes;
import br.com.senior.erpx.fnd.pessoa.pojos.E077pes;
import br.com.senior.erpx.fnd.pessoa.pojos.E085pes;
import br.com.senior.erpx.fnd.pessoa.pojos.E090pes;
import br.com.senior.erpx.fnd.pessoa.pojos.E095cbo;
import br.com.senior.erpx.fnd.pessoa.pojos.E095pes;
import br.com.senior.erpx.fnd.pessoa.pojos.EnumIndNif;
import br.com.senior.erpx.fnd.pessoa.pojos.EnumJurFis;
import br.com.senior.erpx.fnd.pessoa.pojos.EnumSitReg;
import br.com.senior.erpx.fnd.pessoa.pojos.EnumTipEmp;
import br.com.senior.erpx.fnd.pessoa.pojos.EnumTipMer;
import br.com.senior.erpx.fnd.pessoa.pojos.EnumZonFra;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * E001pes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-25T10:49:01.055Z")



public class E001pes {
  @SerializedName("usualt")
  private String usualt = null;

  @SerializedName("zonFra")
  private EnumZonFra zonFra = null;

  @SerializedName("fonPe2")
  private String fonPe2 = null;

  @SerializedName("datRge")
  private LocalDate datRge = null;

  @SerializedName("insMun")
  private String insMun = null;

  @SerializedName("e095pes")
  private E095pes e095pes = null;

  @SerializedName("codCae")
  private String codCae = null;

  @SerializedName("codSuf")
  private String codSuf = null;

  @SerializedName("e085pes")
  private E085pes e085pes = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("datSuf")
  private LocalDate datSuf = null;

  @SerializedName("numIdf")
  private String numIdf = null;

  @SerializedName("nomBai")
  private String nomBai = null;

  @SerializedName("cxaPst")
  private Integer cxaPst = null;

  @SerializedName("excluido")
  private Boolean excluido = null;

  @SerializedName("qtdAtu")
  private Integer qtdAtu = null;

  @SerializedName("orgRge")
  private String orgRge = null;

  @SerializedName("numEnd")
  private String numEnd = null;

  @SerializedName("numRge")
  private String numRge = null;

  @SerializedName("emaNfe")
  private String emaNfe = null;

  @SerializedName("e095cbo")
  private E095cbo e095cbo = null;

  @SerializedName("nomPes")
  private String nomPes = null;

  @SerializedName("datNas")
  private LocalDate datNas = null;

  @SerializedName("e006pai")
  private E006pai e006pai = null;

  @SerializedName("codPes")
  private Integer codPes = null;

  @SerializedName("zipCod")
  private String zipCod = null;

  @SerializedName("tipEmp")
  private EnumTipEmp tipEmp = null;

  @SerializedName("fonPes")
  private String fonPes = null;

  @SerializedName("dthger")
  private OffsetDateTime dthger = null;

  @SerializedName("cnpCpf")
  private String cnpCpf = null;

  @SerializedName("indNif")
  private EnumIndNif indNif = null;

  @SerializedName("e008cep")
  private E008cep e008cep = null;

  @SerializedName("insEst")
  private String insEst = null;

  @SerializedName("qtdDep")
  private Integer qtdDep = null;

  @SerializedName("e001ine")
  private List<E001ine> e001ine = null;

  @SerializedName("tipMer")
  private EnumTipMer tipMer = null;

  @SerializedName("endPes")
  private String endPes = null;

  @SerializedName("e001end")
  private List<E001end> e001end = null;

  @SerializedName("e026ram")
  private E026ram e026ram = null;

  @SerializedName("sitPes")
  private EnumSitReg sitPes = null;

  @SerializedName("faxPes")
  private String faxPes = null;

  @SerializedName("intNet")
  private String intNet = null;

  @SerializedName("datVct")
  private LocalDate datVct = null;

  @SerializedName("e090pes")
  private E090pes e090pes = null;

  @SerializedName("dthalt")
  private OffsetDateTime dthalt = null;

  @SerializedName("numNis")
  private String numNis = null;

  @SerializedName("e073pes")
  private E073pes e073pes = null;

  @SerializedName("e077pes")
  private E077pes e077pes = null;

  @SerializedName("e007ufs")
  private E007ufs e007ufs = null;

  @SerializedName("tipPes")
  private EnumJurFis tipPes = null;

  @SerializedName("usuger")
  private String usuger = null;

  @SerializedName("cplEnd")
  private String cplEnd = null;

  @SerializedName("apePes")
  private String apePes = null;

  @SerializedName("e008rai")
  private E008rai e008rai = null;

  @SerializedName("e069gre")
  private E069gre e069gre = null;

  @SerializedName("vlrPen")
  private String vlrPen = null;

  public E001pes usualt(String usualt) {
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

  public E001pes zonFra(EnumZonFra zonFra) {
    this.zonFra = zonFra;
    return this;
  }

   /**
   * Get zonFra
   * @return zonFra
  **/
  @ApiModelProperty(value = "")
  public EnumZonFra getZonFra() {
    return zonFra;
  }

  public void setZonFra(EnumZonFra zonFra) {
    this.zonFra = zonFra;
  }

  public E001pes fonPe2(String fonPe2) {
    this.fonPe2 = fonPe2;
    return this;
  }

   /**
   * Telefone 2
   * @return fonPe2
  **/
  @ApiModelProperty(value = "Telefone 2")
  public String getFonPe2() {
    return fonPe2;
  }

  public void setFonPe2(String fonPe2) {
    this.fonPe2 = fonPe2;
  }

  public E001pes datRge(LocalDate datRge) {
    this.datRge = datRge;
    return this;
  }

   /**
   * Data de emissão do RG
   * @return datRge
  **/
  @ApiModelProperty(value = "Data de emissão do RG")
  public LocalDate getDatRge() {
    return datRge;
  }

  public void setDatRge(LocalDate datRge) {
    this.datRge = datRge;
  }

  public E001pes insMun(String insMun) {
    this.insMun = insMun;
    return this;
  }

   /**
   * Inscrição municipal
   * @return insMun
  **/
  @ApiModelProperty(value = "Inscrição municipal")
  public String getInsMun() {
    return insMun;
  }

  public void setInsMun(String insMun) {
    this.insMun = insMun;
  }

  public E001pes e095pes(E095pes e095pes) {
    this.e095pes = e095pes;
    return this;
  }

   /**
   * Get e095pes
   * @return e095pes
  **/
  @ApiModelProperty(value = "")
  public E095pes getE095pes() {
    return e095pes;
  }

  public void setE095pes(E095pes e095pes) {
    this.e095pes = e095pes;
  }

  public E001pes codCae(String codCae) {
    this.codCae = codCae;
    return this;
  }

   /**
   * Cadastro da atividade econômica da pessoa física (CAEPF)
   * @return codCae
  **/
  @ApiModelProperty(value = "Cadastro da atividade econômica da pessoa física (CAEPF)")
  public String getCodCae() {
    return codCae;
  }

  public void setCodCae(String codCae) {
    this.codCae = codCae;
  }

  public E001pes codSuf(String codSuf) {
    this.codSuf = codSuf;
    return this;
  }

   /**
   * Código do SUFRAMA
   * @return codSuf
  **/
  @ApiModelProperty(value = "Código do SUFRAMA")
  public String getCodSuf() {
    return codSuf;
  }

  public void setCodSuf(String codSuf) {
    this.codSuf = codSuf;
  }

  public E001pes e085pes(E085pes e085pes) {
    this.e085pes = e085pes;
    return this;
  }

   /**
   * Get e085pes
   * @return e085pes
  **/
  @ApiModelProperty(value = "")
  public E085pes getE085pes() {
    return e085pes;
  }

  public void setE085pes(E085pes e085pes) {
    this.e085pes = e085pes;
  }

  public E001pes id(UUID id) {
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

  public E001pes datSuf(LocalDate datSuf) {
    this.datSuf = datSuf;
    return this;
  }

   /**
   * Validade do registro do SUFRAMA
   * @return datSuf
  **/
  @ApiModelProperty(value = "Validade do registro do SUFRAMA")
  public LocalDate getDatSuf() {
    return datSuf;
  }

  public void setDatSuf(LocalDate datSuf) {
    this.datSuf = datSuf;
  }

  public E001pes numIdf(String numIdf) {
    this.numIdf = numIdf;
    return this;
  }

   /**
   * Número de identificação fiscal (NIF)
   * @return numIdf
  **/
  @ApiModelProperty(value = "Número de identificação fiscal (NIF)")
  public String getNumIdf() {
    return numIdf;
  }

  public void setNumIdf(String numIdf) {
    this.numIdf = numIdf;
  }

  public E001pes nomBai(String nomBai) {
    this.nomBai = nomBai;
    return this;
  }

   /**
   * Bairro
   * @return nomBai
  **/
  @ApiModelProperty(value = "Bairro")
  public String getNomBai() {
    return nomBai;
  }

  public void setNomBai(String nomBai) {
    this.nomBai = nomBai;
  }

  public E001pes cxaPst(Integer cxaPst) {
    this.cxaPst = cxaPst;
    return this;
  }

   /**
   * Caixa postal
   * @return cxaPst
  **/
  @ApiModelProperty(value = "Caixa postal")
  public Integer getCxaPst() {
    return cxaPst;
  }

  public void setCxaPst(Integer cxaPst) {
    this.cxaPst = cxaPst;
  }

  public E001pes excluido(Boolean excluido) {
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

  public E001pes qtdAtu(Integer qtdAtu) {
    this.qtdAtu = qtdAtu;
    return this;
  }

   /**
   * Quantidade de renovações cadastrais
   * @return qtdAtu
  **/
  @ApiModelProperty(value = "Quantidade de renovações cadastrais")
  public Integer getQtdAtu() {
    return qtdAtu;
  }

  public void setQtdAtu(Integer qtdAtu) {
    this.qtdAtu = qtdAtu;
  }

  public E001pes orgRge(String orgRge) {
    this.orgRge = orgRge;
    return this;
  }

   /**
   * Órgão emissor do RG
   * @return orgRge
  **/
  @ApiModelProperty(value = "Órgão emissor do RG")
  public String getOrgRge() {
    return orgRge;
  }

  public void setOrgRge(String orgRge) {
    this.orgRge = orgRge;
  }

  public E001pes numEnd(String numEnd) {
    this.numEnd = numEnd;
    return this;
  }

   /**
   * Número
   * @return numEnd
  **/
  @ApiModelProperty(value = "Número")
  public String getNumEnd() {
    return numEnd;
  }

  public void setNumEnd(String numEnd) {
    this.numEnd = numEnd;
  }

  public E001pes numRge(String numRge) {
    this.numRge = numRge;
    return this;
  }

   /**
   * Número do RG
   * @return numRge
  **/
  @ApiModelProperty(value = "Número do RG")
  public String getNumRge() {
    return numRge;
  }

  public void setNumRge(String numRge) {
    this.numRge = numRge;
  }

  public E001pes emaNfe(String emaNfe) {
    this.emaNfe = emaNfe;
    return this;
  }

   /**
   * E-mail para envio de documentos eletrônicos
   * @return emaNfe
  **/
  @ApiModelProperty(value = "E-mail para envio de documentos eletrônicos")
  public String getEmaNfe() {
    return emaNfe;
  }

  public void setEmaNfe(String emaNfe) {
    this.emaNfe = emaNfe;
  }

  public E001pes e095cbo(E095cbo e095cbo) {
    this.e095cbo = e095cbo;
    return this;
  }

   /**
   * Get e095cbo
   * @return e095cbo
  **/
  @ApiModelProperty(value = "")
  public E095cbo getE095cbo() {
    return e095cbo;
  }

  public void setE095cbo(E095cbo e095cbo) {
    this.e095cbo = e095cbo;
  }

  public E001pes nomPes(String nomPes) {
    this.nomPes = nomPes;
    return this;
  }

   /**
   * Nome
   * @return nomPes
  **/
  @ApiModelProperty(value = "Nome")
  public String getNomPes() {
    return nomPes;
  }

  public void setNomPes(String nomPes) {
    this.nomPes = nomPes;
  }

  public E001pes datNas(LocalDate datNas) {
    this.datNas = datNas;
    return this;
  }

   /**
   * Data de nascimento
   * @return datNas
  **/
  @ApiModelProperty(value = "Data de nascimento")
  public LocalDate getDatNas() {
    return datNas;
  }

  public void setDatNas(LocalDate datNas) {
    this.datNas = datNas;
  }

  public E001pes e006pai(E006pai e006pai) {
    this.e006pai = e006pai;
    return this;
  }

   /**
   * Get e006pai
   * @return e006pai
  **/
  @ApiModelProperty(value = "")
  public E006pai getE006pai() {
    return e006pai;
  }

  public void setE006pai(E006pai e006pai) {
    this.e006pai = e006pai;
  }

  public E001pes codPes(Integer codPes) {
    this.codPes = codPes;
    return this;
  }

   /**
   * Código
   * @return codPes
  **/
  @ApiModelProperty(value = "Código")
  public Integer getCodPes() {
    return codPes;
  }

  public void setCodPes(Integer codPes) {
    this.codPes = codPes;
  }

  public E001pes zipCod(String zipCod) {
    this.zipCod = zipCod;
    return this;
  }

   /**
   * Zip code
   * @return zipCod
  **/
  @ApiModelProperty(value = "Zip code")
  public String getZipCod() {
    return zipCod;
  }

  public void setZipCod(String zipCod) {
    this.zipCod = zipCod;
  }

  public E001pes tipEmp(EnumTipEmp tipEmp) {
    this.tipEmp = tipEmp;
    return this;
  }

   /**
   * Get tipEmp
   * @return tipEmp
  **/
  @ApiModelProperty(value = "")
  public EnumTipEmp getTipEmp() {
    return tipEmp;
  }

  public void setTipEmp(EnumTipEmp tipEmp) {
    this.tipEmp = tipEmp;
  }

  public E001pes fonPes(String fonPes) {
    this.fonPes = fonPes;
    return this;
  }

   /**
   * Telefone
   * @return fonPes
  **/
  @ApiModelProperty(value = "Telefone")
  public String getFonPes() {
    return fonPes;
  }

  public void setFonPes(String fonPes) {
    this.fonPes = fonPes;
  }

  public E001pes dthger(OffsetDateTime dthger) {
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

  public E001pes cnpCpf(String cnpCpf) {
    this.cnpCpf = cnpCpf;
    return this;
  }

   /**
   * CNPJ/CPF
   * @return cnpCpf
  **/
  @ApiModelProperty(value = "CNPJ/CPF")
  public String getCnpCpf() {
    return cnpCpf;
  }

  public void setCnpCpf(String cnpCpf) {
    this.cnpCpf = cnpCpf;
  }

  public E001pes indNif(EnumIndNif indNif) {
    this.indNif = indNif;
    return this;
  }

   /**
   * Get indNif
   * @return indNif
  **/
  @ApiModelProperty(value = "")
  public EnumIndNif getIndNif() {
    return indNif;
  }

  public void setIndNif(EnumIndNif indNif) {
    this.indNif = indNif;
  }

  public E001pes e008cep(E008cep e008cep) {
    this.e008cep = e008cep;
    return this;
  }

   /**
   * Get e008cep
   * @return e008cep
  **/
  @ApiModelProperty(value = "")
  public E008cep getE008cep() {
    return e008cep;
  }

  public void setE008cep(E008cep e008cep) {
    this.e008cep = e008cep;
  }

  public E001pes insEst(String insEst) {
    this.insEst = insEst;
    return this;
  }

   /**
   * Inscrição estadual
   * @return insEst
  **/
  @ApiModelProperty(value = "Inscrição estadual")
  public String getInsEst() {
    return insEst;
  }

  public void setInsEst(String insEst) {
    this.insEst = insEst;
  }

  public E001pes qtdDep(Integer qtdDep) {
    this.qtdDep = qtdDep;
    return this;
  }

   /**
   * Quantidade de dependentes
   * @return qtdDep
  **/
  @ApiModelProperty(value = "Quantidade de dependentes")
  public Integer getQtdDep() {
    return qtdDep;
  }

  public void setQtdDep(Integer qtdDep) {
    this.qtdDep = qtdDep;
  }

  public E001pes e001ine(List<E001ine> e001ine) {
    this.e001ine = e001ine;
    return this;
  }

  public E001pes addE001ineItem(E001ine e001ineItem) {
    if (this.e001ine == null) {
      this.e001ine = new ArrayList<E001ine>();
    }
    this.e001ine.add(e001ineItem);
    return this;
  }

   /**
   * Ligação inscrição estadual por estado na pessoa
   * @return e001ine
  **/
  @ApiModelProperty(value = "Ligação inscrição estadual por estado na pessoa")
  public List<E001ine> getE001ine() {
    return e001ine;
  }

  public void setE001ine(List<E001ine> e001ine) {
    this.e001ine = e001ine;
  }

  public E001pes tipMer(EnumTipMer tipMer) {
    this.tipMer = tipMer;
    return this;
  }

   /**
   * Get tipMer
   * @return tipMer
  **/
  @ApiModelProperty(value = "")
  public EnumTipMer getTipMer() {
    return tipMer;
  }

  public void setTipMer(EnumTipMer tipMer) {
    this.tipMer = tipMer;
  }

  public E001pes endPes(String endPes) {
    this.endPes = endPes;
    return this;
  }

   /**
   * Endereço
   * @return endPes
  **/
  @ApiModelProperty(value = "Endereço")
  public String getEndPes() {
    return endPes;
  }

  public void setEndPes(String endPes) {
    this.endPes = endPes;
  }

  public E001pes e001end(List<E001end> e001end) {
    this.e001end = e001end;
    return this;
  }

  public E001pes addE001endItem(E001end e001endItem) {
    if (this.e001end == null) {
      this.e001end = new ArrayList<E001end>();
    }
    this.e001end.add(e001endItem);
    return this;
  }

   /**
   * Endereços
   * @return e001end
  **/
  @ApiModelProperty(value = "Endereços")
  public List<E001end> getE001end() {
    return e001end;
  }

  public void setE001end(List<E001end> e001end) {
    this.e001end = e001end;
  }

  public E001pes e026ram(E026ram e026ram) {
    this.e026ram = e026ram;
    return this;
  }

   /**
   * Get e026ram
   * @return e026ram
  **/
  @ApiModelProperty(value = "")
  public E026ram getE026ram() {
    return e026ram;
  }

  public void setE026ram(E026ram e026ram) {
    this.e026ram = e026ram;
  }

  public E001pes sitPes(EnumSitReg sitPes) {
    this.sitPes = sitPes;
    return this;
  }

   /**
   * Get sitPes
   * @return sitPes
  **/
  @ApiModelProperty(value = "")
  public EnumSitReg getSitPes() {
    return sitPes;
  }

  public void setSitPes(EnumSitReg sitPes) {
    this.sitPes = sitPes;
  }

  public E001pes faxPes(String faxPes) {
    this.faxPes = faxPes;
    return this;
  }

   /**
   * Fax
   * @return faxPes
  **/
  @ApiModelProperty(value = "Fax")
  public String getFaxPes() {
    return faxPes;
  }

  public void setFaxPes(String faxPes) {
    this.faxPes = faxPes;
  }

  public E001pes intNet(String intNet) {
    this.intNet = intNet;
    return this;
  }

   /**
   * E-mail
   * @return intNet
  **/
  @ApiModelProperty(value = "E-mail")
  public String getIntNet() {
    return intNet;
  }

  public void setIntNet(String intNet) {
    this.intNet = intNet;
  }

  public E001pes datVct(LocalDate datVct) {
    this.datVct = datVct;
    return this;
  }

   /**
   * Vencimento do cadastro do cliente
   * @return datVct
  **/
  @ApiModelProperty(value = "Vencimento do cadastro do cliente")
  public LocalDate getDatVct() {
    return datVct;
  }

  public void setDatVct(LocalDate datVct) {
    this.datVct = datVct;
  }

  public E001pes e090pes(E090pes e090pes) {
    this.e090pes = e090pes;
    return this;
  }

   /**
   * Get e090pes
   * @return e090pes
  **/
  @ApiModelProperty(value = "")
  public E090pes getE090pes() {
    return e090pes;
  }

  public void setE090pes(E090pes e090pes) {
    this.e090pes = e090pes;
  }

  public E001pes dthalt(OffsetDateTime dthalt) {
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

  public E001pes numNis(String numNis) {
    this.numNis = numNis;
    return this;
  }

   /**
   * Número de inscrição do segurado (NIS, NIT e PIS/PASEP)
   * @return numNis
  **/
  @ApiModelProperty(value = "Número de inscrição do segurado (NIS, NIT e PIS/PASEP)")
  public String getNumNis() {
    return numNis;
  }

  public void setNumNis(String numNis) {
    this.numNis = numNis;
  }

  public E001pes e073pes(E073pes e073pes) {
    this.e073pes = e073pes;
    return this;
  }

   /**
   * Get e073pes
   * @return e073pes
  **/
  @ApiModelProperty(value = "")
  public E073pes getE073pes() {
    return e073pes;
  }

  public void setE073pes(E073pes e073pes) {
    this.e073pes = e073pes;
  }

  public E001pes e077pes(E077pes e077pes) {
    this.e077pes = e077pes;
    return this;
  }

   /**
   * Get e077pes
   * @return e077pes
  **/
  @ApiModelProperty(value = "")
  public E077pes getE077pes() {
    return e077pes;
  }

  public void setE077pes(E077pes e077pes) {
    this.e077pes = e077pes;
  }

  public E001pes e007ufs(E007ufs e007ufs) {
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

  public E001pes tipPes(EnumJurFis tipPes) {
    this.tipPes = tipPes;
    return this;
  }

   /**
   * Get tipPes
   * @return tipPes
  **/
  @ApiModelProperty(value = "")
  public EnumJurFis getTipPes() {
    return tipPes;
  }

  public void setTipPes(EnumJurFis tipPes) {
    this.tipPes = tipPes;
  }

  public E001pes usuger(String usuger) {
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

  public E001pes cplEnd(String cplEnd) {
    this.cplEnd = cplEnd;
    return this;
  }

   /**
   * Complemento
   * @return cplEnd
  **/
  @ApiModelProperty(value = "Complemento")
  public String getCplEnd() {
    return cplEnd;
  }

  public void setCplEnd(String cplEnd) {
    this.cplEnd = cplEnd;
  }

  public E001pes apePes(String apePes) {
    this.apePes = apePes;
    return this;
  }

   /**
   * Nome fantasia
   * @return apePes
  **/
  @ApiModelProperty(value = "Nome fantasia")
  public String getApePes() {
    return apePes;
  }

  public void setApePes(String apePes) {
    this.apePes = apePes;
  }

  public E001pes e008rai(E008rai e008rai) {
    this.e008rai = e008rai;
    return this;
  }

   /**
   * Get e008rai
   * @return e008rai
  **/
  @ApiModelProperty(value = "")
  public E008rai getE008rai() {
    return e008rai;
  }

  public void setE008rai(E008rai e008rai) {
    this.e008rai = e008rai;
  }

  public E001pes e069gre(E069gre e069gre) {
    this.e069gre = e069gre;
    return this;
  }

   /**
   * Get e069gre
   * @return e069gre
  **/
  @ApiModelProperty(value = "")
  public E069gre getE069gre() {
    return e069gre;
  }

  public void setE069gre(E069gre e069gre) {
    this.e069gre = e069gre;
  }

  public E001pes vlrPen(String vlrPen) {
    this.vlrPen = vlrPen;
    return this;
  }

   /**
   * Valor da Pensão judicial/alimentícia
   * @return vlrPen
  **/
  @ApiModelProperty(value = "Valor da Pensão judicial/alimentícia")
  public String getVlrPen() {
    return vlrPen;
  }

  public void setVlrPen(String vlrPen) {
    this.vlrPen = vlrPen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    E001pes e001pes = (E001pes) o;
    return Objects.equals(this.usualt, e001pes.usualt) &&
        Objects.equals(this.zonFra, e001pes.zonFra) &&
        Objects.equals(this.fonPe2, e001pes.fonPe2) &&
        Objects.equals(this.datRge, e001pes.datRge) &&
        Objects.equals(this.insMun, e001pes.insMun) &&
        Objects.equals(this.e095pes, e001pes.e095pes) &&
        Objects.equals(this.codCae, e001pes.codCae) &&
        Objects.equals(this.codSuf, e001pes.codSuf) &&
        Objects.equals(this.e085pes, e001pes.e085pes) &&
        Objects.equals(this.id, e001pes.id) &&
        Objects.equals(this.datSuf, e001pes.datSuf) &&
        Objects.equals(this.numIdf, e001pes.numIdf) &&
        Objects.equals(this.nomBai, e001pes.nomBai) &&
        Objects.equals(this.cxaPst, e001pes.cxaPst) &&
        Objects.equals(this.excluido, e001pes.excluido) &&
        Objects.equals(this.qtdAtu, e001pes.qtdAtu) &&
        Objects.equals(this.orgRge, e001pes.orgRge) &&
        Objects.equals(this.numEnd, e001pes.numEnd) &&
        Objects.equals(this.numRge, e001pes.numRge) &&
        Objects.equals(this.emaNfe, e001pes.emaNfe) &&
        Objects.equals(this.e095cbo, e001pes.e095cbo) &&
        Objects.equals(this.nomPes, e001pes.nomPes) &&
        Objects.equals(this.datNas, e001pes.datNas) &&
        Objects.equals(this.e006pai, e001pes.e006pai) &&
        Objects.equals(this.codPes, e001pes.codPes) &&
        Objects.equals(this.zipCod, e001pes.zipCod) &&
        Objects.equals(this.tipEmp, e001pes.tipEmp) &&
        Objects.equals(this.fonPes, e001pes.fonPes) &&
        Objects.equals(this.dthger, e001pes.dthger) &&
        Objects.equals(this.cnpCpf, e001pes.cnpCpf) &&
        Objects.equals(this.indNif, e001pes.indNif) &&
        Objects.equals(this.e008cep, e001pes.e008cep) &&
        Objects.equals(this.insEst, e001pes.insEst) &&
        Objects.equals(this.qtdDep, e001pes.qtdDep) &&
        Objects.equals(this.e001ine, e001pes.e001ine) &&
        Objects.equals(this.tipMer, e001pes.tipMer) &&
        Objects.equals(this.endPes, e001pes.endPes) &&
        Objects.equals(this.e001end, e001pes.e001end) &&
        Objects.equals(this.e026ram, e001pes.e026ram) &&
        Objects.equals(this.sitPes, e001pes.sitPes) &&
        Objects.equals(this.faxPes, e001pes.faxPes) &&
        Objects.equals(this.intNet, e001pes.intNet) &&
        Objects.equals(this.datVct, e001pes.datVct) &&
        Objects.equals(this.e090pes, e001pes.e090pes) &&
        Objects.equals(this.dthalt, e001pes.dthalt) &&
        Objects.equals(this.numNis, e001pes.numNis) &&
        Objects.equals(this.e073pes, e001pes.e073pes) &&
        Objects.equals(this.e077pes, e001pes.e077pes) &&
        Objects.equals(this.e007ufs, e001pes.e007ufs) &&
        Objects.equals(this.tipPes, e001pes.tipPes) &&
        Objects.equals(this.usuger, e001pes.usuger) &&
        Objects.equals(this.cplEnd, e001pes.cplEnd) &&
        Objects.equals(this.apePes, e001pes.apePes) &&
        Objects.equals(this.e008rai, e001pes.e008rai) &&
        Objects.equals(this.e069gre, e001pes.e069gre) &&
        Objects.equals(this.vlrPen, e001pes.vlrPen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usualt, zonFra, fonPe2, datRge, insMun, e095pes, codCae, codSuf, e085pes, id, datSuf, numIdf, nomBai, cxaPst, excluido, qtdAtu, orgRge, numEnd, numRge, emaNfe, e095cbo, nomPes, datNas, e006pai, codPes, zipCod, tipEmp, fonPes, dthger, cnpCpf, indNif, e008cep, insEst, qtdDep, e001ine, tipMer, endPes, e001end, e026ram, sitPes, faxPes, intNet, datVct, e090pes, dthalt, numNis, e073pes, e077pes, e007ufs, tipPes, usuger, cplEnd, apePes, e008rai, e069gre, vlrPen);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class E001pes {\n");
    
    sb.append("    usualt: ").append(toIndentedString(usualt)).append("\n");
    sb.append("    zonFra: ").append(toIndentedString(zonFra)).append("\n");
    sb.append("    fonPe2: ").append(toIndentedString(fonPe2)).append("\n");
    sb.append("    datRge: ").append(toIndentedString(datRge)).append("\n");
    sb.append("    insMun: ").append(toIndentedString(insMun)).append("\n");
    sb.append("    e095pes: ").append(toIndentedString(e095pes)).append("\n");
    sb.append("    codCae: ").append(toIndentedString(codCae)).append("\n");
    sb.append("    codSuf: ").append(toIndentedString(codSuf)).append("\n");
    sb.append("    e085pes: ").append(toIndentedString(e085pes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    datSuf: ").append(toIndentedString(datSuf)).append("\n");
    sb.append("    numIdf: ").append(toIndentedString(numIdf)).append("\n");
    sb.append("    nomBai: ").append(toIndentedString(nomBai)).append("\n");
    sb.append("    cxaPst: ").append(toIndentedString(cxaPst)).append("\n");
    sb.append("    excluido: ").append(toIndentedString(excluido)).append("\n");
    sb.append("    qtdAtu: ").append(toIndentedString(qtdAtu)).append("\n");
    sb.append("    orgRge: ").append(toIndentedString(orgRge)).append("\n");
    sb.append("    numEnd: ").append(toIndentedString(numEnd)).append("\n");
    sb.append("    numRge: ").append(toIndentedString(numRge)).append("\n");
    sb.append("    emaNfe: ").append(toIndentedString(emaNfe)).append("\n");
    sb.append("    e095cbo: ").append(toIndentedString(e095cbo)).append("\n");
    sb.append("    nomPes: ").append(toIndentedString(nomPes)).append("\n");
    sb.append("    datNas: ").append(toIndentedString(datNas)).append("\n");
    sb.append("    e006pai: ").append(toIndentedString(e006pai)).append("\n");
    sb.append("    codPes: ").append(toIndentedString(codPes)).append("\n");
    sb.append("    zipCod: ").append(toIndentedString(zipCod)).append("\n");
    sb.append("    tipEmp: ").append(toIndentedString(tipEmp)).append("\n");
    sb.append("    fonPes: ").append(toIndentedString(fonPes)).append("\n");
    sb.append("    dthger: ").append(toIndentedString(dthger)).append("\n");
    sb.append("    cnpCpf: ").append(toIndentedString(cnpCpf)).append("\n");
    sb.append("    indNif: ").append(toIndentedString(indNif)).append("\n");
    sb.append("    e008cep: ").append(toIndentedString(e008cep)).append("\n");
    sb.append("    insEst: ").append(toIndentedString(insEst)).append("\n");
    sb.append("    qtdDep: ").append(toIndentedString(qtdDep)).append("\n");
    sb.append("    e001ine: ").append(toIndentedString(e001ine)).append("\n");
    sb.append("    tipMer: ").append(toIndentedString(tipMer)).append("\n");
    sb.append("    endPes: ").append(toIndentedString(endPes)).append("\n");
    sb.append("    e001end: ").append(toIndentedString(e001end)).append("\n");
    sb.append("    e026ram: ").append(toIndentedString(e026ram)).append("\n");
    sb.append("    sitPes: ").append(toIndentedString(sitPes)).append("\n");
    sb.append("    faxPes: ").append(toIndentedString(faxPes)).append("\n");
    sb.append("    intNet: ").append(toIndentedString(intNet)).append("\n");
    sb.append("    datVct: ").append(toIndentedString(datVct)).append("\n");
    sb.append("    e090pes: ").append(toIndentedString(e090pes)).append("\n");
    sb.append("    dthalt: ").append(toIndentedString(dthalt)).append("\n");
    sb.append("    numNis: ").append(toIndentedString(numNis)).append("\n");
    sb.append("    e073pes: ").append(toIndentedString(e073pes)).append("\n");
    sb.append("    e077pes: ").append(toIndentedString(e077pes)).append("\n");
    sb.append("    e007ufs: ").append(toIndentedString(e007ufs)).append("\n");
    sb.append("    tipPes: ").append(toIndentedString(tipPes)).append("\n");
    sb.append("    usuger: ").append(toIndentedString(usuger)).append("\n");
    sb.append("    cplEnd: ").append(toIndentedString(cplEnd)).append("\n");
    sb.append("    apePes: ").append(toIndentedString(apePes)).append("\n");
    sb.append("    e008rai: ").append(toIndentedString(e008rai)).append("\n");
    sb.append("    e069gre: ").append(toIndentedString(e069gre)).append("\n");
    sb.append("    vlrPen: ").append(toIndentedString(vlrPen)).append("\n");
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

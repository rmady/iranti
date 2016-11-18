package iranti.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="iranti")
public class Iranti implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="iranti_id")
	private Integer id;
	@Column(name="iranti_name")
	private String nome;
	@Column
	private String descricao;
	@Column
	private Date dataCriacao;
	@Column
	private Date ultimaModificacao;
	
	private static final long serialVersionUID = 1L;
	public Iranti() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getUltimaModificacao() {
		return ultimaModificacao;
	}

	public void setUltimaModificacao(Date ultimaModificacao) {
		this.ultimaModificacao = ultimaModificacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}

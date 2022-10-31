package entities;
// Generated Oct 31, 2022, 8:22:32 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Invoice generated by hbm2java
 */
@Entity
@Table(name = "invoice", catalog = "miniShop")
public class Invoice implements java.io.Serializable {

	private InvoiceId id;

	public Invoice() {
	}

	public Invoice(InvoiceId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "invoiceId", column = @Column(name = "InvoiceId", nullable = false, length = 32)),
			@AttributeOverride(name = "userId", column = @Column(name = "userId")),
			@AttributeOverride(name = "email", column = @Column(name = "Email", nullable = false, length = 64)),
			@AttributeOverride(name = "tel", column = @Column(name = "Tel", nullable = false, length = 16)),
			@AttributeOverride(name = "address", column = @Column(name = "Address", nullable = false, length = 128)),
			@AttributeOverride(name = "statusId", column = @Column(name = "StatusId", nullable = false)),
			@AttributeOverride(name = "addedDate", column = @Column(name = "AddedDate", nullable = false, length = 19)) })
	public InvoiceId getId() {
		return this.id;
	}

	public void setId(InvoiceId id) {
		this.id = id;
	}

}
